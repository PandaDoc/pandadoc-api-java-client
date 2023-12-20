/*
 * PandaDoc Public API
 * PandaDoc Public API documentation
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pandadoc.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.pandadoc.client.models.QuoteResponseSummaryRecurringSubtotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * QuoteResponseSectionSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuoteResponseSectionSummary {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private String subtotal;

  public static final String SERIALIZED_NAME_ONE_TIME_SUBTOTAL = "one_time_subtotal";
  @SerializedName(SERIALIZED_NAME_ONE_TIME_SUBTOTAL)
  private String oneTimeSubtotal;

  public static final String SERIALIZED_NAME_RECURRING_SUBTOTAL = "recurring_subtotal";
  @SerializedName(SERIALIZED_NAME_RECURRING_SUBTOTAL)
  private List<QuoteResponseSummaryRecurringSubtotal> recurringSubtotal = null;

  public static final String SERIALIZED_NAME_TOTAL_QTY = "total_qty";
  @SerializedName(SERIALIZED_NAME_TOTAL_QTY)
  private String totalQty;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private Object discounts;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private Object taxes;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Object fees;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, String> customFields = null;

  public static final String SERIALIZED_NAME_TOTAL_SECTION_VALUE = "total_section_value";
  @SerializedName(SERIALIZED_NAME_TOTAL_SECTION_VALUE)
  private String totalSectionValue;

  public QuoteResponseSectionSummary() { 
  }

  public QuoteResponseSectionSummary total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  public QuoteResponseSectionSummary subtotal(String subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Get subtotal
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public String getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }


  public QuoteResponseSectionSummary oneTimeSubtotal(String oneTimeSubtotal) {
    
    this.oneTimeSubtotal = oneTimeSubtotal;
    return this;
  }

   /**
   * Get oneTimeSubtotal
   * @return oneTimeSubtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "")

  public String getOneTimeSubtotal() {
    return oneTimeSubtotal;
  }


  public void setOneTimeSubtotal(String oneTimeSubtotal) {
    this.oneTimeSubtotal = oneTimeSubtotal;
  }


  public QuoteResponseSectionSummary recurringSubtotal(List<QuoteResponseSummaryRecurringSubtotal> recurringSubtotal) {
    
    this.recurringSubtotal = recurringSubtotal;
    return this;
  }

  public QuoteResponseSectionSummary addRecurringSubtotalItem(QuoteResponseSummaryRecurringSubtotal recurringSubtotalItem) {
    if (this.recurringSubtotal == null) {
      this.recurringSubtotal = new ArrayList<>();
    }
    this.recurringSubtotal.add(recurringSubtotalItem);
    return this;
  }

   /**
   * Get recurringSubtotal
   * @return recurringSubtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QuoteResponseSummaryRecurringSubtotal> getRecurringSubtotal() {
    return recurringSubtotal;
  }


  public void setRecurringSubtotal(List<QuoteResponseSummaryRecurringSubtotal> recurringSubtotal) {
    this.recurringSubtotal = recurringSubtotal;
  }


  public QuoteResponseSectionSummary totalQty(String totalQty) {
    
    this.totalQty = totalQty;
    return this;
  }

   /**
   * Get totalQty
   * @return totalQty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalQty() {
    return totalQty;
  }


  public void setTotalQty(String totalQty) {
    this.totalQty = totalQty;
  }


  public QuoteResponseSectionSummary discounts(Object discounts) {
    
    this.discounts = discounts;
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDiscounts() {
    return discounts;
  }


  public void setDiscounts(Object discounts) {
    this.discounts = discounts;
  }


  public QuoteResponseSectionSummary taxes(Object taxes) {
    
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTaxes() {
    return taxes;
  }


  public void setTaxes(Object taxes) {
    this.taxes = taxes;
  }


  public QuoteResponseSectionSummary fees(Object fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFees() {
    return fees;
  }


  public void setFees(Object fees) {
    this.fees = fees;
  }


  public QuoteResponseSectionSummary customFields(Map<String, String> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public QuoteResponseSectionSummary putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  public QuoteResponseSectionSummary totalSectionValue(String totalSectionValue) {
    
    this.totalSectionValue = totalSectionValue;
    return this;
  }

   /**
   * Get totalSectionValue
   * @return totalSectionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1900", value = "")

  public String getTotalSectionValue() {
    return totalSectionValue;
  }


  public void setTotalSectionValue(String totalSectionValue) {
    this.totalSectionValue = totalSectionValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteResponseSectionSummary quoteResponseSectionSummary = (QuoteResponseSectionSummary) o;
    return Objects.equals(this.total, quoteResponseSectionSummary.total) &&
        Objects.equals(this.subtotal, quoteResponseSectionSummary.subtotal) &&
        Objects.equals(this.oneTimeSubtotal, quoteResponseSectionSummary.oneTimeSubtotal) &&
        Objects.equals(this.recurringSubtotal, quoteResponseSectionSummary.recurringSubtotal) &&
        Objects.equals(this.totalQty, quoteResponseSectionSummary.totalQty) &&
        Objects.equals(this.discounts, quoteResponseSectionSummary.discounts) &&
        Objects.equals(this.taxes, quoteResponseSectionSummary.taxes) &&
        Objects.equals(this.fees, quoteResponseSectionSummary.fees) &&
        Objects.equals(this.customFields, quoteResponseSectionSummary.customFields) &&
        Objects.equals(this.totalSectionValue, quoteResponseSectionSummary.totalSectionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, subtotal, oneTimeSubtotal, recurringSubtotal, totalQty, discounts, taxes, fees, customFields, totalSectionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteResponseSectionSummary {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    oneTimeSubtotal: ").append(toIndentedString(oneTimeSubtotal)).append("\n");
    sb.append("    recurringSubtotal: ").append(toIndentedString(recurringSubtotal)).append("\n");
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    totalSectionValue: ").append(toIndentedString(totalSectionValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

