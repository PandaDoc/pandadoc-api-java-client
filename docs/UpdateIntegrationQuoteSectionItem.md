

# UpdateIntegrationQuoteSectionItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Item ID to update. Invalid (or missing) ID causes creating a new item. |  [optional]
**sku** | **String** | Product SKU. If you create an item without providing a value, it will have the default value. |  [optional]
**name** | **String** | Item name. If you create an item without providing a value, it will have the default value. |  [optional]
**description** | **String** | Item description. If you create an item without providing a value, it will have the default value. |  [optional]
**qty** | **Integer** | Item QTY. If you create an item without providing a value, it will have the default value. |  [optional]
**price** | **BigDecimal** | Item price. If you create an item without providing a value, it will have the default value. If &#x60;price_settings&#x60; is passed, this value may change after the quote is updated. |  [optional]
**priceSettings** | [**QuoteUpdateRequestPriceSettings**](QuoteUpdateRequestPriceSettings.md) |  |  [optional]
**cost** | **BigDecimal** | Item cost. If you create an item without providing a value, it will have the default value. |  [optional]
**billingFrequency** | [**BillingFrequencyEnum**](#BillingFrequencyEnum) |  |  [optional]
**contractTerm** | **Integer** | Contract term. Measured in units set in the &#x60;billing_frequency&#x60; parameter. |  [optional]
**referenceId** | **String** | Use this field to pass an id that references this item in external systems. |  [optional]
**options** | [**QuoteUpdateRequestOptions**](QuoteUpdateRequestOptions.md) |  |  [optional]
**customColumns** | **Map&lt;String, String&gt;** |  |  [optional]
**discounts** | [**Map&lt;String, QuoteUpdateRequestDiscounts&gt;**](QuoteUpdateRequestDiscounts.md) | Item discounts. |  [optional]
**taxes** | [**Map&lt;String, QuoteUpdateRequestDiscounts&gt;**](QuoteUpdateRequestDiscounts.md) | Item taxes. |  [optional]
**fees** | [**Map&lt;String, QuoteUpdateRequestDiscounts&gt;**](QuoteUpdateRequestDiscounts.md) | Item fees. |  [optional]
**multipliers** | **Map&lt;String, BigDecimal&gt;** | Item multipliers. |  [optional]



## Enum: BillingFrequencyEnum

Name | Value
---- | -----
WEEKLY | &quot;weekly&quot;
MONTHLY | &quot;monthly&quot;
ANNUALLY | &quot;annually&quot;
QUARTERLY | &quot;quarterly&quot;
SEMIANNUALY | &quot;semiannualy&quot;



