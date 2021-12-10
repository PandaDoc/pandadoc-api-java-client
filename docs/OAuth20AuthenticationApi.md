# OAuth20AuthenticationApi

All URIs are relative to *https://api.pandadoc.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessToken**](OAuth20AuthenticationApi.md#accessToken) | **POST** /oauth2/access_token | Create/Refresh Access Token



## accessToken

> OAuth2AccessTokenResponse accessToken(grantType, clientId, clientSecret, code, scope, refreshToken)

Create/Refresh Access Token

### Example

```java
// Import classes:
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.auth.*;
import com.pandadoc.client.models.*;
import com.pandadoc.client.api.OAuth20AuthenticationApi;

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

        OAuth20AuthenticationApi apiInstance = new OAuth20AuthenticationApi(defaultClient);
        // String | This value must be set to `refresh_token`.
        String grantType = "\"refresh_token\"";
        // String | Client ID that is automatically generated after application creation in the Developer Dashboard.
        String clientId = "clientId_example";
        // String | Client secret that is automatically generated after application creation in the Developer Dashboard.
        String clientSecret = "clientSecret_example";
        // String | `auth_code` from the server on the previous step (Authorize a PandaDoc User). 
        String code = "code_example";
        // String | Requested permissions. Use `read+write` as our default value to send documents.
        String scope = "scope_example";
        // String | `refresh_token` you received and stored from the server when initially creating an `access_token`. 
        String refreshToken = "refreshToken_example";
        try {
            OAuth2AccessTokenResponse result = apiInstance.accessToken(grantType, clientId, clientSecret, code, scope, refreshToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OAuth20AuthenticationApi#accessToken");
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
 **grantType** | **String**| This value must be set to &#x60;refresh_token&#x60;. | [optional] [default to &quot;refresh_token&quot;]
 **clientId** | **String**| Client ID that is automatically generated after application creation in the Developer Dashboard. | [optional]
 **clientSecret** | **String**| Client secret that is automatically generated after application creation in the Developer Dashboard. | [optional]
 **code** | **String**| &#x60;auth_code&#x60; from the server on the previous step (Authorize a PandaDoc User).  | [optional]
 **scope** | **String**| Requested permissions. Use &#x60;read+write&#x60; as our default value to send documents. | [optional]
 **refreshToken** | **String**| &#x60;refresh_token&#x60; you received and stored from the server when initially creating an &#x60;access_token&#x60;.  | [optional]

### Return type

[**OAuth2AccessTokenResponse**](OAuth2AccessTokenResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

