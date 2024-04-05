# SectionsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSections**](SectionsApi.md#listSections) | **GET** /public/v1/documents/{document_id}/sections | List sections
[**sectionDetails**](SectionsApi.md#sectionDetails) | **GET** /public/v1/documents/{document_id}/sections/uploads/{upload_id} | Section details
[**sectionInfo**](SectionsApi.md#sectionInfo) | **GET** /public/v1/documents/{document_id}/sections/{section_id} | Section Info
[**uploadSection**](SectionsApi.md#uploadSection) | **POST** /public/v1/documents/{document_id}/sections/uploads | Upload section



## listSections

> UploadSectionListResponse listSections(documentId)

List sections

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.SectionsApi;

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

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        // String | Document ID
        String documentId = "BhVzRcxH9Z2LgfPPGXFUBa";
        try {
            UploadSectionListResponse result = apiInstance.listSections(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#listSections");
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
 **documentId** | **String**| Document ID |

### Return type

[**UploadSectionListResponse**](UploadSectionListResponse.md)

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


## sectionDetails

> UploadSectionStatusResponse sectionDetails(documentId, uploadId)

Section details

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.SectionsApi;

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

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        // String | Document ID
        String documentId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Upload ID
        String uploadId = "LQ6cUT7xevPLUEgJeF8Zrm";
        try {
            UploadSectionStatusResponse result = apiInstance.sectionDetails(documentId, uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#sectionDetails");
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
 **documentId** | **String**| Document ID |
 **uploadId** | **String**| Upload ID |

### Return type

[**UploadSectionStatusResponse**](UploadSectionStatusResponse.md)

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


## sectionInfo

> SectionInfoResponse sectionInfo(documentId, sectionId)

Section Info

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.SectionsApi;

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

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        // String | Document ID
        String documentId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Section ID
        String sectionId = "LQ6cUT7xevPLUEgJeF8Zrm";
        try {
            SectionInfoResponse result = apiInstance.sectionInfo(documentId, sectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#sectionInfo");
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
 **documentId** | **String**| Document ID |
 **sectionId** | **String**| Section ID |

### Return type

[**SectionInfoResponse**](SectionInfoResponse.md)

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


## uploadSection

> UploadSectionResponse uploadSection(documentId, uploadSectionRequest, mergeFieldScope)

Upload section

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.SectionsApi;

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

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        // String | Document ID
        String documentId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // UploadSectionRequest | Use a PandaDoc template or an existing PDF to upload a section. See the creation request examples [by template](/schemas/UploadSectionByTemplateRequest) and [by pdf](/schemas/UploadSectionByPdfRequest) 
        UploadSectionRequest uploadSectionRequest = new UploadSectionRequest();
        // String | Determines how the fields are mapped when creating a section.   * document: Default value. The fields of the entire document are updated.   * upload: Only the fields from the created section are updated. The merge field is appended with the upload ID. 
        String mergeFieldScope = "document";
        try {
            UploadSectionResponse result = apiInstance.uploadSection(documentId, uploadSectionRequest, mergeFieldScope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#uploadSection");
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
 **documentId** | **String**| Document ID |
 **uploadSectionRequest** | [**UploadSectionRequest**](UploadSectionRequest.md)| Use a PandaDoc template or an existing PDF to upload a section. See the creation request examples [by template](/schemas/UploadSectionByTemplateRequest) and [by pdf](/schemas/UploadSectionByPdfRequest)  |
 **mergeFieldScope** | **String**| Determines how the fields are mapped when creating a section.   * document: Default value. The fields of the entire document are updated.   * upload: Only the fields from the created section are updated. The merge field is appended with the upload ID.  | [optional] [enum: document, upload]

### Return type

[**UploadSectionResponse**](UploadSectionResponse.md)

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

