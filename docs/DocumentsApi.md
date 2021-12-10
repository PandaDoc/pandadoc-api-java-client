# DocumentsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /public/v1/documents/{id} | Delete document by id
[**documentCreate**](DocumentsApi.md#documentCreate) | **POST** /public/v1/documents | Create document
[**documentCreateLink**](DocumentsApi.md#documentCreateLink) | **POST** /public/v1/documents/{id}/session | Create a Document Link
[**documentDetails**](DocumentsApi.md#documentDetails) | **GET** /public/v1/documents/{id}/details | Document details
[**documentList**](DocumentsApi.md#documentList) | **GET** /public/v1/documents | List documents
[**documentStatus**](DocumentsApi.md#documentStatus) | **GET** /public/v1/documents/{id} | Document status
[**documentStatusChange**](DocumentsApi.md#documentStatusChange) | **PATCH** /public/v1/documents/{id}/status | Document status change
[**downloadDocument**](DocumentsApi.md#downloadDocument) | **GET** /public/v1/documents/{id}/download | Document download
[**downloadProtectedDocument**](DocumentsApi.md#downloadProtectedDocument) | **GET** /public/v1/documents/{id}/download-protected | Download document protected
[**linkedObjectDelete**](DocumentsApi.md#linkedObjectDelete) | **DELETE** /public/v1/documents/{id}/linked-objects/{linked_object_id} | Delete Linked Object
[**linkedObjectList**](DocumentsApi.md#linkedObjectList) | **GET** /public/v1/documents/{id}/linked-objects | List Linked Objects
[**linkedObjectsCreate**](DocumentsApi.md#linkedObjectsCreate) | **POST** /public/v1/documents/{id}/linked-objects | Create Linked Object
[**sendDocument**](DocumentsApi.md#sendDocument) | **POST** /public/v1/documents/{id}/send | Send Document



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


## documentCreate

> DocumentCreateResponse documentCreate(documentCreateRequest, editorVer)

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
        // DocumentCreateRequest | Use a PandaDoc template or an existing PDF to create a document. See the creation request examples [by template](#/schemas/DocumentCreateByTemplateRequest) and [by pdf](#/schemas/DocumentCreateByPdfRequest) 
        DocumentCreateRequest documentCreateRequest = new DocumentCreateRequest();
        // String | Set this parameter as `ev1` if you want to create a document from PDF with Classic Editor when both editors are enabled for the workspace.
        String editorVer = "ev2";
        try {
            DocumentCreateResponse result = apiInstance.documentCreate(documentCreateRequest, editorVer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentCreate");
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
 **documentCreateRequest** | [**DocumentCreateRequest**](DocumentCreateRequest.md)| Use a PandaDoc template or an existing PDF to create a document. See the creation request examples [by template](#/schemas/DocumentCreateByTemplateRequest) and [by pdf](#/schemas/DocumentCreateByPdfRequest)  |
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


## documentCreateLink

> DocumentCreateLinkResponse documentCreateLink(id, documentCreateLinkRequest)

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
            DocumentCreateLinkResponse result = apiInstance.documentCreateLink(id, documentCreateLinkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentCreateLink");
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


## documentDetails

> DocumentDetailsResponse documentDetails(id, dataMerge)

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
        // Boolean | When set to true, each item will contain all the fields in flat structure with external field names defined in the template.
        Boolean dataMerge = true;
        try {
            DocumentDetailsResponse result = apiInstance.documentDetails(id, dataMerge);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentDetails");
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
 **dataMerge** | **Boolean**| When set to true, each item will contain all the fields in flat structure with external field names defined in the template. | [optional]

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
| **429** | Too Many Requests |  -  |


## documentList

> DocumentListResponse documentList(completedFrom, completedTo, count, createdFrom, createdTo, deleted, id, folderUuid, formId, metadata, modifiedFrom, modifiedTo, orderBy, page, q, status, statusNe, tag, templateId)

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
        // String | Specify metadata to filter by in the format of `metadata_{metadata-key}={metadata-value}` such as `metadata_opportunity_id=2181432`. The `metadata_` prefix is always required.
        String metadata = "metadata_example";
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
        // DocumentStatusEnum | Specify the status of documents to return.   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined 
        DocumentStatusEnum status = DocumentStatusEnum.fromValue("0");
        // DocumentStatusEnum | Specify the status of documents to return (exclude).   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined 
        DocumentStatusEnum statusNe = DocumentStatusEnum.fromValue("0");
        // String | Search tag. Filter by document tag.
        String tag = "tag_1";
        // String | Specify the template used for documents creation. Parameter can't be used with form_id.
        String templateId = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            DocumentListResponse result = apiInstance.documentList(completedFrom, completedTo, count, createdFrom, createdTo, deleted, id, folderUuid, formId, metadata, modifiedFrom, modifiedTo, orderBy, page, q, status, statusNe, tag, templateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentList");
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
 **count** | **Integer**| Specify how many document results to return. Default is 50 documents, maximum is 100 documents. | [optional]
 **createdFrom** | **String**| Return results where the &#x60;date_created&#x60; field (ISO 8601) is greater than or equal to this value. | [optional]
 **createdTo** | **String**| Return results where the &#x60;date_created&#x60; field (ISO 8601) is less than this value. | [optional]
 **deleted** | **Boolean**| Returns only the deleted documents. | [optional]
 **id** | **String**|  | [optional]
 **folderUuid** | **String**| The UUID of the folder where the documents are stored. | [optional]
 **formId** | **String**| Specify the form used for documents creation. This parameter can&#39;t be used with template_id. | [optional]
 **metadata** | **String**| Specify metadata to filter by in the format of &#x60;metadata_{metadata-key}&#x3D;{metadata-value}&#x60; such as &#x60;metadata_opportunity_id&#x3D;2181432&#x60;. The &#x60;metadata_&#x60; prefix is always required. | [optional]
 **modifiedFrom** | **String**| Return results where the &#x60;date_modified&#x60; field (iso-8601) is greater than or equal to this value. | [optional]
 **modifiedTo** | **String**| Return results where the &#x60;date_modified&#x60; field (iso-8601) is less than this value. | [optional]
 **orderBy** | [**DocumentOrderingFieldsEnum**](.md)| Specify the order of documents to return. Use &#x60;value&#x60; (for example, &#x60;date_created&#x60;) for ASC and &#x60;-value&#x60; (for example, &#x60;-date_created&#x60;) for DESC. | [optional] [enum: name, date_created, date_status_changed, date_of_last_action, date_modified, date_sent, date_completed, date_expiration, date_declined, status, -name, -date_created, -date_status_changed, -date_of_last_action, -date_modified, -date_sent, -date_completed, -date_expiration, -date_declined, -status]
 **page** | **Integer**| Specify which page of the dataset to return. | [optional]
 **q** | **String**| Search query. Filter by document reference number (this token is stored on the template level) or name. | [optional]
 **status** | [**DocumentStatusEnum**](.md)| Specify the status of documents to return.   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 **statusNe** | [**DocumentStatusEnum**](.md)| Specify the status of documents to return (exclude).   * 0: document.draft   * 1: document.sent   * 2: document.completed   * 3: document.uploaded   * 4: document.error   * 5: document.viewed   * 6: document.waiting_approval   * 7: document.approved   * 8: document.rejected   * 9: document.waiting_pay   * 10: document.paid   * 11: document.voided   * 12: document.declined  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
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
| **401** | Bad Request |  -  |
| **403** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## documentStatus

> DocumentStatusResponse documentStatus(id)

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
            DocumentStatusResponse result = apiInstance.documentStatus(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentStatus");
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


## documentStatusChange

> documentStatusChange(id, documentStatusChangeRequest)

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
            apiInstance.documentStatusChange(id, documentStatusChangeRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#documentStatusChange");
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
| **429** | Too Many Requests |  -  |


## downloadDocument

> File downloadDocument(id, watermarkColor, watermarkFontSize, watermarkOpacity, watermarkText)

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
        try {
            File result = apiInstance.downloadDocument(id, watermarkColor, watermarkFontSize, watermarkOpacity, watermarkText);
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
| **429** | Too Many Requests |  -  |


## downloadProtectedDocument

> File downloadProtectedDocument(id)

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
        try {
            File result = apiInstance.downloadProtectedDocument(id);
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
| **429** | Too Many Requests |  -  |


## linkedObjectDelete

> linkedObjectDelete(id, linkedObjectId)

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
            apiInstance.linkedObjectDelete(id, linkedObjectId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#linkedObjectDelete");
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
| **429** | Too Many Requests |  -  |


## linkedObjectList

> LinkedObjectListResponse linkedObjectList(id)

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
            LinkedObjectListResponse result = apiInstance.linkedObjectList(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#linkedObjectList");
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
| **429** | Too Many Requests |  -  |


## linkedObjectsCreate

> LinkedObjectCreateResponse linkedObjectsCreate(id, linkedObjectCreateRequest)

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
            LinkedObjectCreateResponse result = apiInstance.linkedObjectsCreate(id, linkedObjectCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#linkedObjectsCreate");
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
| **429** | Too Many Requests |  -  |
