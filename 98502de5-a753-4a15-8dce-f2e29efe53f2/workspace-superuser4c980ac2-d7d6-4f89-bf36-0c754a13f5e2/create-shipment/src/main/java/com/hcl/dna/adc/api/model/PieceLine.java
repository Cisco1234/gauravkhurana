package com.hcl.dna.adc.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * PieceLine
 */

public class PieceLine  implements Serializable {
  @JsonProperty("pieceLineID")
  private Long pieceLineID = null;

  @JsonProperty("pieceLineDetail")
  private String pieceLineDetail = null;

  @JsonProperty("pieceLineDetailHarmonizedCode")
  private String pieceLineDetailHarmonizedCode = null;

  @JsonProperty("dangerousGoodsIndicator")
  private Boolean dangerousGoodsIndicator = false;

  @JsonProperty("value")
  private Long value = null;

  @JsonProperty("valueCurrency")
  private String valueCurrency = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("markAndNumber")
  private String markAndNumber = null;

  @JsonProperty("indicator")
  private Boolean indicator = false;

  @JsonProperty("weight")
  private Long weight = null;

  @JsonProperty("weightUOMCode")
  private String weightUOMCode = null;

  public PieceLine pieceLineID(Long pieceLineID) {
    this.pieceLineID = pieceLineID;
    return this;
  }

   /**
   * Get pieceLineID
   * @return pieceLineID
  **/
  @ApiModelProperty(value = "")
  public Long getPieceLineID() {
    return pieceLineID;
  }

  public void setPieceLineID(Long pieceLineID) {
    this.pieceLineID = pieceLineID;
  }

  public PieceLine pieceLineDetail(String pieceLineDetail) {
    this.pieceLineDetail = pieceLineDetail;
    return this;
  }

   /**
   * Get pieceLineDetail
   * @return pieceLineDetail
  **/
  @ApiModelProperty(value = "")
  public String getPieceLineDetail() {
    return pieceLineDetail;
  }

  public void setPieceLineDetail(String pieceLineDetail) {
    this.pieceLineDetail = pieceLineDetail;
  }

  public PieceLine pieceLineDetailHarmonizedCode(String pieceLineDetailHarmonizedCode) {
    this.pieceLineDetailHarmonizedCode = pieceLineDetailHarmonizedCode;
    return this;
  }

   /**
   * Get pieceLineDetailHarmonizedCode
   * @return pieceLineDetailHarmonizedCode
  **/
  @ApiModelProperty(value = "")
  public String getPieceLineDetailHarmonizedCode() {
    return pieceLineDetailHarmonizedCode;
  }

  public void setPieceLineDetailHarmonizedCode(String pieceLineDetailHarmonizedCode) {
    this.pieceLineDetailHarmonizedCode = pieceLineDetailHarmonizedCode;
  }

  public PieceLine dangerousGoodsIndicator(Boolean dangerousGoodsIndicator) {
    this.dangerousGoodsIndicator = dangerousGoodsIndicator;
    return this;
  }

   /**
   * Get dangerousGoodsIndicator
   * @return dangerousGoodsIndicator
  **/
  @ApiModelProperty(value = "")
  public Boolean getDangerousGoodsIndicator() {
    return dangerousGoodsIndicator;
  }

  public void setDangerousGoodsIndicator(Boolean dangerousGoodsIndicator) {
    this.dangerousGoodsIndicator = dangerousGoodsIndicator;
  }

  public PieceLine value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public PieceLine valueCurrency(String valueCurrency) {
    this.valueCurrency = valueCurrency;
    return this;
  }

   /**
   * Get valueCurrency
   * @return valueCurrency
  **/
  @ApiModelProperty(value = "")
  public String getValueCurrency() {
    return valueCurrency;
  }

  public void setValueCurrency(String valueCurrency) {
    this.valueCurrency = valueCurrency;
  }

  public PieceLine status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PieceLine remark(String remark) {
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(value = "")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public PieceLine markAndNumber(String markAndNumber) {
    this.markAndNumber = markAndNumber;
    return this;
  }

   /**
   * Get markAndNumber
   * @return markAndNumber
  **/
  @ApiModelProperty(value = "")
  public String getMarkAndNumber() {
    return markAndNumber;
  }

  public void setMarkAndNumber(String markAndNumber) {
    this.markAndNumber = markAndNumber;
  }

  public PieceLine indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * Get indicator
   * @return indicator
  **/
  @ApiModelProperty(value = "")
  public Boolean getIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public PieceLine weight(Long weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

  public PieceLine weightUOMCode(String weightUOMCode) {
    this.weightUOMCode = weightUOMCode;
    return this;
  }

   /**
   * Get weightUOMCode
   * @return weightUOMCode
  **/
  @ApiModelProperty(value = "")
  public String getWeightUOMCode() {
    return weightUOMCode;
  }

  public void setWeightUOMCode(String weightUOMCode) {
    this.weightUOMCode = weightUOMCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PieceLine pieceLine = (PieceLine) o;
    return Objects.equals(this.pieceLineID, pieceLine.pieceLineID) &&
        Objects.equals(this.pieceLineDetail, pieceLine.pieceLineDetail) &&
        Objects.equals(this.pieceLineDetailHarmonizedCode, pieceLine.pieceLineDetailHarmonizedCode) &&
        Objects.equals(this.dangerousGoodsIndicator, pieceLine.dangerousGoodsIndicator) &&
        Objects.equals(this.value, pieceLine.value) &&
        Objects.equals(this.valueCurrency, pieceLine.valueCurrency) &&
        Objects.equals(this.status, pieceLine.status) &&
        Objects.equals(this.remark, pieceLine.remark) &&
        Objects.equals(this.markAndNumber, pieceLine.markAndNumber) &&
        Objects.equals(this.indicator, pieceLine.indicator) &&
        Objects.equals(this.weight, pieceLine.weight) &&
        Objects.equals(this.weightUOMCode, pieceLine.weightUOMCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pieceLineID, pieceLineDetail, pieceLineDetailHarmonizedCode, dangerousGoodsIndicator, value, valueCurrency, status, remark, markAndNumber, indicator, weight, weightUOMCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieceLine {\n");
    
    sb.append("    pieceLineID: ").append(toIndentedString(pieceLineID)).append("\n");
    sb.append("    pieceLineDetail: ").append(toIndentedString(pieceLineDetail)).append("\n");
    sb.append("    pieceLineDetailHarmonizedCode: ").append(toIndentedString(pieceLineDetailHarmonizedCode)).append("\n");
    sb.append("    dangerousGoodsIndicator: ").append(toIndentedString(dangerousGoodsIndicator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueCurrency: ").append(toIndentedString(valueCurrency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    markAndNumber: ").append(toIndentedString(markAndNumber)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightUOMCode: ").append(toIndentedString(weightUOMCode)).append("\n");
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

