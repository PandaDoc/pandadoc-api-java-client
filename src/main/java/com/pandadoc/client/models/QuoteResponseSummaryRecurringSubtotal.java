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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QuoteResponseSummaryRecurringSubtotal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuoteResponseSummaryRecurringSubtotal {
  public static final String SERIALIZED_NAME_BILLING_CYCLE = "billing_cycle";
  @SerializedName(SERIALIZED_NAME_BILLING_CYCLE)
  private String billingCycle;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public QuoteResponseSummaryRecurringSubtotal() { 
  }

  public QuoteResponseSummaryRecurringSubtotal billingCycle(String billingCycle) {
    
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "monthly", value = "")

  public String getBillingCycle() {
    return billingCycle;
  }


  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }


  public QuoteResponseSummaryRecurringSubtotal value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteResponseSummaryRecurringSubtotal quoteResponseSummaryRecurringSubtotal = (QuoteResponseSummaryRecurringSubtotal) o;
    return Objects.equals(this.billingCycle, quoteResponseSummaryRecurringSubtotal.billingCycle) &&
        Objects.equals(this.value, quoteResponseSummaryRecurringSubtotal.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycle, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteResponseSummaryRecurringSubtotal {\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
