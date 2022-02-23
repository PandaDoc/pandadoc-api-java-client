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


import com.pandadoc.client.models.ContentLibraryItemListResponse;
import com.pandadoc.client.models.ContentLibraryItemResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentLibraryItemsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContentLibraryItemsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContentLibraryItemsApi(ApiClient apiClient) {
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
     * Build call for detailsContentLibraryItem
     * @param id Content Library Item ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Permission error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call detailsContentLibraryItemCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/public/v1/content-library-items/{id}/details"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call detailsContentLibraryItemValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling detailsContentLibraryItem(Async)");
        }
        

        okhttp3.Call localVarCall = detailsContentLibraryItemCall(id, _callback);
        return localVarCall;

    }

    /**
     * Details Content Library Item
     * Return detailed data about a content library item.
     * @param id Content Library Item ID (required)
     * @return ContentLibraryItemResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Permission error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ContentLibraryItemResponse detailsContentLibraryItem(String id) throws ApiException {
        ApiResponse<ContentLibraryItemResponse> localVarResp = detailsContentLibraryItemWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Details Content Library Item
     * Return detailed data about a content library item.
     * @param id Content Library Item ID (required)
     * @return ApiResponse&lt;ContentLibraryItemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Permission error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContentLibraryItemResponse> detailsContentLibraryItemWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = detailsContentLibraryItemValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ContentLibraryItemResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Details Content Library Item (asynchronously)
     * Return detailed data about a content library item.
     * @param id Content Library Item ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Permission error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call detailsContentLibraryItemAsync(String id, final ApiCallback<ContentLibraryItemResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = detailsContentLibraryItemValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ContentLibraryItemResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listContentLibraryItems
     * @param q Search query. Filter by content library item name. (optional)
     * @param id Specify content library item ID. (optional)
     * @param deleted Returns only the deleted content library items. (optional)
     * @param folderUuid The UUID of the folder where the content library items are stored. (optional)
     * @param count Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items. (optional)
     * @param page Specify which page of the dataset to return. (optional)
     * @param tag Search tag. Filter by content library item tag. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listContentLibraryItemsCall(String q, String id, Boolean deleted, String folderUuid, Integer count, Integer page, String tag, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/public/v1/content-library-items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (deleted != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deleted", deleted));
        }

        if (folderUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("folder_uuid", folderUuid));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listContentLibraryItemsValidateBeforeCall(String q, String id, Boolean deleted, String folderUuid, Integer count, Integer page, String tag, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listContentLibraryItemsCall(q, id, deleted, folderUuid, count, page, tag, _callback);
        return localVarCall;

    }

    /**
     * List Content Library Item
     * Optionally filter by a search query or tags.
     * @param q Search query. Filter by content library item name. (optional)
     * @param id Specify content library item ID. (optional)
     * @param deleted Returns only the deleted content library items. (optional)
     * @param folderUuid The UUID of the folder where the content library items are stored. (optional)
     * @param count Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items. (optional)
     * @param page Specify which page of the dataset to return. (optional)
     * @param tag Search tag. Filter by content library item tag. (optional)
     * @return ContentLibraryItemListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ContentLibraryItemListResponse listContentLibraryItems(String q, String id, Boolean deleted, String folderUuid, Integer count, Integer page, String tag) throws ApiException {
        ApiResponse<ContentLibraryItemListResponse> localVarResp = listContentLibraryItemsWithHttpInfo(q, id, deleted, folderUuid, count, page, tag);
        return localVarResp.getData();
    }

    /**
     * List Content Library Item
     * Optionally filter by a search query or tags.
     * @param q Search query. Filter by content library item name. (optional)
     * @param id Specify content library item ID. (optional)
     * @param deleted Returns only the deleted content library items. (optional)
     * @param folderUuid The UUID of the folder where the content library items are stored. (optional)
     * @param count Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items. (optional)
     * @param page Specify which page of the dataset to return. (optional)
     * @param tag Search tag. Filter by content library item tag. (optional)
     * @return ApiResponse&lt;ContentLibraryItemListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContentLibraryItemListResponse> listContentLibraryItemsWithHttpInfo(String q, String id, Boolean deleted, String folderUuid, Integer count, Integer page, String tag) throws ApiException {
        okhttp3.Call localVarCall = listContentLibraryItemsValidateBeforeCall(q, id, deleted, folderUuid, count, page, tag, null);
        Type localVarReturnType = new TypeToken<ContentLibraryItemListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Content Library Item (asynchronously)
     * Optionally filter by a search query or tags.
     * @param q Search query. Filter by content library item name. (optional)
     * @param id Specify content library item ID. (optional)
     * @param deleted Returns only the deleted content library items. (optional)
     * @param folderUuid The UUID of the folder where the content library items are stored. (optional)
     * @param count Specify how many content library items to return. Default is 50 content library items, maximum is 100 content library items. (optional)
     * @param page Specify which page of the dataset to return. (optional)
     * @param tag Search tag. Filter by content library item tag. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listContentLibraryItemsAsync(String q, String id, Boolean deleted, String folderUuid, Integer count, Integer page, String tag, final ApiCallback<ContentLibraryItemListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listContentLibraryItemsValidateBeforeCall(q, id, deleted, folderUuid, count, page, tag, _callback);
        Type localVarReturnType = new TypeToken<ContentLibraryItemListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
