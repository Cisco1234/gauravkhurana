package com.hcl.dna.adc.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ShipmentPartyContact
 */

public class ShipmentPartyContact  implements Serializable {
  @JsonProperty("contactId")
  private Long contactId = null;

  @JsonProperty("shipmentPartyId")
  private Long shipmentPartyId = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("name")
  private String name = null;

  public ShipmentPartyContact contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(value = "")
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public ShipmentPartyContact shipmentPartyId(Long shipmentPartyId) {
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

  public ShipmentPartyContact typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(value = "")
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public ShipmentPartyContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentPartyContact shipmentPartyContact = (ShipmentPartyContact) o;
    return Objects.equals(this.contactId, shipmentPartyContact.contactId) &&
        Objects.equals(this.shipmentPartyId, shipmentPartyContact.shipmentPartyId) &&
        Objects.equals(this.typeCode, shipmentPartyContact.typeCode) &&
        Objects.equals(this.name, shipmentPartyContact.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, shipmentPartyId, typeCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentPartyContact {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    shipmentPartyId: ").append(toIndentedString(shipmentPartyId)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

