# CategorySpecificationApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**specificationsByCategoryId**](CategorySpecificationApi.md#specificationsByCategoryId) | **GET** /api/catalog_system/pub/specification/field/listByCategoryId/{categoryId} | Get Specifications By Category Id
[**specificationsTreeByCategoryId**](CategorySpecificationApi.md#specificationsTreeByCategoryId) | **GET** /api/catalog_system/pub/specification/field/listTreeByCategoryId/{categoryId} | Get Specifications Tree By Category Id


<a name="specificationsByCategoryId"></a>
# **specificationsByCategoryId**
> specificationsByCategoryId(contentType, accept, categoryId)

Get Specifications By Category Id

Gets all specifications from a category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategorySpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.Int = 56 // kotlin.Int | Category ID
try {
    apiInstance.specificationsByCategoryId(contentType, accept, categoryId)
} catch (e: ClientException) {
    println("4xx response calling CategorySpecificationApi#specificationsByCategoryId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategorySpecificationApi#specificationsByCategoryId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.Int**| Category ID |

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

<a name="specificationsTreeByCategoryId"></a>
# **specificationsTreeByCategoryId**
> kotlin.collections.List&lt;Example9&gt; specificationsTreeByCategoryId(contentType, accept, categoryId)

Get Specifications Tree By Category Id

Lists all specifications including the current category and the level zero specifications from a category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategorySpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.Int = 56 // kotlin.Int | Category ID
try {
    val result : kotlin.collections.List<Example9> = apiInstance.specificationsTreeByCategoryId(contentType, accept, categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategorySpecificationApi#specificationsTreeByCategoryId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategorySpecificationApi#specificationsTreeByCategoryId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.Int**| Category ID |

### Return type

[**kotlin.collections.List&lt;Example9&gt;**](Example9.md)

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

