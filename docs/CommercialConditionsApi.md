# CommercialConditionsApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCommercialConditions**](CommercialConditionsApi.md#getAllCommercialConditions) | **GET** /api/catalog_system/pvt/commercialcondition/list | Get all commercial conditions
[**getCommercialConditions**](CommercialConditionsApi.md#getCommercialConditions) | **GET** /api/catalog_system/pvt/commercialcondition/{commercialConditionId} | Get a commercial condition


<a name="getAllCommercialConditions"></a>
# **getAllCommercialConditions**
> kotlin.collections.List&lt;InlineResponse20025&gt; getAllCommercialConditions(contentType, accept)

Get all commercial conditions

Lists all commercial conditions on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommercialConditionsApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    val result : kotlin.collections.List<InlineResponse20025> = apiInstance.getAllCommercialConditions(contentType, accept)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommercialConditionsApi#getAllCommercialConditions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommercialConditionsApi#getAllCommercialConditions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]

### Return type

[**kotlin.collections.List&lt;InlineResponse20025&gt;**](InlineResponse20025.md)

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

<a name="getCommercialConditions"></a>
# **getCommercialConditions**
> InlineResponse20025 getCommercialConditions(contentType, accept, commercialConditionId)

Get a commercial condition

Retrives information of a commercial condition.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommercialConditionsApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val commercialConditionId : kotlin.Int = 1 // kotlin.Int | Commercial condition unique numerical identifier
try {
    val result : InlineResponse20025 = apiInstance.getCommercialConditions(contentType, accept, commercialConditionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommercialConditionsApi#getCommercialConditions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommercialConditionsApi#getCommercialConditions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **commercialConditionId** | **kotlin.Int**| Commercial condition unique numerical identifier |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

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

