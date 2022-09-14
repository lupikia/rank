/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.28).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.rank.api;

import com.rank.entity.Player;
import com.rank.model.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")

@Validated
@Api(value = "player", description = "the player API")
@RequestMapping(value = "/casino/v1")
public interface PlayerApi {

    @ApiOperation(value = "Return player balance", nickname = "getBalance", notes = "", response = Player.class, responseContainer = "List", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlayerDetail.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request", response = ResponseError.class),
        @ApiResponse(code = 412, message = "Precondition Failed"),
        @ApiResponse(code = 413, message = "Payload Too Large"),
        @ApiResponse(code = 429, message = "Too Many Requests in a short period") })
    @RequestMapping(value = "/player/{playerId}/balance",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PlayerDetail> getBalance(@ApiParam(value = "Player id",required=true) @PathVariable("playerId") Integer playerId);


    @ApiOperation(value = "Update player balance", nickname = "updateBalance", notes = "", response = PlayerBalance.class, responseContainer = "List", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PlayerBalance.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request", response = ResponseError.class),
        @ApiResponse(code = 412, message = "Precondition Failed"),
        @ApiResponse(code = 413, message = "Payload Too Large"),
        @ApiResponse(code = 418, message = "Wager greater than current balance"),
        @ApiResponse(code = 429, message = "Too Many Requests in a short period") })
    @RequestMapping(value = "/player/{playerid}/balance/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<PlayerBalance> updateBalance(@ApiParam(value = "Player id",required=true) @PathVariable("playerid") Integer playerid,@ApiParam(value = "user details" ,required=true )  @Valid @RequestBody RequestUpdateBalance body);

}
