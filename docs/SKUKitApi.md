# SKUKitApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtStockkeepingunitkitDelete**](SKUKitApi.md#apiCatalogPvtStockkeepingunitkitDelete) | **DELETE** /api/catalog/pvt/stockkeepingunitkit | Delete SKU Kit by SKU ID or Parent SKU ID
[**apiCatalogPvtStockkeepingunitkitGet**](SKUKitApi.md#apiCatalogPvtStockkeepingunitkitGet) | **GET** /api/catalog/pvt/stockkeepingunitkit | Get SKU Kit by SKU ID or Parent SKU ID
[**apiCatalogPvtStockkeepingunitkitKitIdDelete**](SKUKitApi.md#apiCatalogPvtStockkeepingunitkitKitIdDelete) | **DELETE** /api/catalog/pvt/stockkeepingunitkit/{kitId} | Delete SKU Kit by KitId
[**apiCatalogPvtStockkeepingunitkitKitIdGet**](SKUKitApi.md#apiCatalogPvtStockkeepingunitkitKitIdGet) | **GET** /api/catalog/pvt/stockkeepingunitkit/{kitId} | Get SKU Kit
[**apiCatalogPvtStockkeepingunitkitPost**](SKUKitApi.md#apiCatalogPvtStockkeepingunitkitPost) | **POST** /api/catalog/pvt/stockkeepingunitkit | Create SKU Kit


<a name="apiCatalogPvtStockkeepingunitkitDelete"></a>
# **apiCatalogPvtStockkeepingunitkitDelete**
> apiCatalogPvtStockkeepingunitkitDelete(contentType, accept, skuId, parentSkuId)

Delete SKU Kit by SKU ID or Parent SKU ID

Deletes all Kit’s components based on the Parent SKU ID or deletes a specific Kit’s component based on the SKU ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUKitApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val parentSkuId : kotlin.Int = 56 // kotlin.Int | Parent SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitkitDelete(contentType, accept, skuId, parentSkuId)
} catch (e: ClientException) {
    println("4xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [optional] [default to 1]
 **parentSkuId** | **kotlin.Int**| Parent SKU’s unique numerical identifier | [optional] [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitkitGet"></a>
# **apiCatalogPvtStockkeepingunitkitGet**
> apiCatalogPvtStockkeepingunitkitGet(contentType, accept, skuId, parentSkuId)

Get SKU Kit by SKU ID or Parent SKU ID

Retrieves general information about the components of an SKU Kit by SKU ID or Parent SKU ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUKitApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val parentSkuId : kotlin.Int = 56 // kotlin.Int | Parent SKU’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitkitGet(contentType, accept, skuId, parentSkuId)
} catch (e: ClientException) {
    println("4xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [optional] [default to 1]
 **parentSkuId** | **kotlin.Int**| Parent SKU’s unique numerical identifier | [optional] [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitkitKitIdDelete"></a>
# **apiCatalogPvtStockkeepingunitkitKitIdDelete**
> apiCatalogPvtStockkeepingunitkitKitIdDelete(contentType, accept, kitId)

Delete SKU Kit by KitId

Deletes a specific Kit’s component based on its Kit ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUKitApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val kitId : kotlin.Int = 56 // kotlin.Int | Kit’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitkitKitIdDelete(contentType, accept, kitId)
} catch (e: ClientException) {
    println("4xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitKitIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitKitIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **kitId** | **kotlin.Int**| Kit’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitkitKitIdGet"></a>
# **apiCatalogPvtStockkeepingunitkitKitIdGet**
> apiCatalogPvtStockkeepingunitkitKitIdGet(contentType, accept, kitId)

Get SKU Kit

Retrieves general information about a component of a Kit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUKitApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val kitId : kotlin.Int = 56 // kotlin.Int | Kit’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtStockkeepingunitkitKitIdGet(contentType, accept, kitId)
} catch (e: ClientException) {
    println("4xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitKitIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitKitIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **kitId** | **kotlin.Int**| Kit’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtStockkeepingunitkitPost"></a>
# **apiCatalogPvtStockkeepingunitkitPost**
> apiCatalogPvtStockkeepingunitkitPost(contentType, accept, requestBody4)

Create SKU Kit

Creates new component to a specific Kit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUKitApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody4 : RequestBody4 =  // RequestBody4 | 
try {
    apiInstance.apiCatalogPvtStockkeepingunitkitPost(contentType, accept, requestBody4)
} catch (e: ClientException) {
    println("4xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUKitApi#apiCatalogPvtStockkeepingunitkitPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody4** | [**RequestBody4**](RequestBody4.md)|  | [optional]

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

