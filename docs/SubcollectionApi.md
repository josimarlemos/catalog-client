# SubcollectionApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtCollectionCollectionIdPositionPost**](SubcollectionApi.md#apiCatalogPvtCollectionCollectionIdPositionPost) | **POST** /api/catalog/pvt/collection/{collectionId}/position | Reposition SKU on the SubCollection
[**apiCatalogPvtCollectionCollectionIdSubcollectionGet**](SubcollectionApi.md#apiCatalogPvtCollectionCollectionIdSubcollectionGet) | **GET** /api/catalog/pvt/collection/{collectionId}/subcollection | Get Subcollection by Collection ID
[**apiCatalogPvtSubcollectionPost**](SubcollectionApi.md#apiCatalogPvtSubcollectionPost) | **POST** /api/catalog/pvt/subcollection | Create SubCollection
[**apiCatalogPvtSubcollectionSubCollectionIdDelete**](SubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdDelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId} | Delete SubCollection
[**apiCatalogPvtSubcollectionSubCollectionIdGet**](SubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdGet) | **GET** /api/catalog/pvt/subcollection/{subCollectionId} | Get SubCollection
[**apiCatalogPvtSubcollectionSubCollectionIdPut**](SubcollectionApi.md#apiCatalogPvtSubcollectionSubCollectionIdPut) | **PUT** /api/catalog/pvt/subcollection/{subCollectionId} | Update SubCollection


<a name="apiCatalogPvtCollectionCollectionIdPositionPost"></a>
# **apiCatalogPvtCollectionCollectionIdPositionPost**
> apiCatalogPvtCollectionCollectionIdPositionPost(contentType, accept, collectionId, inlineObject15)

Reposition SKU on the SubCollection

Edits an SKU position that already exists in the subcollection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection’s unique numerical identifier
val inlineObject15 : InlineObject15 =  // InlineObject15 | 
try {
    apiInstance.apiCatalogPvtCollectionCollectionIdPositionPost(contentType, accept, collectionId, inlineObject15)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtCollectionCollectionIdPositionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtCollectionCollectionIdPositionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection’s unique numerical identifier | [default to 151]
 **inlineObject15** | [**InlineObject15**](InlineObject15.md)|  | [optional]

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

<a name="apiCatalogPvtCollectionCollectionIdSubcollectionGet"></a>
# **apiCatalogPvtCollectionCollectionIdSubcollectionGet**
> kotlin.collections.List&lt;InlineResponse20018&gt; apiCatalogPvtCollectionCollectionIdSubcollectionGet(contentType, accept, collectionId)

Get Subcollection by Collection ID

Retrieves all Subcollections by its Collection ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection’s unique numerical identifier
try {
    val result : kotlin.collections.List<InlineResponse20018> = apiInstance.apiCatalogPvtCollectionCollectionIdSubcollectionGet(contentType, accept, collectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtCollectionCollectionIdSubcollectionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtCollectionCollectionIdSubcollectionGet")
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

[**kotlin.collections.List&lt;InlineResponse20018&gt;**](InlineResponse20018.md)

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

<a name="apiCatalogPvtSubcollectionPost"></a>
# **apiCatalogPvtSubcollectionPost**
> InlineResponse20018 apiCatalogPvtSubcollectionPost(contentType, accept, inlineObject14)

Create SubCollection

Creates a new SubCollection inclusion or exclusion under a Collection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject14 : InlineObject14 =  // InlineObject14 | 
try {
    val result : InlineResponse20018 = apiInstance.apiCatalogPvtSubcollectionPost(contentType, accept, inlineObject14)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtSubcollectionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtSubcollectionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject14** | [**InlineObject14**](InlineObject14.md)|  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdDelete"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdDelete**
> apiCatalogPvtSubcollectionSubCollectionIdDelete(contentType, accept, subCollectionId)

Delete SubCollection

Deletes a previously SubCollection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtSubcollectionSubCollectionIdDelete(contentType, accept, subCollectionId)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdGet"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdGet**
> InlineResponse20018 apiCatalogPvtSubcollectionSubCollectionIdGet(contentType, accept, subCollectionId)

Get SubCollection

Retrieves information about a SubCollection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
try {
    val result : InlineResponse20018 = apiInstance.apiCatalogPvtSubcollectionSubCollectionIdGet(contentType, accept, subCollectionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 17]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

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

<a name="apiCatalogPvtSubcollectionSubCollectionIdPut"></a>
# **apiCatalogPvtSubcollectionSubCollectionIdPut**
> InlineResponse20018 apiCatalogPvtSubcollectionSubCollectionIdPut(contentType, accept, subCollectionId, inlineObject13)

Update SubCollection

Updates a previously SubCollection.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubcollectionApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val subCollectionId : kotlin.Int = 56 // kotlin.Int | Subcollection’s unique numerical identifier
val inlineObject13 : InlineObject13 =  // InlineObject13 | 
try {
    val result : InlineResponse20018 = apiInstance.apiCatalogPvtSubcollectionSubCollectionIdPut(contentType, accept, subCollectionId, inlineObject13)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubcollectionApi#apiCatalogPvtSubcollectionSubCollectionIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **subCollectionId** | **kotlin.Int**| Subcollection’s unique numerical identifier | [default to 17]
 **inlineObject13** | [**InlineObject13**](InlineObject13.md)|  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

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

