# ContentLibraryItemsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detailsContentLibraryItem**](ContentLibraryItemsApi.md#detailsContentLibraryItem) | **GET** /public/v1/content-library-items/{id}/details | Details Content Library Item
[**listContentLibraryItems**](ContentLibraryItemsApi.md#listContentLibraryItems) | **GET** /public/v1/content-library-items | List Content Library Item



## detailsContentLibraryItem

> ContentLibraryItemResponse detailsContentLibraryItem(id)

Details Content Library Item

Return detailed data about a content library item.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.ContentLibraryItemsApi;

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

        ContentLibraryItemsApi apiInstance = new ContentLibraryItemsApi(defaultClient);
        // String | Content Library Item ID
        String id = "UXdP7Lnbvvr4WEb2wzM2hc";
        try {
            ContentLibraryItemResponse result = apiInstance.detailsContentLibraryItem(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryItemsApi#detailsContentLibraryItem");
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
 **id** | **String**| Content Library Item ID |

### Return type

[**ContentLibraryItemResponse**](ContentLibraryItemResponse.md)

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


## listContentLibraryItems

> ContentLibraryItemListResponse listContentLibraryItems(q, id, deleted, folderUuid, count, page, tag)

List Content Library Item

Optionally filter by a search query or tags.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.ContentLibraryItemsApi;

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

        ContentLibraryItemsApi apiInstance = new ContentLibraryItemsApi(defaultClient);
        // String | Search query. Filter by content library item name.
        String q = "Sample Pricing Table";
        // String | Specify content library item ID.
        String id = "UXdP7Lnbvvr4WEb2wzM2hc";
        // Boolean | Returns only the deleted content library items.
        Boolean deleted = true;
        // String | The UUID of the folder where the content library items are stored.
        String folderUuid = "S6xX7saJfA44mtJxGWd95L";
        // Integer | Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items.
        Integer count = 10;
        // Integer | Specify which page of the dataset to return.
        Integer page = 56;
        // String | Search tag. Filter by content library item tag.
        String tag = "pricing_tables";
        try {
            ContentLibraryItemListResponse result = apiInstance.listContentLibraryItems(q, id, deleted, folderUuid, count, page, tag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentLibraryItemsApi#listContentLibraryItems");
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
 **q** | **String**| Search query. Filter by content library item name. | [optional]
 **id** | **String**| Specify content library item ID. | [optional]
 **deleted** | **Boolean**| Returns only the deleted content library items. | [optional]
 **folderUuid** | **String**| The UUID of the folder where the content library items are stored. | [optional]
 **count** | **Integer**| Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items. | [optional]
 **page** | **Integer**| Specify which page of the dataset to return. | [optional]
 **tag** | **String**| Search tag. Filter by content library item tag. | [optional]

### Return type

[**ContentLibraryItemListResponse**](ContentLibraryItemListResponse.md)

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

