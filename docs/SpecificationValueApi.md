# SpecificationValueApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSpecificationvaluePost**](SpecificationValueApi.md#apiCatalogPvtSpecificationvaluePost) | **POST** /api/catalog/pvt/specificationvalue | Create Specification Value
[**apiCatalogPvtSpecificationvalueSpecificationValueIdGet**](SpecificationValueApi.md#apiCatalogPvtSpecificationvalueSpecificationValueIdGet) | **GET** /api/catalog/pvt/specificationvalue/{specificationValueId} | Get Specification Value
[**apiCatalogPvtSpecificationvalueSpecificationValueIdPut**](SpecificationValueApi.md#apiCatalogPvtSpecificationvalueSpecificationValueIdPut) | **PUT** /api/catalog/pvt/specificationvalue/{specificationValueId} | Update Specification Value


<a name="apiCatalogPvtSpecificationvaluePost"></a>
# **apiCatalogPvtSpecificationvaluePost**
> InlineResponse20020 apiCatalogPvtSpecificationvaluePost(contentType, accept, inlineObject17)

Create Specification Value

Creates a new Specification Value for a Category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject17 : InlineObject17 =  // InlineObject17 | 
try {
    val result : InlineResponse20020 = apiInstance.apiCatalogPvtSpecificationvaluePost(contentType, accept, inlineObject17)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvaluePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvaluePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject17** | [**InlineObject17**](InlineObject17.md)|  | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

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

<a name="apiCatalogPvtSpecificationvalueSpecificationValueIdGet"></a>
# **apiCatalogPvtSpecificationvalueSpecificationValueIdGet**
> apiCatalogPvtSpecificationvalueSpecificationValueIdGet(contentType, accept, specificationValueId)

Get Specification Value

Retrieves general information about a Specification Value 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationValueId : kotlin.Int = 56 // kotlin.Int |  Specification Value’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSpecificationvalueSpecificationValueIdGet(contentType, accept, specificationValueId)
} catch (e: ClientException) {
    println("4xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvalueSpecificationValueIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvalueSpecificationValueIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationValueId** | **kotlin.Int**|  Specification Value’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSpecificationvalueSpecificationValueIdPut"></a>
# **apiCatalogPvtSpecificationvalueSpecificationValueIdPut**
> apiCatalogPvtSpecificationvalueSpecificationValueIdPut(contentType, accept, specificationValueId, requestBody18)

Update Specification Value

Updates a new Specification Value for a Category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationValueId : kotlin.Int = 56 // kotlin.Int |  Specification Value’s unique numerical identifier
val requestBody18 : RequestBody18 =  // RequestBody18 | 
try {
    apiInstance.apiCatalogPvtSpecificationvalueSpecificationValueIdPut(contentType, accept, specificationValueId, requestBody18)
} catch (e: ClientException) {
    println("4xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvalueSpecificationValueIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationValueApi#apiCatalogPvtSpecificationvalueSpecificationValueIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationValueId** | **kotlin.Int**|  Specification Value’s unique numerical identifier | [default to 1]
 **requestBody18** | [**RequestBody18**](RequestBody18.md)|  | [optional]

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

