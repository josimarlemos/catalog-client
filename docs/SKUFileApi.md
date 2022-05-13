# SKUFileApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut**](SKUFileApi.md#apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut) | **PUT** /api/catalog/pvt/stockkeepingunit/copy/{skuIdfrom}/{skuIdto}/file/ | Copy All Files from an SKU to other SKU
[**apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete**](SKUFileApi.md#apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/disassociate/{skuId}/file/{skuFileId} | Disassociate SKU File
[**apiCatalogPvtStockkeepingunitSkuIdFileDelete**](SKUFileApi.md#apiCatalogPvtStockkeepingunitSkuIdFileDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Delete All SKU File
[**apiCatalogPvtStockkeepingunitSkuIdFileGet**](SKUFileApi.md#apiCatalogPvtStockkeepingunitSkuIdFileGet) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Get SKU File
[**apiCatalogPvtStockkeepingunitSkuIdFilePost**](SKUFileApi.md#apiCatalogPvtStockkeepingunitSkuIdFilePost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Create SKU File
[**apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete**](SKUFileApi.md#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/file/{skuFileId} | Delete SKU Image by File ID
[**apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut**](SKUFileApi.md#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId}/file/{skuFileId} | Update SKU File


<a name="apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut"></a>
# **apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut**
> apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut(contentType, accept, skuIdfrom, skuIdto)

Copy All Files from an SKU to other SKU

Copy all existing files from an SKU to other SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuIdfrom : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier __Origin__
val skuIdto : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier __Destiny__
try {
    apiInstance.apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut(contentType, accept, skuIdfrom, skuIdto)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuIdfrom** | **kotlin.Int**| SKU’s unique numerical identifier __Origin__ | [default to 1]
 **skuIdto** | **kotlin.Int**| SKU’s unique numerical identifier __Destiny__ | [default to 2]

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

<a name="apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete"></a>
# **apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete**
> apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete(contentType, accept, skuId, skuFileId)

Disassociate SKU File

Disassociates an SKU File from an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val skuFileId : kotlin.Int = 56 // kotlin.Int | SKU File's unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete(contentType, accept, skuId, skuFileId)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **skuFileId** | **kotlin.Int**| SKU File&#39;s unique numerical identifier | [default to 32]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdFileDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdFileDelete**
> apiCatalogPvtStockkeepingunitSkuIdFileDelete(contentType, accept, skuId)

Delete All SKU File

Deletes all SKU Image Files

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdFileDelete(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdFileGet"></a>
# **apiCatalogPvtStockkeepingunitSkuIdFileGet**
> apiCatalogPvtStockkeepingunitSkuIdFileGet(contentType, accept, skuId)

Get SKU File

Gets general information about all Files inside the SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdFileGet(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdFilePost"></a>
# **apiCatalogPvtStockkeepingunitSkuIdFilePost**
> InlineResponse20012 apiCatalogPvtStockkeepingunitSkuIdFilePost(contentType, accept, skuId, skUFileURL)

Create SKU File

Creates a new Image on an SKU based on its URL or on a form-data request body

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val skUFileURL : SKUFileURL =  // SKUFileURL | 
try {
    val result : InlineResponse20012 = apiInstance.apiCatalogPvtStockkeepingunitSkuIdFilePost(contentType, accept, skuId, skUFileURL)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFilePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFilePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 123456]
 **skUFileURL** | [**SKUFileURL**](SKUFileURL.md)|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete**
> apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete(contentType, accept, skuId, skuFileId)

Delete SKU Image by File ID

Deletes a specific SKU Image File

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val skuFileId : kotlin.Int = 56 // kotlin.Int | SKU File’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete(contentType, accept, skuId, skuFileId)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **skuFileId** | **kotlin.Int**| SKU File’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut"></a>
# **apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut**
> InlineResponse20012 apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut(contentType, accept, skuId, skuFileId, skUFileURL)

Update SKU File

Updates a new Image on an SKU based on its URL or on a form-data request body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUFileApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val skuFileId : kotlin.Int = 56 // kotlin.Int | ID of the association of the SKU and the image, which can be obtained by placing a request to the [Get SKU File](https://developers.vtex.com/vtex-rest-api/reference/catalog-api-get-sku-file) endpoint and copying the `Id` field.
val skUFileURL : SKUFileURL =  // SKUFileURL | 
try {
    val result : InlineResponse20012 = apiInstance.apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut(contentType, accept, skuId, skuFileId, skUFileURL)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUFileApi#apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 123456]
 **skuFileId** | **kotlin.Int**| ID of the association of the SKU and the image, which can be obtained by placing a request to the [Get SKU File](https://developers.vtex.com/vtex-rest-api/reference/catalog-api-get-sku-file) endpoint and copying the &#x60;Id&#x60; field. | [default to 517]
 **skUFileURL** | [**SKUFileURL**](SKUFileURL.md)|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization


Configure appKey:
    ApiClient.apiKey["X-VTEX-API-AppKey"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppKey"] = ""
Configure appToken:
    ApiClient.apiKey["X-VTEX-API-AppToken"] = ""
    ApiClient.apiKeyPrefix["X-VTEX-API-AppToken"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

