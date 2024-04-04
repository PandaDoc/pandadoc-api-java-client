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
import com.pandadoc.client.models.UploadSectionStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UploadSectionStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadSectionStatusResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_DOCUMENT_UUID = "document_uuid";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_UUID)
  private String documentUuid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UploadSectionStatusEnum status;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECTIONS_UUIDS = "sections_uuids";
  @SerializedName(SERIALIZED_NAME_SECTIONS_UUIDS)
  private List<String> sectionsUuids = null;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private String dateModified;

  public UploadSectionStatusResponse() { 
  }

  public UploadSectionStatusResponse uuid(String uuid) {
    
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


  public UploadSectionStatusResponse documentUuid(String documentUuid) {
    
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


  public UploadSectionStatusResponse status(UploadSectionStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadSectionStatusEnum getStatus() {
    return status;
  }


  public void setStatus(UploadSectionStatusEnum status) {
    this.status = status;
  }


  public UploadSectionStatusResponse name(String name) {
    
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


  public UploadSectionStatusResponse sectionsUuids(List<String> sectionsUuids) {
    
    this.sectionsUuids = sectionsUuids;
    return this;
  }

  public UploadSectionStatusResponse addSectionsUuidsItem(String sectionsUuidsItem) {
    if (this.sectionsUuids == null) {
      this.sectionsUuids = new ArrayList<>();
    }
    this.sectionsUuids.add(sectionsUuidsItem);
    return this;
  }

   /**
   * Get sectionsUuids
   * @return sectionsUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"cKbJ7uay3cEGtsKuGPwYGX\", \"jzjCfYgKQYm2u9ctwN6io4\"]", value = "")

  public List<String> getSectionsUuids() {
    return sectionsUuids;
  }


  public void setSectionsUuids(List<String> sectionsUuids) {
    this.sectionsUuids = sectionsUuids;
  }


  public UploadSectionStatusResponse dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-08T11:06:32.337395Z", value = "")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public UploadSectionStatusResponse dateModified(String dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-08T11:06:32.337395Z", value = "")

  public String getDateModified() {
    return dateModified;
  }


  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSectionStatusResponse uploadSectionStatusResponse = (UploadSectionStatusResponse) o;
    return Objects.equals(this.uuid, uploadSectionStatusResponse.uuid) &&
        Objects.equals(this.documentUuid, uploadSectionStatusResponse.documentUuid) &&
        Objects.equals(this.status, uploadSectionStatusResponse.status) &&
        Objects.equals(this.name, uploadSectionStatusResponse.name) &&
        Objects.equals(this.sectionsUuids, uploadSectionStatusResponse.sectionsUuids) &&
        Objects.equals(this.dateCreated, uploadSectionStatusResponse.dateCreated) &&
        Objects.equals(this.dateModified, uploadSectionStatusResponse.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, documentUuid, status, name, sectionsUuids, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSectionStatusResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    documentUuid: ").append(toIndentedString(documentUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sectionsUuids: ").append(toIndentedString(sectionsUuids)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
