# WebhookSubscriptionsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookSubscription**](WebhookSubscriptionsApi.md#createWebhookSubscription) | **POST** /public/v1/webhook-subscriptions | Create webhook subscription
[**deleteWebhookSubscription**](WebhookSubscriptionsApi.md#deleteWebhookSubscription) | **DELETE** /public/v1/webhook-subscriptions/{id} | Delete webhook subscription
[**detailsWebhookSubscription**](WebhookSubscriptionsApi.md#detailsWebhookSubscription) | **GET** /public/v1/webhook-subscriptions/{id} | Get webhook subscription by uuid
[**listWebhookSubscriptions**](WebhookSubscriptionsApi.md#listWebhookSubscriptions) | **GET** /public/v1/webhook-subscriptions | Get all webhook subscriptions
[**updateWebhookSubscription**](WebhookSubscriptionsApi.md#updateWebhookSubscription) | **PATCH** /public/v1/webhook-subscriptions/{id} | Update webhook subscription
[**updateWebhookSubscriptionSharedKey**](WebhookSubscriptionsApi.md#updateWebhookSubscriptionSharedKey) | **PATCH** /public/v1/webhook-subscriptions/{id}/shared-key | Regenerate webhook subscription shared key



## createWebhookSubscription

> WebhookSubscriptionItemResponse createWebhookSubscription(webhookSubscriptionCreateRequest)

Create webhook subscription

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        // WebhookSubscriptionCreateRequest | 
        WebhookSubscriptionCreateRequest webhookSubscriptionCreateRequest = new WebhookSubscriptionCreateRequest();
        try {
            WebhookSubscriptionItemResponse result = apiInstance.createWebhookSubscription(webhookSubscriptionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#createWebhookSubscription");
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
 **webhookSubscriptionCreateRequest** | [**WebhookSubscriptionCreateRequest**](WebhookSubscriptionCreateRequest.md)|  |

### Return type

[**WebhookSubscriptionItemResponse**](WebhookSubscriptionItemResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Webhook subscription created |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **429** | Too Many Requests |  -  |


## deleteWebhookSubscription

> deleteWebhookSubscription(id)

Delete webhook subscription

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        // UUID | Webhook subscription uuid
        UUID id = UUID.randomUUID();
        try {
            apiInstance.deleteWebhookSubscription(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#deleteWebhookSubscription");
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
 **id** | **UUID**| Webhook subscription uuid |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Webhook subscription removed |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## detailsWebhookSubscription

> WebhookSubscriptionItemResponse detailsWebhookSubscription(id)

Get webhook subscription by uuid

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        // UUID | Webhook subscription uuid
        UUID id = UUID.randomUUID();
        try {
            WebhookSubscriptionItemResponse result = apiInstance.detailsWebhookSubscription(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#detailsWebhookSubscription");
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
 **id** | **UUID**| Webhook subscription uuid |

### Return type

[**WebhookSubscriptionItemResponse**](WebhookSubscriptionItemResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get webhook subscription by uuid |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## listWebhookSubscriptions

> WebhookSubscriptionListResponse listWebhookSubscriptions()

Get all webhook subscriptions

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        try {
            WebhookSubscriptionListResponse result = apiInstance.listWebhookSubscriptions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#listWebhookSubscriptions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**WebhookSubscriptionListResponse**](WebhookSubscriptionListResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List webhook subscriptions |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## updateWebhookSubscription

> WebhookSubscriptionItemResponse updateWebhookSubscription(id, webhookSubscriptionPatchRequest)

Update webhook subscription

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        // UUID | Webhook subscription uuid
        UUID id = UUID.randomUUID();
        // WebhookSubscriptionPatchRequest | 
        WebhookSubscriptionPatchRequest webhookSubscriptionPatchRequest = new WebhookSubscriptionPatchRequest();
        try {
            WebhookSubscriptionItemResponse result = apiInstance.updateWebhookSubscription(id, webhookSubscriptionPatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#updateWebhookSubscription");
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
 **id** | **UUID**| Webhook subscription uuid |
 **webhookSubscriptionPatchRequest** | [**WebhookSubscriptionPatchRequest**](WebhookSubscriptionPatchRequest.md)|  |

### Return type

[**WebhookSubscriptionItemResponse**](WebhookSubscriptionItemResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook subscription updated |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## updateWebhookSubscriptionSharedKey

> WebhookSubscriptionSharedKeyResponse updateWebhookSubscriptionSharedKey(id)

Regenerate webhook subscription shared key

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.WebhookSubscriptionsApi;

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

        WebhookSubscriptionsApi apiInstance = new WebhookSubscriptionsApi(defaultClient);
        // UUID | Webhook subscription uuid
        UUID id = UUID.randomUUID();
        try {
            WebhookSubscriptionSharedKeyResponse result = apiInstance.updateWebhookSubscriptionSharedKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookSubscriptionsApi#updateWebhookSubscriptionSharedKey");
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
 **id** | **UUID**| Webhook subscription uuid |

### Return type

[**WebhookSubscriptionSharedKeyResponse**](WebhookSubscriptionSharedKeyResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook subscription shared key regenerated |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |

