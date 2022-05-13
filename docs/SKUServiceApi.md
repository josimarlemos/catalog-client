# SKUServiceApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSkuservicePost**](SKUServiceApi.md#apiCatalogPvtSkuservicePost) | **POST** /api/catalog/pvt/skuservice | Associate SKU Service
[**apiCatalogPvtSkuserviceSkuServiceIdDelete**](SKUServiceApi.md#apiCatalogPvtSkuserviceSkuServiceIdDelete) | **DELETE** /api/catalog/pvt/skuservice/{skuServiceId} | Dissociate SKU Service
[**apiCatalogPvtSkuserviceSkuServiceIdPut**](SKUServiceApi.md#apiCatalogPvtSkuserviceSkuServiceIdPut) | **PUT** /api/catalog/pvt/skuservice/{skuServiceId} | Update SKU Service


<a name="apiCatalogPvtSkuservicePost"></a>
# **apiCatalogPvtSkuservicePost**
> apiCatalogPvtSkuservicePost(contentType, accept, requestBody6)

Associate SKU Service

Associates an SKU Service to an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody6 : RequestBody6 =  // RequestBody6 | 
try {
    apiInstance.apiCatalogPvtSkuservicePost(contentType, accept, requestBody6)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceApi#apiCatalogPvtSkuservicePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceApi#apiCatalogPvtSkuservicePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody6** | [**RequestBody6**](RequestBody6.md)|  | [optional]

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

<a name="apiCatalogPvtSkuserviceSkuServiceIdDelete"></a>
# **apiCatalogPvtSkuserviceSkuServiceIdDelete**
> apiCatalogPvtSkuserviceSkuServiceIdDelete(contentType, accept, skuServiceId)

Dissociate SKU Service

Dissociates an SKU Service from an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceId : kotlin.Int = 56 // kotlin.Int | SKU Service unique identifier
try {
    apiInstance.apiCatalogPvtSkuserviceSkuServiceIdDelete(contentType, accept, skuServiceId)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceApi#apiCatalogPvtSkuserviceSkuServiceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceApi#apiCatalogPvtSkuserviceSkuServiceIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceId** | **kotlin.Int**| SKU Service unique identifier |

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

<a name="apiCatalogPvtSkuserviceSkuServiceIdPut"></a>
# **apiCatalogPvtSkuserviceSkuServiceIdPut**
> apiCatalogPvtSkuserviceSkuServiceIdPut(contentType, accept, skuServiceId, requestBody5)

Update SKU Service

Updates an SKU Service from an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceId : kotlin.Int = 56 // kotlin.Int | SKU Service unique identifier
val requestBody5 : RequestBody5 =  // RequestBody5 | 
try {
    apiInstance.apiCatalogPvtSkuserviceSkuServiceIdPut(contentType, accept, skuServiceId, requestBody5)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceApi#apiCatalogPvtSkuserviceSkuServiceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceApi#apiCatalogPvtSkuserviceSkuServiceIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceId** | **kotlin.Int**| SKU Service unique identifier |
 **requestBody5** | [**RequestBody5**](RequestBody5.md)|  | [optional]

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

