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
 * APILogDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APILogDetailsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_REQUEST_TIME = "request_time";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME)
  private String requestTime;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "response_time";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private String responseTime;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "response_body";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private Object responseBody;

  public static final String SERIALIZED_NAME_QUERY_PARAMS_STRING = "query_params_string";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMS_STRING)
  private String queryParamsString;

  public static final String SERIALIZED_NAME_QUERY_PARAMS_OBJECT = "query_params_object";
  @SerializedName(SERIALIZED_NAME_QUERY_PARAMS_OBJECT)
  private Object queryParamsObject;

  public static final String SERIALIZED_NAME_REQUEST_BODY = "request_body";
  @SerializedName(SERIALIZED_NAME_REQUEST_BODY)
  private Object requestBody;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;


  public APILogDetailsResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AXyDkCYFy9B65Q_E9BY3", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public APILogDetailsResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/public/v1/templates/folders/LKoqFUZZGowLAVo6ECFRyB", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public APILogDetailsResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUT", value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public APILogDetailsResponse status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201", value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public APILogDetailsResponse requestTime(String requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Get requestTime
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T10:46:57.867", value = "")

  public String getRequestTime() {
    return requestTime;
  }


  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }


  public APILogDetailsResponse responseTime(String responseTime) {
    
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Get responseTime
   * @return responseTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-15T10:46:57.969", value = "")

  public String getResponseTime() {
    return responseTime;
  }


  public void setResponseTime(String responseTime) {
    this.responseTime = responseTime;
  }


  public APILogDetailsResponse responseBody(Object responseBody) {
    
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"name\":\"Another templates folder\"}", value = "")

  public Object getResponseBody() {
    return responseBody;
  }


  public void setResponseBody(Object responseBody) {
    this.responseBody = responseBody;
  }


  public APILogDetailsResponse queryParamsString(String queryParamsString) {
    
    this.queryParamsString = queryParamsString;
    return this;
  }

   /**
   * Get queryParamsString
   * @return queryParamsString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "since=-1d&to=now", value = "")

  public String getQueryParamsString() {
    return queryParamsString;
  }


  public void setQueryParamsString(String queryParamsString) {
    this.queryParamsString = queryParamsString;
  }


  public APILogDetailsResponse queryParamsObject(Object queryParamsObject) {
    
    this.queryParamsObject = queryParamsObject;
    return this;
  }

   /**
   * Get queryParamsObject
   * @return queryParamsObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"moesif_meta\":{\"root\":{\"count\":2},\"since\":{\"count\":1},\"to\":{\"count\":1}},\"since\":\"-1d\",\"to\":\"now\"}", value = "")

  public Object getQueryParamsObject() {
    return queryParamsObject;
  }


  public void setQueryParamsObject(Object queryParamsObject) {
    this.queryParamsObject = queryParamsObject;
  }


  public APILogDetailsResponse requestBody(Object requestBody) {
    
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"date_created\":\"2021-10-15T10:45:41.138489Z\",\"name\":\"Another templates folder\",\"uuid\":\"LKoqFUZZGowLAVo6ECFRyB\"}", value = "")

  public Object getRequestBody() {
    return requestBody;
  }


  public void setRequestBody(Object requestBody) {
    this.requestBody = requestBody;
  }


  public APILogDetailsResponse tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OAUTH2_TOKEN", value = "")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public APILogDetailsResponse application(String application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Application One", value = "")

  public String getApplication() {
    return application;
  }


  public void setApplication(String application) {
    this.application = application;
  }


  public APILogDetailsResponse key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0a5eb48cf42fa507f3dfdd5bdbab7c5bfc20a1b9", value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public APILogDetailsResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "94d232f6-fadd-4e2d-a330-702b0b172588", value = "")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public APILogDetailsResponse userEmail(String userEmail) {
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support@pandadoc.com", value = "")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public APILogDetailsResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KKj4kdqfrMeE6bni7pK5gK", value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILogDetailsResponse apILogDetailsResponse = (APILogDetailsResponse) o;
    return Objects.equals(this.id, apILogDetailsResponse.id) &&
        Objects.equals(this.url, apILogDetailsResponse.url) &&
        Objects.equals(this.method, apILogDetailsResponse.method) &&
        Objects.equals(this.status, apILogDetailsResponse.status) &&
        Objects.equals(this.requestTime, apILogDetailsResponse.requestTime) &&
        Objects.equals(this.responseTime, apILogDetailsResponse.responseTime) &&
        Objects.equals(this.responseBody, apILogDetailsResponse.responseBody) &&
        Objects.equals(this.queryParamsString, apILogDetailsResponse.queryParamsString) &&
        Objects.equals(this.queryParamsObject, apILogDetailsResponse.queryParamsObject) &&
        Objects.equals(this.requestBody, apILogDetailsResponse.requestBody) &&
        Objects.equals(this.tokenType, apILogDetailsResponse.tokenType) &&
        Objects.equals(this.application, apILogDetailsResponse.application) &&
        Objects.equals(this.key, apILogDetailsResponse.key) &&
        Objects.equals(this.requestId, apILogDetailsResponse.requestId) &&
        Objects.equals(this.userEmail, apILogDetailsResponse.userEmail) &&
        Objects.equals(this.userId, apILogDetailsResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, method, status, requestTime, responseTime, responseBody, queryParamsString, queryParamsObject, requestBody, tokenType, application, key, requestId, userEmail, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILogDetailsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    queryParamsString: ").append(toIndentedString(queryParamsString)).append("\n");
    sb.append("    queryParamsObject: ").append(toIndentedString(queryParamsObject)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
