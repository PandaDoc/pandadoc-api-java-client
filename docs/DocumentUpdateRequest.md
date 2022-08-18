

# DocumentUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipients** | [**List&lt;DocumentUpdateRequestRecipients&gt;**](DocumentUpdateRequestRecipients.md) | The list of recipients you&#39;re sending the document to. The ID or email are required. If the ID is passed, an existing recipient will be updated. If the email is passed, a new recipient will be added to CC. |  [optional]
**fields** | **Object** | You may pass a list of fields/values which exist in a document. Please use &#x60;Merge Field&#x60; property of the fields like the key. |  [optional]
**tokens** | [**List&lt;DocumentCreateByTemplateRequestTokens&gt;**](DocumentCreateByTemplateRequestTokens.md) | You can pass a list of tokens/values. If a token name exists in a document then the value will be updated. Otherwise, a new token will be added to the document. |  [optional]
**metadata** | **Object** | You can pass arbitrary data in the key-value format to associate custom information with a document. This information is returned in any API requests for the document details by id. If metadata exists in a document then the value will be updated. Otherwise, metadata will be added to the document. |  [optional]
**pricingTables** | [**List&lt;PricingTableRequest&gt;**](PricingTableRequest.md) |  |  [optional]



