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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets WebhookSubscriptionTriggerEnum
 */
@JsonAdapter(WebhookSubscriptionTriggerEnum.Adapter.class)
public enum WebhookSubscriptionTriggerEnum {
  
  RECIPIENT_COMPLETED("recipient_completed"),
  
  DOCUMENT_UPDATED("document_updated"),
  
  DOCUMENT_DELETED("document_deleted"),
  
  DOCUMENT_STATE_CHANGED("document_state_changed"),
  
  DOCUMENT_CREATION_FAILED("document_creation_failed"),
  
  QUOTE_UPDATED("quote_updated");

  private String value;

  WebhookSubscriptionTriggerEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookSubscriptionTriggerEnum fromValue(String value) {
    for (WebhookSubscriptionTriggerEnum b : WebhookSubscriptionTriggerEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookSubscriptionTriggerEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookSubscriptionTriggerEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookSubscriptionTriggerEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookSubscriptionTriggerEnum.fromValue(value);
    }
  }
}

