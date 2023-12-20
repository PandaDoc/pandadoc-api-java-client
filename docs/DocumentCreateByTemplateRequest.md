

# DocumentCreateByTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name the document you are creating. If name is not passed, the template name is used. |  [optional]
**detectTitleVariables** | **Boolean** | Set this parameter as true if you want to detect title variables in the document. |  [optional]
**templateUuid** | **String** | The ID of a template you want to use. You can copy it from an in app template url such as &#x60;https://app.pandadoc.com/a/#/templates/{ID}/content&#x60;. A template ID is also obtained by listing templates. | 
**folderUuid** | **String** |  |  [optional]
**recipients** | [**List&lt;DocumentCreateByTemplateRequestRecipients&gt;**](DocumentCreateByTemplateRequestRecipients.md) | The list of recipients you&#39;re sending the document to. Every object must contain the email parameter. The &#x60;role&#x60;, &#x60;first_name&#x60; and &#x60;last_name&#x60; parameters are optional. If the &#x60;role&#x60; parameter passed, a person is assigned all fields matching their corresponding role. If not passed, a person will receive a read-only link to view the document. If the &#x60;first_name&#x60; and &#x60;last_name&#x60; not passed the system 1. creates a new contact, if none exists with the given &#x60;email&#x60;; or 2. gets the existing contact with the given &#x60;email&#x60; that already exists. | 
**tokens** | [**List&lt;DocumentCreateByTemplateRequestTokens&gt;**](DocumentCreateByTemplateRequestTokens.md) | You can pass a list of tokens/values to pre-fill tokens used in a template. Name is a token name in a template. Value is a real value you would like to replace a token with. |  [optional]
**fields** | **Object** | You can pass a list of fields/values to pre-fill fields used in a template. Note that the Signature field can&#39;t be pre-filled. |  [optional]
**metadata** | **Object** | You can pass arbitrary data in the key-value format to associate custom information with a document. This information is returned in any API requests for the document details by id. |  [optional]
**tags** | **List&lt;String&gt;** | Mark your document with one or several tags. |  [optional]
**images** | [**List&lt;DocumentCreateByTemplateRequestImages&gt;**](DocumentCreateByTemplateRequestImages.md) | You can pass a list of images to image blocks (one image in one block) for replacement. |  [optional]
**pricingTables** | [**List&lt;PricingTableRequest&gt;**](PricingTableRequest.md) | Information to construct or populate a pricing table can be passed when creating a document. All product information must be passed when creating a new document. Products stored in PandaDoc cannot be used to populate table rows at this time. Keep in mind that this is an array, so multiple table objects can be passed to a document. Make sure that \&quot;Automatically add products to this table\&quot; is enabled in the PandaDoc template pricing tables you wish to populate via API. |  [optional]
**contentPlaceholders** | [**List&lt;DocumentCreateByTemplateRequestContentPlaceholders&gt;**](DocumentCreateByTemplateRequestContentPlaceholders.md) | You may replace Content Library Item Placeholders with a few content library items each and pre-fill fields/variables values, pricing table items, and assign recipients to roles from there. |  [optional]



