# BrandApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtBrandBrandIdDelete**](BrandApi.md#apiCatalogPvtBrandBrandIdDelete) | **DELETE** /api/catalog/pvt/brand/{brandId} | Delete Brand
[**apiCatalogPvtBrandBrandIdGet**](BrandApi.md#apiCatalogPvtBrandBrandIdGet) | **GET** /api/catalog/pvt/brand/{brandId} | Get Brand and context
[**apiCatalogPvtBrandBrandIdPut**](BrandApi.md#apiCatalogPvtBrandBrandIdPut) | **PUT** /api/catalog/pvt/brand/{brandId} | Update Brand
[**apiCatalogPvtBrandPost**](BrandApi.md#apiCatalogPvtBrandPost) | **POST** /api/catalog/pvt/brand | Create Brand
[**brand**](BrandApi.md#brand) | **GET** /api/catalog_system/pvt/brand/{brandId} | Get Brand
[**brandList**](BrandApi.md#brandList) | **GET** /api/catalog_system/pvt/brand/list | Get Brand List
[**brandListPerPage**](BrandApi.md#brandListPerPage) | **GET** /api/catalog_system/pvt/brand/pagedlist | Get Brand List Per Page


<a name="apiCatalogPvtBrandBrandIdDelete"></a>
# **apiCatalogPvtBrandBrandIdDelete**
> apiCatalogPvtBrandBrandIdDelete(brandId, contentType, accept)

Delete Brand

Deletes an existing Brand

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val brandId : kotlin.String = brandId_example // kotlin.String | Brand’s unique numerical identifier
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.apiCatalogPvtBrandBrandIdDelete(brandId, contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#apiCatalogPvtBrandBrandIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#apiCatalogPvtBrandBrandIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.String**| Brand’s unique numerical identifier | [default to &quot;vtexcommercestable&quot;]
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

<a name="apiCatalogPvtBrandBrandIdGet"></a>
# **apiCatalogPvtBrandBrandIdGet**
> InlineResponse20017 apiCatalogPvtBrandBrandIdGet(contentType, accept, brandId)

Get Brand and context

Retrieves information about a specific Brand and its context

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val brandId : kotlin.String = brandId_example // kotlin.String | Brand ID
try {
    val result : InlineResponse20017 = apiInstance.apiCatalogPvtBrandBrandIdGet(contentType, accept, brandId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#apiCatalogPvtBrandBrandIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#apiCatalogPvtBrandBrandIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **brandId** | **kotlin.String**| Brand ID |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

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

<a name="apiCatalogPvtBrandBrandIdPut"></a>
# **apiCatalogPvtBrandBrandIdPut**
> InlineResponse20017 apiCatalogPvtBrandBrandIdPut(brandId, contentType, accept, inlineObject10)

Update Brand

Updates a previously existing Brand

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val brandId : kotlin.String = brandId_example // kotlin.String | Brand’s unique numerical identifier
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject10 : InlineObject10 =  // InlineObject10 | 
try {
    val result : InlineResponse20017 = apiInstance.apiCatalogPvtBrandBrandIdPut(brandId, contentType, accept, inlineObject10)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#apiCatalogPvtBrandBrandIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#apiCatalogPvtBrandBrandIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.String**| Brand’s unique numerical identifier | [default to &quot;vtexcommercestable&quot;]
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

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

<a name="apiCatalogPvtBrandPost"></a>
# **apiCatalogPvtBrandPost**
> InlineResponse20017 apiCatalogPvtBrandPost(contentType, accept, inlineObject9)

Create Brand

Creates a new Brand from scratch

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val inlineObject9 : InlineObject9 =  // InlineObject9 | 
try {
    val result : InlineResponse20017 = apiInstance.apiCatalogPvtBrandPost(contentType, accept, inlineObject9)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#apiCatalogPvtBrandPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#apiCatalogPvtBrandPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

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

<a name="brand"></a>
# **brand**
> Brand brand(contentType, accept, brandId)

Get Brand

Retrieves a specific Brand by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val brandId : kotlin.String = brandId_example // kotlin.String | Brand ID
try {
    val result : Brand = apiInstance.brand(contentType, accept, brandId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#brand")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#brand")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **brandId** | **kotlin.String**| Brand ID |

### Return type

[**Brand**](Brand.md)

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

<a name="brandList"></a>
# **brandList**
> kotlin.collections.List&lt;InlineResponse20015&gt; brandList(contentType, accept)

Get Brand List

Retrieves all Brands registered in the store&#39;s Catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    val result : kotlin.collections.List<InlineResponse20015> = apiInstance.brandList(contentType, accept)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#brandList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#brandList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]

### Return type

[**kotlin.collections.List&lt;InlineResponse20015&gt;**](InlineResponse20015.md)

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

<a name="brandListPerPage"></a>
# **brandListPerPage**
> InlineResponse20016 brandListPerPage(contentType, accept, pageSize, page)

Get Brand List Per Page

Retrieves all Brands registered in the store&#39;s Catalog by page number.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BrandApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val pageSize : kotlin.Int = 56 // kotlin.Int | Quantity of brands per page
val page : kotlin.Int = 56 // kotlin.Int | Page number of the brand list
try {
    val result : InlineResponse20016 = apiInstance.brandListPerPage(contentType, accept, pageSize, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BrandApi#brandListPerPage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BrandApi#brandListPerPage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **pageSize** | **kotlin.Int**| Quantity of brands per page | [default to 5]
 **page** | **kotlin.Int**| Page number of the brand list | [default to 1]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

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

