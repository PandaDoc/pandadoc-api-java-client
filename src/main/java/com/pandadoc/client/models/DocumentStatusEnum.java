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
 * Gets or Sets DocumentStatusEnum
 */
@JsonAdapter(DocumentStatusEnum.Adapter.class)
public enum DocumentStatusEnum {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_10(10),
  
  NUMBER_11(11),
  
  NUMBER_12(12);

  private Integer value;

  DocumentStatusEnum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentStatusEnum fromValue(Integer value) {
    for (DocumentStatusEnum b : DocumentStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentStatusEnum read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return DocumentStatusEnum.fromValue(value);
    }
  }
}
