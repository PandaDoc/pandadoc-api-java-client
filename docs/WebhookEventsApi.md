# WebhookEventsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detailsWebhookEvent**](WebhookEventsApi.md#detailsWebhookEvent) | **GET** /public/v1/webhook-events/{id} | Get webhook event by uuid
[**listWebhookEvent**](WebhookEventsApi.md#listWebhookEvent) | **GET** /public/v1/webhook-events | Get webhook event page



## detailsWebhookEvent

> WebhookEventDetailsResponse detailsWebhookEvent(id)

Get webhook event by uuid

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookEventsApi;

import java.util.Arrays;
import java.io.File;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pandadoc.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "API-Key" (defaults to null)
        //apiKey.setApiKeyPrefix("API-Key");

        // Configure OAuth2 access token for authorization: oauth2
        // OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        // oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WebhookEventsApi apiInstance = new WebhookEventsApi(defaultClient);
        // UUID | Webhook event uuid
        UUID id = UUID.randomUUID();
        try {
            WebhookEventDetailsResponse result = apiInstance.detailsWebhookEvent(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEventsApi#detailsWebhookEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Webhook event uuid |

### Return type

[**WebhookEventDetailsResponse**](WebhookEventDetailsResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get webhook event by uuid |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## listWebhookEvent

> WebhookEventPageResponse listWebhookEvent(count, page, since, to, type, httpStatusCode, error)

Get webhook event page

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookEventsApi;

import java.util.Arrays;
import java.io.File;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pandadoc.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "API-Key" (defaults to null)
        //apiKey.setApiKeyPrefix("API-Key");

        // Configure OAuth2 access token for authorization: oauth2
        // OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        // oauth2.setAccessToken("YOUR ACCESS TOKEN");

        WebhookEventsApi apiInstance = new WebhookEventsApi(defaultClient);
        // Integer | Number of element in page
        Integer count = 56;
        // Integer | Page number
        Integer page = 56;
        // OffsetDateTime | Filter option: all events from specified timestamp
        OffsetDateTime since = OffsetDateTime.now();
        // OffsetDateTime | Filter option: all events up to specified timestamp
        OffsetDateTime to = OffsetDateTime.now();
        // List<WebhookEventTriggerEnum> | Filter option: all events of type
        List<WebhookEventTriggerEnum> type = Arrays.asList();
        // List<WebhookEventHttpStatusCodeGroupEnum> | Filter option: all events of http status code
        List<WebhookEventHttpStatusCodeGroupEnum> httpStatusCode = Arrays.asList();
        // List<WebhookEventErrorEnum> | Filter option: all events with following error
        List<WebhookEventErrorEnum> error = Arrays.asList();
        try {
            WebhookEventPageResponse result = apiInstance.listWebhookEvent(count, page, since, to, type, httpStatusCode, error);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookEventsApi#listWebhookEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of element in page |
 **page** | **Integer**| Page number |
 **since** | **OffsetDateTime**| Filter option: all events from specified timestamp | [optional]
 **to** | **OffsetDateTime**| Filter option: all events up to specified timestamp | [optional]
 **type** | [**List&lt;WebhookEventTriggerEnum&gt;**](WebhookEventTriggerEnum.md)| Filter option: all events of type | [optional]
 **httpStatusCode** | [**List&lt;WebhookEventHttpStatusCodeGroupEnum&gt;**](WebhookEventHttpStatusCodeGroupEnum.md)| Filter option: all events of http status code | [optional]
 **error** | [**List&lt;WebhookEventErrorEnum&gt;**](WebhookEventErrorEnum.md)| Filter option: all events with following error | [optional]

### Return type

[**WebhookEventPageResponse**](WebhookEventPageResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page of webhook events |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |

