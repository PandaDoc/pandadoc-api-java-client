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
import com.pandadoc.client.models.DocumentSendRequestSelectedApproversGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DocumentSendRequestSelectedApproversSteps
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentSendRequestSelectedApproversSteps {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private DocumentSendRequestSelectedApproversGroup group;

  public DocumentSendRequestSelectedApproversSteps() { 
  }

  public DocumentSendRequestSelectedApproversSteps id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Step ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "LzWmancTxrgfTMpsJP9Eqd", required = true, value = "Step ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DocumentSendRequestSelectedApproversSteps group(DocumentSendRequestSelectedApproversGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentSendRequestSelectedApproversGroup getGroup() {
    return group;
  }


  public void setGroup(DocumentSendRequestSelectedApproversGroup group) {
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSendRequestSelectedApproversSteps documentSendRequestSelectedApproversSteps = (DocumentSendRequestSelectedApproversSteps) o;
    return Objects.equals(this.id, documentSendRequestSelectedApproversSteps.id) &&
        Objects.equals(this.group, documentSendRequestSelectedApproversSteps.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSendRequestSelectedApproversSteps {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

