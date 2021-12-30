/*
 * PandaDoc Public API
 * PandaDoc Public API documentation
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pandadoc.client.api;

import com.pandadoc.client.ApiCallback;
import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.ApiResponse;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.Pair;
import com.pandadoc.client.ProgressRequestBody;
import com.pandadoc.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.pandadoc.client.models.FormListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FormsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FormsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for listForm
     * @param count Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms. (optional)
     * @param page Optionally, specify which page of the dataset to return. (optional)
     * @param status Optionally, specify which status of the forms dataset to return. (optional)
     * @param orderBy Optionally, specify the form dataset order to return. (optional)
     * @param asc Optionally, specify sorting the result-set in ascending or descending order. (optional)
     * @param name Specify the form name. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFormCall(Integer count, Integer page, List<String> status, String orderBy, Boolean asc, String name, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/public/v1/forms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (status != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "status", status));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (asc != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asc", asc));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listFormValidateBeforeCall(Integer count, Integer page, List<String> status, String orderBy, Boolean asc, String name, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listFormCall(count, page, status, orderBy, asc, name, _callback);
        return localVarCall;

    }

    /**
     * Forms
     * List forms.
     * @param count Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms. (optional)
     * @param page Optionally, specify which page of the dataset to return. (optional)
     * @param status Optionally, specify which status of the forms dataset to return. (optional)
     * @param orderBy Optionally, specify the form dataset order to return. (optional)
     * @param asc Optionally, specify sorting the result-set in ascending or descending order. (optional)
     * @param name Specify the form name. (optional)
     * @return FormListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public FormListResponse listForm(Integer count, Integer page, List<String> status, String orderBy, Boolean asc, String name) throws ApiException {
        ApiResponse<FormListResponse> localVarResp = listFormWithHttpInfo(count, page, status, orderBy, asc, name);
        return localVarResp.getData();
    }

    /**
     * Forms
     * List forms.
     * @param count Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms. (optional)
     * @param page Optionally, specify which page of the dataset to return. (optional)
     * @param status Optionally, specify which status of the forms dataset to return. (optional)
     * @param orderBy Optionally, specify the form dataset order to return. (optional)
     * @param asc Optionally, specify sorting the result-set in ascending or descending order. (optional)
     * @param name Specify the form name. (optional)
     * @return ApiResponse&lt;FormListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FormListResponse> listFormWithHttpInfo(Integer count, Integer page, List<String> status, String orderBy, Boolean asc, String name) throws ApiException {
        okhttp3.Call localVarCall = listFormValidateBeforeCall(count, page, status, orderBy, asc, name, null);
        Type localVarReturnType = new TypeToken<FormListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Forms (asynchronously)
     * List forms.
     * @param count Optionally, specify how many forms to return. Default is 50 forms, maximum is 100 forms. (optional)
     * @param page Optionally, specify which page of the dataset to return. (optional)
     * @param status Optionally, specify which status of the forms dataset to return. (optional)
     * @param orderBy Optionally, specify the form dataset order to return. (optional)
     * @param asc Optionally, specify sorting the result-set in ascending or descending order. (optional)
     * @param name Specify the form name. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listFormAsync(Integer count, Integer page, List<String> status, String orderBy, Boolean asc, String name, final ApiCallback<FormListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listFormValidateBeforeCall(count, page, status, orderBy, asc, name, _callback);
        Type localVarReturnType = new TypeToken<FormListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
