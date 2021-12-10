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
 * DocumentSendRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentSendRequest {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_SILENT = "silent";
  @SerializedName(SERIALIZED_NAME_SILENT)
  private Boolean silent;


  public DocumentSendRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message that will be sent by email with a link to a document to sign.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello! This document was sent from the PandaDoc API", value = "A message that will be sent by email with a link to a document to sign.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public DocumentSendRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Value that will be used as the email subject.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please check this test API document from PandaDoc", value = "Value that will be used as the email subject.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public DocumentSendRequest silent(Boolean silent) {
    
    this.silent = silent;
    return this;
  }

   /**
   * Disables sent, viewed, comment, and completed email notifications for document recipients and the document sender. By default, notifications emails are sent for specific actions. If set as true, it won&#39;t affect the \&quot;Approve document\&quot; email notification sent to the Approver.
   * @return silent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disables sent, viewed, comment, and completed email notifications for document recipients and the document sender. By default, notifications emails are sent for specific actions. If set as true, it won't affect the \"Approve document\" email notification sent to the Approver.")

  public Boolean getSilent() {
    return silent;
  }


  public void setSilent(Boolean silent) {
    this.silent = silent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSendRequest documentSendRequest = (DocumentSendRequest) o;
    return Objects.equals(this.message, documentSendRequest.message) &&
        Objects.equals(this.subject, documentSendRequest.subject) &&
        Objects.equals(this.silent, documentSendRequest.silent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, subject, silent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSendRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
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
