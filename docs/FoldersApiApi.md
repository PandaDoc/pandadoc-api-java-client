# FoldersApiApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentFolder**](FoldersApiApi.md#createDocumentFolder) | **POST** /public/v1/documents/folders | Create Documents Folder
[**createTemplateFolder**](FoldersApiApi.md#createTemplateFolder) | **POST** /public/v1/templates/folders | Create Templates Folder
[**listDocumentFolders**](FoldersApiApi.md#listDocumentFolders) | **GET** /public/v1/documents/folders | List Documents Folders
[**listTemplateFolders**](FoldersApiApi.md#listTemplateFolders) | **GET** /public/v1/templates/folders | List Templates Folders
[**renameDocumentFolder**](FoldersApiApi.md#renameDocumentFolder) | **PUT** /public/v1/documents/folders/{id} | Rename Documents Folder
[**renameTemplateFolder**](FoldersApiApi.md#renameTemplateFolder) | **PUT** /public/v1/templates/folders/{id} | Rename Templates Folder



## createDocumentFolder

> DocumentsFolderCreateResponse createDocumentFolder(documentsFolderCreateRequest)

Create Documents Folder

Create a new folder to store your documents.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // DocumentsFolderCreateRequest | 
        DocumentsFolderCreateRequest documentsFolderCreateRequest = new DocumentsFolderCreateRequest();
        try {
            DocumentsFolderCreateResponse result = apiInstance.createDocumentFolder(documentsFolderCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#createDocumentFolder");
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
 **documentsFolderCreateRequest** | [**DocumentsFolderCreateRequest**](DocumentsFolderCreateRequest.md)|  |

### Return type

[**DocumentsFolderCreateResponse**](DocumentsFolderCreateResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## createTemplateFolder

> TemplatesFolderCreateResponse createTemplateFolder(templatesFolderCreateRequest)

Create Templates Folder

Create a new folder to store your templates.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // TemplatesFolderCreateRequest | 
        TemplatesFolderCreateRequest templatesFolderCreateRequest = new TemplatesFolderCreateRequest();
        try {
            TemplatesFolderCreateResponse result = apiInstance.createTemplateFolder(templatesFolderCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#createTemplateFolder");
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
 **templatesFolderCreateRequest** | [**TemplatesFolderCreateRequest**](TemplatesFolderCreateRequest.md)|  |

### Return type

[**TemplatesFolderCreateResponse**](TemplatesFolderCreateResponse.md)

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
| **429** | Too Many Requests |  -  |


## listDocumentFolders

> DocumentsFolderListResponse listDocumentFolders(parentUuid, count, page)

List Documents Folders

Get the list of folders that contain Documents in your account.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // String | The UUID of the folder containing folders. To list the folders located in the root folder, remove this parameter in the request.
        String parentUuid = "Nq8htXxFssmhRxAPSP4SBP";
        // Integer | Optionally, specify how many folders to return. Default is 50 folders, maximum is 100 folders.
        Integer count = 10;
        // Integer | Optionally, specify which page of the dataset to return.
        Integer page = 56;
        try {
            DocumentsFolderListResponse result = apiInstance.listDocumentFolders(parentUuid, count, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#listDocumentFolders");
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
 **parentUuid** | **String**| The UUID of the folder containing folders. To list the folders located in the root folder, remove this parameter in the request. | [optional]
 **count** | **Integer**| Optionally, specify how many folders to return. Default is 50 folders, maximum is 100 folders. | [optional]
 **page** | **Integer**| Optionally, specify which page of the dataset to return. | [optional]

### Return type

[**DocumentsFolderListResponse**](DocumentsFolderListResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **429** | Too Many Requests |  -  |


## listTemplateFolders

> TemplatesFolderListResponse listTemplateFolders(parentUuid, count, page)

List Templates Folders

Get the list of folders that contain Templates in your account.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // String | The UUID of the folder containing folders. To list the folders located in the root folder, remove this parameter in the request.
        String parentUuid = "Nq8htXxFssmhRxAPSP4SBP";
        // Integer | Optionally, specify how many folders to return. Default is 50 folders, maximum is 100 folders.
        Integer count = 10;
        // Integer | Optionally, specify which page of the dataset to return.
        Integer page = 56;
        try {
            TemplatesFolderListResponse result = apiInstance.listTemplateFolders(parentUuid, count, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#listTemplateFolders");
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
 **parentUuid** | **String**| The UUID of the folder containing folders. To list the folders located in the root folder, remove this parameter in the request. | [optional]
 **count** | **Integer**| Optionally, specify how many folders to return. Default is 50 folders, maximum is 100 folders. | [optional]
 **page** | **Integer**| Optionally, specify which page of the dataset to return. | [optional]

### Return type

[**TemplatesFolderListResponse**](TemplatesFolderListResponse.md)

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
| **429** | Too Many Requests |  -  |


## renameDocumentFolder

> DocumentsFolderRenameResponse renameDocumentFolder(id, documentsFolderRenameRequest)

Rename Documents Folder

Rename Documents Folder.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // String | The UUID of the folder that you are renaming.
        String id = "Nq8htXxFssmhRxAPSP4SBP";
        // DocumentsFolderRenameRequest | 
        DocumentsFolderRenameRequest documentsFolderRenameRequest = new DocumentsFolderRenameRequest();
        try {
            DocumentsFolderRenameResponse result = apiInstance.renameDocumentFolder(id, documentsFolderRenameRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#renameDocumentFolder");
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
 **id** | **String**| The UUID of the folder that you are renaming. |
 **documentsFolderRenameRequest** | [**DocumentsFolderRenameRequest**](DocumentsFolderRenameRequest.md)|  |

### Return type

[**DocumentsFolderRenameResponse**](DocumentsFolderRenameResponse.md)

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
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## renameTemplateFolder

> TemplatesFolderRenameResponse renameTemplateFolder(id, templatesFolderRenameRequest)

Rename Templates Folder

Rename a templates folder.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FoldersApiApi;

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

        FoldersApiApi apiInstance = new FoldersApiApi(defaultClient);
        // String | The UUID of the folder which you are renaming.
        String id = "Nq8htXxFssmhRxAPSP4SBP";
        // TemplatesFolderRenameRequest | 
        TemplatesFolderRenameRequest templatesFolderRenameRequest = new TemplatesFolderRenameRequest();
        try {
            TemplatesFolderRenameResponse result = apiInstance.renameTemplateFolder(id, templatesFolderRenameRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApiApi#renameTemplateFolder");
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
 **id** | **String**| The UUID of the folder which you are renaming. |
 **templatesFolderRenameRequest** | [**TemplatesFolderRenameRequest**](TemplatesFolderRenameRequest.md)|  |

### Return type

[**TemplatesFolderRenameResponse**](TemplatesFolderRenameResponse.md)

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
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |

