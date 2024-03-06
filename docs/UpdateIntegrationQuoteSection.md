

# UpdateIntegrationQuoteSection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Section ID to update. Invalid (or missing) ID causes creating a new section. |  [optional]
**name** | **String** | Name of the quotes section. If you create a section without providing a value, it will have the default value. |  [optional]
**items** | [**List&lt;UpdateIntegrationQuoteSectionItem&gt;**](UpdateIntegrationQuoteSectionItem.md) | Section items - this property overrides the existing items in the order specified. If you want to change only one item, you must still pass other items IDs. Otherwise these items will be removed. |  [optional]
**settings** | [**QuoteUpdateRequestSettings**](QuoteUpdateRequestSettings.md) |  |  [optional]



