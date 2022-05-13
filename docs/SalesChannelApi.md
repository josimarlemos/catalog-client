# SalesChannelApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesChannelList**](SalesChannelApi.md#salesChannelList) | **GET** /api/catalog_system/pvt/saleschannel/list | Get Sales Channel List
[**salesChannelbyId**](SalesChannelApi.md#salesChannelbyId) | **GET** /api/catalog_system/pub/saleschannel/{salesChannelId} | Get Sales Channel by Id


<a name="salesChannelList"></a>
# **salesChannelList**
> salesChannelList(contentType, accept)

Get Sales Channel List

Retrieves a list with details about the store&#39;s sales channels.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesChannelApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.salesChannelList(contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling SalesChannelApi#salesChannelList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesChannelApi#salesChannelList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]

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

<a name="salesChannelbyId"></a>
# **salesChannelbyId**
> salesChannelbyId(contentType, accept, salesChannelId)

Get Sales Channel by Id

Retrieves a specific sales channel by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesChannelApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val salesChannelId : kotlin.String = salesChannelId_example // kotlin.String | 
try {
    apiInstance.salesChannelbyId(contentType, accept, salesChannelId)
} catch (e: ClientException) {
    println("4xx response calling SalesChannelApi#salesChannelbyId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesChannelApi#salesChannelbyId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **salesChannelId** | **kotlin.String**|  |

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

