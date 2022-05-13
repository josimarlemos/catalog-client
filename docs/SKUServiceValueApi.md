# SKUServiceValueApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSkuservicevaluePost**](SKUServiceValueApi.md#apiCatalogPvtSkuservicevaluePost) | **POST** /api/catalog/pvt/skuservicevalue | Create SKU Service Value
[**apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete**](SKUServiceValueApi.md#apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete) | **DELETE** /api/catalog/pvt/skuservicevalue/{skuServiceValueId} | Delete SKU Service Value
[**apiCatalogPvtSkuservicevalueSkuServiceValueIdPut**](SKUServiceValueApi.md#apiCatalogPvtSkuservicevalueSkuServiceValueIdPut) | **PUT** /api/catalog/pvt/skuservicevalue/{skuServiceValueId} | Update SKU Service Value


<a name="apiCatalogPvtSkuservicevaluePost"></a>
# **apiCatalogPvtSkuservicevaluePost**
> apiCatalogPvtSkuservicevaluePost(contentType, accept, requestBody10)

Create SKU Service Value

Creates an SKU Service Value for an existing SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody10 : RequestBody10 =  // RequestBody10 | 
try {
    apiInstance.apiCatalogPvtSkuservicevaluePost(contentType, accept, requestBody10)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevaluePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevaluePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody10** | [**RequestBody10**](RequestBody10.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete"></a>
# **apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete**
> apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete(contentType, accept, skuServiceValueId)

Delete SKU Service Value

Deletes an existing SKU Service Value

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceValueId : kotlin.Int = 56 // kotlin.Int | SKU Service Value unique identifier
try {
    apiInstance.apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete(contentType, accept, skuServiceValueId)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceValueId** | **kotlin.Int**| SKU Service Value unique identifier |

### Return type

null (empty response body)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiCatalogPvtSkuservicevalueSkuServiceValueIdPut"></a>
# **apiCatalogPvtSkuservicevalueSkuServiceValueIdPut**
> apiCatalogPvtSkuservicevalueSkuServiceValueIdPut(contentType, accept, skuServiceValueId, requestBody11)

Update SKU Service Value

Updates an existing SKU Service Value

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceValueId : kotlin.Int = 56 // kotlin.Int | SKU Service Value unique identifier
val requestBody11 : RequestBody11 =  // RequestBody11 | 
try {
    apiInstance.apiCatalogPvtSkuservicevalueSkuServiceValueIdPut(contentType, accept, skuServiceValueId, requestBody11)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevalueSkuServiceValueIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceValueApi#apiCatalogPvtSkuservicevalueSkuServiceValueIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceValueId** | **kotlin.Int**| SKU Service Value unique identifier |
 **requestBody11** | [**RequestBody11**](RequestBody11.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

