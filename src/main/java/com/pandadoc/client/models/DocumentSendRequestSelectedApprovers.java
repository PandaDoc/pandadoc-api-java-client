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
import com.pandadoc.client.models.DocumentSendRequestSelectedApproversSteps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Configuration for selected approvers
 */
@ApiModel(description = "Configuration for selected approvers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentSendRequestSelectedApprovers {
  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<DocumentSendRequestSelectedApproversSteps> steps = null;

  public DocumentSendRequestSelectedApprovers() { 
  }

  public DocumentSendRequestSelectedApprovers steps(List<DocumentSendRequestSelectedApproversSteps> steps) {
    
    this.steps = steps;
    return this;
  }

  public DocumentSendRequestSelectedApprovers addStepsItem(DocumentSendRequestSelectedApproversSteps stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Approval steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Approval steps")

  public List<DocumentSendRequestSelectedApproversSteps> getSteps() {
    return steps;
  }


  public void setSteps(List<DocumentSendRequestSelectedApproversSteps> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSendRequestSelectedApprovers documentSendRequestSelectedApprovers = (DocumentSendRequestSelectedApprovers) o;
    return Objects.equals(this.steps, documentSendRequestSelectedApprovers.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSendRequestSelectedApprovers {\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

