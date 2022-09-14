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
 * ResponseUserTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")


public class ResponseUserTransaction   {
  @JsonProperty("transactionType")
  private Integer transactionType = null;

  @JsonProperty("transactionId")
  private Integer transactionId = null;

  @JsonProperty("amount")
  private float amount = 0;

  @JsonProperty("transactions")
  private Object transactions = null;

  public ResponseUserTransaction transactionType(Integer transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")


  public Integer getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(Integer transactionType) {
    this.transactionType = transactionType;
  }

  public ResponseUserTransaction transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")


  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  public ResponseUserTransaction amount(float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public ResponseUserTransaction transactions(Object transactions) {
    this.transactions = transactions;
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")


  public Object getTransactions() {
    return transactions;
  }

  public void setTransactions(Object transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseUserTransaction responseUserTransaction = (ResponseUserTransaction) o;
    return Objects.equals(this.transactionType, responseUserTransaction.transactionType) &&
        Objects.equals(this.transactionId, responseUserTransaction.transactionId) &&
        Objects.equals(this.amount, responseUserTransaction.amount) &&
        Objects.equals(this.transactions, responseUserTransaction.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, transactionId, amount, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseUserTransaction {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

