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
 * UploadSectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadSectionResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOCUMENT_UUID = "document_uuid";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_UUID)
  private String documentUuid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UploadSectionStatusEnum status;

  public static final String SERIALIZED_NAME_SECTIONS_UUIDS = "sections_uuids";
  @SerializedName(SERIALIZED_NAME_SECTIONS_UUIDS)
  private List<String> sectionsUuids = null;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private String dateModified;

  public static final String SERIALIZED_NAME_DATE_COMPLETED = "date_completed";
  @SerializedName(SERIALIZED_NAME_DATE_COMPLETED)
  private String dateCompleted;

  public static final String SERIALIZED_NAME_INFO_MESSAGE = "info_message";
  @SerializedName(SERIALIZED_NAME_INFO_MESSAGE)
  private String infoMessage;

  public UploadSectionResponse() { 
  }

  public UploadSectionResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cKbJ7uay3cEGtsKuGPwYGX", value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public UploadSectionResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Sample Upload Section from PandaDoc Template", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UploadSectionResponse documentUuid(String documentUuid) {
    
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


  public UploadSectionResponse status(UploadSectionStatusEnum status) {
    
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


  public UploadSectionResponse sectionsUuids(List<String> sectionsUuids) {
    
    this.sectionsUuids = sectionsUuids;
    return this;
  }

  public UploadSectionResponse addSectionsUuidsItem(String sectionsUuidsItem) {
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


  public UploadSectionResponse dateCreated(String dateCreated) {
    
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


  public UploadSectionResponse dateModified(String dateModified) {
    
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


  public UploadSectionResponse dateCompleted(String dateCompleted) {
    
    this.dateCompleted = dateCompleted;
    return this;
  }

   /**
   * Get dateCompleted
   * @return dateCompleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-08T11:06:32.337395Z", value = "")

  public String getDateCompleted() {
    return dateCompleted;
  }


  public void setDateCompleted(String dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  public UploadSectionResponse infoMessage(String infoMessage) {
    
    this.infoMessage = infoMessage;
    return this;
  }

   /**
   * Get infoMessage
   * @return infoMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "You need to poll the Document Sections Upload Status method until the status will be changed to document_sections_upload.PROCESSED", value = "")

  public String getInfoMessage() {
    return infoMessage;
  }


  public void setInfoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSectionResponse uploadSectionResponse = (UploadSectionResponse) o;
    return Objects.equals(this.uuid, uploadSectionResponse.uuid) &&
        Objects.equals(this.name, uploadSectionResponse.name) &&
        Objects.equals(this.documentUuid, uploadSectionResponse.documentUuid) &&
        Objects.equals(this.status, uploadSectionResponse.status) &&
        Objects.equals(this.sectionsUuids, uploadSectionResponse.sectionsUuids) &&
        Objects.equals(this.dateCreated, uploadSectionResponse.dateCreated) &&
        Objects.equals(this.dateModified, uploadSectionResponse.dateModified) &&
        Objects.equals(this.dateCompleted, uploadSectionResponse.dateCompleted) &&
        Objects.equals(this.infoMessage, uploadSectionResponse.infoMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, documentUuid, status, sectionsUuids, dateCreated, dateModified, dateCompleted, infoMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSectionResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentUuid: ").append(toIndentedString(documentUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sectionsUuids: ").append(toIndentedString(sectionsUuids)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    infoMessage: ").append(toIndentedString(infoMessage)).append("\n");
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

