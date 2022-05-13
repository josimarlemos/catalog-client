# SKUSubcollectionApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet**](SKUSubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet) | **GET** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit | Get Subcollection&#39;s SKUs
[**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost**](SKUSubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit | Associate SubCollection to SKU
[**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete**](SKUSubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit/{skuId} | Delete SKU SubCollection


<a name="apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet**
> apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet(contentType, accept, subCollectionId, page, size)

Get Subcollection&#39;s SKUs

Retrieves all SKUs from a Subcollection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val page : kotlin.Int = 56 // kotlin.Int | Page number
val size : kotlin.Int = 56 // kotlin.Int | Number of items in a page
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet(contentType, accept, subCollectionId, page, size)
} catch (e: ClientException) {
    println("4xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **page** | **kotlin.Int**| Page number | [default to 1]
 **size** | **kotlin.Int**| Number of items in a page | [default to 50]

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost**
> apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost(contentType, accept, subCollectionId, requestBody12)

Associate SubCollection to SKU

Associates a SubCollection to a single SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val requestBody12 : RequestBody12 =  // RequestBody12 | 
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost(contentType, accept, subCollectionId, requestBody12)
} catch (e: ClientException) {
    println("4xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
 **requestBody12** | [**RequestBody12**](RequestBody12.md)|  | [optional]

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete**
> apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete(contentType, accept, subCollectionId, skuId)

Delete SKU SubCollection

Deletes an SKU from a SubCollection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete(contentType, accept, subCollectionId, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]
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

