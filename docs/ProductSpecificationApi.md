# ProductSpecificationApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtProductProductIdSpecificationPost**](ProductSpecificationApi.md#apiCatalogPvtProductProductIdSpecificationPost) | **POST** /api/catalog/pvt/product/{productId}/specification | Associate Product Specification
[**apiCatalogPvtProductProductIdSpecificationvaluePut**](ProductSpecificationApi.md#apiCatalogPvtProductProductIdSpecificationvaluePut) | **PUT** /api/catalog/pvt/product/{productId}/specificationvalue | Associate product specification using specification and group names
[**deleteAllProductSpecification**](ProductSpecificationApi.md#deleteAllProductSpecification) | **DELETE** /api/catalog/pvt/product/{productId}/specification | Delete all Product Specification
[**deleteProductSpecification**](ProductSpecificationApi.md#deleteProductSpecification) | **DELETE** /api/catalog/pvt/product/{productId}/specification/{specificationId} | Delete Product Specification
[**getProductSpecification**](ProductSpecificationApi.md#getProductSpecification) | **GET** /api/catalog_system/pvt/products/{productId}/specification | Get Product Specification by Product ID
[**getProductSpecificationbyProductID**](ProductSpecificationApi.md#getProductSpecificationbyProductID) | **GET** /api/catalog/pvt/product/{productId}/specification | Get Product Specification and its information by Product ID
[**updateProductSpecification**](ProductSpecificationApi.md#updateProductSpecification) | **POST** /api/catalog_system/pvt/products/{productId}/specification | Update Product Specification by Product ID


<a name="apiCatalogPvtProductProductIdSpecificationPost"></a>
# **apiCatalogPvtProductProductIdSpecificationPost**
> InlineResponse2006 apiCatalogPvtProductProductIdSpecificationPost(contentType, accept, productId, inlineObject2)

Associate Product Specification

Associates a previously defined Specification to a Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val inlineObject2 : InlineObject2 =  // InlineObject2 | 
try {
    val result : InlineResponse2006 = apiInstance.apiCatalogPvtProductProductIdSpecificationPost(contentType, accept, productId, inlineObject2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#apiCatalogPvtProductProductIdSpecificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#apiCatalogPvtProductProductIdSpecificationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

<a name="apiCatalogPvtProductProductIdSpecificationvaluePut"></a>
# **apiCatalogPvtProductProductIdSpecificationvaluePut**
> kotlin.collections.List&lt;InlineResponse2007&gt; apiCatalogPvtProductProductIdSpecificationvaluePut(contentType, accept, productId, inlineObject3)

Associate product specification using specification and group names

Associates a previously defined specification to a product using specification and group names

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val inlineObject3 : InlineObject3 =  // InlineObject3 | 
try {
    val result : kotlin.collections.List<InlineResponse2007> = apiInstance.apiCatalogPvtProductProductIdSpecificationvaluePut(contentType, accept, productId, inlineObject3)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#apiCatalogPvtProductProductIdSpecificationvaluePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#apiCatalogPvtProductProductIdSpecificationvaluePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier | [default to 1]
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;InlineResponse2007&gt;**](InlineResponse2007.md)

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

<a name="deleteAllProductSpecification"></a>
# **deleteAllProductSpecification**
> deleteAllProductSpecification(contentType, accept, productId)

Delete all Product Specification

Deletes all Product Specifications

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    apiInstance.deleteAllProductSpecification(contentType, accept, productId)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#deleteAllProductSpecification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#deleteAllProductSpecification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier |

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

<a name="deleteProductSpecification"></a>
# **deleteProductSpecification**
> deleteProductSpecification(contentType, accept, productId, specificationId)

Delete Product Specification

Deletes a specific Product Specification

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val specificationId : kotlin.Int = 56 // kotlin.Int | Product Specification’s unique numerical identifier
try {
    apiInstance.deleteProductSpecification(contentType, accept, productId, specificationId)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#deleteProductSpecification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#deleteProductSpecification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier |
 **specificationId** | **kotlin.Int**| Product Specification’s unique numerical identifier |

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

<a name="getProductSpecification"></a>
# **getProductSpecification**
> kotlin.collections.List&lt;Example2&gt; getProductSpecification(contentType, accept, productId)

Get Product Specification by Product ID

Retrieves all specifications of a product by the product&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    val result : kotlin.collections.List<Example2> = apiInstance.getProductSpecification(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#getProductSpecification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#getProductSpecification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier |

### Return type

[**kotlin.collections.List&lt;Example2&gt;**](Example2.md)

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

<a name="getProductSpecificationbyProductID"></a>
# **getProductSpecificationbyProductID**
> kotlin.collections.List&lt;InlineResponse2005&gt; getProductSpecificationbyProductID(contentType, accept, productId)

Get Product Specification and its information by Product ID

Retrieves information of all specifications of a product by the product&#39;s ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
try {
    val result : kotlin.collections.List<InlineResponse2005> = apiInstance.getProductSpecificationbyProductID(contentType, accept, productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#getProductSpecificationbyProductID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#getProductSpecificationbyProductID")
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

[**kotlin.collections.List&lt;InlineResponse2005&gt;**](InlineResponse2005.md)

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

<a name="updateProductSpecification"></a>
# **updateProductSpecification**
> updateProductSpecification(contentType, accept, productId, updateProductSpecificationRequest)

Update Product Specification by Product ID

Updates the value of a product specification by the product&#39;s ID. The ID or name can be used to identify what product specification will be updated. Specification fields must be previously created in your Catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductSpecificationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val productId : kotlin.Int = 56 // kotlin.Int | Product’s unique numerical identifier
val updateProductSpecificationRequest : kotlin.collections.List<UpdateProductSpecificationRequest> =  // kotlin.collections.List<UpdateProductSpecificationRequest> | 
try {
    apiInstance.updateProductSpecification(contentType, accept, productId, updateProductSpecificationRequest)
} catch (e: ClientException) {
    println("4xx response calling ProductSpecificationApi#updateProductSpecification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductSpecificationApi#updateProductSpecification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **productId** | **kotlin.Int**| Product’s unique numerical identifier |
 **updateProductSpecificationRequest** | [**kotlin.collections.List&lt;UpdateProductSpecificationRequest&gt;**](UpdateProductSpecificationRequest.md)|  |

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

