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
 * LinkedObjectCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkedObjectCreateResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTIRY_ID = "entiry_id";
  @SerializedName(SERIALIZED_NAME_ENTIRY_ID)
  private String entiryId;


  public LinkedObjectCreateResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abb4d3fc-919b-491e-9e08-775036660c0b", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LinkedObjectCreateResponse provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * CRM name (lowercase). See the list above.
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pipedrive", value = "CRM name (lowercase). See the list above.")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public LinkedObjectCreateResponse entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity type. The system validates if the type is supported. See the list for each CRM above.
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "deal", value = "Entity type. The system validates if the type is supported. See the list for each CRM above.")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public LinkedObjectCreateResponse entiryId(String entiryId) {
    
    this.entiryId = entiryId;
    return this;
  }

   /**
   * Entity unique identifier. The system validates if the entity exists.
   * @return entiryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9372", value = "Entity unique identifier. The system validates if the entity exists.")

  public String getEntiryId() {
    return entiryId;
  }


  public void setEntiryId(String entiryId) {
    this.entiryId = entiryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedObjectCreateResponse linkedObjectCreateResponse = (LinkedObjectCreateResponse) o;
    return Objects.equals(this.id, linkedObjectCreateResponse.id) &&
        Objects.equals(this.provider, linkedObjectCreateResponse.provider) &&
        Objects.equals(this.entityType, linkedObjectCreateResponse.entityType) &&
        Objects.equals(this.entiryId, linkedObjectCreateResponse.entiryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider, entityType, entiryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedObjectCreateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entiryId: ").append(toIndentedString(entiryId)).append("\n");
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

