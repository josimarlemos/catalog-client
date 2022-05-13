# AttachmentApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtAttachmentAttachmentidDelete**](AttachmentApi.md#apiCatalogPvtAttachmentAttachmentidDelete) | **DELETE** /api/catalog/pvt/attachment/{attachmentid} | Delete attachment
[**apiCatalogPvtAttachmentAttachmentidGet**](AttachmentApi.md#apiCatalogPvtAttachmentAttachmentidGet) | **GET** /api/catalog/pvt/attachment/{attachmentid} | Get attachment
[**apiCatalogPvtAttachmentAttachmentidPut**](AttachmentApi.md#apiCatalogPvtAttachmentAttachmentidPut) | **PUT** /api/catalog/pvt/attachment/{attachmentid} | Update attachment
[**apiCatalogPvtAttachmentPost**](AttachmentApi.md#apiCatalogPvtAttachmentPost) | **POST** /api/catalog/pvt/attachment | Create attachment


<a name="apiCatalogPvtAttachmentAttachmentidDelete"></a>
# **apiCatalogPvtAttachmentAttachmentidDelete**
> apiCatalogPvtAttachmentAttachmentidDelete(attachmentid, contentType, accept)

Delete attachment

Deletes a previously existing SKU attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentApi()
val attachmentid : kotlin.String = attachmentid_example // kotlin.String | Attachment ID
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.apiCatalogPvtAttachmentAttachmentidDelete(attachmentid, contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentid** | **kotlin.String**| Attachment ID | [default to &quot;vtexcommercestable&quot;]
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
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

<a name="apiCatalogPvtAttachmentAttachmentidGet"></a>
# **apiCatalogPvtAttachmentAttachmentidGet**
> apiCatalogPvtAttachmentAttachmentidGet(attachmentid, contentType, accept)

Get attachment

Gets information about a registered attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentApi()
val attachmentid : kotlin.String = attachmentid_example // kotlin.String | Attachment ID
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.apiCatalogPvtAttachmentAttachmentidGet(attachmentid, contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentid** | **kotlin.String**| Attachment ID | [default to &quot;vtexcommercestable&quot;]
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
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

<a name="apiCatalogPvtAttachmentAttachmentidPut"></a>
# **apiCatalogPvtAttachmentAttachmentidPut**
> apiCatalogPvtAttachmentAttachmentidPut(attachmentid, contentType, accept, resquetBody)

Update attachment

Updates a previously existing SKU attachment with new information

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentApi()
val attachmentid : kotlin.String = attachmentid_example // kotlin.String | Attachment ID
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val resquetBody : ResquetBody =  // ResquetBody | 
try {
    apiInstance.apiCatalogPvtAttachmentAttachmentidPut(attachmentid, contentType, accept, resquetBody)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#apiCatalogPvtAttachmentAttachmentidPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentid** | **kotlin.String**| Attachment ID | [default to &quot;vtexcommercestable&quot;]
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **resquetBody** | [**ResquetBody**](ResquetBody.md)|  | [optional]

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

<a name="apiCatalogPvtAttachmentPost"></a>
# **apiCatalogPvtAttachmentPost**
> apiCatalogPvtAttachmentPost(contentType, accept, resquetBody1)

Create attachment

Creates a new SKU attachment from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val resquetBody1 : ResquetBody1 =  // ResquetBody1 | 
try {
    apiInstance.apiCatalogPvtAttachmentPost(contentType, accept, resquetBody1)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#apiCatalogPvtAttachmentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#apiCatalogPvtAttachmentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **resquetBody1** | [**ResquetBody1**](ResquetBody1.md)|  | [optional]

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

