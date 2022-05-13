# NonStructuredSpecificationApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSpecificationNonstructuredDelete**](NonStructuredSpecificationApi.md#apiCatalogPvtSpecificationNonstructuredDelete) | **DELETE** /api/catalog/pvt/specification/nonstructured | Delete Specification Non Structured by SkuId
[**apiCatalogPvtSpecificationNonstructuredGet**](NonStructuredSpecificationApi.md#apiCatalogPvtSpecificationNonstructuredGet) | **GET** /api/catalog/pvt/specification/nonstructured | Get Specification Non Structured by SkuId
[**apiCatalogPvtSpecificationNonstructuredIdDelete**](NonStructuredSpecificationApi.md#apiCatalogPvtSpecificationNonstructuredIdDelete) | **DELETE** /api/catalog/pvt/specification/nonstructured/{Id} | Delete Specification Non Structured
[**apiCatalogPvtSpecificationNonstructuredIdGet**](NonStructuredSpecificationApi.md#apiCatalogPvtSpecificationNonstructuredIdGet) | **GET** /api/catalog/pvt/specification/nonstructured/{Id} | Get Specification Non Structured


<a name="apiCatalogPvtSpecificationNonstructuredDelete"></a>
# **apiCatalogPvtSpecificationNonstructuredDelete**
> apiCatalogPvtSpecificationNonstructuredDelete(contentType, accept, skuId)

Delete Specification Non Structured by SkuId

Deletes unmapped Specifications of a Seller SKU in a Marketplace by its unique ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonStructuredSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSpecificationNonstructuredDelete(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredDelete")
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

<a name="apiCatalogPvtSpecificationNonstructuredGet"></a>
# **apiCatalogPvtSpecificationNonstructuredGet**
> apiCatalogPvtSpecificationNonstructuredGet(contentType, accept, skuId)

Get Specification Non Structured by SkuId

Gets general information about unmapped Specifications of a Seller SKU in a Marketplace by its unique ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonStructuredSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSpecificationNonstructuredGet(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredGet")
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

<a name="apiCatalogPvtSpecificationNonstructuredIdDelete"></a>
# **apiCatalogPvtSpecificationNonstructuredIdDelete**
> apiCatalogPvtSpecificationNonstructuredIdDelete(contentType, accept, id)

Delete Specification Non Structured

Deletes unmapped Specifications of a Seller SKU in a Marketplace by its unique ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonStructuredSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val id : kotlin.Int = 56 // kotlin.Int | Non Structured Specification’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSpecificationNonstructuredIdDelete(contentType, accept, id)
} catch (e: ClientException) {
    println("4xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **id** | **kotlin.Int**| Non Structured Specification’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSpecificationNonstructuredIdGet"></a>
# **apiCatalogPvtSpecificationNonstructuredIdGet**
> apiCatalogPvtSpecificationNonstructuredIdGet(contentType, accept, id)

Get Specification Non Structured

Gets general information about unmapped Specifications of a Seller SKU in a Marketplace

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NonStructuredSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val id : kotlin.Int = 56 // kotlin.Int | Non Structured Specification’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSpecificationNonstructuredIdGet(contentType, accept, id)
} catch (e: ClientException) {
    println("4xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NonStructuredSpecificationApi#apiCatalogPvtSpecificationNonstructuredIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **id** | **kotlin.Int**| Non Structured Specification’s unique numerical identifier | [default to 1]

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

