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
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200 {
  public static final String SERIALIZED_NAME_ACTOR_ID = "actor_id";
  @SerializedName(SERIALIZED_NAME_ACTOR_ID)
  private String actorId;

  public InlineResponse200() { 
  }

  public InlineResponse200 actorId(String actorId) {
    
    this.actorId = actorId;
    return this;
  }

   /**
   * Get actorId
   * @return actorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2eWSKSvVqmuVCnuUK3iWwD", value = "")

  public String getActorId() {
    return actorId;
  }


  public void setActorId(String actorId) {
    this.actorId = actorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.actorId, inlineResponse200.actorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
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

