package com.rank.api;

import com.rank.entity.Player;
import com.rank.entity.Transactions;
import com.rank.model.PlayerBalance;
import com.rank.model.PlayerDetail;
import com.rank.model.RequestUpdateBalance;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rank.repository.PlayerRepository;
import com.rank.repository.TransactionsRepository;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")

@RestController
public class PlayerApiController implements PlayerApi {

    private static final Logger log = LoggerFactory.getLogger(PlayerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private TransactionsRepository transactionsRepository;
    @Autowired
    private PlayerRepository playerrepository;
    @Autowired
    private PlayerDetail playerDetail;
    private Player tempData;

    @org.springframework.beans.factory.annotation.Autowired
    public PlayerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PlayerDetail> getBalance(@ApiParam(value = "Player id",required=true) @PathVariable("playerId") Integer playerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                tempData =  playerrepository.findById(playerId).get();
                playerDetail.setBalance(tempData.getBalance());
                playerDetail.setPlayerId(tempData.getId());

                return new ResponseEntity<PlayerDetail>(playerDetail, HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PlayerDetail>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<PlayerDetail>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PlayerBalance> updateBalance(@ApiParam(value = "Player id",required=true) @PathVariable("playerid") Integer playerid,@ApiParam(value = "user details" ,required=true )  @Valid @RequestBody RequestUpdateBalance body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                    //-->get user balance first
                    tempData =  playerrepository.findById(playerid).get();
                    Boolean addToBalance = false;
                    float newBalance = 0;
                    //-->check if request is a wagger
                    if((body.getTransactionType()).toUpperCase().equals("WAGER")){
                        //-->check if wager is not bigger than balance
                        if(body.getAmount() <= tempData.getBalance()){
                            newBalance = tempData.getBalance() - body.getAmount();

                        }else{
                            throw new Exception("418");
                        }
                    }else{
                        newBalance = tempData.getBalance() + body.getAmount();
                    }

                //-->create entry to database table
                Transactions transactions  = new Transactions();
                transactions.setPlayerId(playerid);
                transactions.setAmount(body.getAmount());
                transactions.setTransactionType(body.getTransactionType());
                transactions = transactionsRepository.saveAndFlush(transactions);

                PlayerBalance playerbalance = new PlayerBalance();

                //-->Update player balance
                tempData.setBalance(newBalance);
                playerrepository.save(tempData);

                playerbalance.setTransactionId(transactions.getId());
                playerbalance.setBalance(newBalance);

                return new ResponseEntity<PlayerBalance>(playerbalance, HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {

                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PlayerBalance>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PlayerBalance>(HttpStatus.NOT_IMPLEMENTED);
    }

}
