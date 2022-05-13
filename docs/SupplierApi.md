# SupplierApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSupplierPost**](SupplierApi.md#apiCatalogPvtSupplierPost) | **POST** /api/catalog/pvt/supplier | Create Supplier
[**apiCatalogPvtSupplierSupplierIdDelete**](SupplierApi.md#apiCatalogPvtSupplierSupplierIdDelete) | **DELETE** /api/catalog/pvt/supplier/{supplierId} | Delete Supplier
[**apiCatalogPvtSupplierSupplierIdPut**](SupplierApi.md#apiCatalogPvtSupplierSupplierIdPut) | **PUT** /api/catalog/pvt/supplier/{supplierId} | Update Supplier


<a name="apiCatalogPvtSupplierPost"></a>
# **apiCatalogPvtSupplierPost**
> apiCatalogPvtSupplierPost(contentType, accept, requestBody20)

Create Supplier

Creates a new Supplier from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody20 : RequestBody20 =  // RequestBody20 | 
try {
    apiInstance.apiCatalogPvtSupplierPost(contentType, accept, requestBody20)
} catch (e: ClientException) {
    println("4xx response calling SupplierApi#apiCatalogPvtSupplierPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierApi#apiCatalogPvtSupplierPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody20** | [**RequestBody20**](RequestBody20.md)|  | [optional]

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

<a name="apiCatalogPvtSupplierSupplierIdDelete"></a>
# **apiCatalogPvtSupplierSupplierIdDelete**
> apiCatalogPvtSupplierSupplierIdDelete(contentType, accept, supplierId)

Delete Supplier

Deletes an existing Supplier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val supplierId : kotlin.Int = 56 // kotlin.Int | Category’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSupplierSupplierIdDelete(contentType, accept, supplierId)
} catch (e: ClientException) {
    println("4xx response calling SupplierApi#apiCatalogPvtSupplierSupplierIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierApi#apiCatalogPvtSupplierSupplierIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **supplierId** | **kotlin.Int**| Category’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSupplierSupplierIdPut"></a>
# **apiCatalogPvtSupplierSupplierIdPut**
> apiCatalogPvtSupplierSupplierIdPut(contentType, accept, supplierId, requestBody21)

Update Supplier

Updates general information of an existing Supplier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val supplierId : kotlin.Int = 56 // kotlin.Int | Category’s unique numerical identifier
val requestBody21 : RequestBody21 =  // RequestBody21 | 
try {
    apiInstance.apiCatalogPvtSupplierSupplierIdPut(contentType, accept, supplierId, requestBody21)
} catch (e: ClientException) {
    println("4xx response calling SupplierApi#apiCatalogPvtSupplierSupplierIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierApi#apiCatalogPvtSupplierSupplierIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **supplierId** | **kotlin.Int**| Category’s unique numerical identifier | [default to 1]
 **requestBody21** | [**RequestBody21**](RequestBody21.md)|  | [optional]

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

