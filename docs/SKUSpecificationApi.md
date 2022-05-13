# SKUSpecificationApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete**](SKUSpecificationApi.md#apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Delete all SKU Specifications
[**apiCatalogPvtStockkeepingunitSkuIdSpecificationGet**](SKUSpecificationApi.md#apiCatalogPvtStockkeepingunitSkuIdSpecificationGet) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Get SKU Specifications
[**apiCatalogPvtStockkeepingunitSkuIdSpecificationPost**](SKUSpecificationApi.md#apiCatalogPvtStockkeepingunitSkuIdSpecificationPost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Associate SKU Specification
[**apiCatalogPvtStockkeepingunitSkuIdSpecificationPut**](SKUSpecificationApi.md#apiCatalogPvtStockkeepingunitSkuIdSpecificationPut) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Update SKU Specification
[**apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete**](SKUSpecificationApi.md#apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/specification/{specificationId} | Delete SKU Specification


<a name="apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete**
> apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete(contentType, accept, skuId)

Delete all SKU Specifications

Deletes all Product Specifications

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdSpecificationGet"></a>
# **apiCatalogPvtStockkeepingunitSkuIdSpecificationGet**
> apiCatalogPvtStockkeepingunitSkuIdSpecificationGet(contentType, accept, skuId)

Get SKU Specifications

Retrieves general information about an SKU Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdSpecificationGet(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdSpecificationPost"></a>
# **apiCatalogPvtStockkeepingunitSkuIdSpecificationPost**
> InlineResponse20013 apiCatalogPvtStockkeepingunitSkuIdSpecificationPost(contentType, accept, skuId, inlineObject6)

Associate SKU Specification

Associates a previously defined Specification to an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val inlineObject6 : InlineObject6 =  // InlineObject6 | 
try {
    val result : InlineResponse20013 = apiInstance.apiCatalogPvtStockkeepingunitSkuIdSpecificationPost(contentType, accept, skuId, inlineObject6)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1234568387]
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiCatalogPvtStockkeepingunitSkuIdSpecificationPut"></a>
# **apiCatalogPvtStockkeepingunitSkuIdSpecificationPut**
> apiCatalogPvtStockkeepingunitSkuIdSpecificationPut(contentType, accept, skuId, requestBody)

Update SKU Specification

Updates an existing Specification on an existing SKU. This endpoint only updates the &#x60;FieldValueId&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val requestBody : RequestBody =  // RequestBody | 
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdSpecificationPut(contentType, accept, skuId, requestBody)
} catch (e: ClientException) {
    println("4xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 21]
 **requestBody** | [**RequestBody**](RequestBody.md)|  | [optional]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete**
> apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete(contentType, accept, skuId, specificationId)

Delete SKU Specification

Deletes a specific SKU Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val specificationId : kotlin.Int = 56 // kotlin.Int | Specification’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete(contentType, accept, skuId, specificationId)
} catch (e: ClientException) {
    println("4xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSpecificationApi#apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **specificationId** | **kotlin.Int**| Specification’s unique numerical identifier | [default to 1]

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

