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
 * SectionInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SectionInfoResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT_UUID = "document_uuid";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_UUID)
  private String documentUuid;

  public SectionInfoResponse() { 
  }

  public SectionInfoResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7kqXgjFejB2toXxjcC5jfZ", value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public SectionInfoResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Sample Section from PandaDoc Template", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SectionInfoResponse documentUuid(String documentUuid) {
    
    this.documentUuid = documentUuid;
    return this;
  }

   /**
   * Get documentUuid
   * @return documentUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cKbJ7uay3cEGtsKuGPwYGX", value = "")

  public String getDocumentUuid() {
    return documentUuid;
  }


  public void setDocumentUuid(String documentUuid) {
    this.documentUuid = documentUuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionInfoResponse sectionInfoResponse = (SectionInfoResponse) o;
    return Objects.equals(this.uuid, sectionInfoResponse.uuid) &&
        Objects.equals(this.name, sectionInfoResponse.name) &&
        Objects.equals(this.documentUuid, sectionInfoResponse.documentUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, documentUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionInfoResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentUuid: ").append(toIndentedString(documentUuid)).append("\n");
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
