# SpecificationApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSpecificationPost**](SpecificationApi.md#apiCatalogPvtSpecificationPost) | **POST** /api/catalog/pvt/specification | Create Specification
[**apiCatalogPvtSpecificationSpecificationIdGet**](SpecificationApi.md#apiCatalogPvtSpecificationSpecificationIdGet) | **GET** /api/catalog/pvt/specification/{specificationId} | Get Specification
[**apiCatalogPvtSpecificationSpecificationIdPut**](SpecificationApi.md#apiCatalogPvtSpecificationSpecificationIdPut) | **PUT** /api/catalog/pvt/specification/{specificationId} | Update Specification


<a name="apiCatalogPvtSpecificationPost"></a>
# **apiCatalogPvtSpecificationPost**
> InlineResponse20019 apiCatalogPvtSpecificationPost(contentType, accept, inlineObject16)

Create Specification

Creates a new Product or SKU Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject16 : InlineObject16 =  // InlineObject16 | 
try {
    val result : InlineResponse20019 = apiInstance.apiCatalogPvtSpecificationPost(contentType, accept, inlineObject16)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationApi#apiCatalogPvtSpecificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationApi#apiCatalogPvtSpecificationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject16** | [**InlineObject16**](InlineObject16.md)|  | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

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

<a name="apiCatalogPvtSpecificationSpecificationIdGet"></a>
# **apiCatalogPvtSpecificationSpecificationIdGet**
> RequestBody16 apiCatalogPvtSpecificationSpecificationIdGet(contentType, accept, specificationId)

Get Specification

Retrieves information of a Product or SKU Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationId : kotlin.Int = 56 // kotlin.Int | Specification’s unique numerical identifier
try {
    val result : RequestBody16 = apiInstance.apiCatalogPvtSpecificationSpecificationIdGet(contentType, accept, specificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationApi#apiCatalogPvtSpecificationSpecificationIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationApi#apiCatalogPvtSpecificationSpecificationIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationId** | **kotlin.Int**| Specification’s unique numerical identifier | [default to 1]

### Return type

[**RequestBody16**](RequestBody16.md)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiCatalogPvtSpecificationSpecificationIdPut"></a>
# **apiCatalogPvtSpecificationSpecificationIdPut**
> apiCatalogPvtSpecificationSpecificationIdPut(contentType, accept, specificationId, requestBody17)

Update Specification

Updates a Product or SKU Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationId : kotlin.Int = 56 // kotlin.Int | Specification’s unique numerical identifier
val requestBody17 : RequestBody17 =  // RequestBody17 | 
try {
    apiInstance.apiCatalogPvtSpecificationSpecificationIdPut(contentType, accept, specificationId, requestBody17)
} catch (e: ClientException) {
    println("4xx response calling SpecificationApi#apiCatalogPvtSpecificationSpecificationIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationApi#apiCatalogPvtSpecificationSpecificationIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationId** | **kotlin.Int**| Specification’s unique numerical identifier | [default to 1]
 **requestBody17** | [**RequestBody17**](RequestBody17.md)|  | [optional]

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

