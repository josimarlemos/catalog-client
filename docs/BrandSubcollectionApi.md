# BrandSubcollectionApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete**](BrandSubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/brand/{brandId} | Delete Brand SubCollection
[**apiCatalogPvtSubcollectionSubCollectionIdBrandPost**](BrandSubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdBrandPost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/brand | Associate SubCollection to Brand


<a name="apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete**
> apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete(contentType, accept, subCollectionId, brandId)

Delete Brand SubCollection

Deletes a Brand from a SubCollection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandSubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val brandId : kotlin.Int = 56 // kotlin.Int | Brand’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete(contentType, accept, subCollectionId, brandId)
} catch (e: ClientException) {
    println("4xx response calling BrandSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **brandId** | **kotlin.Int**| Brand’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdBrandPost"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdBrandPost**
> apiCatalogPvtSubcollectionSubCollectionIdBrandPost(contentType, accept, subCollectionId, requestBody14)

Associate SubCollection to Brand

Associates a SubCollection to a single Brand

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandSubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val requestBody14 : RequestBody14 =  // RequestBody14 | 
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdBrandPost(contentType, accept, subCollectionId, requestBody14)
} catch (e: ClientException) {
    println("4xx response calling BrandSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **requestBody14** | [**RequestBody14**](RequestBody14.md)|  | [optional]

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

