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
 * ResponseError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-09-13T11:26:17.148Z")


public class ResponseError   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("lable")
  private String lable = null;

  @JsonProperty("street_name")
  private String streetName = null;

  public ResponseError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseError lable(String lable) {
    this.lable = lable;
    return this;
  }

  /**
   * Get lable
   * @return lable
  **/
  @ApiModelProperty(value = "")


  public String getLable() {
    return lable;
  }

  public void setLable(String lable) {
    this.lable = lable;
  }

  public ResponseError streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(value = "")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(this.message, responseError.message) &&
        Objects.equals(this.lable, responseError.lable) &&
        Objects.equals(this.streetName, responseError.streetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, lable, streetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    lable: ").append(toIndentedString(lable)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
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

