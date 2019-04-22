package com.hcl.dna.adc.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ShipmentParty
 */

public class ShipmentParty  implements Serializable {
  @JsonProperty("shipmentPartyId")
  private Long shipmentPartyId = null;

  @JsonProperty("roleCode")
  private String roleCode = null;

  @JsonProperty("securityCheckStatusCode")
  private String securityCheckStatusCode = null;

  @JsonProperty("securityCheckTimestamp")
  private DateTime securityCheckTimestamp = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("addressTypeCode")
  private String addressTypeCode = null;

  @JsonProperty("addressIDCode")
  private String addressIDCode = null;

  @JsonProperty("addressEffectiveDate")
  private DateTime addressEffectiveDate = null;

  public ShipmentParty shipmentPartyId(Long shipmentPartyId) {
    this.shipmentPartyId = shipmentPartyId;
    return this;
  }

   /**
   * Get shipmentPartyId
   * @return shipmentPartyId
  **/
  @ApiModelProperty(value = "")
  public Long getShipmentPartyId() {
    return shipmentPartyId;
  }

  public void setShipmentPartyId(Long shipmentPartyId) {
    this.shipmentPartyId = shipmentPartyId;
  }

  public ShipmentParty roleCode(String roleCode) {
    this.roleCode = roleCode;
    return this;
  }

   /**
   * Get roleCode
   * @return roleCode
  **/
  @ApiModelProperty(value = "")
  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public ShipmentParty securityCheckStatusCode(String securityCheckStatusCode) {
    this.securityCheckStatusCode = securityCheckStatusCode;
    return this;
  }

   /**
   * Get securityCheckStatusCode
   * @return securityCheckStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getSecurityCheckStatusCode() {
    return securityCheckStatusCode;
  }

  public void setSecurityCheckStatusCode(String securityCheckStatusCode) {
    this.securityCheckStatusCode = securityCheckStatusCode;
  }

  public ShipmentParty securityCheckTimestamp(DateTime securityCheckTimestamp) {
    this.securityCheckTimestamp = securityCheckTimestamp;
    return this;
  }

   /**
   * Get securityCheckTimestamp
   * @return securityCheckTimestamp
  **/
  @ApiModelProperty(value = "")
  public DateTime getSecurityCheckTimestamp() {
    return securityCheckTimestamp;
  }

  public void setSecurityCheckTimestamp(DateTime securityCheckTimestamp) {
    this.securityCheckTimestamp = securityCheckTimestamp;
  }

  public ShipmentParty accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ShipmentParty addressTypeCode(String addressTypeCode) {
    this.addressTypeCode = addressTypeCode;
    return this;
  }

   /**
   * Get addressTypeCode
   * @return addressTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getAddressTypeCode() {
    return addressTypeCode;
  }

  public void setAddressTypeCode(String addressTypeCode) {
    this.addressTypeCode = addressTypeCode;
  }

  public ShipmentParty addressIDCode(String addressIDCode) {
    this.addressIDCode = addressIDCode;
    return this;
  }

   /**
   * Get addressIDCode
   * @return addressIDCode
  **/
  @ApiModelProperty(value = "")
  public String getAddressIDCode() {
    return addressIDCode;
  }

  public void setAddressIDCode(String addressIDCode) {
    this.addressIDCode = addressIDCode;
  }

  public ShipmentParty addressEffectiveDate(DateTime addressEffectiveDate) {
    this.addressEffectiveDate = addressEffectiveDate;
    return this;
  }

   /**
   * Get addressEffectiveDate
   * @return addressEffectiveDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getAddressEffectiveDate() {
    return addressEffectiveDate;
  }

  public void setAddressEffectiveDate(DateTime addressEffectiveDate) {
    this.addressEffectiveDate = addressEffectiveDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentParty shipmentParty = (ShipmentParty) o;
    return Objects.equals(this.shipmentPartyId, shipmentParty.shipmentPartyId) &&
        Objects.equals(this.roleCode, shipmentParty.roleCode) &&
        Objects.equals(this.securityCheckStatusCode, shipmentParty.securityCheckStatusCode) &&
        Objects.equals(this.securityCheckTimestamp, shipmentParty.securityCheckTimestamp) &&
        Objects.equals(this.accountNumber, shipmentParty.accountNumber) &&
        Objects.equals(this.addressTypeCode, shipmentParty.addressTypeCode) &&
        Objects.equals(this.addressIDCode, shipmentParty.addressIDCode) &&
        Objects.equals(this.addressEffectiveDate, shipmentParty.addressEffectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentPartyId, roleCode, securityCheckStatusCode, securityCheckTimestamp, accountNumber, addressTypeCode, addressIDCode, addressEffectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentParty {\n");
    
    sb.append("    shipmentPartyId: ").append(toIndentedString(shipmentPartyId)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    securityCheckStatusCode: ").append(toIndentedString(securityCheckStatusCode)).append("\n");
    sb.append("    securityCheckTimestamp: ").append(toIndentedString(securityCheckTimestamp)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    addressTypeCode: ").append(toIndentedString(addressTypeCode)).append("\n");
    sb.append("    addressIDCode: ").append(toIndentedString(addressIDCode)).append("\n");
    sb.append("    addressEffectiveDate: ").append(toIndentedString(addressEffectiveDate)).append("\n");
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

