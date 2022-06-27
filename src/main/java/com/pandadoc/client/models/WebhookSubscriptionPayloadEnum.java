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
 * Gets or Sets WebhookSubscriptionPayloadEnum
 */
@JsonAdapter(WebhookSubscriptionPayloadEnum.Adapter.class)
public enum WebhookSubscriptionPayloadEnum {
  
  METADATA("metadata"),
  
  FIELDS("fields"),
  
  PRODUCTS("products"),
  
  TOKENS("tokens"),
  
  PRICING("pricing");

  private String value;

  WebhookSubscriptionPayloadEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookSubscriptionPayloadEnum fromValue(String value) {
    for (WebhookSubscriptionPayloadEnum b : WebhookSubscriptionPayloadEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookSubscriptionPayloadEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookSubscriptionPayloadEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookSubscriptionPayloadEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookSubscriptionPayloadEnum.fromValue(value);
    }
  }
}

