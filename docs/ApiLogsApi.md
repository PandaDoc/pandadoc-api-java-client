# ApiLogsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detailsLog**](ApiLogsApi.md#detailsLog) | **GET** /public/v1/logs/{id} | Details API Log
[**listLogs**](ApiLogsApi.md#listLogs) | **GET** /public/v1/logs | List API Log



## detailsLog

> APILogDetailsResponse detailsLog(id)

Details API Log

Returns details of the specific API log event.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.ApiLogsApi;

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

        ApiLogsApi apiInstance = new ApiLogsApi(defaultClient);
        // String | Log event id.
        String id = "AXp2jrHMK2MKv_lRqmQ";
        try {
            APILogDetailsResponse result = apiInstance.detailsLog(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiLogsApi#detailsLog");
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
 **id** | **String**| Log event id. |

### Return type

[**APILogDetailsResponse**](APILogDetailsResponse.md)

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


## listLogs

> APILogListResponse listLogs(since, to, count, page, statuses, methods, search, environmentType)

List API Log

Get the list of all logs within the selected workspace. Optionally filter by date, page, and &#x60;#&#x60; of items per page.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.ApiLogsApi;

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

        ApiLogsApi apiInstance = new ApiLogsApi(defaultClient);
        // String | Determines a point in time from which logs should be fetched. Either a specific ISO 8601 datetime or a relative identifier such as \"-90d\" (for past 90 days).
        String since = "-7d";
        // String | Determines a point in time from which logs should be fetched. Either a specific ISO 8601 datetime or a relative identifier such as \"-10d\" (for past 10 days) or a special \"now\" value.
        String to = "now";
        // Integer | The amount of items on each page.
        Integer count = 10;
        // Integer | Page number of the results returned.
        Integer page = 56;
        // List<Integer> | Returns only the predefined status codes. Allows 1xx, 2xx, 3xx, 4xx, and 5xx.
        List<Integer> statuses = Arrays.asList();
        // List<String> | Returns only the predefined HTTP methods. Allows GET, POST, PUT, PATCH, and DELETE.
        List<String> methods = Arrays.asList();
        // String | Returns the results containing a string.
        String search = "documents/hryJY9mqYZHjQCYQuSjRQg/send";
        // String | Returns logs for production/sandbox.
        String environmentType = "PRODUCTION";
        try {
            APILogListResponse result = apiInstance.listLogs(since, to, count, page, statuses, methods, search, environmentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiLogsApi#listLogs");
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
 **since** | **String**| Determines a point in time from which logs should be fetched. Either a specific ISO 8601 datetime or a relative identifier such as \&quot;-90d\&quot; (for past 90 days). | [optional]
 **to** | **String**| Determines a point in time from which logs should be fetched. Either a specific ISO 8601 datetime or a relative identifier such as \&quot;-10d\&quot; (for past 10 days) or a special \&quot;now\&quot; value. | [optional]
 **count** | **Integer**| The amount of items on each page. | [optional]
 **page** | **Integer**| Page number of the results returned. | [optional]
 **statuses** | [**List&lt;Integer&gt;**](Integer.md)| Returns only the predefined status codes. Allows 1xx, 2xx, 3xx, 4xx, and 5xx. | [optional] [enum: 100, 200, 300, 400, 500]
 **methods** | [**List&lt;String&gt;**](String.md)| Returns only the predefined HTTP methods. Allows GET, POST, PUT, PATCH, and DELETE. | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **search** | **String**| Returns the results containing a string. | [optional]
 **environmentType** | **String**| Returns logs for production/sandbox. | [optional] [enum: PRODUCTION, SANDBOX]

### Return type

[**APILogListResponse**](APILogListResponse.md)

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

