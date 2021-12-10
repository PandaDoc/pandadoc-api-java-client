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
import com.pandadoc.client.models.DocumentCreateRequestContentLibraryItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentCreateRequestContentPlaceholders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCreateRequestContentPlaceholders {
  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private String blockId;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_ITEMS = "content_library_items";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_ITEMS)
  private List<DocumentCreateRequestContentLibraryItems> contentLibraryItems = null;


  public DocumentCreateRequestContentPlaceholders blockId(String blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * Content placeholder block id
   * @return blockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Content Placeholder 1", value = "Content placeholder block id")

  public String getBlockId() {
    return blockId;
  }


  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }


  public DocumentCreateRequestContentPlaceholders contentLibraryItems(List<DocumentCreateRequestContentLibraryItems> contentLibraryItems) {
    
    this.contentLibraryItems = contentLibraryItems;
    return this;
  }

  public DocumentCreateRequestContentPlaceholders addContentLibraryItemsItem(DocumentCreateRequestContentLibraryItems contentLibraryItemsItem) {
    if (this.contentLibraryItems == null) {
      this.contentLibraryItems = new ArrayList<>();
    }
    this.contentLibraryItems.add(contentLibraryItemsItem);
    return this;
  }

   /**
   * Get contentLibraryItems
   * @return contentLibraryItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DocumentCreateRequestContentLibraryItems> getContentLibraryItems() {
    return contentLibraryItems;
  }


  public void setContentLibraryItems(List<DocumentCreateRequestContentLibraryItems> contentLibraryItems) {
    this.contentLibraryItems = contentLibraryItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreateRequestContentPlaceholders documentCreateRequestContentPlaceholders = (DocumentCreateRequestContentPlaceholders) o;
    return Objects.equals(this.blockId, documentCreateRequestContentPlaceholders.blockId) &&
        Objects.equals(this.contentLibraryItems, documentCreateRequestContentPlaceholders.contentLibraryItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockId, contentLibraryItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreateRequestContentPlaceholders {\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    contentLibraryItems: ").append(toIndentedString(contentLibraryItems)).append("\n");
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
