# SKUAttachmentApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSkuattachmentDelete**](SKUAttachmentApi.md#apiCatalogPvtSkuattachmentDelete) | **DELETE** /api/catalog/pvt/skuattachment | Dissociate attachments and SKUs
[**apiCatalogPvtSkuattachmentPost**](SKUAttachmentApi.md#apiCatalogPvtSkuattachmentPost) | **POST** /api/catalog/pvt/skuattachment | Associate SKU Attachment
[**apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete**](SKUAttachmentApi.md#apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete) | **DELETE** /api/catalog/pvt/skuattachment/{skuAttachmentAssociationId} | Delete SKU Attachment by SKU Attachment Association ID
[**apiCatalogPvtSkuattachmentSkuAttachmentIdDelete**](SKUAttachmentApi.md#apiCatalogPvtSkuattachmentSkuAttachmentIdDelete) | **DELETE** /api/catalog/pvt/skuattachment/{skuAttachmentId} | Delete SKU Complement
[**apiCatalogPvtStockkeepingunitSkuIdAttachmentGet**](SKUAttachmentApi.md#apiCatalogPvtStockkeepingunitSkuIdAttachmentGet) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/attachment | Get SKU Attachment by SKU ID
[**associateattachmentstoSKU**](SKUAttachmentApi.md#associateattachmentstoSKU) | **POST** /api/catalog_system/pvt/sku/associateattachments | Associate attachments to SKU


<a name="apiCatalogPvtSkuattachmentDelete"></a>
# **apiCatalogPvtSkuattachmentDelete**
> apiCatalogPvtSkuattachmentDelete(contentType, accept, skuId, attachmentId)

Dissociate attachments and SKUs

Dissociates attachments and SKUs based on an SKU ID or an attachment ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 1 // kotlin.Int | SKU ID. By using this query param, you can dissociate all the attachments from an SKU based on its SKU ID.
val attachmentId : kotlin.Int = 1 // kotlin.Int | Attachment ID. By using this query param, you can dissociate the given attachment from all previously associated SKUs.
try {
    apiInstance.apiCatalogPvtSkuattachmentDelete(contentType, accept, skuId, attachmentId)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU ID. By using this query param, you can dissociate all the attachments from an SKU based on its SKU ID. | [optional]
 **attachmentId** | **kotlin.Int**| Attachment ID. By using this query param, you can dissociate the given attachment from all previously associated SKUs. | [optional]

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

<a name="apiCatalogPvtSkuattachmentPost"></a>
# **apiCatalogPvtSkuattachmentPost**
> apiCatalogPvtSkuattachmentPost(contentType, accept, requestBody2)

Associate SKU Attachment

Associates an existing SKU to an existing Attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody2 : RequestBody2 =  // RequestBody2 | 
try {
    apiInstance.apiCatalogPvtSkuattachmentPost(contentType, accept, requestBody2)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody2** | [**RequestBody2**](RequestBody2.md)|  | [optional]

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

<a name="apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete"></a>
# **apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete**
> apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete(contentType, accept, skuAttachmentAssociationId)

Delete SKU Attachment by SKU Attachment Association ID

Deletes an association of an SKU to an Attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuAttachmentAssociationId : kotlin.Int = 56 // kotlin.Int | ID of the association between the attachment and the SKU, which corresponds to the `Id` in the response body of the [Associate SKU Attachment](https://developers.vtex.com/vtex-rest-api/reference/catalog-api-post-sku-attachment) and the [Get SKU Attachment by SKU ID](https://developers.vtex.com/vtex-rest-api/reference/get_api-catalog-pvt-stockkeepingunit-skuid-attachment) endpoints.
try {
    apiInstance.apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete(contentType, accept, skuAttachmentAssociationId)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuAttachmentAssociationId** | **kotlin.Int**| ID of the association between the attachment and the SKU, which corresponds to the &#x60;Id&#x60; in the response body of the [Associate SKU Attachment](https://developers.vtex.com/vtex-rest-api/reference/catalog-api-post-sku-attachment) and the [Get SKU Attachment by SKU ID](https://developers.vtex.com/vtex-rest-api/reference/get_api-catalog-pvt-stockkeepingunit-skuid-attachment) endpoints. | [default to 1]

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

<a name="apiCatalogPvtSkuattachmentSkuAttachmentIdDelete"></a>
# **apiCatalogPvtSkuattachmentSkuAttachmentIdDelete**
> apiCatalogPvtSkuattachmentSkuAttachmentIdDelete(contentType, accept, skuAttachmentId, requestBody3)

Delete SKU Complement

Deletes a previously existing Complement of an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuAttachmentId : kotlin.Int = 56 // kotlin.Int | Attachment’s unique numerical identifier
val requestBody3 : RequestBody3 =  // RequestBody3 | 
try {
    apiInstance.apiCatalogPvtSkuattachmentSkuAttachmentIdDelete(contentType, accept, skuAttachmentId, requestBody3)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentSkuAttachmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#apiCatalogPvtSkuattachmentSkuAttachmentIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuAttachmentId** | **kotlin.Int**| Attachment’s unique numerical identifier | [default to 1]
 **requestBody3** | [**RequestBody3**](RequestBody3.md)|  | [optional]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdAttachmentGet"></a>
# **apiCatalogPvtStockkeepingunitSkuIdAttachmentGet**
> apiCatalogPvtStockkeepingunitSkuIdAttachmentGet(contentType, accept, skuId)

Get SKU Attachment by SKU ID

Retrieves an existing SKU Attachment from a SKU by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU unique identifier.
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdAttachmentGet(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#apiCatalogPvtStockkeepingunitSkuIdAttachmentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#apiCatalogPvtStockkeepingunitSkuIdAttachmentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU unique identifier. | [default to 1]

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

<a name="associateattachmentstoSKU"></a>
# **associateattachmentstoSKU**
> associateattachmentstoSKU(contentType, accept, associateattachmentstoSKURequest)

Associate attachments to SKU

Amplifies a cart data by associating attachments to SKUs.  This request removes existing SKU attachment associations and recreates the associations with the attachments being sent.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUAttachmentApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val associateattachmentstoSKURequest : AssociateattachmentstoSKURequest = {"SkuId":1,"AttachmentNames":["{{attachmentName1}}","{{attachmentName2}}"]} // AssociateattachmentstoSKURequest | 
try {
    apiInstance.associateattachmentstoSKU(contentType, accept, associateattachmentstoSKURequest)
} catch (e: ClientException) {
    println("4xx response calling SKUAttachmentApi#associateattachmentstoSKU")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUAttachmentApi#associateattachmentstoSKU")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **associateattachmentstoSKURequest** | [**AssociateattachmentstoSKURequest**](AssociateattachmentstoSKURequest.md)|  |

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

