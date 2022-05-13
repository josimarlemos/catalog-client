# CollectionCMSApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtCollectionPost**](CollectionCMSApi.md#apiCatalogPvtCollectionPost) | **POST** /api/catalog/pvt/collection | Create Collection


<a name="apiCatalogPvtCollectionPost"></a>
# **apiCatalogPvtCollectionPost**
> apiCatalogPvtCollectionPost(contentType, accept, resquestBody1)

Create Collection

Creates a new Collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionCMSApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val resquestBody1 : ResquestBody1 =  // ResquestBody1 | 
try {
    apiInstance.apiCatalogPvtCollectionPost(contentType, accept, resquestBody1)
} catch (e: ClientException) {
    println("4xx response calling CollectionCMSApi#apiCatalogPvtCollectionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionCMSApi#apiCatalogPvtCollectionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **resquestBody1** | [**ResquestBody1**](ResquestBody1.md)|  | [optional]

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

