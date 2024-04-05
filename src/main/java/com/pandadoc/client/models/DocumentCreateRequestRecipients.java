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
import com.pandadoc.client.models.RecipientRedirect;
import com.pandadoc.client.models.RicipientDeliveryMethods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DocumentCreateRequestRecipients
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCreateRequestRecipients {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_DELIVERY_METHODS = "delivery_methods";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHODS)
  private RicipientDeliveryMethods deliveryMethods;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SIGNING_ORDER = "signing_order";
  @SerializedName(SERIALIZED_NAME_SIGNING_ORDER)
  private Integer signingOrder;

  public static final String SERIALIZED_NAME_REDIRECT = "redirect";
  @SerializedName(SERIALIZED_NAME_REDIRECT)
  private RecipientRedirect redirect;

  public DocumentCreateRequestRecipients() { 
  }

  public DocumentCreateRequestRecipients email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "josh@example.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public DocumentCreateRequestRecipients phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+14842634627", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public DocumentCreateRequestRecipients deliveryMethods(RicipientDeliveryMethods deliveryMethods) {
    
    this.deliveryMethods = deliveryMethods;
    return this;
  }

   /**
   * Get deliveryMethods
   * @return deliveryMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RicipientDeliveryMethods getDeliveryMethods() {
    return deliveryMethods;
  }


  public void setDeliveryMethods(RicipientDeliveryMethods deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }


  public DocumentCreateRequestRecipients firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Josh", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public DocumentCreateRequestRecipients lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ron", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public DocumentCreateRequestRecipients role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user", value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public DocumentCreateRequestRecipients signingOrder(Integer signingOrder) {
    
    this.signingOrder = signingOrder;
    return this;
  }

   /**
   * Get signingOrder
   * @return signingOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getSigningOrder() {
    return signingOrder;
  }


  public void setSigningOrder(Integer signingOrder) {
    this.signingOrder = signingOrder;
  }


  public DocumentCreateRequestRecipients redirect(RecipientRedirect redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * Get redirect
   * @return redirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientRedirect getRedirect() {
    return redirect;
  }


  public void setRedirect(RecipientRedirect redirect) {
    this.redirect = redirect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreateRequestRecipients documentCreateRequestRecipients = (DocumentCreateRequestRecipients) o;
    return Objects.equals(this.email, documentCreateRequestRecipients.email) &&
        Objects.equals(this.phone, documentCreateRequestRecipients.phone) &&
        Objects.equals(this.deliveryMethods, documentCreateRequestRecipients.deliveryMethods) &&
        Objects.equals(this.firstName, documentCreateRequestRecipients.firstName) &&
        Objects.equals(this.lastName, documentCreateRequestRecipients.lastName) &&
        Objects.equals(this.role, documentCreateRequestRecipients.role) &&
        Objects.equals(this.signingOrder, documentCreateRequestRecipients.signingOrder) &&
        Objects.equals(this.redirect, documentCreateRequestRecipients.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, deliveryMethods, firstName, lastName, role, signingOrder, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreateRequestRecipients {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    deliveryMethods: ").append(toIndentedString(deliveryMethods)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    signingOrder: ").append(toIndentedString(signingOrder)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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

