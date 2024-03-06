# QuotesApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quoteUpdate**](QuotesApi.md#quoteUpdate) | **PUT** /public/v1/documents/{document_id}/quotes/{quote_id} | Quote update



## quoteUpdate

> QuoteResponse quoteUpdate(documentId, quoteId, quoteUpdateRequest)

Quote update

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.QuotesApi;

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

        QuotesApi apiInstance = new QuotesApi(defaultClient);
        // String | Document ID
        String documentId = "BhVzRcxH9Z2LgfPPGXFUBa";
        // String | Quote ID
        String quoteId = "99aaa4f9-3250-4f5b-a953-6d7bfc5d8c9e";
        // QuoteUpdateRequest | 
        QuoteUpdateRequest quoteUpdateRequest = new QuoteUpdateRequest();
        try {
            QuoteResponse result = apiInstance.quoteUpdate(documentId, quoteId, quoteUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotesApi#quoteUpdate");
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
 **quoteId** | **String**| Quote ID |
 **quoteUpdateRequest** | [**QuoteUpdateRequest**](QuoteUpdateRequest.md)|  |

### Return type

[**QuoteResponse**](QuoteResponse.md)

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

