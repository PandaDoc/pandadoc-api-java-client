# FormsApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForm**](FormsApi.md#listForm) | **GET** /public/v1/forms | Forms



## listForm

> FormListResponse listForm(count, page, status, orderBy, asc, name)

Forms

List forms.

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.FormsApi;

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

        FormsApi apiInstance = new FormsApi(defaultClient);
        // Integer | Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms.
        Integer count = 10;
        // Integer | Optionally, specify which page of the dataset to return.
        Integer page = 56;
        // List<String> | Optionally, specify which status of the forms dataset to return.
        List<String> status = Arrays.asList();
        // String | Optionally, specify the form dataset order to return.
        String orderBy = "name";
        // Boolean | Optionally, specify sorting the result-set in ascending or descending order.
        Boolean asc = true;
        // String | Specify the form name.
        String name = "New Form";
        try {
            FormListResponse result = apiInstance.listForm(count, page, status, orderBy, asc, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsApi#listForm");
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
 **count** | **Integer**| Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms. | [optional]
 **page** | **Integer**| Optionally, specify which page of the dataset to return. | [optional]
 **status** | [**List&lt;String&gt;**](String.md)| Optionally, specify which status of the forms dataset to return. | [optional] [enum: draft, active, disabled]
 **orderBy** | **String**| Optionally, specify the form dataset order to return. | [optional] [enum: name, responses, status, created_date, modified_date]
 **asc** | **Boolean**| Optionally, specify sorting the result-set in ascending or descending order. | [optional]
 **name** | **String**| Specify the form name. | [optional]

### Return type

[**FormListResponse**](FormListResponse.md)

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

