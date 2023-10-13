# DocumentRecipientsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDocumentRecipient**](DocumentRecipientsApi.md#addDocumentRecipient) | **POST** /public/v1/documents/{id}/recipients | Add Document Recipient
[**deleteDocumentRecipient**](DocumentRecipientsApi.md#deleteDocumentRecipient) | **DELETE** /public/v1/documents/{id}/recipients/{recipient_id} | Delete Document Recipient
[**editDocumentRecipient**](DocumentRecipientsApi.md#editDocumentRecipient) | **PATCH** /public/v1/documents/{id}/recipients/{recipient_id} | Edit Document Recipient
[**reassignDocumentRecipient**](DocumentRecipientsApi.md#reassignDocumentRecipient) | **POST** /public/v1/documents/{id}/recipients/{recipient_id}/reassign | Reassign Document Recipient



## addDocumentRecipient

> InlineResponse200 addDocumentRecipient(id, documentRecipientCreateRequest)

Add Document Recipient

Adds recipient as CC to document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentRecipientsApi;

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

        DocumentRecipientsApi apiInstance = new DocumentRecipientsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // DocumentRecipientCreateRequest | 
        DocumentRecipientCreateRequest documentRecipientCreateRequest = new DocumentRecipientCreateRequest();
        try {
            InlineResponse200 result = apiInstance.addDocumentRecipient(id, documentRecipientCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentRecipientsApi#addDocumentRecipient");
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
 **id** | **String**| Document UUID |
 **documentRecipientCreateRequest** | [**DocumentRecipientCreateRequest**](DocumentRecipientCreateRequest.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## deleteDocumentRecipient

> deleteDocumentRecipient(id, recipientId)

Delete Document Recipient

Deleted recipient from document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentRecipientsApi;

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

        DocumentRecipientsApi apiInstance = new DocumentRecipientsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Recipient UUID
        String recipientId = "tf5dGS3Tmu3cj228ao6fnc";
        try {
            apiInstance.deleteDocumentRecipient(id, recipientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentRecipientsApi#deleteDocumentRecipient");
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
 **id** | **String**| Document UUID |
 **recipientId** | **String**| Recipient UUID |

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
| **204** | No content |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## editDocumentRecipient

> editDocumentRecipient(id, recipientId, documentRecipientEditRequest)

Edit Document Recipient

Edit document recipient&#39;s details

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentRecipientsApi;

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

        DocumentRecipientsApi apiInstance = new DocumentRecipientsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Recipient UUID
        String recipientId = "tf5dGS3Tmu3cj228ao6fnc";
        // DocumentRecipientEditRequest | 
        DocumentRecipientEditRequest documentRecipientEditRequest = new DocumentRecipientEditRequest();
        try {
            apiInstance.editDocumentRecipient(id, recipientId, documentRecipientEditRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentRecipientsApi#editDocumentRecipient");
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
 **id** | **String**| Document UUID |
 **recipientId** | **String**| Recipient UUID |
 **documentRecipientEditRequest** | [**DocumentRecipientEditRequest**](DocumentRecipientEditRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## reassignDocumentRecipient

> Object reassignDocumentRecipient(id, recipientId, documentRecipientCreateRequest)

Reassign Document Recipient

Replace document recipient with another contact

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentRecipientsApi;

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

        DocumentRecipientsApi apiInstance = new DocumentRecipientsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Recipient UUID
        String recipientId = "tf5dGS3Tmu3cj228ao6fnc";
        // DocumentRecipientCreateRequest | 
        DocumentRecipientCreateRequest documentRecipientCreateRequest = new DocumentRecipientCreateRequest();
        try {
            Object result = apiInstance.reassignDocumentRecipient(id, recipientId, documentRecipientCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentRecipientsApi#reassignDocumentRecipient");
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
 **id** | **String**| Document UUID |
 **recipientId** | **String**| Recipient UUID |
 **documentRecipientCreateRequest** | [**DocumentRecipientCreateRequest**](DocumentRecipientCreateRequest.md)|  |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |

