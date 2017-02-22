/**
 * snapCX - Address Validation APIs for commerce & retailers.
 * This set of API end points, provides real time address validations and corrections. Also do zipcode lookups etc. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@snapcx.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.snapcx.avs.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ZipSummary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-03T19:15:39.720-05:00")
public class ZipSummary   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("numberOfZipCodes")
  private Integer numberOfZipCodes = null;

  @JsonProperty("message")
  private String message = null;

  public ZipSummary errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error Code in case of any problem for this particular address.
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "Error Code in case of any problem for this particular address.")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ZipSummary errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error Message in case of any problem for this particular address. 
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "Error Message in case of any problem for this particular address. ")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ZipSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Two possible values, SUCCESS or FAIL.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Two possible values, SUCCESS or FAIL.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ZipSummary numberOfZipCodes(Integer numberOfZipCodes) {
    this.numberOfZipCodes = numberOfZipCodes;
    return this;
  }

   /**
   * Particular city can have more than one zipcode assigned. It will get you all.
   * @return numberOfZipCodes
  **/
  @ApiModelProperty(example = "null", value = "Particular city can have more than one zipcode assigned. It will get you all.")
  public Integer getNumberOfZipCodes() {
    return numberOfZipCodes;
  }

  public void setNumberOfZipCodes(Integer numberOfZipCodes) {
    this.numberOfZipCodes = numberOfZipCodes;
  }

  public ZipSummary message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message or comment, if any.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Message or comment, if any.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipSummary zipSummary = (ZipSummary) o;
    return Objects.equals(this.errorCode, zipSummary.errorCode) &&
        Objects.equals(this.errorMessage, zipSummary.errorMessage) &&
        Objects.equals(this.status, zipSummary.status) &&
        Objects.equals(this.numberOfZipCodes, zipSummary.numberOfZipCodes) &&
        Objects.equals(this.message, zipSummary.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, status, numberOfZipCodes, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipSummary {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numberOfZipCodes: ").append(toIndentedString(numberOfZipCodes)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
