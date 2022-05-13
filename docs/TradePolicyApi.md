# TradePolicyApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtProductProductIdSalespolicyGet**](TradePolicyApi.md#apiCatalogPvtProductProductIdSalespolicyGet) | **GET** /api/catalog/pvt/product/{productId}/salespolicy | Get Trade Policy by Product ID
[**apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete**](TradePolicyApi.md#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete) | **DELETE** /api/catalog/pvt/product/{productId}/salespolicy/{tradepolicyId} | Delete Product to Trade Policy
[**apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost**](TradePolicyApi.md#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost) | **POST** /api/catalog/pvt/product/{productId}/salespolicy/{tradepolicyId} | Create Product to Trade Policy
[**apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet**](TradePolicyApi.md#apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitidsbysaleschannel | List all SKUs of a Trade Policy


<a name="apiCatalogPvtProductProductIdSalespolicyGet"></a>
# **apiCatalogPvtProductProductIdSalespolicyGet**
> apiCatalogPvtProductProductIdSalespolicyGet(contentType, accept, productId)

Get Trade Policy by Product ID

Retrieves a Trade Policy associated to a Product by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TradePolicyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSalespolicyGet(contentType, accept, productId)
} catch (e: ClientException) {
    println("4xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete"></a>
# **apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete**
> apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete(contentType, accept, productId, tradepolicyId)

Delete Product to Trade Policy

Disassociates a Trade Policy to a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TradePolicyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val tradepolicyId : kotlin.Int = 56 // kotlin.Int | Trade Policy’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete(contentType, accept, productId, tradepolicyId)
} catch (e: ClientException) {
    println("4xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **tradepolicyId** | **kotlin.Int**| Trade Policy’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost"></a>
# **apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost**
> apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost(contentType, accept, productId, tradepolicyId)

Create Product to Trade Policy

Associates a existing Trade Policy with a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TradePolicyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val tradepolicyId : kotlin.Int = 56 // kotlin.Int | Trade Policy’s unique numerical identifier
try {
    apiInstance.apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost(contentType, accept, productId, tradepolicyId)
} catch (e: ClientException) {
    println("4xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradePolicyApi#apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **tradepolicyId** | **kotlin.Int**| Trade Policy’s unique numerical identifier | [default to 1]

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

<a name="apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet"></a>
# **apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet**
> kotlin.collections.List&lt;kotlin.Int&gt; apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet(contentType, accept, sc, page, pageSize, onlyAssigned)

List all SKUs of a Trade Policy

Retrieves a list of SKU IDs of one Trade Policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TradePolicyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sc : kotlin.Int = 56 // kotlin.Int | Trade Policy’s unique numerical identifier
val page : kotlin.Int = 56 // kotlin.Int | Page number
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of the items of the page
val onlyAssigned : kotlin.Boolean = true // kotlin.Boolean | If set as `false`, it allows user to decide if the SKUs that are not assigned to a specific trade policy should be also returned
try {
    val result : kotlin.collections.List<kotlin.Int> = apiInstance.apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet(contentType, accept, sc, page, pageSize, onlyAssigned)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TradePolicyApi#apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TradePolicyApi#apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sc** | **kotlin.Int**| Trade Policy’s unique numerical identifier | [default to 1]
 **page** | **kotlin.Int**| Page number | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Number of the items of the page | [optional] [default to 1]
 **onlyAssigned** | **kotlin.Boolean**| If set as &#x60;false&#x60;, it allows user to decide if the SKUs that are not assigned to a specific trade policy should be also returned | [optional] [default to true]

### Return type

**kotlin.collections.List&lt;kotlin.Int&gt;**

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

