# SpecificationFieldValueApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**specificationsGetFieldValue**](SpecificationFieldValueApi.md#specificationsGetFieldValue) | **GET** /api/catalog_system/pvt/specification/fieldValue/{fieldValueId} | Get Specifications Field Value
[**specificationsInsertFieldValue**](SpecificationFieldValueApi.md#specificationsInsertFieldValue) | **POST** /api/catalog_system/pvt/specification/fieldValue | Create Specifications Field Value
[**specificationsUpdateFieldValue**](SpecificationFieldValueApi.md#specificationsUpdateFieldValue) | **PUT** /api/catalog_system/pvt/specification/fieldValue | Update Specifications Field Value
[**specificationsValuesByFieldId**](SpecificationFieldValueApi.md#specificationsValuesByFieldId) | **GET** /api/catalog_system/pub/specification/fieldvalue/{fieldId} | Get Specifications Values By Field Id


<a name="specificationsGetFieldValue"></a>
# **specificationsGetFieldValue**
> specificationsGetFieldValue(contentType, accept, fieldValueId)

Get Specifications Field Value

Retrieves details from a specification field&#39;s value by this value&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val fieldValueId : kotlin.String = fieldValueId_example // kotlin.String | 
try {
    apiInstance.specificationsGetFieldValue(contentType, accept, fieldValueId)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldValueApi#specificationsGetFieldValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldValueApi#specificationsGetFieldValue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **fieldValueId** | **kotlin.String**|  |

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

<a name="specificationsInsertFieldValue"></a>
# **specificationsInsertFieldValue**
> specificationsInsertFieldValue(contentType, accept, specificationsInsertFieldValueRequest)

Create Specifications Field Value

Creates a specification field value by the specification field&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationsInsertFieldValueRequest : SpecificationsInsertFieldValueRequest = {"FieldId":34,"Name":"TesteInsert","Text":"Value Description","IsActive":true,"Position":100} // SpecificationsInsertFieldValueRequest | 
try {
    apiInstance.specificationsInsertFieldValue(contentType, accept, specificationsInsertFieldValueRequest)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldValueApi#specificationsInsertFieldValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldValueApi#specificationsInsertFieldValue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationsInsertFieldValueRequest** | [**SpecificationsInsertFieldValueRequest**](SpecificationsInsertFieldValueRequest.md)|  |

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

<a name="specificationsUpdateFieldValue"></a>
# **specificationsUpdateFieldValue**
> specificationsUpdateFieldValue(contentType, accept, specificationsUpdateFieldValueRequest)

Update Specifications Field Value

Updates a specification field value by the specification field&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationsUpdateFieldValueRequest : SpecificationsUpdateFieldValueRequest = {"FieldId":1,"FieldValueId":276,"Name":"TesteInsertUpdate","Text":"Value Description2","IsActive":true,"Position":100} // SpecificationsUpdateFieldValueRequest | 
try {
    apiInstance.specificationsUpdateFieldValue(contentType, accept, specificationsUpdateFieldValueRequest)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldValueApi#specificationsUpdateFieldValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldValueApi#specificationsUpdateFieldValue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationsUpdateFieldValueRequest** | [**SpecificationsUpdateFieldValueRequest**](SpecificationsUpdateFieldValueRequest.md)|  |

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

<a name="specificationsValuesByFieldId"></a>
# **specificationsValuesByFieldId**
> kotlin.collections.List&lt;Example10&gt; specificationsValuesByFieldId(contentType, accept, fieldId)

Get Specifications Values By Field Id

Gets a list of all specification values from a Specification Field by this field&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldValueApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val fieldId : kotlin.Int = 56 // kotlin.Int | Specification Field ID
try {
    val result : kotlin.collections.List<Example10> = apiInstance.specificationsValuesByFieldId(contentType, accept, fieldId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldValueApi#specificationsValuesByFieldId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldValueApi#specificationsValuesByFieldId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **fieldId** | **kotlin.Int**| Specification Field ID |

### Return type

[**kotlin.collections.List&lt;Example10&gt;**](Example10.md)

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

