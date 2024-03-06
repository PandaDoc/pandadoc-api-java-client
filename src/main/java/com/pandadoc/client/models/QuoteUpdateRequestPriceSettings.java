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
import com.pandadoc.client.models.QuoteUpdateRequestPriceSettingsTiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Price settings if the price is not flat rate. If it is null, the price is flat rate.
 */
@ApiModel(description = "Price settings if the price is not flat rate. If it is null, the price is flat rate.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuoteUpdateRequestPriceSettings {
  public static final String SERIALIZED_NAME_BASE_VALUE = "base_value";
  @SerializedName(SERIALIZED_NAME_BASE_VALUE)
  private BigDecimal baseValue;

  public static final String SERIALIZED_NAME_TIERS = "tiers";
  @SerializedName(SERIALIZED_NAME_TIERS)
  private List<QuoteUpdateRequestPriceSettingsTiers> tiers = new ArrayList<>();

  public QuoteUpdateRequestPriceSettings() { 
  }

  public QuoteUpdateRequestPriceSettings baseValue(BigDecimal baseValue) {
    
    this.baseValue = baseValue;
    return this;
  }

   /**
   * Base value for volume discount pricing. If set, tiers are treated like percentage of discount on this value. If not set, tiers are treated like a flat value discount of chosen currency.
   * @return baseValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Base value for volume discount pricing. If set, tiers are treated like percentage of discount on this value. If not set, tiers are treated like a flat value discount of chosen currency.")

  public BigDecimal getBaseValue() {
    return baseValue;
  }


  public void setBaseValue(BigDecimal baseValue) {
    this.baseValue = baseValue;
  }


  public QuoteUpdateRequestPriceSettings tiers(List<QuoteUpdateRequestPriceSettingsTiers> tiers) {
    
    this.tiers = tiers;
    return this;
  }

  public QuoteUpdateRequestPriceSettings addTiersItem(QuoteUpdateRequestPriceSettingsTiers tiersItem) {
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<QuoteUpdateRequestPriceSettingsTiers> getTiers() {
    return tiers;
  }


  public void setTiers(List<QuoteUpdateRequestPriceSettingsTiers> tiers) {
    this.tiers = tiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteUpdateRequestPriceSettings quoteUpdateRequestPriceSettings = (QuoteUpdateRequestPriceSettings) o;
    return Objects.equals(this.baseValue, quoteUpdateRequestPriceSettings.baseValue) &&
        Objects.equals(this.tiers, quoteUpdateRequestPriceSettings.tiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseValue, tiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteUpdateRequestPriceSettings {\n");
    sb.append("    baseValue: ").append(toIndentedString(baseValue)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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

