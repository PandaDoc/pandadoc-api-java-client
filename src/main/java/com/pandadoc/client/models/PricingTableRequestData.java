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
import com.pandadoc.client.models.PricingTableRequestDataDiscount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * PricingTableRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingTableRequestData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private BigDecimal cost;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private Integer qty;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private PricingTableRequestDataDiscount discount;

  public static final String SERIALIZED_NAME_TAX_FIRST = "tax_first";
  @SerializedName(SERIALIZED_NAME_TAX_FIRST)
  private PricingTableRequestDataDiscount taxFirst;

  public static final String SERIALIZED_NAME_TAX_SECOND = "tax_second";
  @SerializedName(SERIALIZED_NAME_TAX_SECOND)
  private PricingTableRequestDataDiscount taxSecond;


  public PricingTableRequestData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Toy Panda", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PricingTableRequestData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fluffy!", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PricingTableRequestData price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public PricingTableRequestData cost(BigDecimal cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.5", value = "")

  public BigDecimal getCost() {
    return cost;
  }


  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  public PricingTableRequestData qty(Integer qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getQty() {
    return qty;
  }


  public void setQty(Integer qty) {
    this.qty = qty;
  }


  public PricingTableRequestData sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "toy_panda", value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public PricingTableRequestData discount(PricingTableRequestDataDiscount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingTableRequestDataDiscount getDiscount() {
    return discount;
  }


  public void setDiscount(PricingTableRequestDataDiscount discount) {
    this.discount = discount;
  }


  public PricingTableRequestData taxFirst(PricingTableRequestDataDiscount taxFirst) {
    
    this.taxFirst = taxFirst;
    return this;
  }

   /**
   * Get taxFirst
   * @return taxFirst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingTableRequestDataDiscount getTaxFirst() {
    return taxFirst;
  }


  public void setTaxFirst(PricingTableRequestDataDiscount taxFirst) {
    this.taxFirst = taxFirst;
  }


  public PricingTableRequestData taxSecond(PricingTableRequestDataDiscount taxSecond) {
    
    this.taxSecond = taxSecond;
    return this;
  }

   /**
   * Get taxSecond
   * @return taxSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingTableRequestDataDiscount getTaxSecond() {
    return taxSecond;
  }


  public void setTaxSecond(PricingTableRequestDataDiscount taxSecond) {
    this.taxSecond = taxSecond;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTableRequestData pricingTableRequestData = (PricingTableRequestData) o;
    return Objects.equals(this.name, pricingTableRequestData.name) &&
        Objects.equals(this.description, pricingTableRequestData.description) &&
        Objects.equals(this.price, pricingTableRequestData.price) &&
        Objects.equals(this.cost, pricingTableRequestData.cost) &&
        Objects.equals(this.qty, pricingTableRequestData.qty) &&
        Objects.equals(this.sku, pricingTableRequestData.sku) &&
        Objects.equals(this.discount, pricingTableRequestData.discount) &&
        Objects.equals(this.taxFirst, pricingTableRequestData.taxFirst) &&
        Objects.equals(this.taxSecond, pricingTableRequestData.taxSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, price, cost, qty, sku, discount, taxFirst, taxSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTableRequestData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    taxFirst: ").append(toIndentedString(taxFirst)).append("\n");
    sb.append("    taxSecond: ").append(toIndentedString(taxSecond)).append("\n");
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

