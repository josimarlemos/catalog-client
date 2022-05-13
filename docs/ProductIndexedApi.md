# ProductIndexedApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**indexedInfo**](ProductIndexedApi.md#indexedInfo) | **GET** /api/catalog_system/pvt/products/GetIndexedInfo/{productId} | Get Indexed Info


<a name="indexedInfo"></a>
# **indexedInfo**
> indexedInfo(contentType, accept, productId)

Get Indexed Info

Retrieve details of Product Indexed Info

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductIndexedApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.String = productId_example // kotlin.String | Product’s unique numerical identifier
try {
    apiInstance.indexedInfo(contentType, accept, productId)
} catch (e: ClientException) {
    println("4xx response calling ProductIndexedApi#indexedInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductIndexedApi#indexedInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.String**| Product’s unique numerical identifier |

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

