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
 * Address
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-03T19:15:39.720-05:00")
public class Address   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("personName")
  private String personName = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("addressLine3")
  private String addressLine3 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("zipCode4")
  private String zipCode4 = null;

  @JsonProperty("standardized")
  private Boolean standardized = null;

  public Address id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Future use
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Future use")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Address personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * Name of resident, for this address
   * @return personName
  **/
  @ApiModelProperty(example = "null", value = "Name of resident, for this address")
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public Address companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name on this address. 
   * @return companyName
  **/
  @ApiModelProperty(example = "null", value = "Company name on this address. ")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Address line 1. Should be populated.
   * @return addressLine1
  **/
  @ApiModelProperty(example = "null", value = "Address line 1. Should be populated.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Address line 2, if exists
   * @return addressLine2
  **/
  @ApiModelProperty(example = "null", value = "Address line 2, if exists")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Address line 3, if exists
   * @return addressLine3
  **/
  @ApiModelProperty(example = "null", value = "Address line 3, if exists")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Name of city
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "Name of city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 2 Char state abbrv.
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "2 Char state abbrv.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 2 Char country code. It will be US for USA addresses
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "2 Char country code. It will be US for USA addresses")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * 5 Digit zipcode
   * @return zipCode
  **/
  @ApiModelProperty(example = "null", value = "5 Digit zipcode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address zipCode4(String zipCode4) {
    this.zipCode4 = zipCode4;
    return this;
  }

   /**
   * 4 Digit zipcode, specific to address
   * @return zipCode4
  **/
  @ApiModelProperty(example = "null", value = "4 Digit zipcode, specific to address")
  public String getZipCode4() {
    return zipCode4;
  }

  public void setZipCode4(String zipCode4) {
    this.zipCode4 = zipCode4;
  }

  public Address standardized(Boolean standardized) {
    this.standardized = standardized;
    return this;
  }

   /**
   * true or false, whether address is standardized. Mostly true
   * @return standardized
  **/
  @ApiModelProperty(example = "null", value = "true or false, whether address is standardized. Mostly true")
  public Boolean getStandardized() {
    return standardized;
  }

  public void setStandardized(Boolean standardized) {
    this.standardized = standardized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.personName, address.personName) &&
        Objects.equals(this.companyName, address.companyName) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressLine3, address.addressLine3) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.zipCode4, address.zipCode4) &&
        Objects.equals(this.standardized, address.standardized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personName, companyName, addressLine1, addressLine2, addressLine3, city, state, country, zipCode, zipCode4, standardized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipCode4: ").append(toIndentedString(zipCode4)).append("\n");
    sb.append("    standardized: ").append(toIndentedString(standardized)).append("\n");
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

