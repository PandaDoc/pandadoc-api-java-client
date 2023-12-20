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
import com.pandadoc.client.models.DocumentCreateByTemplateRequestContentPlaceholders;
import com.pandadoc.client.models.DocumentCreateByTemplateRequestImages;
import com.pandadoc.client.models.DocumentCreateByTemplateRequestRecipients;
import com.pandadoc.client.models.DocumentCreateByTemplateRequestTokens;
import com.pandadoc.client.models.PricingTableRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentCreateByTemplateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCreateByTemplateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DETECT_TITLE_VARIABLES = "detect_title_variables";
  @SerializedName(SERIALIZED_NAME_DETECT_TITLE_VARIABLES)
  private Boolean detectTitleVariables;

  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "template_uuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  private String templateUuid;

  public static final String SERIALIZED_NAME_FOLDER_UUID = "folder_uuid";
  @SerializedName(SERIALIZED_NAME_FOLDER_UUID)
  private String folderUuid;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<DocumentCreateByTemplateRequestRecipients> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<DocumentCreateByTemplateRequestTokens> tokens = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<DocumentCreateByTemplateRequestImages> images = null;

  public static final String SERIALIZED_NAME_PRICING_TABLES = "pricing_tables";
  @SerializedName(SERIALIZED_NAME_PRICING_TABLES)
  private List<PricingTableRequest> pricingTables = null;

  public static final String SERIALIZED_NAME_CONTENT_PLACEHOLDERS = "content_placeholders";
  @SerializedName(SERIALIZED_NAME_CONTENT_PLACEHOLDERS)
  private List<DocumentCreateByTemplateRequestContentPlaceholders> contentPlaceholders = null;

  public DocumentCreateByTemplateRequest() { 
  }

  public DocumentCreateByTemplateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name the document you are creating. If name is not passed, the template name is used.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Sample Document from PandaDoc Template", value = "Name the document you are creating. If name is not passed, the template name is used.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentCreateByTemplateRequest detectTitleVariables(Boolean detectTitleVariables) {
    
    this.detectTitleVariables = detectTitleVariables;
    return this;
  }

   /**
   * Set this parameter as true if you want to detect title variables in the document.
   * @return detectTitleVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Set this parameter as true if you want to detect title variables in the document.")

  public Boolean getDetectTitleVariables() {
    return detectTitleVariables;
  }


  public void setDetectTitleVariables(Boolean detectTitleVariables) {
    this.detectTitleVariables = detectTitleVariables;
  }


  public DocumentCreateByTemplateRequest templateUuid(String templateUuid) {
    
    this.templateUuid = templateUuid;
    return this;
  }

   /**
   * The ID of a template you want to use. You can copy it from an in app template url such as &#x60;https://app.pandadoc.com/a/#/templates/{ID}/content&#x60;. A template ID is also obtained by listing templates.
   * @return templateUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "hryJY9mqYZHjQCYQuSjRQg", required = true, value = "The ID of a template you want to use. You can copy it from an in app template url such as `https://app.pandadoc.com/a/#/templates/{ID}/content`. A template ID is also obtained by listing templates.")

  public String getTemplateUuid() {
    return templateUuid;
  }


  public void setTemplateUuid(String templateUuid) {
    this.templateUuid = templateUuid;
  }


  public DocumentCreateByTemplateRequest folderUuid(String folderUuid) {
    
    this.folderUuid = folderUuid;
    return this;
  }

   /**
   * Get folderUuid
   * @return folderUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QMDSzwabfFzTgjW4kUijqQ", value = "")

  public String getFolderUuid() {
    return folderUuid;
  }


  public void setFolderUuid(String folderUuid) {
    this.folderUuid = folderUuid;
  }


  public DocumentCreateByTemplateRequest recipients(List<DocumentCreateByTemplateRequestRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public DocumentCreateByTemplateRequest addRecipientsItem(DocumentCreateByTemplateRequestRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * The list of recipients you&#39;re sending the document to. Every object must contain the email parameter. The &#x60;role&#x60;, &#x60;first_name&#x60; and &#x60;last_name&#x60; parameters are optional. If the &#x60;role&#x60; parameter passed, a person is assigned all fields matching their corresponding role. If not passed, a person will receive a read-only link to view the document. If the &#x60;first_name&#x60; and &#x60;last_name&#x60; not passed the system 1. creates a new contact, if none exists with the given &#x60;email&#x60;; or 2. gets the existing contact with the given &#x60;email&#x60; that already exists.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of recipients you're sending the document to. Every object must contain the email parameter. The `role`, `first_name` and `last_name` parameters are optional. If the `role` parameter passed, a person is assigned all fields matching their corresponding role. If not passed, a person will receive a read-only link to view the document. If the `first_name` and `last_name` not passed the system 1. creates a new contact, if none exists with the given `email`; or 2. gets the existing contact with the given `email` that already exists.")

  public List<DocumentCreateByTemplateRequestRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<DocumentCreateByTemplateRequestRecipients> recipients) {
    this.recipients = recipients;
  }


  public DocumentCreateByTemplateRequest tokens(List<DocumentCreateByTemplateRequestTokens> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public DocumentCreateByTemplateRequest addTokensItem(DocumentCreateByTemplateRequestTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * You can pass a list of tokens/values to pre-fill tokens used in a template. Name is a token name in a template. Value is a real value you would like to replace a token with.
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "You can pass a list of tokens/values to pre-fill tokens used in a template. Name is a token name in a template. Value is a real value you would like to replace a token with.")

  public List<DocumentCreateByTemplateRequestTokens> getTokens() {
    return tokens;
  }


  public void setTokens(List<DocumentCreateByTemplateRequestTokens> tokens) {
    this.tokens = tokens;
  }


  public DocumentCreateByTemplateRequest fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * You can pass a list of fields/values to pre-fill fields used in a template. Note that the Signature field can&#39;t be pre-filled.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Like\":{\"value\":true},\"Delivery\":{\"value\":\"Same Day Delivery\"},\"Date\":{\"value\":\"2019-12-31T00:00:00.000Z\"}}", value = "You can pass a list of fields/values to pre-fill fields used in a template. Note that the Signature field can't be pre-filled.")

  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public DocumentCreateByTemplateRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * You can pass arbitrary data in the key-value format to associate custom information with a document. This information is returned in any API requests for the document details by id.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"my_favorite_pet\":\"Cat\"}", value = "You can pass arbitrary data in the key-value format to associate custom information with a document. This information is returned in any API requests for the document details by id.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public DocumentCreateByTemplateRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DocumentCreateByTemplateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Mark your document with one or several tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"created_via_api\",\"test_document\"]", value = "Mark your document with one or several tags.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DocumentCreateByTemplateRequest images(List<DocumentCreateByTemplateRequestImages> images) {
    
    this.images = images;
    return this;
  }

  public DocumentCreateByTemplateRequest addImagesItem(DocumentCreateByTemplateRequestImages imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * You can pass a list of images to image blocks (one image in one block) for replacement.
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "You can pass a list of images to image blocks (one image in one block) for replacement.")

  public List<DocumentCreateByTemplateRequestImages> getImages() {
    return images;
  }


  public void setImages(List<DocumentCreateByTemplateRequestImages> images) {
    this.images = images;
  }


  public DocumentCreateByTemplateRequest pricingTables(List<PricingTableRequest> pricingTables) {
    
    this.pricingTables = pricingTables;
    return this;
  }

  public DocumentCreateByTemplateRequest addPricingTablesItem(PricingTableRequest pricingTablesItem) {
    if (this.pricingTables == null) {
      this.pricingTables = new ArrayList<>();
    }
    this.pricingTables.add(pricingTablesItem);
    return this;
  }

   /**
   * Information to construct or populate a pricing table can be passed when creating a document. All product information must be passed when creating a new document. Products stored in PandaDoc cannot be used to populate table rows at this time. Keep in mind that this is an array, so multiple table objects can be passed to a document. Make sure that \&quot;Automatically add products to this table\&quot; is enabled in the PandaDoc template pricing tables you wish to populate via API.
   * @return pricingTables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information to construct or populate a pricing table can be passed when creating a document. All product information must be passed when creating a new document. Products stored in PandaDoc cannot be used to populate table rows at this time. Keep in mind that this is an array, so multiple table objects can be passed to a document. Make sure that \"Automatically add products to this table\" is enabled in the PandaDoc template pricing tables you wish to populate via API.")

  public List<PricingTableRequest> getPricingTables() {
    return pricingTables;
  }


  public void setPricingTables(List<PricingTableRequest> pricingTables) {
    this.pricingTables = pricingTables;
  }


  public DocumentCreateByTemplateRequest contentPlaceholders(List<DocumentCreateByTemplateRequestContentPlaceholders> contentPlaceholders) {
    
    this.contentPlaceholders = contentPlaceholders;
    return this;
  }

  public DocumentCreateByTemplateRequest addContentPlaceholdersItem(DocumentCreateByTemplateRequestContentPlaceholders contentPlaceholdersItem) {
    if (this.contentPlaceholders == null) {
      this.contentPlaceholders = new ArrayList<>();
    }
    this.contentPlaceholders.add(contentPlaceholdersItem);
    return this;
  }

   /**
   * You may replace Content Library Item Placeholders with a few content library items each and pre-fill fields/variables values, pricing table items, and assign recipients to roles from there.
   * @return contentPlaceholders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "You may replace Content Library Item Placeholders with a few content library items each and pre-fill fields/variables values, pricing table items, and assign recipients to roles from there.")

  public List<DocumentCreateByTemplateRequestContentPlaceholders> getContentPlaceholders() {
    return contentPlaceholders;
  }


  public void setContentPlaceholders(List<DocumentCreateByTemplateRequestContentPlaceholders> contentPlaceholders) {
    this.contentPlaceholders = contentPlaceholders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreateByTemplateRequest documentCreateByTemplateRequest = (DocumentCreateByTemplateRequest) o;
    return Objects.equals(this.name, documentCreateByTemplateRequest.name) &&
        Objects.equals(this.detectTitleVariables, documentCreateByTemplateRequest.detectTitleVariables) &&
        Objects.equals(this.templateUuid, documentCreateByTemplateRequest.templateUuid) &&
        Objects.equals(this.folderUuid, documentCreateByTemplateRequest.folderUuid) &&
        Objects.equals(this.recipients, documentCreateByTemplateRequest.recipients) &&
        Objects.equals(this.tokens, documentCreateByTemplateRequest.tokens) &&
        Objects.equals(this.fields, documentCreateByTemplateRequest.fields) &&
        Objects.equals(this.metadata, documentCreateByTemplateRequest.metadata) &&
        Objects.equals(this.tags, documentCreateByTemplateRequest.tags) &&
        Objects.equals(this.images, documentCreateByTemplateRequest.images) &&
        Objects.equals(this.pricingTables, documentCreateByTemplateRequest.pricingTables) &&
        Objects.equals(this.contentPlaceholders, documentCreateByTemplateRequest.contentPlaceholders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, detectTitleVariables, templateUuid, folderUuid, recipients, tokens, fields, metadata, tags, images, pricingTables, contentPlaceholders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreateByTemplateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    detectTitleVariables: ").append(toIndentedString(detectTitleVariables)).append("\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    folderUuid: ").append(toIndentedString(folderUuid)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    pricingTables: ").append(toIndentedString(pricingTables)).append("\n");
    sb.append("    contentPlaceholders: ").append(toIndentedString(contentPlaceholders)).append("\n");
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

