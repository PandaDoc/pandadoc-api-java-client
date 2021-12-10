# TemplatesApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /public/v1/templates/{id} | Delete Template
[**detailsTemaplate**](TemplatesApi.md#detailsTemaplate) | **GET** /public/v1/templates/{id}/details | Details Template
[**listTemplates**](TemplatesApi.md#listTemplates) | **GET** /public/v1/templates | List Templates



## deleteTemplate

> deleteTemplate(id)

Delete Template

Delete a template

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        // String | Template ID
        String id = "EE8yUNg5HztqVAuH85He8V";
        try {
            apiInstance.deleteTemplate(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#deleteTemplate");
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
 **id** | **String**| Template ID |

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
| **400** | Bad Request |  -  |
| **401** | Authentication error |  -  |
| **403** | Permission error |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## detailsTemaplate

> TemplateDetailsResponse detailsTemaplate(id)

Details Template

Return detailed data about a template.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        // String | Template ID
        String id = "EE8yUNg5HztqVAuH85He8V";
        try {
            TemplateDetailsResponse result = apiInstance.detailsTemaplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#detailsTemaplate");
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
 **id** | **String**| Template ID |

### Return type

[**TemplateDetailsResponse**](TemplateDetailsResponse.md)

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


## listTemplates

> TemplateListResponse listTemplates(q, shared, deleted, count, page, id, folderUuid, tag)

List Templates

Optionally, filter by a search query or tags.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.TemplatesApi;

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

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        // String | Optional search query. Filter by template name.
        String q = "Sample onboarding template";
        // Boolean | Returns only the shared templates.
        Boolean shared = true;
        // Boolean | Optional. Returns only the deleted templates.
        Boolean deleted = true;
        // Integer | Optionally, specify how many templates to return. Default is 50 templates, maximum is 100 templates.
        Integer count = 10;
        // Integer | Optionally, specify which page of the dataset to return.
        Integer page = 56;
        // String | Optionally, specify template ID.
        String id = "e9LxBesSL73AeZMzeYdfvV";
        // String | UUID of the folder where the templates are stored.
        String folderUuid = "xDKHoJ8DkwhiTQSUzNveCJ";
        // List<String> | Optional search tag. Filter by template tag.
        List<String> tag = Arrays.asList();
        try {
            TemplateListResponse result = apiInstance.listTemplates(q, shared, deleted, count, page, id, folderUuid, tag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#listTemplates");
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
 **q** | **String**| Optional search query. Filter by template name. | [optional]
 **shared** | **Boolean**| Returns only the shared templates. | [optional]
 **deleted** | **Boolean**| Optional. Returns only the deleted templates. | [optional]
 **count** | **Integer**| Optionally, specify how many templates to return. Default is 50 templates, maximum is 100 templates. | [optional]
 **page** | **Integer**| Optionally, specify which page of the dataset to return. | [optional]
 **id** | **String**| Optionally, specify template ID. | [optional]
 **folderUuid** | **String**| UUID of the folder where the templates are stored. | [optional]
 **tag** | [**List&lt;String&gt;**](String.md)| Optional search tag. Filter by template tag. | [optional]

### Return type

[**TemplateListResponse**](TemplateListResponse.md)

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
| **429** | Too Many Requests |  -  |

