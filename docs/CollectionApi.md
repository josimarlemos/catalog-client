# CollectionApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtCollectionCollectionIdDelete**](CollectionApi.md#apiCatalogPvtCollectionCollectionIdDelete) | **DELETE** /api/catalog/pvt/collection/{collectionId} | Delete Collection
[**apiCatalogPvtCollectionCollectionIdGet**](CollectionApi.md#apiCatalogPvtCollectionCollectionIdGet) | **GET** /api/catalog/pvt/collection/{collectionId} | Get Collection
[**apiCatalogPvtCollectionCollectionIdPut**](CollectionApi.md#apiCatalogPvtCollectionCollectionIdPut) | **PUT** /api/catalog/pvt/collection/{collectionId} | Update Collection


<a name="apiCatalogPvtCollectionCollectionIdDelete"></a>
# **apiCatalogPvtCollectionCollectionIdDelete**
> apiCatalogPvtCollectionCollectionIdDelete(contentType, accept, collectionId)

Delete Collection

Deletes a previously existing Collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtCollectionCollectionIdDelete(contentType, accept, collectionId)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection’s unique numerical identifier | [default to 151]

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

<a name="apiCatalogPvtCollectionCollectionIdGet"></a>
# **apiCatalogPvtCollectionCollectionIdGet**
> apiCatalogPvtCollectionCollectionIdGet(contentType, accept, collectionId)

Get Collection

Gets general information of a Collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtCollectionCollectionIdGet(contentType, accept, collectionId)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection’s unique numerical identifier | [default to 151]

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

<a name="apiCatalogPvtCollectionCollectionIdPut"></a>
# **apiCatalogPvtCollectionCollectionIdPut**
> apiCatalogPvtCollectionCollectionIdPut(contentType, accept, collectionId, resquestBody)

Update Collection

Updates a previously Collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection’s unique numerical identifier
val resquestBody : ResquestBody =  // ResquestBody | 
try {
    apiInstance.apiCatalogPvtCollectionCollectionIdPut(contentType, accept, collectionId, resquestBody)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#apiCatalogPvtCollectionCollectionIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection’s unique numerical identifier | [default to 151]
 **resquestBody** | [**ResquestBody**](ResquestBody.md)|  | [optional]

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

