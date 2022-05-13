# SKUApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtStockkeepingunitGet**](SKUApi.md#apiCatalogPvtStockkeepingunitGet) | **GET** /api/catalog/pvt/stockkeepingunit | Get SKU by RefId
[**apiCatalogPvtStockkeepingunitPost**](SKUApi.md#apiCatalogPvtStockkeepingunitPost) | **POST** /api/catalog/pvt/stockkeepingunit | Create SKU
[**apiCatalogPvtStockkeepingunitSkuIdPut**](SKUApi.md#apiCatalogPvtStockkeepingunitSkuIdPut) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId} | Update SKU
[**listallSKUsID**](SKUApi.md#listallSKUsID) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitids | List all SKU IDs
[**sku**](SKUApi.md#sku) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId} | Get SKU
[**skuContext**](SKUApi.md#skuContext) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyid/{skuId} | Get SKU and context
[**skuIdbyRefId**](SKUApi.md#skuIdbyRefId) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitidbyrefid/{refId} | Get SkuId by RefId
[**skuIdlistbyRefIdlist**](SKUApi.md#skuIdlistbyRefIdlist) | **POST** /api/catalog_system/pub/sku/stockkeepingunitidsbyrefids | Retrieve SkuId list by RefId list
[**skubyAlternateId**](SKUApi.md#skubyAlternateId) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyalternateId/{alternateId} | Get SKU by Alternate ID
[**skulistbyProductId**](SKUApi.md#skulistbyProductId) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitByProductId/{productId} | Get SKU list by ProductId


<a name="apiCatalogPvtStockkeepingunitGet"></a>
# **apiCatalogPvtStockkeepingunitGet**
> InlineResponse2008 apiCatalogPvtStockkeepingunitGet(contentType, accept, refId)

Get SKU by RefId

Retrieves information about a specific SKU by its RefId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val refId : kotlin.String = refId_example // kotlin.String | SKU reference ID
try {
    val result : InlineResponse2008 = apiInstance.apiCatalogPvtStockkeepingunitGet(contentType, accept, refId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#apiCatalogPvtStockkeepingunitGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#apiCatalogPvtStockkeepingunitGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **refId** | **kotlin.String**| SKU reference ID | [default to &quot;1&quot;]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

<a name="apiCatalogPvtStockkeepingunitPost"></a>
# **apiCatalogPvtStockkeepingunitPost**
> InlineResponse2009 apiCatalogPvtStockkeepingunitPost(contentType, accept, inlineObject4)

Create SKU

Creates a new SKU from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject4 : InlineObject4 =  // InlineObject4 | 
try {
    val result : InlineResponse2009 = apiInstance.apiCatalogPvtStockkeepingunitPost(contentType, accept, inlineObject4)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#apiCatalogPvtStockkeepingunitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#apiCatalogPvtStockkeepingunitPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

<a name="apiCatalogPvtStockkeepingunitSkuIdPut"></a>
# **apiCatalogPvtStockkeepingunitSkuIdPut**
> InlineResponse20010 apiCatalogPvtStockkeepingunitSkuIdPut(contentType, accept, skuId, inlineObject5)

Update SKU

Updates an existing SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU’s unique numerical identifier
val inlineObject5 : InlineObject5 =  // InlineObject5 | 
try {
    val result : InlineResponse20010 = apiInstance.apiCatalogPvtStockkeepingunitSkuIdPut(contentType, accept, skuId, inlineObject5)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#apiCatalogPvtStockkeepingunitSkuIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#apiCatalogPvtStockkeepingunitSkuIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU’s unique numerical identifier | [default to 1]
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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

<a name="listallSKUsID"></a>
# **listallSKUsID**
> kotlin.collections.List&lt;kotlin.Int&gt; listallSKUsID(page, pagesize, contentType, accept)

List all SKU IDs

Retrieves the IDs of all SKUs in the store. Presents the result with page size and pagination.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val page : kotlin.Int = 56 // kotlin.Int | Result page number that you need retrieves SKU ID
val pagesize : kotlin.Int = 56 // kotlin.Int | Page size that you need retrieves SKU ID, maximum value 1000
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    val result : kotlin.collections.List<kotlin.Int> = apiInstance.listallSKUsID(page, pagesize, contentType, accept)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#listallSKUsID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#listallSKUsID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Result page number that you need retrieves SKU ID | [default to 1]
 **pagesize** | **kotlin.Int**| Page size that you need retrieves SKU ID, maximum value 1000 | [default to 25]
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]

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

<a name="sku"></a>
# **sku**
> Example4 sku(contentType, accept, skuId)

Get SKU

Retrieves a specific SKU by its ID. This information is exactly what is needed to create a new SKU.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU unique identifier number.
try {
    val result : Example4 = apiInstance.sku(contentType, accept, skuId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#sku")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#sku")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU unique identifier number. | [default to 1]

### Return type

[**Example4**](Example4.md)

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

<a name="skuContext"></a>
# **skuContext**
> Example4 skuContext(contentType, accept, skuId, sc)

Get SKU and context

Retrieves context of an SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int | SKU's unique identifier number
val sc : kotlin.Int = 56 // kotlin.Int | Trade Policy's unique identifier number
try {
    val result : Example4 = apiInstance.skuContext(contentType, accept, skuId, sc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#skuContext")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#skuContext")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**| SKU&#39;s unique identifier number | [default to 2001773]
 **sc** | **kotlin.Int**| Trade Policy&#39;s unique identifier number | [optional] [default to 1]

### Return type

[**Example4**](Example4.md)

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

<a name="skuIdbyRefId"></a>
# **skuIdbyRefId**
> kotlin.String skuIdbyRefId(contentType, accept, refId)

Get SkuId by RefId

Retrieves an SKU ID by the SKU&#39;s Reference ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val refId : kotlin.String = refId_example // kotlin.String | SKU reference ID
try {
    val result : kotlin.String = apiInstance.skuIdbyRefId(contentType, accept, refId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#skuIdbyRefId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#skuIdbyRefId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **refId** | **kotlin.String**| SKU reference ID | [default to &quot;0001&quot;]

### Return type

**kotlin.String**

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

<a name="skuIdlistbyRefIdlist"></a>
# **skuIdlistbyRefIdlist**
> Example8 skuIdlistbyRefIdlist(contentType, accept, requestBody)

Retrieve SkuId list by RefId list

Receives a list of Reference IDs and returns the same list with the corresponding SKU IDs. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | 
try {
    val result : Example8 = apiInstance.skuIdlistbyRefIdlist(contentType, accept, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#skuIdlistbyRefIdlist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#skuIdlistbyRefIdlist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional]

### Return type

[**Example8**](Example8.md)

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

<a name="skubyAlternateId"></a>
# **skubyAlternateId**
> Example5 skubyAlternateId(contentType, accept, alternateId)

Get SKU by Alternate ID

Retrieves an SKU by its Alternate ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val alternateId : kotlin.String = alternateId_example // kotlin.String | 
try {
    val result : Example5 = apiInstance.skubyAlternateId(contentType, accept, alternateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#skubyAlternateId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#skubyAlternateId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **alternateId** | **kotlin.String**|  |

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

<a name="skulistbyProductId"></a>
# **skulistbyProductId**
> kotlin.collections.List&lt;Example7&gt; skulistbyProductId(contentType, accept, productId)

Get SKU list by ProductId

Retrieves a list with the SKUs related to a product by the product&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.String = productId_example // kotlin.String | Product’s unique numerical identifier
try {
    val result : kotlin.collections.List<Example7> = apiInstance.skulistbyProductId(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUApi#skulistbyProductId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUApi#skulistbyProductId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.String**| Product’s unique numerical identifier |

### Return type

[**kotlin.collections.List&lt;Example7&gt;**](Example7.md)

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

