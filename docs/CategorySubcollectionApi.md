# CategorySubcollectionApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete**](CategorySubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/brand/{categoryId} | Delete Category SubCollection
[**apiCatalogPvtSubcollectionSubCollectionIdCategoryPost**](CategorySubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdCategoryPost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/category | Associate SubCollection to Category


<a name="apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete**
> apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete(contentType, accept, subCollectionId, categoryId)

Delete Category SubCollection

Deletes a Category from a SubCollection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategorySubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val categoryId : kotlin.Int = 56 // kotlin.Int | Category’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete(contentType, accept, subCollectionId, categoryId)
} catch (e: ClientException) {
    println("4xx response calling CategorySubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategorySubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **categoryId** | **kotlin.Int**| Category’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdCategoryPost"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdCategoryPost**
> apiCatalogPvtSubcollectionSubCollectionIdCategoryPost(contentType, accept, subCollectionId, requestBody13)

Associate SubCollection to Category

Associates a SubCollection to a single Category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategorySubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val requestBody13 : RequestBody13 =  // RequestBody13 | 
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdCategoryPost(contentType, accept, subCollectionId, requestBody13)
} catch (e: ClientException) {
    println("4xx response calling CategorySubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdCategoryPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategorySubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdCategoryPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **requestBody13** | [**RequestBody13**](RequestBody13.md)|  | [optional]

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

