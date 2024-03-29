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
 * TemplateDetailsResponsePreassignedPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateDetailsResponsePreassignedPerson {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PLACEHOLDER_NAME = "placeholder_name";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_NAME)
  private String placeholderName;

  public static final String SERIALIZED_NAME_PLACEHOLDER_SOURCE = "placeholder_source";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_SOURCE)
  private String placeholderSource;

  public TemplateDetailsResponsePreassignedPerson() { 
  }

  public TemplateDetailsResponsePreassignedPerson email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jane@example.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public TemplateDetailsResponsePreassignedPerson type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "preassigned contact", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TemplateDetailsResponsePreassignedPerson placeholderName(String placeholderName) {
    
    this.placeholderName = placeholderName;
    return this;
  }

   /**
   * Get placeholderName
   * @return placeholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Employee", value = "")

  public String getPlaceholderName() {
    return placeholderName;
  }


  public void setPlaceholderName(String placeholderName) {
    this.placeholderName = placeholderName;
  }


  public TemplateDetailsResponsePreassignedPerson placeholderSource(String placeholderSource) {
    
    this.placeholderSource = placeholderSource;
    return this;
  }

   /**
   * Get placeholderSource
   * @return placeholderSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bamboohr", value = "")

  public String getPlaceholderSource() {
    return placeholderSource;
  }


  public void setPlaceholderSource(String placeholderSource) {
    this.placeholderSource = placeholderSource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDetailsResponsePreassignedPerson templateDetailsResponsePreassignedPerson = (TemplateDetailsResponsePreassignedPerson) o;
    return Objects.equals(this.email, templateDetailsResponsePreassignedPerson.email) &&
        Objects.equals(this.type, templateDetailsResponsePreassignedPerson.type) &&
        Objects.equals(this.placeholderName, templateDetailsResponsePreassignedPerson.placeholderName) &&
        Objects.equals(this.placeholderSource, templateDetailsResponsePreassignedPerson.placeholderSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, type, placeholderName, placeholderSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDetailsResponsePreassignedPerson {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    placeholderName: ").append(toIndentedString(placeholderName)).append("\n");
    sb.append("    placeholderSource: ").append(toIndentedString(placeholderSource)).append("\n");
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

