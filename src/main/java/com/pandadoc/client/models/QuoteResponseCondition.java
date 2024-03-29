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
import com.pandadoc.client.models.QuoteResponseConditionComparison;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QuoteResponseCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuoteResponseCondition {
  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COMPARISON = "comparison";
  @SerializedName(SERIALIZED_NAME_COMPARISON)
  private List<QuoteResponseConditionComparison> comparison = null;

  public QuoteResponseCondition() { 
  }

  public QuoteResponseCondition fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public QuoteResponseCondition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public QuoteResponseCondition comparison(List<QuoteResponseConditionComparison> comparison) {
    
    this.comparison = comparison;
    return this;
  }

  public QuoteResponseCondition addComparisonItem(QuoteResponseConditionComparison comparisonItem) {
    if (this.comparison == null) {
      this.comparison = new ArrayList<>();
    }
    this.comparison.add(comparisonItem);
    return this;
  }

   /**
   * Get comparison
   * @return comparison
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QuoteResponseConditionComparison> getComparison() {
    return comparison;
  }


  public void setComparison(List<QuoteResponseConditionComparison> comparison) {
    this.comparison = comparison;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteResponseCondition quoteResponseCondition = (QuoteResponseCondition) o;
    return Objects.equals(this.fieldName, quoteResponseCondition.fieldName) &&
        Objects.equals(this.type, quoteResponseCondition.type) &&
        Objects.equals(this.comparison, quoteResponseCondition.comparison);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, type, comparison);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteResponseCondition {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
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

