# DocumentsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeDocumentStatus**](DocumentsApi.md#changeDocumentStatus) | **PATCH** /public/v1/documents/{id}/status | Document status change
[**createDocument**](DocumentsApi.md#createDocument) | **POST** /public/v1/documents | Create document
[**createDocumentLink**](DocumentsApi.md#createDocumentLink) | **POST** /public/v1/documents/{id}/session | Create a Document Link
[**createLinkedObject**](DocumentsApi.md#createLinkedObject) | **POST** /public/v1/documents/{id}/linked-objects | Create Linked Object
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /public/v1/documents/{id} | Delete document by id
[**deleteLinkedObject**](DocumentsApi.md#deleteLinkedObject) | **DELETE** /public/v1/documents/{id}/linked-objects/{linked_object_id} | Delete Linked Object
[**detailsDocument**](DocumentsApi.md#detailsDocument) | **GET** /public/v1/documents/{id}/details | Document details
[**documentMoveToFolder**](DocumentsApi.md#documentMoveToFolder) | **DELETE** /public/v1/documents/{id}/move-to-folder/{folder_id} | Document move to folder
[**downloadDocument**](DocumentsApi.md#downloadDocument) | **GET** /public/v1/documents/{id}/download | Document download
[**downloadProtectedDocument**](DocumentsApi.md#downloadProtectedDocument) | **GET** /public/v1/documents/{id}/download-protected | Download document protected
[**listDocuments**](DocumentsApi.md#listDocuments) | **GET** /public/v1/documents | List documents
[**listLinkedObjects**](DocumentsApi.md#listLinkedObjects) | **GET** /public/v1/documents/{id}/linked-objects | List Linked Objects
[**sendDocument**](DocumentsApi.md#sendDocument) | **POST** /public/v1/documents/{id}/send | Send Document
[**statusDocument**](DocumentsApi.md#statusDocument) | **GET** /public/v1/documents/{id} | Document status
[**transferAllDocumentsOwnership**](DocumentsApi.md#transferAllDocumentsOwnership) | **PATCH** /public/v1/documents/ownership | Transfer all documents ownership
[**transferDocumentOwnership**](DocumentsApi.md#transferDocumentOwnership) | **PATCH** /public/v1/documents/{id}/ownership | Update document ownership
[**updateDocument**](DocumentsApi.md#updateDocument) | **PATCH** /public/v1/documents/{id} | Update Document only in the draft status



## changeDocumentStatus

> changeDocumentStatus(id, documentStatusChangeRequest)

Document status change

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // DocumentStatusChangeRequest | 
        DocumentStatusChangeRequest documentStatusChangeRequest = new DocumentStatusChangeRequest();
        try {
            apiInstance.changeDocumentStatus(id, documentStatusChangeRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#changeDocumentStatus");
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
 **id** | **String**| Specify document ID. |
 **documentStatusChangeRequest** | [**DocumentStatusChangeRequest**](DocumentStatusChangeRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## createDocument

> DocumentCreateResponse createDocument(documentCreateRequest, editorVer)

Create document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // DocumentCreateRequest | Use a PandaDoc template or an existing PDF to create a document. See the creation request examples [by template](/schemas/DocumentCreateByTemplateRequest) and [by pdf](/schemas/DocumentCreateByPdfRequest) 
        DocumentCreateRequest documentCreateRequest = new DocumentCreateRequest();
        // String | Set this parameter as `ev1` if you want to create a document from PDF with Classic Editor when both editors are enabled for the workspace.
        String editorVer = "ev2";
        try {
            DocumentCreateResponse result = apiInstance.createDocument(documentCreateRequest, editorVer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#createDocument");
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
 **documentCreateRequest** | [**DocumentCreateRequest**](DocumentCreateRequest.md)| Use a PandaDoc template or an existing PDF to create a document. See the creation request examples [by template](/schemas/DocumentCreateByTemplateRequest) and [by pdf](/schemas/DocumentCreateByPdfRequest)  |
 **editorVer** | **String**| Set this parameter as &#x60;ev1&#x60; if you want to create a document from PDF with Classic Editor when both editors are enabled for the workspace. | [optional]

### Return type

[**DocumentCreateResponse**](DocumentCreateResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## createDocumentLink

> DocumentCreateLinkResponse createDocumentLink(id, documentCreateLinkRequest)

Create a Document Link

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Document ID
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        // DocumentCreateLinkRequest | 
        DocumentCreateLinkRequest documentCreateLinkRequest = new DocumentCreateLinkRequest();
        try {
            DocumentCreateLinkResponse result = apiInstance.createDocumentLink(id, documentCreateLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#createDocumentLink");
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
 **id** | **String**| Document ID |
 **documentCreateLinkRequest** | [**DocumentCreateLinkRequest**](DocumentCreateLinkRequest.md)|  |

### Return type

[**DocumentCreateLinkResponse**](DocumentCreateLinkResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## createLinkedObject

> LinkedObjectCreateResponse createLinkedObject(id, linkedObjectCreateRequest)

Create Linked Object

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        // LinkedObjectCreateRequest | 
        LinkedObjectCreateRequest linkedObjectCreateRequest = new LinkedObjectCreateRequest();
        try {
            LinkedObjectCreateResponse result = apiInstance.createLinkedObject(id, linkedObjectCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#createLinkedObject");
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
 **id** | **String**| Specify document ID. |
 **linkedObjectCreateRequest** | [**LinkedObjectCreateRequest**](LinkedObjectCreateRequest.md)|  |

### Return type

[**LinkedObjectCreateResponse**](LinkedObjectCreateResponse.md)

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


## deleteDocument

> deleteDocument(id)

Delete document by id

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Document ID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            apiInstance.deleteDocument(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#deleteDocument");
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
 **id** | **String**| Document ID |

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
| **404** | Not found |  -  |


## deleteLinkedObject

> deleteLinkedObject(id, linkedObjectId)

Delete Linked Object

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        // String | Specify linked object ID.
        String linkedObjectId = "deb0d530-d759-4189-a422-8d2265e01b2e";
        try {
            apiInstance.deleteLinkedObject(id, linkedObjectId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#deleteLinkedObject");
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
 **id** | **String**| Specify document ID. |
 **linkedObjectId** | **String**| Specify linked object ID. |

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
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## detailsDocument

> DocumentDetailsResponse detailsDocument(id)

Document details

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Document ID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            DocumentDetailsResponse result = apiInstance.detailsDocument(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#detailsDocument");
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
 **id** | **String**| Document ID |

### Return type

[**DocumentDetailsResponse**](DocumentDetailsResponse.md)

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
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## documentMoveToFolder

> documentMoveToFolder(id, folderId)

Document move to folder

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        // String | Specify folder ID.
        String folderId = "ZPeAfcpzr9aiVs5vqUf6jg";
        try {
            apiInstance.documentMoveToFolder(id, folderId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentMoveToFolder");
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
 **id** | **String**| Specify document ID. |
 **folderId** | **String**| Specify folder ID. |

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


## downloadDocument

> File downloadDocument(id, watermarkColor, watermarkFontSize, watermarkOpacity, watermarkText, separateFiles)

Document download

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | HEX code (for example `#FF5733`).
        String watermarkColor = "#FF5733";
        // Integer | Font size of the watermark.
        Integer watermarkFontSize = 12;
        // Float | In range 0.0-1.0
        Float watermarkOpacity = 0.5F;
        // String | Specify watermark text.
        String watermarkText = "John Doe inc.";
        // Boolean | Set as `true` if you want to receive a zip file with all documents in separate when document transaction contains more than 1.
        Boolean separateFiles = true;
        try {
            File result = apiInstance.downloadDocument(id, watermarkColor, watermarkFontSize, watermarkOpacity, watermarkText, separateFiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#downloadDocument");
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
 **id** | **String**| Specify document ID. |
 **watermarkColor** | **String**| HEX code (for example &#x60;#FF5733&#x60;). | [optional]
 **watermarkFontSize** | **Integer**| Font size of the watermark. | [optional]
 **watermarkOpacity** | **Float**| In range 0.0-1.0 | [optional]
 **watermarkText** | **String**| Specify watermark text. | [optional]
 **separateFiles** | **Boolean**| Set as &#x60;true&#x60; if you want to receive a zip file with all documents in separate when document transaction contains more than 1. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## downloadProtectedDocument

> File downloadProtectedDocument(id, separateFiles)

Download document protected

Download a signed PDF of a completed document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "Mebvyy3NGsGBnY2rPLkH84";
        // Boolean | Set as `true` if you want to receive a zip file with all documents in separate when document transaction contains more than 1.
        Boolean separateFiles = true;
        try {
            File result = apiInstance.downloadProtectedDocument(id, separateFiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#downloadProtectedDocument");
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
 **id** | **String**| Specify document ID. |
 **separateFiles** | **Boolean**| Set as &#x60;true&#x60; if you want to receive a zip file with all documents in separate when document transaction contains more than 1. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## listDocuments

> DocumentListResponse listDocuments(completedFrom, completedTo, contactId, count, createdFrom, createdTo, deleted, id, folderUuid, formId, membershipId, metadata, modifiedFrom, modifiedTo, orderBy, page, q, status, statusNe, tag, templateId)

List documents

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Return results where the `date_completed` field (ISO 8601) is greater than or equal to this value.
        String completedFrom = "2021-10-27T15:22:23.132757Z";
        // String | Return results where the `date_completed` field (ISO 8601) is less than or equal to this value.
        String completedTo = "2021-10-27T15:22:23.132757Z";
        // String | Returns results where 'contact_id' is present in document as recipient or approver
        String contactId = "9FeAY2NB3C9qDdtQRb4tTL";
        // Integer | Specify how many document results to return. Default is 50 documents, maximum is 100 documents.
        Integer count = 50;
        // String | Return results where the `date_created` field (ISO 8601) is greater than or equal to this value.
        String createdFrom = "2021-10-27T15:22:23.132757Z";
        // String | Return results where the `date_created` field (ISO 8601) is less than this value.
        String createdTo = "2021-10-27T15:22:23.132757Z";
        // Boolean | Returns only the deleted documents.
        Boolean deleted = true;
        // String | 
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | The UUID of the folder where the documents are stored.
        String folderUuid = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Specify the form used for documents creation. This parameter can't be used with template_id.
        String formId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Returns results where 'membership_id' is present in document as owner (should be member uuid)
        String membershipId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // List<String> | Specify metadata to filter by in the format of `metadata_{metadata-key}={metadata-value}` such as `metadata_opportunity_id=2181432`. The `metadata_` prefix is always required.
        List<String> metadata = Arrays.asList();
        // String | Return results where the `date_modified` field (iso-8601) is greater than or equal to this value.
        String modifiedFrom = "2021-10-27T15:22:23.132757Z";
        // String | Return results where the `date_modified` field (iso-8601) is less than this value.
        String modifiedTo = "2021-10-27T15:22:23.132757Z";
        // DocumentOrderingFieldsEnum | Specify the order of documents to return. Use `value` (for example, `date_created`) for ASC and `-value` (for example, `-date_created`) for DESC.
        DocumentOrderingFieldsEnum orderBy = DocumentOrderingFieldsEnum.fromValue("name");
        // Integer | Specify which page of the dataset to return.
        Integer page = 1;
        // String | Search query. Filter by document reference number (this token is stored on the template level) or name.
        String q = "Sample Document";
        // DocumentStatusRequestEnum | Specify the status of documents to return.   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined   * 13: document.external_review 
        DocumentStatusRequestEnum status = DocumentStatusRequestEnum.fromValue("0");
        // DocumentStatusRequestEnum | Specify the status of documents to return (exclude).   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined   * 13: document.external_review 
        DocumentStatusRequestEnum statusNe = DocumentStatusRequestEnum.fromValue("0");
        // String | Search tag. Filter by document tag.
        String tag = "tag_1";
        // String | Specify the template used for documents creation. Parameter can't be used with form_id.
        String templateId = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            DocumentListResponse result = apiInstance.listDocuments(completedFrom, completedTo, contactId, count, createdFrom, createdTo, deleted, id, folderUuid, formId, membershipId, metadata, modifiedFrom, modifiedTo, orderBy, page, q, status, statusNe, tag, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#listDocuments");
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
 **completedFrom** | **String**| Return results where the &#x60;date_completed&#x60; field (ISO 8601) is greater than or equal to this value. | [optional]
 **completedTo** | **String**| Return results where the &#x60;date_completed&#x60; field (ISO 8601) is less than or equal to this value. | [optional]
 **contactId** | **String**| Returns results where &#39;contact_id&#39; is present in document as recipient or approver | [optional]
 **count** | **Integer**| Specify how many document results to return. Default is 50 documents, maximum is 100 documents. | [optional]
 **createdFrom** | **String**| Return results where the &#x60;date_created&#x60; field (ISO 8601) is greater than or equal to this value. | [optional]
 **createdTo** | **String**| Return results where the &#x60;date_created&#x60; field (ISO 8601) is less than this value. | [optional]
 **deleted** | **Boolean**| Returns only the deleted documents. | [optional]
 **id** | **String**|  | [optional]
 **folderUuid** | **String**| The UUID of the folder where the documents are stored. | [optional]
 **formId** | **String**| Specify the form used for documents creation. This parameter can&#39;t be used with template_id. | [optional]
 **membershipId** | **String**| Returns results where &#39;membership_id&#39; is present in document as owner (should be member uuid) | [optional]
 **metadata** | [**List&lt;String&gt;**](String.md)| Specify metadata to filter by in the format of &#x60;metadata_{metadata-key}&#x3D;{metadata-value}&#x60; such as &#x60;metadata_opportunity_id&#x3D;2181432&#x60;. The &#x60;metadata_&#x60; prefix is always required. | [optional]
 **modifiedFrom** | **String**| Return results where the &#x60;date_modified&#x60; field (iso-8601) is greater than or equal to this value. | [optional]
 **modifiedTo** | **String**| Return results where the &#x60;date_modified&#x60; field (iso-8601) is less than this value. | [optional]
 **orderBy** | [**DocumentOrderingFieldsEnum**](.md)| Specify the order of documents to return. Use &#x60;value&#x60; (for example, &#x60;date_created&#x60;) for ASC and &#x60;-value&#x60; (for example, &#x60;-date_created&#x60;) for DESC. | [optional] [enum: name, date_created, date_status_changed, date_of_last_action, date_modified, date_sent, date_completed, date_expiration, date_declined, status, -name, -date_created, -date_status_changed, -date_of_last_action, -date_modified, -date_sent, -date_completed, -date_expiration, -date_declined, -status]
 **page** | **Integer**| Specify which page of the dataset to return. | [optional]
 **q** | **String**| Search query. Filter by document reference number (this token is stored on the template level) or name. | [optional]
 **status** | [**DocumentStatusRequestEnum**](.md)| Specify the status of documents to return.   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined   * 13: document.external_review  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
 **statusNe** | [**DocumentStatusRequestEnum**](.md)| Specify the status of documents to return (exclude).   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined   * 13: document.external_review  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
 **tag** | **String**| Search tag. Filter by document tag. | [optional]
 **templateId** | **String**| Specify the template used for documents creation. Parameter can&#39;t be used with form_id. | [optional]

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **429** | Too Many Requests |  -  |


## listLinkedObjects

> LinkedObjectListResponse listLinkedObjects(id)

List Linked Objects

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        try {
            LinkedObjectListResponse result = apiInstance.listLinkedObjects(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#listLinkedObjects");
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
 **id** | **String**| Specify document ID. |

### Return type

[**LinkedObjectListResponse**](LinkedObjectListResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## sendDocument

> DocumentSendResponse sendDocument(id, documentSendRequest)

Send Document

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Document ID
        String id = "ZPeAfcpzr9aiVs5vqUf6jg";
        // DocumentSendRequest | 
        DocumentSendRequest documentSendRequest = new DocumentSendRequest();
        try {
            DocumentSendResponse result = apiInstance.sendDocument(id, documentSendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#sendDocument");
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
 **id** | **String**| Document ID |
 **documentSendRequest** | [**DocumentSendRequest**](DocumentSendRequest.md)|  |

### Return type

[**DocumentSendResponse**](DocumentSendResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## statusDocument

> DocumentStatusResponse statusDocument(id)

Document status

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            DocumentStatusResponse result = apiInstance.statusDocument(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#statusDocument");
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
 **id** | **String**| Specify document ID. |

### Return type

[**DocumentStatusResponse**](DocumentStatusResponse.md)

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
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## transferAllDocumentsOwnership

> transferAllDocumentsOwnership(documentTransferAllOwnershipRequest)

Transfer all documents ownership

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // DocumentTransferAllOwnershipRequest | 
        DocumentTransferAllOwnershipRequest documentTransferAllOwnershipRequest = new DocumentTransferAllOwnershipRequest();
        try {
            apiInstance.transferAllDocumentsOwnership(documentTransferAllOwnershipRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#transferAllDocumentsOwnership");
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
 **documentTransferAllOwnershipRequest** | [**DocumentTransferAllOwnershipRequest**](DocumentTransferAllOwnershipRequest.md)|  |

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
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## transferDocumentOwnership

> transferDocumentOwnership(id, documentTransferOwnershipRequest)

Update document ownership

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Specify document ID.
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // DocumentTransferOwnershipRequest | 
        DocumentTransferOwnershipRequest documentTransferOwnershipRequest = new DocumentTransferOwnershipRequest();
        try {
            apiInstance.transferDocumentOwnership(id, documentTransferOwnershipRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#transferDocumentOwnership");
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
 **id** | **String**| Specify document ID. |
 **documentTransferOwnershipRequest** | [**DocumentTransferOwnershipRequest**](DocumentTransferOwnershipRequest.md)|  |

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
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## updateDocument

> updateDocument(id, documentUpdateRequest)

Update Document only in the draft status

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        // String | Document ID
        String id = "BhVzRcxH9Z2LgfPPGXFUBa";
        // DocumentUpdateRequest | 
        DocumentUpdateRequest documentUpdateRequest = new DocumentUpdateRequest();
        try {
            apiInstance.updateDocument(id, documentUpdateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#updateDocument");
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
 **id** | **String**| Document ID |
 **documentUpdateRequest** | [**DocumentUpdateRequest**](DocumentUpdateRequest.md)|  |

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

