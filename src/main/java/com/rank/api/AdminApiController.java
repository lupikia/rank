package com.rank.api;

import com.rank.entity.Transactions;
import com.rank.model.RequestUserTransaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rank.model.TransactionDetail;
import com.rank.repository.*;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")

@RestController
public class AdminApiController implements AdminApi {

    private static final Logger log = LoggerFactory.getLogger(AdminApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;

    @Autowired
    PlayerRepository player;
    @Autowired
    private TransactionsRepository transactions;

    @org.springframework.beans.factory.annotation.Autowired
    public AdminApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<TransactionDetail>> getTransactions(@ApiParam(value = "player details" ,required=true )  @Valid @RequestBody RequestUserTransaction body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                List<TransactionDetail> details =  new ArrayList<TransactionDetail>();

                Integer userId = player.findByUsername(body.getUsername()).getId();

                return new ResponseEntity<List<TransactionDetail>>((MultiValueMap<String, String>) transactions.findByPlayerId(userId), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TransactionDetail>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<List<TransactionDetail>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
