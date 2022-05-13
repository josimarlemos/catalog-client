# SKUServiceTypeApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSkuservicetypePost**](SKUServiceTypeApi.md#apiCatalogPvtSkuservicetypePost) | **POST** /api/catalog/pvt/skuservicetype | Create SKU Service Type
[**apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete**](SKUServiceTypeApi.md#apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete) | **DELETE** /api/catalog/pvt/skuservicetype/{skuServiceTypeId} | Delete SKU Service Type
[**apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut**](SKUServiceTypeApi.md#apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut) | **PUT** /api/catalog/pvt/skuservicetype/{skuServiceTypeId} | Update SKU Service Type


<a name="apiCatalogPvtSkuservicetypePost"></a>
# **apiCatalogPvtSkuservicetypePost**
> apiCatalogPvtSkuservicetypePost(contentType, accept, requestBody8)

Create SKU Service Type

Creates an SKU Service Type from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceTypeApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody8 : RequestBody8 =  // RequestBody8 | 
try {
    apiInstance.apiCatalogPvtSkuservicetypePost(contentType, accept, requestBody8)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody8** | [**RequestBody8**](RequestBody8.md)|  | [optional]

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

<a name="apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete"></a>
# **apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete**
> apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete(contentType, accept, skuServiceTypeId)

Delete SKU Service Type

Deletes an existing SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceTypeApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceTypeId : kotlin.Int = 56 // kotlin.Int | SKU Service Type unique identifier
try {
    apiInstance.apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete(contentType, accept, skuServiceTypeId)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceTypeId** | **kotlin.Int**| SKU Service Type unique identifier |

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

<a name="apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut"></a>
# **apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut**
> apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut(contentType, accept, skuServiceTypeId, requestBody9)

Update SKU Service Type

Updates an existing SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceTypeApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceTypeId : kotlin.Int = 56 // kotlin.Int | SKU Service Type unique identifier
val requestBody9 : RequestBody9 =  // RequestBody9 | 
try {
    apiInstance.apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut(contentType, accept, skuServiceTypeId, requestBody9)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceTypeApi#apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceTypeId** | **kotlin.Int**| SKU Service Type unique identifier |
 **requestBody9** | [**RequestBody9**](RequestBody9.md)|  | [optional]

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

