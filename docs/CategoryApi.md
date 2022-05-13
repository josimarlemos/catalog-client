# CategoryApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtCategoryCategoryIdGet**](CategoryApi.md#apiCatalogPvtCategoryCategoryIdGet) | **GET** /api/catalog/pvt/category/{categoryId} | Get Category by ID
[**apiCatalogPvtCategoryCategoryIdPut**](CategoryApi.md#apiCatalogPvtCategoryCategoryIdPut) | **PUT** /api/catalog/pvt/category/{categoryId} | Update Category
[**apiCatalogPvtCategoryPost**](CategoryApi.md#apiCatalogPvtCategoryPost) | **POST** /api/catalog/pvt/category | Create Category
[**categoryTree**](CategoryApi.md#categoryTree) | **GET** /api/catalog_system/pub/category/tree/{categoryLevels} | Get Category Tree


<a name="apiCatalogPvtCategoryCategoryIdGet"></a>
# **apiCatalogPvtCategoryCategoryIdGet**
> InlineResponse20014 apiCatalogPvtCategoryCategoryIdGet(contentType, accept, categoryId)

Get Category by ID

Retrieves general information about a Category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.Int = 56 // kotlin.Int | Category’s unique numerical identifier
try {
    val result : InlineResponse20014 = apiInstance.apiCatalogPvtCategoryCategoryIdGet(contentType, accept, categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#apiCatalogPvtCategoryCategoryIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#apiCatalogPvtCategoryCategoryIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.Int**| Category’s unique numerical identifier | [default to 9289]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

<a name="apiCatalogPvtCategoryCategoryIdPut"></a>
# **apiCatalogPvtCategoryCategoryIdPut**
> InlineResponse20014 apiCatalogPvtCategoryCategoryIdPut(contentType, accept, categoryId, inlineObject7)

Update Category

Updates a previously existing Category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.Int = 56 // kotlin.Int | Category’s unique numerical identifier
val inlineObject7 : InlineObject7 =  // InlineObject7 | 
try {
    val result : InlineResponse20014 = apiInstance.apiCatalogPvtCategoryCategoryIdPut(contentType, accept, categoryId, inlineObject7)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#apiCatalogPvtCategoryCategoryIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#apiCatalogPvtCategoryCategoryIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.Int**| Category’s unique numerical identifier | [default to 9289]
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

<a name="apiCatalogPvtCategoryPost"></a>
# **apiCatalogPvtCategoryPost**
> InlineResponse20014 apiCatalogPvtCategoryPost(contentType, accept, inlineObject8)

Create Category

Creates a new Category from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject8 : InlineObject8 =  // InlineObject8 | 
try {
    val result : InlineResponse20014 = apiInstance.apiCatalogPvtCategoryPost(contentType, accept, inlineObject8)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#apiCatalogPvtCategoryPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#apiCatalogPvtCategoryPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

<a name="categoryTree"></a>
# **categoryTree**
> kotlin.collections.List&lt;Example1&gt; categoryTree(contentType, accept, categoryLevels)

Get Category Tree

Retrieves the Category Tree of your store. Get all the category levels registered in the Catalog or define the level up to which you want to get.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryLevels : kotlin.String = categoryLevels_example // kotlin.String | Value of the category level you need to retrieve
try {
    val result : kotlin.collections.List<Example1> = apiInstance.categoryTree(contentType, accept, categoryLevels)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryTree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryLevels** | **kotlin.String**| Value of the category level you need to retrieve |

### Return type

[**kotlin.collections.List&lt;Example1&gt;**](Example1.md)

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

