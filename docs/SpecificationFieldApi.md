# SpecificationFieldApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**specificationsField**](SpecificationFieldApi.md#specificationsField) | **GET** /api/catalog_system/pub/specification/fieldGet/{fieldId} | Get Specifications Field
[**specificationsInsertField**](SpecificationFieldApi.md#specificationsInsertField) | **POST** /api/catalog_system/pvt/specification/field | Create Specifications Field
[**specificationsInsertFieldUpdate**](SpecificationFieldApi.md#specificationsInsertFieldUpdate) | **PUT** /api/catalog_system/pvt/specification/field | Update Specifications Field


<a name="specificationsField"></a>
# **specificationsField**
> specificationsField(contentType, accept, fieldId)

Get Specifications Field

Retrieves details from a specification field by this field&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val fieldId : kotlin.Int = 56 // kotlin.Int | Specification Field ID
try {
    apiInstance.specificationsField(contentType, accept, fieldId)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldApi#specificationsField")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldApi#specificationsField")
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

<a name="specificationsInsertField"></a>
# **specificationsInsertField**
> specificationsInsertField(contentType, accept, specificationsInsertFieldRequest)

Create Specifications Field

Creates a specification field in a category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationsInsertFieldRequest : SpecificationsInsertFieldRequest = {"Name":"FieldNameExample","CategoryId":null,"FieldId":null,"IsActive":true,"IsRequired":false,"FieldTypeId":5,"FieldValueId":1,"Description":null,"IsStockKeepingUnit":false,"IsFilter":true,"IsOnProductDetails":true,"Position":1,"IsWizard":false,"IsTopMenuLinkActive":true,"IsSideMenuLinkActive":true,"DefaultValue":null,"FieldGroupId":5,"FieldGroupName":"Sizes"} // SpecificationsInsertFieldRequest | 
try {
    apiInstance.specificationsInsertField(contentType, accept, specificationsInsertFieldRequest)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldApi#specificationsInsertField")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldApi#specificationsInsertField")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationsInsertFieldRequest** | [**SpecificationsInsertFieldRequest**](SpecificationsInsertFieldRequest.md)|  |

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

<a name="specificationsInsertFieldUpdate"></a>
# **specificationsInsertFieldUpdate**
> specificationsInsertFieldUpdate(contentType, accept, specificationsInsertFieldUpdateRequest)

Update Specifications Field

Updates a specification field in a category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationFieldApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationsInsertFieldUpdateRequest : SpecificationsInsertFieldUpdateRequest = {"FieldId":89,"Name":"Size","CategoryId":null,"IsActive":true,"IsRequired":false,"FieldTypeId":5,"Description":"Clothing size","IsStockKeepingUnit":true,"IsFilter":true,"IsOnProductDetails":true,"Position":1,"IsWizard":false,"IsTopMenuLinkActive":false,"IsSideMenuLinkActive":false,"DefaultValue":"M","FieldGroupId":5,"FieldGroupName":"Sizes"} // SpecificationsInsertFieldUpdateRequest | 
try {
    apiInstance.specificationsInsertFieldUpdate(contentType, accept, specificationsInsertFieldUpdateRequest)
} catch (e: ClientException) {
    println("4xx response calling SpecificationFieldApi#specificationsInsertFieldUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationFieldApi#specificationsInsertFieldUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationsInsertFieldUpdateRequest** | [**SpecificationsInsertFieldUpdateRequest**](SpecificationsInsertFieldUpdateRequest.md)|  |

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

