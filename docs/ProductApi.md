# ProductApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtProductPost**](ProductApi.md#apiCatalogPvtProductPost) | **POST** /api/catalog/pvt/product | Create Product
[**apiCatalogPvtProductProductIdPut**](ProductApi.md#apiCatalogPvtProductProductIdPut) | **PUT** /api/catalog/pvt/product/{productId} | Update Product
[**getProductbyid**](ProductApi.md#getProductbyid) | **GET** /api/catalog/pvt/product/{productId} | Get Product by ID
[**productAndSkuIds**](ProductApi.md#productAndSkuIds) | **GET** /api/catalog_system/pvt/products/GetProductAndSkuIds | Get Product and SKU IDs
[**productVariations**](ProductApi.md#productVariations) | **GET** /api/catalog_system/pub/products/variations/{productId} | Get Product&#39;s SKUs by Product ID
[**productandTradePolicy**](ProductApi.md#productandTradePolicy) | **GET** /api/catalog_system/pvt/products/productget/{productId} | Get Product and its general context
[**productbyRefId**](ProductApi.md#productbyRefId) | **GET** /api/catalog_system/pvt/products/productgetbyrefid/{refId} | Get Product by RefId
[**reviewRateProduct**](ProductApi.md#reviewRateProduct) | **GET** /api/addon/pvt/review/GetProductRate/{productId} | Get Product Review Rate by Product ID


<a name="apiCatalogPvtProductPost"></a>
# **apiCatalogPvtProductPost**
> InlineResponse2002 apiCatalogPvtProductPost(contentType, accept, inlineObject1)

Create Product

Creates a new Product from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject1 : InlineObject1 =  // InlineObject1 | 
try {
    val result : InlineResponse2002 = apiInstance.apiCatalogPvtProductPost(contentType, accept, inlineObject1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#apiCatalogPvtProductPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#apiCatalogPvtProductPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

<a name="apiCatalogPvtProductProductIdPut"></a>
# **apiCatalogPvtProductProductIdPut**
> InlineResponse2002 apiCatalogPvtProductProductIdPut(contentType, accept, productId, inlineObject)

Update Product

Updates an existent Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val inlineObject : InlineObject =  // InlineObject | 
try {
    val result : InlineResponse2002 = apiInstance.apiCatalogPvtProductProductIdPut(contentType, accept, productId, inlineObject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#apiCatalogPvtProductProductIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#apiCatalogPvtProductProductIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

<a name="getProductbyid"></a>
# **getProductbyid**
> InlineResponse2001 getProductbyid(contentType, accept, productId)

Get Product by ID

Retrieves a specific Product by its ID. This information is exactly what is needed to create a new Product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.String = productId_example // kotlin.String | Product’s unique numerical identifier
try {
    val result : InlineResponse2001 = apiInstance.getProductbyid(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#getProductbyid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#getProductbyid")
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

[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="productAndSkuIds"></a>
# **productAndSkuIds**
> InlineResponse200 productAndSkuIds(contentType, accept, categoryId, from, to)

Get Product and SKU IDs

Retrieves the IDs of all products and SKUs from a specific category by its category ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.Int = 56 // kotlin.Int | Fill this variable with the category ID that you need retrieves Product and SKU
val from : kotlin.Int = 56 // kotlin.Int | Insert the number that will start the request result
val to : kotlin.Int = 56 // kotlin.Int | Insert the number that will end the request result
try {
    val result : InlineResponse200 = apiInstance.productAndSkuIds(contentType, accept, categoryId, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAndSkuIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAndSkuIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.Int**| Fill this variable with the category ID that you need retrieves Product and SKU | [optional] [default to 1]
 **from** | **kotlin.Int**| Insert the number that will start the request result | [optional] [default to 1]
 **to** | **kotlin.Int**| Insert the number that will end the request result | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

<a name="productVariations"></a>
# **productVariations**
> productVariations(contentType, accept, productId)

Get Product&#39;s SKUs by Product ID

Retrieves data about the product and all SKUs related to it by the product&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    apiInstance.productVariations(contentType, accept, productId)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
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

<a name="productandTradePolicy"></a>
# **productandTradePolicy**
> InlineResponse2003 productandTradePolicy(contentType, accept, productId)

Get Product and its general context

Retrieves a specific product&#39;s general information as name, description and the trade policies that it is included.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    val result : InlineResponse2003 = apiInstance.productandTradePolicy(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productandTradePolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productandTradePolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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

<a name="productbyRefId"></a>
# **productbyRefId**
> InlineResponse2004 productbyRefId(contentType, accept, refId)

Get Product by RefId

Retrieves a specific product by its Reference ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val refId : kotlin.String = refId_example // kotlin.String | Product Referecial Code
try {
    val result : InlineResponse2004 = apiInstance.productbyRefId(contentType, accept, refId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productbyRefId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productbyRefId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **refId** | **kotlin.String**| Product Referecial Code |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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

<a name="reviewRateProduct"></a>
# **reviewRateProduct**
> java.math.BigDecimal reviewRateProduct(contentType, accept, productId)

Get Product Review Rate by Product ID

Retrieves the review rate of a product by this product&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    val result : java.math.BigDecimal = apiInstance.reviewRateProduct(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#reviewRateProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#reviewRateProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]

### Return type

[**java.math.BigDecimal**](java.math.BigDecimal.md)

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

