

# QuoteUpdateRequestPriceSettings

Price settings if the price is not flat rate. If it is null, the price is flat rate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseValue** | **BigDecimal** | Base value for volume discount pricing. If set, tiers are treated like percentage of discount on this value. If not set, tiers are treated like a flat value discount of chosen currency. | 
**tiers** | [**List&lt;QuoteUpdateRequestPriceSettingsTiers&gt;**](QuoteUpdateRequestPriceSettingsTiers.md) |  | 



