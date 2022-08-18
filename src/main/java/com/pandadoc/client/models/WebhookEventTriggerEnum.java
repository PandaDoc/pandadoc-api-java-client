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
 * Gets or Sets WebhookEventTriggerEnum
 */
@JsonAdapter(WebhookEventTriggerEnum.Adapter.class)
public enum WebhookEventTriggerEnum {
  
  RECIPIENT_COMPLETED("recipient_completed"),
  
  DOCUMENT_UPDATED("document_updated"),
  
  DOCUMENT_DELETED("document_deleted"),
  
  DOCUMENT_STATE_CHANGED("document_state_changed"),
  
  DOCUMENT_CREATION_FAILED("document_creation_failed");

  private String value;

  WebhookEventTriggerEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookEventTriggerEnum fromValue(String value) {
    for (WebhookEventTriggerEnum b : WebhookEventTriggerEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookEventTriggerEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookEventTriggerEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookEventTriggerEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookEventTriggerEnum.fromValue(value);
    }
  }
}
