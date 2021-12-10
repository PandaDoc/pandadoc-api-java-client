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
 * DocumentsFolderListResponseResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentsFolderListResponseResults {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_HAS_FOLDERS = "has_folders";
  @SerializedName(SERIALIZED_NAME_HAS_FOLDERS)
  private Boolean hasFolders;

  public static final String SERIALIZED_NAME_HAS_ITEMS = "has_items";
  @SerializedName(SERIALIZED_NAME_HAS_ITEMS)
  private Boolean hasItems;


  public DocumentsFolderListResponseResults uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nq8htXxFssmhRxAPSP4SBP", value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public DocumentsFolderListResponseResults name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A new document folder", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentsFolderListResponseResults dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T10:43:04.103331Z", value = "")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public DocumentsFolderListResponseResults hasFolders(Boolean hasFolders) {
    
    this.hasFolders = hasFolders;
    return this;
  }

   /**
   * Get hasFolders
   * @return hasFolders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasFolders() {
    return hasFolders;
  }


  public void setHasFolders(Boolean hasFolders) {
    this.hasFolders = hasFolders;
  }


  public DocumentsFolderListResponseResults hasItems(Boolean hasItems) {
    
    this.hasItems = hasItems;
    return this;
  }

   /**
   * Get hasItems
   * @return hasItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasItems() {
    return hasItems;
  }


  public void setHasItems(Boolean hasItems) {
    this.hasItems = hasItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentsFolderListResponseResults documentsFolderListResponseResults = (DocumentsFolderListResponseResults) o;
    return Objects.equals(this.uuid, documentsFolderListResponseResults.uuid) &&
        Objects.equals(this.name, documentsFolderListResponseResults.name) &&
        Objects.equals(this.dateCreated, documentsFolderListResponseResults.dateCreated) &&
        Objects.equals(this.hasFolders, documentsFolderListResponseResults.hasFolders) &&
        Objects.equals(this.hasItems, documentsFolderListResponseResults.hasItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, dateCreated, hasFolders, hasItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsFolderListResponseResults {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    hasFolders: ").append(toIndentedString(hasFolders)).append("\n");
    sb.append("    hasItems: ").append(toIndentedString(hasItems)).append("\n");
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

