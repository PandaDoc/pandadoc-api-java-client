

# WebhookEventDetailsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **UUID** | Unique webhook subscription event identifier |  [optional]
**name** | **String** | Webhook subscription name |  [optional]
**type** | **WebhookEventTriggerEnum** |  |  [optional]
**httpStatusCode** | **Integer** | Webhook subscription event response http status code |  [optional]
**error** | **WebhookEventErrorEnum** |  |  [optional]
**deliveryTime** | **OffsetDateTime** | Webhook subscription event delivery time |  [optional]
**url** | **String** | Webhook subscription event destination url |  [optional]
**signature** | **String** | Webhook subscription event digital signature |  [optional]
**requestBody** | **String** | Webhook subscription event request body |  [optional]
**responseBody** | **String** | Webhook subscription response body |  [optional]
**responseHeaders** | **String** | Webhook subscription response headers |  [optional]
**eventTime** | **OffsetDateTime** | Webhook subscription event trigger time |  [optional]



