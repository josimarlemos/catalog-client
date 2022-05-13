# SKUServiceAttachmentApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSkuservicetypeattachmentDelete**](SKUServiceAttachmentApi.md#apiCatalogPvtSkuservicetypeattachmentDelete) | **DELETE** /api/catalog/pvt/skuservicetypeattachment | Dissociate Attachment by Attachment ID or SKU Service Type ID
[**apiCatalogPvtSkuservicetypeattachmentPost**](SKUServiceAttachmentApi.md#apiCatalogPvtSkuservicetypeattachmentPost) | **POST** /api/catalog/pvt/skuservicetypeattachment | Associate SKU Service Attachment
[**apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete**](SKUServiceAttachmentApi.md#apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete) | **DELETE** /api/catalog/pvt/skuservicetypeattachment/{skuServiceTypeAttachmentId} | Dissociate Attachment from SKU Service Type


<a name="apiCatalogPvtSkuservicetypeattachmentDelete"></a>
# **apiCatalogPvtSkuservicetypeattachmentDelete**
> apiCatalogPvtSkuservicetypeattachmentDelete(contentType, accept, attachmentId, skuServiceTypeId)

Dissociate Attachment by Attachment ID or SKU Service Type ID

Dissociates an Attachment by its Attachment ID or SKU Service Type ID from an SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val attachmentId : kotlin.Int = 56 // kotlin.Int | SKU Service Attachment unique identifier
val skuServiceTypeId : kotlin.Int = 56 // kotlin.Int | SKU Service Type unique identifier
try {
    apiInstance.apiCatalogPvtSkuservicetypeattachmentDelete(contentType, accept, attachmentId, skuServiceTypeId)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **attachmentId** | **kotlin.Int**| SKU Service Attachment unique identifier | [optional]
 **skuServiceTypeId** | **kotlin.Int**| SKU Service Type unique identifier | [optional]

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

<a name="apiCatalogPvtSkuservicetypeattachmentPost"></a>
# **apiCatalogPvtSkuservicetypeattachmentPost**
> apiCatalogPvtSkuservicetypeattachmentPost(contentType, accept, requestBody7)

Associate SKU Service Attachment

Associates an Attachment for an existing SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody7 : RequestBody7 =  // RequestBody7 | 
try {
    apiInstance.apiCatalogPvtSkuservicetypeattachmentPost(contentType, accept, requestBody7)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody7** | [**RequestBody7**](RequestBody7.md)|  | [optional]

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

<a name="apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete"></a>
# **apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete**
> apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete(contentType, accept, skuServiceTypeAttachmentId)

Dissociate Attachment from SKU Service Type

Dissociates an Attachment from an SKU Service Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUServiceAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuServiceTypeAttachmentId : kotlin.Int = 56 // kotlin.Int | SKU Service Attachment unique identifier
try {
    apiInstance.apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete(contentType, accept, skuServiceTypeAttachmentId)
} catch (e: ClientException) {
    println("4xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUServiceAttachmentApi#apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuServiceTypeAttachmentId** | **kotlin.Int**| SKU Service Attachment unique identifier |

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

