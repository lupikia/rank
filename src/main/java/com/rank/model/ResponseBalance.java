package com.rank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBalance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")


public class ResponseBalance   {
  @JsonProperty("playerId")
  private Integer playerId = null;

  @JsonProperty("balance")
  private Integer balance = null;

  public ResponseBalance playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Get playerId
   * @return playerId
  **/
  @ApiModelProperty(value = "")


  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }

  public ResponseBalance balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")


  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBalance responseBalance = (ResponseBalance) o;
    return Objects.equals(this.playerId, responseBalance.playerId) &&
        Objects.equals(this.balance, responseBalance.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerId, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBalance {\n");
    
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

