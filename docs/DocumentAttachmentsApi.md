# DocumentAttachmentsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentAttachment**](DocumentAttachmentsApi.md#createDocumentAttachment) | **POST** /public/v1/documents/{id}/attachments | Document Attachment Create
[**deleteDocumentAttachment**](DocumentAttachmentsApi.md#deleteDocumentAttachment) | **DELETE** /public/v1/documents/{id}/attachments/{attachment_id} | Document Attachment Delete
[**detailsDocumentAttachment**](DocumentAttachmentsApi.md#detailsDocumentAttachment) | **GET** /public/v1/documents/{id}/attachments/{attachment_id} | Document Attachment Details
[**downloadDocumentAttachment**](DocumentAttachmentsApi.md#downloadDocumentAttachment) | **GET** /public/v1/documents/{id}/attachments/{attachment_id}/download | Document Attachment Download
[**listDocumentAttachments**](DocumentAttachmentsApi.md#listDocumentAttachments) | **GET** /public/v1/documents/{id}/attachments | Document Attachment List



## createDocumentAttachment

> DocumentAttachmentResponse createDocumentAttachment(id, file, source, name)

Document Attachment Create

Creates an attachment for a particular document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentAttachmentsApi;

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

        DocumentAttachmentsApi apiInstance = new DocumentAttachmentsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // File | Binary file to be attached to a document
        File file = new File("/path/to/file");
        // String | URL link to the file to be attached to a document
        String source = "source_example";
        // String | Optional name to set for uploaded file
        String name = "name_example";
        try {
            DocumentAttachmentResponse result = apiInstance.createDocumentAttachment(id, file, source, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentAttachmentsApi#createDocumentAttachment");
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
 **file** | **File**| Binary file to be attached to a document | [optional]
 **source** | **String**| URL link to the file to be attached to a document | [optional]
 **name** | **String**| Optional name to set for uploaded file | [optional]

### Return type

[**DocumentAttachmentResponse**](DocumentAttachmentResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## deleteDocumentAttachment

> deleteDocumentAttachment(id, attachmentId)

Document Attachment Delete

Deletes specific document&#39;s attachment

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentAttachmentsApi;

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

        DocumentAttachmentsApi apiInstance = new DocumentAttachmentsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Attachment UUID
        String attachmentId = "89ce2f49-10fb-4e9b-b5f3-e28be2a5c042";
        try {
            apiInstance.deleteDocumentAttachment(id, attachmentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentAttachmentsApi#deleteDocumentAttachment");
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
 **attachmentId** | **String**| Attachment UUID |

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
| **204** | No Content |  -  |
| **401** | Authentication error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## detailsDocumentAttachment

> DocumentAttachmentResponse detailsDocumentAttachment(id, attachmentId)

Document Attachment Details

Returns details of the specific document&#39;s attachment

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentAttachmentsApi;

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

        DocumentAttachmentsApi apiInstance = new DocumentAttachmentsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Attachment UUID
        String attachmentId = "89ce2f49-10fb-4e9b-b5f3-e28be2a5c042";
        try {
            DocumentAttachmentResponse result = apiInstance.detailsDocumentAttachment(id, attachmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentAttachmentsApi#detailsDocumentAttachment");
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
 **attachmentId** | **String**| Attachment UUID |

### Return type

[**DocumentAttachmentResponse**](DocumentAttachmentResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## downloadDocumentAttachment

> File downloadDocumentAttachment(id, attachmentId)

Document Attachment Download

Returns document attachment file for download

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentAttachmentsApi;

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

        DocumentAttachmentsApi apiInstance = new DocumentAttachmentsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Attachment UUID
        String attachmentId = "89ce2f49-10fb-4e9b-b5f3-e28be2a5c042";
        try {
            File result = apiInstance.downloadDocumentAttachment(id, attachmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentAttachmentsApi#downloadDocumentAttachment");
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
 **attachmentId** | **String**| Attachment UUID |

### Return type

[**File**](File.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/_*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## listDocumentAttachments

> List&lt;DocumentAttachmentResponse&gt; listDocumentAttachments(id)

Document Attachment List

Return list of objects attached to particular document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentAttachmentsApi;

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

        DocumentAttachmentsApi apiInstance = new DocumentAttachmentsApi(defaultClient);
        // String | Document UUID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            List<DocumentAttachmentResponse> result = apiInstance.listDocumentAttachments(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentAttachmentsApi#listDocumentAttachments");
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

### Return type

[**List&lt;DocumentAttachmentResponse&gt;**](DocumentAttachmentResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |

