package com.hcl.dna.adc.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.dna.adc.api.model.PieceLine;
import com.hcl.dna.adc.api.model.ShipmentParty;
import com.hcl.dna.adc.api.model.ShipmentPartyContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Sequence
 */

public class Sequence  implements Serializable {
  @JsonProperty("shipmentId")
  private Long shipmentId = null;

  @JsonProperty("shipmentNumber")
  private String shipmentNumber = null;

  @JsonProperty("shipmentTypeCode")
  private String shipmentTypeCode = null;

  @JsonProperty("paymentTermCode")
  private String paymentTermCode = null;

  @JsonProperty("receivedLocationCode")
  private String receivedLocationCode = null;

  @JsonProperty("originTariffPointCode")
  private String originTariffPointCode = null;

  @JsonProperty("destinationTariffPointCode")
  private String destinationTariffPointCode = null;

  @JsonProperty("originBranchCode")
  private String originBranchCode = null;

  @JsonProperty("destinationBranchCode")
  private String destinationBranchCode = null;

  @JsonProperty("deliveryDeadlineCode")
  private DateTime deliveryDeadlineCode = null;

  @JsonProperty("receivedDate")
  private DateTime receivedDate = null;

  @JsonProperty("grossWeightMaxUOMCode")
  private String grossWeightMaxUOMCode = null;

  @JsonProperty("volumeMaximum")
  private Long volumeMaximum = null;

  @JsonProperty("volumeMaximumUnitMeasurement")
  private String volumeMaximumUnitMeasurement = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("customerStatedWeightMeasurementUnit")
  private String customerStatedWeightMeasurementUnit = null;

  @JsonProperty("actualWeightMeasurementCode")
  private String actualWeightMeasurementCode = null;

  @JsonProperty("ratedWeightMeasurementCode")
  private String ratedWeightMeasurementCode = null;

  @JsonProperty("dimensionalWeightMeasurementCode")
  private String dimensionalWeightMeasurementCode = null;

  @JsonProperty("volumeWeightMeasurementUnit")
  private String volumeWeightMeasurementUnit = null;

  @JsonProperty("importGatewayCode")
  private String importGatewayCode = null;

  @JsonProperty("exportGatewayCode")
  private String exportGatewayCode = null;

  @JsonProperty("statusLocationCode")
  private String statusLocationCode = null;

  @JsonProperty("dataCompleteStatusCode")
  private String dataCompleteStatusCode = null;

  @JsonProperty("loadPortCode")
  private String loadPortCode = null;

  @JsonProperty("dischargePortCode")
  private String dischargePortCode = null;

  @JsonProperty("cargoReceiptCountryCode")
  private String cargoReceiptCountryCode = null;

  @JsonProperty("cargoReceiptStateCode")
  private String cargoReceiptStateCode = null;

  @JsonProperty("cargoReceiptCityCode")
  private String cargoReceiptCityCode = null;

  @JsonProperty("cargoReceiptUNLOCPointCode")
  private String cargoReceiptUNLOCPointCode = null;

  @JsonProperty("cargoDeliveryCountryCode")
  private String cargoDeliveryCountryCode = null;

  @JsonProperty("cargoDeliveryStateCode")
  private String cargoDeliveryStateCode = null;

  @JsonProperty("cargoDeliveryCityCode")
  private String cargoDeliveryCityCode = null;

  @JsonProperty("cargoDeliveryUNLOCPointCode")
  private String cargoDeliveryUNLOCPointCode = null;

  @JsonProperty("invoiceStatusCode")
  private String invoiceStatusCode = null;

  @JsonProperty("customsStatusCode")
  private String customsStatusCode = null;

  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("originServiceTypeCode")
  private String originServiceTypeCode = null;

  @JsonProperty("destinationServiceTypeCode")
  private String destinationServiceTypeCode = null;

  @JsonProperty("billOfLadingTypeCode")
  private String billOfLadingTypeCode = null;

  @JsonProperty("countryOfManufactureCode")
  private String countryOfManufactureCode = null;

  @JsonProperty("sourceShipmentNumber")
  private String sourceShipmentNumber = null;

  @JsonProperty("originEnteredBranchCode")
  private String originEnteredBranchCode = null;

  @JsonProperty("destinationEnteredBranchCode")
  private String destinationEnteredBranchCode = null;

  @JsonProperty("dangerousGoodsCargoPassengerCode")
  private String dangerousGoodsCargoPassengerCode = null;

  @JsonProperty("deliveryDeadlineDatetime")
  private DateTime deliveryDeadlineDatetime = null;

  @JsonProperty("customerStatedPieceCount")
  private Long customerStatedPieceCount = null;

  @JsonProperty("carrierPieceCount")
  private Long carrierPieceCount = null;

  @JsonProperty("customerStatedWeight")
  private Integer customerStatedWeight = null;

  @JsonProperty("actualWeight")
  private Integer actualWeight = null;

  @JsonProperty("ratedWeight")
  private Integer ratedWeight = null;

  @JsonProperty("dimensionalWeight")
  private Integer dimensionalWeight = null;

  @JsonProperty("dimensionalFactor")
  private Integer dimensionalFactor = null;

  @JsonProperty("volume")
  private Integer volume = null;

  @JsonProperty("dataEntryMode")
  private String dataEntryMode = null;

  @JsonProperty("enteredbyUser")
  private String enteredbyUser = null;

  @JsonProperty("federalMaritimeCommissionIndicator")
  private Boolean federalMaritimeCommissionIndicator = false;

  @JsonProperty("freightAvailableDate")
  private DateTime freightAvailableDate = null;

  @JsonProperty("requiredOnsiteDate")
  private DateTime requiredOnsiteDate = null;

  @JsonProperty("numberofOriginals")
  private Long numberofOriginals = null;

  @JsonProperty("originBranchCutoffDate")
  private DateTime originBranchCutoffDate = null;

  @JsonProperty("exportDocsFinalReceiptDate")
  private DateTime exportDocsFinalReceiptDate = null;

  @JsonProperty("requiredShipDate")
  private DateTime requiredShipDate = null;

  @JsonProperty("forwarderCargoReceiptIssueDate")
  private DateTime forwarderCargoReceiptIssueDate = null;

  @JsonProperty("exportPickupReadyDate")
  private DateTime exportPickupReadyDate = null;

  @JsonProperty("cargoArrivalNoticeDate")
  private DateTime cargoArrivalNoticeDate = null;

  @JsonProperty("deliveryOrderDate")
  private DateTime deliveryOrderDate = null;

  @JsonProperty("importPickupReadyDate")
  private DateTime importPickupReadyDate = null;

  @JsonProperty("freetimeExpirationDate")
  private DateTime freetimeExpirationDate = null;

  @JsonProperty("freeCalendarDays")
  private Long freeCalendarDays = null;

  @JsonProperty("shipmentAtDestinationDate")
  private DateTime shipmentAtDestinationDate = null;

  @JsonProperty("createdby")
  private String createdby = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("updatedby")
  private String updatedby = null;

  @JsonProperty("updatedDate")
  private DateTime updatedDate = null;

  @JsonProperty("pieceLine")
  private PieceLine pieceLine = null;

  @JsonProperty("shipmentParty")
  private ShipmentParty shipmentParty = null;

  @JsonProperty("shipmentPartyContact")
  private ShipmentPartyContact shipmentPartyContact = null;

  public Sequence shipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(value = "")
  public Long getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(Long shipmentId) {
    this.shipmentId = shipmentId;
  }

