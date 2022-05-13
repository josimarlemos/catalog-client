# SKUEANApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtStockkeepingunitSkuIdEanDelete**](SKUEANApi.md#apiCatalogPvtStockkeepingunitSkuIdEanDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/ean | Delete all SKU EAN
[**apiCatalogPvtStockkeepingunitSkuIdEanEanDelete**](SKUEANApi.md#apiCatalogPvtStockkeepingunitSkuIdEanEanDelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/ean/{ean} | Delete SKU EAN
[**apiCatalogPvtStockkeepingunitSkuIdEanEanPost**](SKUEANApi.md#apiCatalogPvtStockkeepingunitSkuIdEanEanPost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/ean/{ean} | Create SKU EAN
[**apiCatalogPvtStockkeepingunitSkuIdEanGet**](SKUEANApi.md#apiCatalogPvtStockkeepingunitSkuIdEanGet) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/ean | Get EAN by SkuId
[**skubyEAN**](SKUEANApi.md#skubyEAN) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyean/{ean} | Get SKU by EAN


<a name="apiCatalogPvtStockkeepingunitSkuIdEanDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdEanDelete**
> apiCatalogPvtStockkeepingunitSkuIdEanDelete(contentType, accept, skuId)

Delete all SKU EAN

Deletes all EANs values of an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUEANApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdEanDelete(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanDelete")
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

<a name="apiCatalogPvtStockkeepingunitSkuIdEanEanDelete"></a>
# **apiCatalogPvtStockkeepingunitSkuIdEanEanDelete**
> apiCatalogPvtStockkeepingunitSkuIdEanEanDelete(contentType, accept, skuId, ean)

Delete SKU EAN

Deletes the EAN value of an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUEANApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val ean : kotlin.Int = 56 // kotlin.Int | EAN number
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdEanEanDelete(contentType, accept, skuId, ean)
} catch (e: ClientException) {
    println("4xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanEanDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanEanDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **ean** | **kotlin.Int**| EAN number | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdEanEanPost"></a>
# **apiCatalogPvtStockkeepingunitSkuIdEanEanPost**
> apiCatalogPvtStockkeepingunitSkuIdEanEanPost(contentType, accept, skuId, ean)

Create SKU EAN

Creates or updates the EAN value of an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUEANApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val ean : kotlin.Int = 56 // kotlin.Int | EAN number
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdEanEanPost(contentType, accept, skuId, ean)
} catch (e: ClientException) {
    println("4xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanEanPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanEanPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **ean** | **kotlin.Int**| EAN number | [default to 1234567]

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

<a name="apiCatalogPvtStockkeepingunitSkuIdEanGet"></a>
# **apiCatalogPvtStockkeepingunitSkuIdEanGet**
> apiCatalogPvtStockkeepingunitSkuIdEanGet(contentType, accept, skuId)

Get EAN by SkuId

Retrieves the EAN of the SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUEANApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitSkuIdEanGet(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUEANApi#apiCatalogPvtStockkeepingunitSkuIdEanGet")
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

<a name="skubyEAN"></a>
# **skubyEAN**
> Example5 skubyEAN(contentType, accept, ean)

Get SKU by EAN

Retrieves an SKU by its EAN ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUEANApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val ean : kotlin.String = ean_example // kotlin.String | 
try {
    val result : Example5 = apiInstance.skubyEAN(contentType, accept, ean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUEANApi#skubyEAN")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUEANApi#skubyEAN")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **ean** | **kotlin.String**|  |

### Return type

[**Example5**](Example5.md)

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

