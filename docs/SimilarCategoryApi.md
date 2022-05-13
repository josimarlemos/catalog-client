# SimilarCategoryApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete**](SimilarCategoryApi.md#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete) | **DELETE** /api/catalog/pvt/product/{productId}/similarcategory/{categoryId} | Delete Similar Product Category
[**apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost**](SimilarCategoryApi.md#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost) | **POST** /api/catalog/pvt/product/{productId}/similarcategory/{categoryId} | Create Similar Product Category
[**apiCatalogPvtProductProductIdSimilarcategoryGet**](SimilarCategoryApi.md#apiCatalogPvtProductProductIdSimilarcategoryGet) | **GET** /api/catalog/pvt/product/{productId}/similarcategory/ | Get Similar Product Category


<a name="apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete"></a>
# **apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete**
> apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete(contentType, accept, productId, categoryId)

Delete Similar Product Category

Deletes a Similar Category from a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SimilarCategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val categoryId : kotlin.Int = 56 // kotlin.Int | Similar Category’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete(contentType, accept, productId, categoryId)
} catch (e: ClientException) {
    println("4xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **categoryId** | **kotlin.Int**| Similar Category’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost"></a>
# **apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost**
> apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost(contentType, accept, productId, categoryId)

Create Similar Product Category

Creates a Similar Category to a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SimilarCategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val categoryId : kotlin.Int = 56 // kotlin.Int | Similar Category’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost(contentType, accept, productId, categoryId)
} catch (e: ClientException) {
    println("4xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **categoryId** | **kotlin.Int**| Similar Category’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtProductProductIdSimilarcategoryGet"></a>
# **apiCatalogPvtProductProductIdSimilarcategoryGet**
> apiCatalogPvtProductProductIdSimilarcategoryGet(contentType, accept, productId)

Get Similar Product Category

Retrieves Similars Categories from a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SimilarCategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSimilarcategoryGet(contentType, accept, productId)
} catch (e: ClientException) {
    println("4xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SimilarCategoryApi#apiCatalogPvtProductProductIdSimilarcategoryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]

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