  public Sequence shipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * Get shipmentNumber
   * @return shipmentNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getShipmentNumber() {
    return shipmentNumber;
  }

  public void setShipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }

  public Sequence shipmentTypeCode(String shipmentTypeCode) {
    this.shipmentTypeCode = shipmentTypeCode;
    return this;
  }

   /**
   * Get shipmentTypeCode
   * @return shipmentTypeCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getShipmentTypeCode() {
    return shipmentTypeCode;
  }

  public void setShipmentTypeCode(String shipmentTypeCode) {
    this.shipmentTypeCode = shipmentTypeCode;
  }

  public Sequence paymentTermCode(String paymentTermCode) {
    this.paymentTermCode = paymentTermCode;
    return this;
  }

   /**
   * Get paymentTermCode
   * @return paymentTermCode
  **/
  @ApiModelProperty(value = "")
  public String getPaymentTermCode() {
    return paymentTermCode;
  }

  public void setPaymentTermCode(String paymentTermCode) {
    this.paymentTermCode = paymentTermCode;
  }

  public Sequence receivedLocationCode(String receivedLocationCode) {
    this.receivedLocationCode = receivedLocationCode;
    return this;
  }

   /**
   * Get receivedLocationCode
   * @return receivedLocationCode
  **/
  @ApiModelProperty(value = "")
  public String getReceivedLocationCode() {
    return receivedLocationCode;
  }

  public void setReceivedLocationCode(String receivedLocationCode) {
    this.receivedLocationCode = receivedLocationCode;
  }

  public Sequence originTariffPointCode(String originTariffPointCode) {
    this.originTariffPointCode = originTariffPointCode;
    return this;
  }

   /**
   * Get originTariffPointCode
   * @return originTariffPointCode
  **/
  @ApiModelProperty(value = "")
  public String getOriginTariffPointCode() {
    return originTariffPointCode;
  }

  public void setOriginTariffPointCode(String originTariffPointCode) {
    this.originTariffPointCode = originTariffPointCode;
  }

  public Sequence destinationTariffPointCode(String destinationTariffPointCode) {
    this.destinationTariffPointCode = destinationTariffPointCode;
    return this;
  }

   /**
   * Get destinationTariffPointCode
   * @return destinationTariffPointCode
  **/
  @ApiModelProperty(value = "")
  public String getDestinationTariffPointCode() {
    return destinationTariffPointCode;
  }

  public void setDestinationTariffPointCode(String destinationTariffPointCode) {
    this.destinationTariffPointCode = destinationTariffPointCode;
  }

  public Sequence originBranchCode(String originBranchCode) {
    this.originBranchCode = originBranchCode;
    return this;
  }

   /**
   * Get originBranchCode
   * @return originBranchCode
  **/
  @ApiModelProperty(value = "")
  public String getOriginBranchCode() {
    return originBranchCode;
  }

  public void setOriginBranchCode(String originBranchCode) {
    this.originBranchCode = originBranchCode;
  }

  public Sequence destinationBranchCode(String destinationBranchCode) {
    this.destinationBranchCode = destinationBranchCode;
    return this;
  }

   /**
   * Get destinationBranchCode
   * @return destinationBranchCode
  **/
  @ApiModelProperty(value = "")
  public String getDestinationBranchCode() {
    return destinationBranchCode;
  }

  public void setDestinationBranchCode(String destinationBranchCode) {
    this.destinationBranchCode = destinationBranchCode;
  }

  public Sequence deliveryDeadlineCode(DateTime deliveryDeadlineCode) {
    this.deliveryDeadlineCode = deliveryDeadlineCode;
    return this;
  }

   /**
   * Get deliveryDeadlineCode
   * @return deliveryDeadlineCode
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeliveryDeadlineCode() {
    return deliveryDeadlineCode;
  }

  public void setDeliveryDeadlineCode(DateTime deliveryDeadlineCode) {
    this.deliveryDeadlineCode = deliveryDeadlineCode;
  }

  public Sequence receivedDate(DateTime receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Get receivedDate
   * @return receivedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(DateTime receivedDate) {
    this.receivedDate = receivedDate;
  }

  public Sequence grossWeightMaxUOMCode(String grossWeightMaxUOMCode) {
    this.grossWeightMaxUOMCode = grossWeightMaxUOMCode;
    return this;
  }

   /**
   * Get grossWeightMaxUOMCode
   * @return grossWeightMaxUOMCode
  **/
  @ApiModelProperty(value = "")
  public String getGrossWeightMaxUOMCode() {
    return grossWeightMaxUOMCode;
  }

  public void setGrossWeightMaxUOMCode(String grossWeightMaxUOMCode) {
    this.grossWeightMaxUOMCode = grossWeightMaxUOMCode;
  }

  public Sequence volumeMaximum(Long volumeMaximum) {
    this.volumeMaximum = volumeMaximum;
    return this;
  }

   /**
   * Get volumeMaximum
   * @return volumeMaximum
  **/
  @ApiModelProperty(value = "")
  public Long getVolumeMaximum() {
    return volumeMaximum;
  }

  public void setVolumeMaximum(Long volumeMaximum) {
    this.volumeMaximum = volumeMaximum;
  }

  public Sequence volumeMaximumUnitMeasurement(String volumeMaximumUnitMeasurement) {
    this.volumeMaximumUnitMeasurement = volumeMaximumUnitMeasurement;
    return this;
  }

   /**
   * Get volumeMaximumUnitMeasurement
   * @return volumeMaximumUnitMeasurement
  **/
  @ApiModelProperty(value = "")
  public String getVolumeMaximumUnitMeasurement() {
    return volumeMaximumUnitMeasurement;
  }

  public void setVolumeMaximumUnitMeasurement(String volumeMaximumUnitMeasurement) {
    this.volumeMaximumUnitMeasurement = volumeMaximumUnitMeasurement;
  }

  public Sequence statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public Sequence customerStatedWeightMeasurementUnit(String customerStatedWeightMeasurementUnit) {
    this.customerStatedWeightMeasurementUnit = customerStatedWeightMeasurementUnit;
    return this;
  }

   /**
   * Get customerStatedWeightMeasurementUnit
   * @return customerStatedWeightMeasurementUnit
  **/
  @ApiModelProperty(value = "")
  public String getCustomerStatedWeightMeasurementUnit() {
    return customerStatedWeightMeasurementUnit;
  }

  public void setCustomerStatedWeightMeasurementUnit(String customerStatedWeightMeasurementUnit) {
    this.customerStatedWeightMeasurementUnit = customerStatedWeightMeasurementUnit;
  }

  public Sequence actualWeightMeasurementCode(String actualWeightMeasurementCode) {
    this.actualWeightMeasurementCode = actualWeightMeasurementCode;
    return this;
  }

   /**
   * Get actualWeightMeasurementCode
   * @return actualWeightMeasurementCode
  **/
  @ApiModelProperty(value = "")
  public String getActualWeightMeasurementCode() {
    return actualWeightMeasurementCode;
  }

  public void setActualWeightMeasurementCode(String actualWeightMeasurementCode) {
    this.actualWeightMeasurementCode = actualWeightMeasurementCode;
  }

  public Sequence ratedWeightMeasurementCode(String ratedWeightMeasurementCode) {
    this.ratedWeightMeasurementCode = ratedWeightMeasurementCode;
    return this;
  }

   /**
   * Get ratedWeightMeasurementCode
   * @return ratedWeightMeasurementCode
  **/
  @ApiModelProperty(value = "")
  public String getRatedWeightMeasurementCode() {
    return ratedWeightMeasurementCode;
  }

  public void setRatedWeightMeasurementCode(String ratedWeightMeasurementCode) {
    this.ratedWeightMeasurementCode = ratedWeightMeasurementCode;
  }

  public Sequence dimensionalWeightMeasurementCode(String dimensionalWeightMeasurementCode) {
    this.dimensionalWeightMeasurementCode = dimensionalWeightMeasurementCode;
    return this;
  }

   /**
   * Get dimensionalWeightMeasurementCode
   * @return dimensionalWeightMeasurementCode
  **/
  @ApiModelProperty(value = "")
  public String getDimensionalWeightMeasurementCode() {
    return dimensionalWeightMeasurementCode;
  }

  public void setDimensionalWeightMeasurementCode(String dimensionalWeightMeasurementCode) {
    this.dimensionalWeightMeasurementCode = dimensionalWeightMeasurementCode;
  }

  public Sequence volumeWeightMeasurementUnit(String volumeWeightMeasurementUnit) {
    this.volumeWeightMeasurementUnit = volumeWeightMeasurementUnit;
    return this;
  }

   /**
   * Get volumeWeightMeasurementUnit
   * @return volumeWeightMeasurementUnit
  **/
  @ApiModelProperty(value = "")
  public String getVolumeWeightMeasurementUnit() {
    return volumeWeightMeasurementUnit;
  }

  public void setVolumeWeightMeasurementUnit(String volumeWeightMeasurementUnit) {
    this.volumeWeightMeasurementUnit = volumeWeightMeasurementUnit;
  }

  public Sequence importGatewayCode(String importGatewayCode) {
    this.importGatewayCode = importGatewayCode;
    return this;
  }

   /**
   * Get importGatewayCode
   * @return importGatewayCode
  **/
  @ApiModelProperty(value = "")
  public String getImportGatewayCode() {
    return importGatewayCode;
  }

  public void setImportGatewayCode(String importGatewayCode) {
    this.importGatewayCode = importGatewayCode;
  }

  public Sequence exportGatewayCode(String exportGatewayCode) {
    this.exportGatewayCode = exportGatewayCode;
    return this;
  }

   /**
   * Get exportGatewayCode
   * @return exportGatewayCode
  **/
  @ApiModelProperty(value = "")
  public String getExportGatewayCode() {
    return exportGatewayCode;
  }

  public void setExportGatewayCode(String exportGatewayCode) {
    this.exportGatewayCode = exportGatewayCode;
  }

  public Sequence statusLocationCode(String statusLocationCode) {
    this.statusLocationCode = statusLocationCode;
    return this;
  }

   /**
   * Get statusLocationCode
   * @return statusLocationCode
  **/
  @ApiModelProperty(value = "")
  public String getStatusLocationCode() {
    return statusLocationCode;
  }

  public void setStatusLocationCode(String statusLocationCode) {
    this.statusLocationCode = statusLocationCode;
  }

  public Sequence dataCompleteStatusCode(String dataCompleteStatusCode) {
    this.dataCompleteStatusCode = dataCompleteStatusCode;
    return this;
  }

   /**
   * Get dataCompleteStatusCode
   * @return dataCompleteStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getDataCompleteStatusCode() {
    return dataCompleteStatusCode;
  }

  public void setDataCompleteStatusCode(String dataCompleteStatusCode) {
    this.dataCompleteStatusCode = dataCompleteStatusCode;
  }

  public Sequence loadPortCode(String loadPortCode) {
    this.loadPortCode = loadPortCode;
    return this;
  }

   /**
   * Get loadPortCode
   * @return loadPortCode
  **/
  @ApiModelProperty(value = "")
  public String getLoadPortCode() {
    return loadPortCode;
  }

  public void setLoadPortCode(String loadPortCode) {
    this.loadPortCode = loadPortCode;
  }

  public Sequence dischargePortCode(String dischargePortCode) {
    this.dischargePortCode = dischargePortCode;
    return this;
  }

   /**
   * Get dischargePortCode
   * @return dischargePortCode
  **/
  @ApiModelProperty(value = "")
  public String getDischargePortCode() {
    return dischargePortCode;
  }

  public void setDischargePortCode(String dischargePortCode) {
    this.dischargePortCode = dischargePortCode;
  }

  public Sequence cargoReceiptCountryCode(String cargoReceiptCountryCode) {
    this.cargoReceiptCountryCode = cargoReceiptCountryCode;
    return this;
  }

   /**
   * Get cargoReceiptCountryCode
   * @return cargoReceiptCountryCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoReceiptCountryCode() {
    return cargoReceiptCountryCode;
  }

  public void setCargoReceiptCountryCode(String cargoReceiptCountryCode) {
    this.cargoReceiptCountryCode = cargoReceiptCountryCode;
  }

  public Sequence cargoReceiptStateCode(String cargoReceiptStateCode) {
    this.cargoReceiptStateCode = cargoReceiptStateCode;
    return this;
  }

   /**
   * Get cargoReceiptStateCode
   * @return cargoReceiptStateCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoReceiptStateCode() {
    return cargoReceiptStateCode;
  }

  public void setCargoReceiptStateCode(String cargoReceiptStateCode) {
    this.cargoReceiptStateCode = cargoReceiptStateCode;
  }

  public Sequence cargoReceiptCityCode(String cargoReceiptCityCode) {
    this.cargoReceiptCityCode = cargoReceiptCityCode;
    return this;
  }

   /**
   * Get cargoReceiptCityCode
   * @return cargoReceiptCityCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoReceiptCityCode() {
    return cargoReceiptCityCode;
  }

  public void setCargoReceiptCityCode(String cargoReceiptCityCode) {
    this.cargoReceiptCityCode = cargoReceiptCityCode;
  }

  public Sequence cargoReceiptUNLOCPointCode(String cargoReceiptUNLOCPointCode) {
    this.cargoReceiptUNLOCPointCode = cargoReceiptUNLOCPointCode;
    return this;
  }

   /**
   * Get cargoReceiptUNLOCPointCode
   * @return cargoReceiptUNLOCPointCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoReceiptUNLOCPointCode() {
    return cargoReceiptUNLOCPointCode;
  }

  public void setCargoReceiptUNLOCPointCode(String cargoReceiptUNLOCPointCode) {
    this.cargoReceiptUNLOCPointCode = cargoReceiptUNLOCPointCode;
  }

  public Sequence cargoDeliveryCountryCode(String cargoDeliveryCountryCode) {
    this.cargoDeliveryCountryCode = cargoDeliveryCountryCode;
    return this;
  }

   /**
   * Get cargoDeliveryCountryCode
   * @return cargoDeliveryCountryCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoDeliveryCountryCode() {
    return cargoDeliveryCountryCode;
  }

  public void setCargoDeliveryCountryCode(String cargoDeliveryCountryCode) {
    this.cargoDeliveryCountryCode = cargoDeliveryCountryCode;
  }

  public Sequence cargoDeliveryStateCode(String cargoDeliveryStateCode) {
    this.cargoDeliveryStateCode = cargoDeliveryStateCode;
    return this;
  }

   /**
   * Get cargoDeliveryStateCode
   * @return cargoDeliveryStateCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoDeliveryStateCode() {
    return cargoDeliveryStateCode;
  }

  public void setCargoDeliveryStateCode(String cargoDeliveryStateCode) {
    this.cargoDeliveryStateCode = cargoDeliveryStateCode;
  }

  public Sequence cargoDeliveryCityCode(String cargoDeliveryCityCode) {
    this.cargoDeliveryCityCode = cargoDeliveryCityCode;
    return this;
  }

   /**
   * Get cargoDeliveryCityCode
   * @return cargoDeliveryCityCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoDeliveryCityCode() {
    return cargoDeliveryCityCode;
  }

  public void setCargoDeliveryCityCode(String cargoDeliveryCityCode) {
    this.cargoDeliveryCityCode = cargoDeliveryCityCode;
  }

  public Sequence cargoDeliveryUNLOCPointCode(String cargoDeliveryUNLOCPointCode) {
    this.cargoDeliveryUNLOCPointCode = cargoDeliveryUNLOCPointCode;
    return this;
  }

   /**
   * Get cargoDeliveryUNLOCPointCode
   * @return cargoDeliveryUNLOCPointCode
  **/
  @ApiModelProperty(value = "")
  public String getCargoDeliveryUNLOCPointCode() {
    return cargoDeliveryUNLOCPointCode;
  }

  public void setCargoDeliveryUNLOCPointCode(String cargoDeliveryUNLOCPointCode) {
    this.cargoDeliveryUNLOCPointCode = cargoDeliveryUNLOCPointCode;
  }

  public Sequence invoiceStatusCode(String invoiceStatusCode) {
    this.invoiceStatusCode = invoiceStatusCode;
    return this;
  }

   /**
   * Get invoiceStatusCode
   * @return invoiceStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceStatusCode() {
    return invoiceStatusCode;
  }

  public void setInvoiceStatusCode(String invoiceStatusCode) {
    this.invoiceStatusCode = invoiceStatusCode;
  }

  public Sequence customsStatusCode(String customsStatusCode) {
    this.customsStatusCode = customsStatusCode;
    return this;
  }

   /**
   * Get customsStatusCode
   * @return customsStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getCustomsStatusCode() {
    return customsStatusCode;
  }

  public void setCustomsStatusCode(String customsStatusCode) {
    this.customsStatusCode = customsStatusCode;
  }

  public Sequence productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @ApiModelProperty(value = "")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Sequence originServiceTypeCode(String originServiceTypeCode) {
    this.originServiceTypeCode = originServiceTypeCode;
    return this;
  }

   /**
   * Get originServiceTypeCode
   * @return originServiceTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getOriginServiceTypeCode() {
    return originServiceTypeCode;
  }

  public void setOriginServiceTypeCode(String originServiceTypeCode) {
    this.originServiceTypeCode = originServiceTypeCode;
  }

  public Sequence destinationServiceTypeCode(String destinationServiceTypeCode) {
    this.destinationServiceTypeCode = destinationServiceTypeCode;
    return this;
  }

   /**
   * Get destinationServiceTypeCode
   * @return destinationServiceTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getDestinationServiceTypeCode() {
    return destinationServiceTypeCode;
  }

  public void setDestinationServiceTypeCode(String destinationServiceTypeCode) {
    this.destinationServiceTypeCode = destinationServiceTypeCode;
  }

  public Sequence billOfLadingTypeCode(String billOfLadingTypeCode) {
    this.billOfLadingTypeCode = billOfLadingTypeCode;
    return this;
  }

   /**
   * Get billOfLadingTypeCode
   * @return billOfLadingTypeCode
  **/
  @ApiModelProperty(value = "")
  public String getBillOfLadingTypeCode() {
    return billOfLadingTypeCode;
  }

  public void setBillOfLadingTypeCode(String billOfLadingTypeCode) {
    this.billOfLadingTypeCode = billOfLadingTypeCode;
  }

  public Sequence countryOfManufactureCode(String countryOfManufactureCode) {
    this.countryOfManufactureCode = countryOfManufactureCode;
    return this;
  }

   /**
   * Get countryOfManufactureCode
   * @return countryOfManufactureCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryOfManufactureCode() {
    return countryOfManufactureCode;
  }

  public void setCountryOfManufactureCode(String countryOfManufactureCode) {
    this.countryOfManufactureCode = countryOfManufactureCode;
  }

  public Sequence sourceShipmentNumber(String sourceShipmentNumber) {
    this.sourceShipmentNumber = sourceShipmentNumber;
    return this;
  }

   /**
   * Get sourceShipmentNumber
   * @return sourceShipmentNumber
  **/
  @ApiModelProperty(value = "")
  public String getSourceShipmentNumber() {
    return sourceShipmentNumber;
  }

  public void setSourceShipmentNumber(String sourceShipmentNumber) {
    this.sourceShipmentNumber = sourceShipmentNumber;
  }

  public Sequence originEnteredBranchCode(String originEnteredBranchCode) {
    this.originEnteredBranchCode = originEnteredBranchCode;
    return this;
  }

   /**
   * Get originEnteredBranchCode
   * @return originEnteredBranchCode
  **/
  @ApiModelProperty(value = "")
  public String getOriginEnteredBranchCode() {
    return originEnteredBranchCode;
  }

  public void setOriginEnteredBranchCode(String originEnteredBranchCode) {
    this.originEnteredBranchCode = originEnteredBranchCode;
  }

  public Sequence destinationEnteredBranchCode(String destinationEnteredBranchCode) {
    this.destinationEnteredBranchCode = destinationEnteredBranchCode;
    return this;
  }

   /**
   * Get destinationEnteredBranchCode
   * @return destinationEnteredBranchCode
  **/
  @ApiModelProperty(value = "")
  public String getDestinationEnteredBranchCode() {
    return destinationEnteredBranchCode;
  }

  public void setDestinationEnteredBranchCode(String destinationEnteredBranchCode) {
    this.destinationEnteredBranchCode = destinationEnteredBranchCode;
  }

  public Sequence dangerousGoodsCargoPassengerCode(String dangerousGoodsCargoPassengerCode) {
    this.dangerousGoodsCargoPassengerCode = dangerousGoodsCargoPassengerCode;
    return this;
  }

   /**
   * Get dangerousGoodsCargoPassengerCode
   * @return dangerousGoodsCargoPassengerCode
  **/
  @ApiModelProperty(value = "")
  public String getDangerousGoodsCargoPassengerCode() {
    return dangerousGoodsCargoPassengerCode;
  }

  public void setDangerousGoodsCargoPassengerCode(String dangerousGoodsCargoPassengerCode) {
    this.dangerousGoodsCargoPassengerCode = dangerousGoodsCargoPassengerCode;
  }

  public Sequence deliveryDeadlineDatetime(DateTime deliveryDeadlineDatetime) {
    this.deliveryDeadlineDatetime = deliveryDeadlineDatetime;
    return this;
  }

   /**
   * Get deliveryDeadlineDatetime
   * @return deliveryDeadlineDatetime
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeliveryDeadlineDatetime() {
    return deliveryDeadlineDatetime;
  }

  public void setDeliveryDeadlineDatetime(DateTime deliveryDeadlineDatetime) {
    this.deliveryDeadlineDatetime = deliveryDeadlineDatetime;
  }

  public Sequence customerStatedPieceCount(Long customerStatedPieceCount) {
    this.customerStatedPieceCount = customerStatedPieceCount;
    return this;
  }

   /**
   * Get customerStatedPieceCount
   * @return customerStatedPieceCount
  **/
  @ApiModelProperty(value = "")
  public Long getCustomerStatedPieceCount() {
    return customerStatedPieceCount;
  }

  public void setCustomerStatedPieceCount(Long customerStatedPieceCount) {
    this.customerStatedPieceCount = customerStatedPieceCount;
  }

  public Sequence carrierPieceCount(Long carrierPieceCount) {
    this.carrierPieceCount = carrierPieceCount;
    return this;
  }

   /**
   * Get carrierPieceCount
   * @return carrierPieceCount
  **/
  @ApiModelProperty(value = "")
  public Long getCarrierPieceCount() {
    return carrierPieceCount;
  }

  public void setCarrierPieceCount(Long carrierPieceCount) {
    this.carrierPieceCount = carrierPieceCount;
  }

  public Sequence customerStatedWeight(Integer customerStatedWeight) {
    this.customerStatedWeight = customerStatedWeight;
    return this;
  }

   /**
   * Get customerStatedWeight
   * @return customerStatedWeight
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerStatedWeight() {
    return customerStatedWeight;
  }

  public void setCustomerStatedWeight(Integer customerStatedWeight) {
    this.customerStatedWeight = customerStatedWeight;
  }

  public Sequence actualWeight(Integer actualWeight) {
    this.actualWeight = actualWeight;
    return this;
  }

   /**
   * Get actualWeight
   * @return actualWeight
  **/
  @ApiModelProperty(value = "")
  public Integer getActualWeight() {
    return actualWeight;
  }

  public void setActualWeight(Integer actualWeight) {
    this.actualWeight = actualWeight;
  }

  public Sequence ratedWeight(Integer ratedWeight) {
    this.ratedWeight = ratedWeight;
    return this;
  }

   /**
   * Get ratedWeight
   * @return ratedWeight
  **/
  @ApiModelProperty(value = "")
  public Integer getRatedWeight() {
    return ratedWeight;
  }

  public void setRatedWeight(Integer ratedWeight) {
    this.ratedWeight = ratedWeight;
  }

  public Sequence dimensionalWeight(Integer dimensionalWeight) {
    this.dimensionalWeight = dimensionalWeight;
    return this;
  }

   /**
   * Get dimensionalWeight
   * @return dimensionalWeight
  **/
  @ApiModelProperty(value = "")
  public Integer getDimensionalWeight() {
    return dimensionalWeight;
  }

  public void setDimensionalWeight(Integer dimensionalWeight) {
    this.dimensionalWeight = dimensionalWeight;
  }

  public Sequence dimensionalFactor(Integer dimensionalFactor) {
    this.dimensionalFactor = dimensionalFactor;
    return this;
  }

   /**
   * Get dimensionalFactor
   * @return dimensionalFactor
  **/
  @ApiModelProperty(value = "")
  public Integer getDimensionalFactor() {
    return dimensionalFactor;
  }

  public void setDimensionalFactor(Integer dimensionalFactor) {
    this.dimensionalFactor = dimensionalFactor;
  }

  public Sequence volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public Sequence dataEntryMode(String dataEntryMode) {
    this.dataEntryMode = dataEntryMode;
    return this;
  }

   /**
   * Get dataEntryMode
   * @return dataEntryMode
  **/
  @ApiModelProperty(value = "")
  public String getDataEntryMode() {
    return dataEntryMode;
  }

  public void setDataEntryMode(String dataEntryMode) {
    this.dataEntryMode = dataEntryMode;
  }

  public Sequence enteredbyUser(String enteredbyUser) {
    this.enteredbyUser = enteredbyUser;
    return this;
  }

   /**
   * Get enteredbyUser
   * @return enteredbyUser
  **/
  @ApiModelProperty(value = "")
  public String getEnteredbyUser() {
    return enteredbyUser;
  }

  public void setEnteredbyUser(String enteredbyUser) {
    this.enteredbyUser = enteredbyUser;
  }

  public Sequence federalMaritimeCommissionIndicator(Boolean federalMaritimeCommissionIndicator) {
    this.federalMaritimeCommissionIndicator = federalMaritimeCommissionIndicator;
    return this;
  }

   /**
   * Get federalMaritimeCommissionIndicator
   * @return federalMaritimeCommissionIndicator
  **/
  @ApiModelProperty(value = "")
  public Boolean getFederalMaritimeCommissionIndicator() {
    return federalMaritimeCommissionIndicator;
  }

  public void setFederalMaritimeCommissionIndicator(Boolean federalMaritimeCommissionIndicator) {
    this.federalMaritimeCommissionIndicator = federalMaritimeCommissionIndicator;
  }

  public Sequence freightAvailableDate(DateTime freightAvailableDate) {
    this.freightAvailableDate = freightAvailableDate;
    return this;
  }

   /**
   * Get freightAvailableDate
   * @return freightAvailableDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getFreightAvailableDate() {
    return freightAvailableDate;
  }

  public void setFreightAvailableDate(DateTime freightAvailableDate) {
    this.freightAvailableDate = freightAvailableDate;
  }

  public Sequence requiredOnsiteDate(DateTime requiredOnsiteDate) {
    this.requiredOnsiteDate = requiredOnsiteDate;
    return this;
  }

   /**
   * Get requiredOnsiteDate
   * @return requiredOnsiteDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getRequiredOnsiteDate() {
    return requiredOnsiteDate;
  }

  public void setRequiredOnsiteDate(DateTime requiredOnsiteDate) {
    this.requiredOnsiteDate = requiredOnsiteDate;
  }

  public Sequence numberofOriginals(Long numberofOriginals) {
    this.numberofOriginals = numberofOriginals;
    return this;
  }

   /**
   * Get numberofOriginals
   * @return numberofOriginals
  **/
  @ApiModelProperty(value = "")
  public Long getNumberofOriginals() {
    return numberofOriginals;
  }

  public void setNumberofOriginals(Long numberofOriginals) {
    this.numberofOriginals = numberofOriginals;
  }

  public Sequence originBranchCutoffDate(DateTime originBranchCutoffDate) {
    this.originBranchCutoffDate = originBranchCutoffDate;
    return this;
  }

   /**
   * Get originBranchCutoffDate
   * @return originBranchCutoffDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getOriginBranchCutoffDate() {
    return originBranchCutoffDate;
  }

  public void setOriginBranchCutoffDate(DateTime originBranchCutoffDate) {
    this.originBranchCutoffDate = originBranchCutoffDate;
  }

  public Sequence exportDocsFinalReceiptDate(DateTime exportDocsFinalReceiptDate) {
    this.exportDocsFinalReceiptDate = exportDocsFinalReceiptDate;
    return this;
  }

   /**
   * Get exportDocsFinalReceiptDate
   * @return exportDocsFinalReceiptDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getExportDocsFinalReceiptDate() {
    return exportDocsFinalReceiptDate;
  }

  public void setExportDocsFinalReceiptDate(DateTime exportDocsFinalReceiptDate) {
    this.exportDocsFinalReceiptDate = exportDocsFinalReceiptDate;
  }

  public Sequence requiredShipDate(DateTime requiredShipDate) {
    this.requiredShipDate = requiredShipDate;
    return this;
  }

   /**
   * Get requiredShipDate
   * @return requiredShipDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getRequiredShipDate() {
    return requiredShipDate;
  }

  public void setRequiredShipDate(DateTime requiredShipDate) {
    this.requiredShipDate = requiredShipDate;
  }

  public Sequence forwarderCargoReceiptIssueDate(DateTime forwarderCargoReceiptIssueDate) {
    this.forwarderCargoReceiptIssueDate = forwarderCargoReceiptIssueDate;
    return this;
  }

   /**
   * Get forwarderCargoReceiptIssueDate
   * @return forwarderCargoReceiptIssueDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getForwarderCargoReceiptIssueDate() {
    return forwarderCargoReceiptIssueDate;
  }

  public void setForwarderCargoReceiptIssueDate(DateTime forwarderCargoReceiptIssueDate) {
    this.forwarderCargoReceiptIssueDate = forwarderCargoReceiptIssueDate;
  }

  public Sequence exportPickupReadyDate(DateTime exportPickupReadyDate) {
    this.exportPickupReadyDate = exportPickupReadyDate;
    return this;
  }

   /**
   * Get exportPickupReadyDate
   * @return exportPickupReadyDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getExportPickupReadyDate() {
    return exportPickupReadyDate;
  }

  public void setExportPickupReadyDate(DateTime exportPickupReadyDate) {
    this.exportPickupReadyDate = exportPickupReadyDate;
  }

  public Sequence cargoArrivalNoticeDate(DateTime cargoArrivalNoticeDate) {
    this.cargoArrivalNoticeDate = cargoArrivalNoticeDate;
    return this;
  }

   /**
   * Get cargoArrivalNoticeDate
   * @return cargoArrivalNoticeDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCargoArrivalNoticeDate() {
    return cargoArrivalNoticeDate;
  }

  public void setCargoArrivalNoticeDate(DateTime cargoArrivalNoticeDate) {
    this.cargoArrivalNoticeDate = cargoArrivalNoticeDate;
  }

  public Sequence deliveryOrderDate(DateTime deliveryOrderDate) {
    this.deliveryOrderDate = deliveryOrderDate;
    return this;
  }

   /**
   * Get deliveryOrderDate
   * @return deliveryOrderDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeliveryOrderDate() {
    return deliveryOrderDate;
  }

  public void setDeliveryOrderDate(DateTime deliveryOrderDate) {
    this.deliveryOrderDate = deliveryOrderDate;
  }

  public Sequence importPickupReadyDate(DateTime importPickupReadyDate) {
    this.importPickupReadyDate = importPickupReadyDate;
    return this;
  }

   /**
   * Get importPickupReadyDate
   * @return importPickupReadyDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getImportPickupReadyDate() {
    return importPickupReadyDate;
  }

  public void setImportPickupReadyDate(DateTime importPickupReadyDate) {
    this.importPickupReadyDate = importPickupReadyDate;
  }

  public Sequence freetimeExpirationDate(DateTime freetimeExpirationDate) {
    this.freetimeExpirationDate = freetimeExpirationDate;
    return this;
  }

   /**
   * Get freetimeExpirationDate
   * @return freetimeExpirationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getFreetimeExpirationDate() {
    return freetimeExpirationDate;
  }

  public void setFreetimeExpirationDate(DateTime freetimeExpirationDate) {
    this.freetimeExpirationDate = freetimeExpirationDate;
  }

  public Sequence freeCalendarDays(Long freeCalendarDays) {
    this.freeCalendarDays = freeCalendarDays;
    return this;
  }

   /**
   * Get freeCalendarDays
   * @return freeCalendarDays
  **/
  @ApiModelProperty(value = "")
  public Long getFreeCalendarDays() {
    return freeCalendarDays;
  }

  public void setFreeCalendarDays(Long freeCalendarDays) {
    this.freeCalendarDays = freeCalendarDays;
  }

  public Sequence shipmentAtDestinationDate(DateTime shipmentAtDestinationDate) {
    this.shipmentAtDestinationDate = shipmentAtDestinationDate;
    return this;
  }

   /**
   * Get shipmentAtDestinationDate
   * @return shipmentAtDestinationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getShipmentAtDestinationDate() {
    return shipmentAtDestinationDate;
  }

  public void setShipmentAtDestinationDate(DateTime shipmentAtDestinationDate) {
    this.shipmentAtDestinationDate = shipmentAtDestinationDate;
  }

  public Sequence createdby(String createdby) {
    this.createdby = createdby;
    return this;
  }

   /**
   * Get createdby
   * @return createdby
  **/
  @ApiModelProperty(value = "")
  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public Sequence createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Sequence updatedby(String updatedby) {
    this.updatedby = updatedby;
    return this;
  }

   /**
   * Get updatedby
   * @return updatedby
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(String updatedby) {
    this.updatedby = updatedby;
  }

  public Sequence updatedDate(DateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(DateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Sequence pieceLine(PieceLine pieceLine) {
    this.pieceLine = pieceLine;
    return this;
  }

   /**
   * Get pieceLine
   * @return pieceLine
  **/
  @ApiModelProperty(value = "")
  public PieceLine getPieceLine() {
    return pieceLine;
  }

  public void setPieceLine(PieceLine pieceLine) {
    this.pieceLine = pieceLine;
  }

  public Sequence shipmentParty(ShipmentParty shipmentParty) {
    this.shipmentParty = shipmentParty;
    return this;
  }

   /**
   * Get shipmentParty
   * @return shipmentParty
  **/
  @ApiModelProperty(value = "")
  public ShipmentParty getShipmentParty() {
    return shipmentParty;
  }

  public void setShipmentParty(ShipmentParty shipmentParty) {
    this.shipmentParty = shipmentParty;
  }

  public Sequence shipmentPartyContact(ShipmentPartyContact shipmentPartyContact) {
    this.shipmentPartyContact = shipmentPartyContact;
    return this;
  }

   /**
   * Get shipmentPartyContact
   * @return shipmentPartyContact
  **/
  @ApiModelProperty(value = "")
  public ShipmentPartyContact getShipmentPartyContact() {
    return shipmentPartyContact;
  }

  public void setShipmentPartyContact(ShipmentPartyContact shipmentPartyContact) {
    this.shipmentPartyContact = shipmentPartyContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sequence sequence = (Sequence) o;
    return Objects.equals(this.shipmentId, sequence.shipmentId) &&
        Objects.equals(this.shipmentNumber, sequence.shipmentNumber) &&
        Objects.equals(this.shipmentTypeCode, sequence.shipmentTypeCode) &&
        Objects.equals(this.paymentTermCode, sequence.paymentTermCode) &&
        Objects.equals(this.receivedLocationCode, sequence.receivedLocationCode) &&
        Objects.equals(this.originTariffPointCode, sequence.originTariffPointCode) &&
        Objects.equals(this.destinationTariffPointCode, sequence.destinationTariffPointCode) &&
        Objects.equals(this.originBranchCode, sequence.originBranchCode) &&
        Objects.equals(this.destinationBranchCode, sequence.destinationBranchCode) &&
        Objects.equals(this.deliveryDeadlineCode, sequence.deliveryDeadlineCode) &&
        Objects.equals(this.receivedDate, sequence.receivedDate) &&
        Objects.equals(this.grossWeightMaxUOMCode, sequence.grossWeightMaxUOMCode) &&
        Objects.equals(this.volumeMaximum, sequence.volumeMaximum) &&
        Objects.equals(this.volumeMaximumUnitMeasurement, sequence.volumeMaximumUnitMeasurement) &&
        Objects.equals(this.statusCode, sequence.statusCode) &&
        Objects.equals(this.customerStatedWeightMeasurementUnit, sequence.customerStatedWeightMeasurementUnit) &&
        Objects.equals(this.actualWeightMeasurementCode, sequence.actualWeightMeasurementCode) &&
        Objects.equals(this.ratedWeightMeasurementCode, sequence.ratedWeightMeasurementCode) &&
        Objects.equals(this.dimensionalWeightMeasurementCode, sequence.dimensionalWeightMeasurementCode) &&
        Objects.equals(this.volumeWeightMeasurementUnit, sequence.volumeWeightMeasurementUnit) &&
        Objects.equals(this.importGatewayCode, sequence.importGatewayCode) &&
        Objects.equals(this.exportGatewayCode, sequence.exportGatewayCode) &&
        Objects.equals(this.statusLocationCode, sequence.statusLocationCode) &&
        Objects.equals(this.dataCompleteStatusCode, sequence.dataCompleteStatusCode) &&
        Objects.equals(this.loadPortCode, sequence.loadPortCode) &&
        Objects.equals(this.dischargePortCode, sequence.dischargePortCode) &&
        Objects.equals(this.cargoReceiptCountryCode, sequence.cargoReceiptCountryCode) &&
        Objects.equals(this.cargoReceiptStateCode, sequence.cargoReceiptStateCode) &&
        Objects.equals(this.cargoReceiptCityCode, sequence.cargoReceiptCityCode) &&
        Objects.equals(this.cargoReceiptUNLOCPointCode, sequence.cargoReceiptUNLOCPointCode) &&
        Objects.equals(this.cargoDeliveryCountryCode, sequence.cargoDeliveryCountryCode) &&
        Objects.equals(this.cargoDeliveryStateCode, sequence.cargoDeliveryStateCode) &&
        Objects.equals(this.cargoDeliveryCityCode, sequence.cargoDeliveryCityCode) &&
        Objects.equals(this.cargoDeliveryUNLOCPointCode, sequence.cargoDeliveryUNLOCPointCode) &&
        Objects.equals(this.invoiceStatusCode, sequence.invoiceStatusCode) &&
        Objects.equals(this.customsStatusCode, sequence.customsStatusCode) &&
        Objects.equals(this.productCode, sequence.productCode) &&
        Objects.equals(this.originServiceTypeCode, sequence.originServiceTypeCode) &&
        Objects.equals(this.destinationServiceTypeCode, sequence.destinationServiceTypeCode) &&
        Objects.equals(this.billOfLadingTypeCode, sequence.billOfLadingTypeCode) &&
        Objects.equals(this.countryOfManufactureCode, sequence.countryOfManufactureCode) &&
        Objects.equals(this.sourceShipmentNumber, sequence.sourceShipmentNumber) &&
        Objects.equals(this.originEnteredBranchCode, sequence.originEnteredBranchCode) &&
        Objects.equals(this.destinationEnteredBranchCode, sequence.destinationEnteredBranchCode) &&
        Objects.equals(this.dangerousGoodsCargoPassengerCode, sequence.dangerousGoodsCargoPassengerCode) &&
        Objects.equals(this.deliveryDeadlineDatetime, sequence.deliveryDeadlineDatetime) &&
        Objects.equals(this.customerStatedPieceCount, sequence.customerStatedPieceCount) &&
        Objects.equals(this.carrierPieceCount, sequence.carrierPieceCount) &&
        Objects.equals(this.customerStatedWeight, sequence.customerStatedWeight) &&
        Objects.equals(this.actualWeight, sequence.actualWeight) &&
        Objects.equals(this.ratedWeight, sequence.ratedWeight) &&
        Objects.equals(this.dimensionalWeight, sequence.dimensionalWeight) &&
        Objects.equals(this.dimensionalFactor, sequence.dimensionalFactor) &&
        Objects.equals(this.volume, sequence.volume) &&
        Objects.equals(this.dataEntryMode, sequence.dataEntryMode) &&
        Objects.equals(this.enteredbyUser, sequence.enteredbyUser) &&
        Objects.equals(this.federalMaritimeCommissionIndicator, sequence.federalMaritimeCommissionIndicator) &&
        Objects.equals(this.freightAvailableDate, sequence.freightAvailableDate) &&
        Objects.equals(this.requiredOnsiteDate, sequence.requiredOnsiteDate) &&
        Objects.equals(this.numberofOriginals, sequence.numberofOriginals) &&
        Objects.equals(this.originBranchCutoffDate, sequence.originBranchCutoffDate) &&
        Objects.equals(this.exportDocsFinalReceiptDate, sequence.exportDocsFinalReceiptDate) &&
        Objects.equals(this.requiredShipDate, sequence.requiredShipDate) &&
        Objects.equals(this.forwarderCargoReceiptIssueDate, sequence.forwarderCargoReceiptIssueDate) &&
        Objects.equals(this.exportPickupReadyDate, sequence.exportPickupReadyDate) &&
        Objects.equals(this.cargoArrivalNoticeDate, sequence.cargoArrivalNoticeDate) &&
        Objects.equals(this.deliveryOrderDate, sequence.deliveryOrderDate) &&
        Objects.equals(this.importPickupReadyDate, sequence.importPickupReadyDate) &&
        Objects.equals(this.freetimeExpirationDate, sequence.freetimeExpirationDate) &&
        Objects.equals(this.freeCalendarDays, sequence.freeCalendarDays) &&
        Objects.equals(this.shipmentAtDestinationDate, sequence.shipmentAtDestinationDate) &&
        Objects.equals(this.createdby, sequence.createdby) &&
        Objects.equals(this.createdDate, sequence.createdDate) &&
        Objects.equals(this.updatedby, sequence.updatedby) &&
        Objects.equals(this.updatedDate, sequence.updatedDate) &&
        Objects.equals(this.pieceLine, sequence.pieceLine) &&
        Objects.equals(this.shipmentParty, sequence.shipmentParty) &&
        Objects.equals(this.shipmentPartyContact, sequence.shipmentPartyContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, shipmentNumber, shipmentTypeCode, paymentTermCode, receivedLocationCode, originTariffPointCode, destinationTariffPointCode, originBranchCode, destinationBranchCode, deliveryDeadlineCode, receivedDate, grossWeightMaxUOMCode, volumeMaximum, volumeMaximumUnitMeasurement, statusCode, customerStatedWeightMeasurementUnit, actualWeightMeasurementCode, ratedWeightMeasurementCode, dimensionalWeightMeasurementCode, volumeWeightMeasurementUnit, importGatewayCode, exportGatewayCode, statusLocationCode, dataCompleteStatusCode, loadPortCode, dischargePortCode, cargoReceiptCountryCode, cargoReceiptStateCode, cargoReceiptCityCode, cargoReceiptUNLOCPointCode, cargoDeliveryCountryCode, cargoDeliveryStateCode, cargoDeliveryCityCode, cargoDeliveryUNLOCPointCode, invoiceStatusCode, customsStatusCode, productCode, originServiceTypeCode, destinationServiceTypeCode, billOfLadingTypeCode, countryOfManufactureCode, sourceShipmentNumber, originEnteredBranchCode, destinationEnteredBranchCode, dangerousGoodsCargoPassengerCode, deliveryDeadlineDatetime, customerStatedPieceCount, carrierPieceCount, customerStatedWeight, actualWeight, ratedWeight, dimensionalWeight, dimensionalFactor, volume, dataEntryMode, enteredbyUser, federalMaritimeCommissionIndicator, freightAvailableDate, requiredOnsiteDate, numberofOriginals, originBranchCutoffDate, exportDocsFinalReceiptDate, requiredShipDate, forwarderCargoReceiptIssueDate, exportPickupReadyDate, cargoArrivalNoticeDate, deliveryOrderDate, importPickupReadyDate, freetimeExpirationDate, freeCalendarDays, shipmentAtDestinationDate, createdby, createdDate, updatedby, updatedDate, pieceLine, shipmentParty, shipmentPartyContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sequence {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    shipmentTypeCode: ").append(toIndentedString(shipmentTypeCode)).append("\n");
    sb.append("    paymentTermCode: ").append(toIndentedString(paymentTermCode)).append("\n");
    sb.append("    receivedLocationCode: ").append(toIndentedString(receivedLocationCode)).append("\n");
    sb.append("    originTariffPointCode: ").append(toIndentedString(originTariffPointCode)).append("\n");
    sb.append("    destinationTariffPointCode: ").append(toIndentedString(destinationTariffPointCode)).append("\n");
    sb.append("    originBranchCode: ").append(toIndentedString(originBranchCode)).append("\n");
    sb.append("    destinationBranchCode: ").append(toIndentedString(destinationBranchCode)).append("\n");
    sb.append("    deliveryDeadlineCode: ").append(toIndentedString(deliveryDeadlineCode)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    grossWeightMaxUOMCode: ").append(toIndentedString(grossWeightMaxUOMCode)).append("\n");
    sb.append("    volumeMaximum: ").append(toIndentedString(volumeMaximum)).append("\n");
    sb.append("    volumeMaximumUnitMeasurement: ").append(toIndentedString(volumeMaximumUnitMeasurement)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    customerStatedWeightMeasurementUnit: ").append(toIndentedString(customerStatedWeightMeasurementUnit)).append("\n");
    sb.append("    actualWeightMeasurementCode: ").append(toIndentedString(actualWeightMeasurementCode)).append("\n");
    sb.append("    ratedWeightMeasurementCode: ").append(toIndentedString(ratedWeightMeasurementCode)).append("\n");
    sb.append("    dimensionalWeightMeasurementCode: ").append(toIndentedString(dimensionalWeightMeasurementCode)).append("\n");
    sb.append("    volumeWeightMeasurementUnit: ").append(toIndentedString(volumeWeightMeasurementUnit)).append("\n");
    sb.append("    importGatewayCode: ").append(toIndentedString(importGatewayCode)).append("\n");
    sb.append("    exportGatewayCode: ").append(toIndentedString(exportGatewayCode)).append("\n");
    sb.append("    statusLocationCode: ").append(toIndentedString(statusLocationCode)).append("\n");
    sb.append("    dataCompleteStatusCode: ").append(toIndentedString(dataCompleteStatusCode)).append("\n");
    sb.append("    loadPortCode: ").append(toIndentedString(loadPortCode)).append("\n");
    sb.append("    dischargePortCode: ").append(toIndentedString(dischargePortCode)).append("\n");
    sb.append("    cargoReceiptCountryCode: ").append(toIndentedString(cargoReceiptCountryCode)).append("\n");
    sb.append("    cargoReceiptStateCode: ").append(toIndentedString(cargoReceiptStateCode)).append("\n");
    sb.append("    cargoReceiptCityCode: ").append(toIndentedString(cargoReceiptCityCode)).append("\n");
    sb.append("    cargoReceiptUNLOCPointCode: ").append(toIndentedString(cargoReceiptUNLOCPointCode)).append("\n");
    sb.append("    cargoDeliveryCountryCode: ").append(toIndentedString(cargoDeliveryCountryCode)).append("\n");
    sb.append("    cargoDeliveryStateCode: ").append(toIndentedString(cargoDeliveryStateCode)).append("\n");
    sb.append("    cargoDeliveryCityCode: ").append(toIndentedString(cargoDeliveryCityCode)).append("\n");
    sb.append("    cargoDeliveryUNLOCPointCode: ").append(toIndentedString(cargoDeliveryUNLOCPointCode)).append("\n");
    sb.append("    invoiceStatusCode: ").append(toIndentedString(invoiceStatusCode)).append("\n");
    sb.append("    customsStatusCode: ").append(toIndentedString(customsStatusCode)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    originServiceTypeCode: ").append(toIndentedString(originServiceTypeCode)).append("\n");
    sb.append("    destinationServiceTypeCode: ").append(toIndentedString(destinationServiceTypeCode)).append("\n");
    sb.append("    billOfLadingTypeCode: ").append(toIndentedString(billOfLadingTypeCode)).append("\n");
    sb.append("    countryOfManufactureCode: ").append(toIndentedString(countryOfManufactureCode)).append("\n");
    sb.append("    sourceShipmentNumber: ").append(toIndentedString(sourceShipmentNumber)).append("\n");
    sb.append("    originEnteredBranchCode: ").append(toIndentedString(originEnteredBranchCode)).append("\n");
    sb.append("    destinationEnteredBranchCode: ").append(toIndentedString(destinationEnteredBranchCode)).append("\n");
    sb.append("    dangerousGoodsCargoPassengerCode: ").append(toIndentedString(dangerousGoodsCargoPassengerCode)).append("\n");
    sb.append("    deliveryDeadlineDatetime: ").append(toIndentedString(deliveryDeadlineDatetime)).append("\n");
    sb.append("    customerStatedPieceCount: ").append(toIndentedString(customerStatedPieceCount)).append("\n");
    sb.append("    carrierPieceCount: ").append(toIndentedString(carrierPieceCount)).append("\n");
    sb.append("    customerStatedWeight: ").append(toIndentedString(customerStatedWeight)).append("\n");
    sb.append("    actualWeight: ").append(toIndentedString(actualWeight)).append("\n");
    sb.append("    ratedWeight: ").append(toIndentedString(ratedWeight)).append("\n");
    sb.append("    dimensionalWeight: ").append(toIndentedString(dimensionalWeight)).append("\n");
    sb.append("    dimensionalFactor: ").append(toIndentedString(dimensionalFactor)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    dataEntryMode: ").append(toIndentedString(dataEntryMode)).append("\n");
    sb.append("    enteredbyUser: ").append(toIndentedString(enteredbyUser)).append("\n");
    sb.append("    federalMaritimeCommissionIndicator: ").append(toIndentedString(federalMaritimeCommissionIndicator)).append("\n");
    sb.append("    freightAvailableDate: ").append(toIndentedString(freightAvailableDate)).append("\n");
    sb.append("    requiredOnsiteDate: ").append(toIndentedString(requiredOnsiteDate)).append("\n");
    sb.append("    numberofOriginals: ").append(toIndentedString(numberofOriginals)).append("\n");
    sb.append("    originBranchCutoffDate: ").append(toIndentedString(originBranchCutoffDate)).append("\n");
    sb.append("    exportDocsFinalReceiptDate: ").append(toIndentedString(exportDocsFinalReceiptDate)).append("\n");
    sb.append("    requiredShipDate: ").append(toIndentedString(requiredShipDate)).append("\n");
    sb.append("    forwarderCargoReceiptIssueDate: ").append(toIndentedString(forwarderCargoReceiptIssueDate)).append("\n");
    sb.append("    exportPickupReadyDate: ").append(toIndentedString(exportPickupReadyDate)).append("\n");
    sb.append("    cargoArrivalNoticeDate: ").append(toIndentedString(cargoArrivalNoticeDate)).append("\n");
    sb.append("    deliveryOrderDate: ").append(toIndentedString(deliveryOrderDate)).append("\n");
    sb.append("    importPickupReadyDate: ").append(toIndentedString(importPickupReadyDate)).append("\n");
    sb.append("    freetimeExpirationDate: ").append(toIndentedString(freetimeExpirationDate)).append("\n");
    sb.append("    freeCalendarDays: ").append(toIndentedString(freeCalendarDays)).append("\n");
    sb.append("    shipmentAtDestinationDate: ").append(toIndentedString(shipmentAtDestinationDate)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedby: ").append(toIndentedString(updatedby)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    pieceLine: ").append(toIndentedString(pieceLine)).append("\n");
    sb.append("    shipmentParty: ").append(toIndentedString(shipmentParty)).append("\n");
    sb.append("    shipmentPartyContact: ").append(toIndentedString(shipmentPartyContact)).append("\n");
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

