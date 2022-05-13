# CollectionBetaApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gETAllCollections**](CollectionBetaApi.md#gETAllCollections) | **GET** /api/catalog_system/pvt/collection/search | Get All Collections
[**gETAllInactiveCollections**](CollectionBetaApi.md#gETAllInactiveCollections) | **GET** /api/catalog/pvt/collection/inactive | Get All Inactive Collections
[**gETCollectionsbyseachterms**](CollectionBetaApi.md#gETCollectionsbyseachterms) | **GET** /api/catalog_system/pvt/collection/search/{searchTerms} | Get Collections by search terms
[**gETImportfileexample**](CollectionBetaApi.md#gETImportfileexample) | **GET** /api/catalog/pvt/collection/stockkeepingunit/importfileexample | Import Collection file example
[**gETProductsfromacollection**](CollectionBetaApi.md#gETProductsfromacollection) | **GET** /api/catalog/pvt/collection/{collectionId}/products | Get products from a collection
[**pOSTAddproductsbyimportfile**](CollectionBetaApi.md#pOSTAddproductsbyimportfile) | **POST** /api/catalog/pvt/collection/{collectionId}/stockkeepingunit/importinsert | Add products to Collection by imported file
[**pOSTCreateCollection**](CollectionBetaApi.md#pOSTCreateCollection) | **POST** /api/catalog/pvt/collection/ | Create Collection
[**pOSTRemoveproductsbyimportfile**](CollectionBetaApi.md#pOSTRemoveproductsbyimportfile) | **POST** /api/catalog/pvt/collection/{collectionId}/stockkeepingunit/importexclude | Remove products from Collection by imported file


<a name="gETAllCollections"></a>
# **gETAllCollections**
> gETAllCollections(contentType, accept, page, pageSize, orderByAsc)

Get All Collections

Retrieves a list of all collections matching a filter

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val page : kotlin.Int = 2 // kotlin.Int | Page number
val pageSize : kotlin.Int = 15 // kotlin.Int | Number of the items of the page
val orderByAsc : kotlin.Boolean = true // kotlin.Boolean | If the items of the page are order by ascending
try {
    apiInstance.gETAllCollections(contentType, accept, page, pageSize, orderByAsc)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#gETAllCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#gETAllCollections")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **page** | **kotlin.Int**| Page number |
 **pageSize** | **kotlin.Int**| Number of the items of the page |
 **orderByAsc** | **kotlin.Boolean**| If the items of the page are order by ascending |

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

<a name="gETAllInactiveCollections"></a>
# **gETAllInactiveCollections**
> gETAllInactiveCollections(contentType, accept)

Get All Inactive Collections

Retrieves a list of Collection IDs of the inactive Collections

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.gETAllInactiveCollections(contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#gETAllInactiveCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#gETAllInactiveCollections")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="gETCollectionsbyseachterms"></a>
# **gETCollectionsbyseachterms**
> gETCollectionsbyseachterms(contentType, accept, searchTerms, page, pageSize, orderByAsc)

Get Collections by search terms

Retrieves a list of collections matching a filter

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val searchTerms : kotlin.String = searchTerms_example // kotlin.String | String that will search for a collection related to it
val page : kotlin.Int = 2 // kotlin.Int | Page number
val pageSize : kotlin.Int = 15 // kotlin.Int | Number of the items of the page
val orderByAsc : kotlin.Boolean = true // kotlin.Boolean | If the items of the page are order by ascending
try {
    apiInstance.gETCollectionsbyseachterms(contentType, accept, searchTerms, page, pageSize, orderByAsc)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#gETCollectionsbyseachterms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#gETCollectionsbyseachterms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **searchTerms** | **kotlin.String**| String that will search for a collection related to it | [default to &quot;costume&quot;]
 **page** | **kotlin.Int**| Page number | [optional]
 **pageSize** | **kotlin.Int**| Number of the items of the page | [optional]
 **orderByAsc** | **kotlin.Boolean**| If the items of the page are order by ascending | [optional]

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

<a name="gETImportfileexample"></a>
# **gETImportfileexample**
> gETImportfileexample(contentType, accept)

Import Collection file example

Imports a sample of the imported XLS file. You need to save the response file to your device

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
try {
    apiInstance.gETImportfileexample(contentType, accept)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#gETImportfileexample")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#gETImportfileexample")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="gETProductsfromacollection"></a>
# **gETProductsfromacollection**
> gETProductsfromacollection(contentType, accept, collectionId, page, pageSize, filter, active, visible, categoryId, brandId, supplierId, salesChannelId, releaseFrom, releaseTo, specificationProduct, specificationFieldId)

Get products from a collection

Retrieves information about the products from a collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection's unique identifier
val page : kotlin.Int = 56 // kotlin.Int | Page number
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of the items of the page
val filter : kotlin.String = filter_example // kotlin.String | Filter used to refine the Collection's products
val active : kotlin.Boolean = true // kotlin.Boolean | If the status of the product is active or not
val visible : kotlin.Boolean = true // kotlin.Boolean | If the product is visible on store or not
val categoryId : kotlin.Int = 56 // kotlin.Int | Product's Category unique identifier
val brandId : kotlin.Int = 56 // kotlin.Int | Product's Brand unique identifier
val supplierId : kotlin.Int = 56 // kotlin.Int | Product's Supplier unique identifier
val salesChannelId : kotlin.Int = 56 // kotlin.Int | Product's Trade Policy unique identifier
val releaseFrom : kotlin.String = releaseFrom_example // kotlin.String | Product past release date
val releaseTo : kotlin.String = releaseTo_example // kotlin.String | Product future release date
val specificationProduct : kotlin.String = specificationProduct_example // kotlin.String | Product Specification Field Value. You must also fill in `SpecificationFieldId` to use this parameter.
val specificationFieldId : kotlin.Int = 56 // kotlin.Int | Product Specification Field unique identifier
try {
    apiInstance.gETProductsfromacollection(contentType, accept, collectionId, page, pageSize, filter, active, visible, categoryId, brandId, supplierId, salesChannelId, releaseFrom, releaseTo, specificationProduct, specificationFieldId)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#gETProductsfromacollection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#gETProductsfromacollection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection&#39;s unique identifier | [default to 1]
 **page** | **kotlin.Int**| Page number | [optional] [default to 2]
 **pageSize** | **kotlin.Int**| Number of the items of the page | [optional] [default to 15]
 **filter** | **kotlin.String**| Filter used to refine the Collection&#39;s products | [optional] [default to &quot;Pre launch&quot;]
 **active** | **kotlin.Boolean**| If the status of the product is active or not | [optional] [default to true]
 **visible** | **kotlin.Boolean**| If the product is visible on store or not | [optional] [default to true]
 **categoryId** | **kotlin.Int**| Product&#39;s Category unique identifier | [optional] [default to 12]
 **brandId** | **kotlin.Int**| Product&#39;s Brand unique identifier | [optional] [default to 3]
 **supplierId** | **kotlin.Int**| Product&#39;s Supplier unique identifier | [optional] [default to 1]
 **salesChannelId** | **kotlin.Int**| Product&#39;s Trade Policy unique identifier | [optional] [default to 1]
 **releaseFrom** | **kotlin.String**| Product past release date | [optional] [default to &quot;2069-11-26T15:23:00&quot;]
 **releaseTo** | **kotlin.String**| Product future release date | [optional] [default to &quot;2069-11-26T15:23:00&quot;]
 **specificationProduct** | **kotlin.String**| Product Specification Field Value. You must also fill in &#x60;SpecificationFieldId&#x60; to use this parameter. | [optional] [default to &quot;M&quot;]
 **specificationFieldId** | **kotlin.Int**| Product Specification Field unique identifier | [optional] [default to 40]

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

<a name="pOSTAddproductsbyimportfile"></a>
# **pOSTAddproductsbyimportfile**
> pOSTAddproductsbyimportfile(contentType, accept, collectionId, file)

Add products to Collection by imported file

Adds products to a collection from the request body file. The file must be an imported template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection's unique identifier
val file : kotlin.Any =  // kotlin.Any | XLS file with information about products to be added to a Collection. The file must be an imported template from [Import Collection file example](https://developers.vtex.com/vtex-developer-docs/reference/get-importfileexample) endpoint.
try {
    apiInstance.pOSTAddproductsbyimportfile(contentType, accept, collectionId, file)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#pOSTAddproductsbyimportfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#pOSTAddproductsbyimportfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;multipart/form-data&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection&#39;s unique identifier | [default to 1]
 **file** | [**kotlin.Any**](kotlin.Any.md)| XLS file with information about products to be added to a Collection. The file must be an imported template from [Import Collection file example](https://developers.vtex.com/vtex-developer-docs/reference/get-importfileexample) endpoint. | [optional]

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

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="pOSTCreateCollection"></a>
# **pOSTCreateCollection**
> pOSTCreateCollection(contentType, accept, requestBody15)

Create Collection

Creates a new collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody15 : RequestBody15 =  // RequestBody15 | 
try {
    apiInstance.pOSTCreateCollection(contentType, accept, requestBody15)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#pOSTCreateCollection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#pOSTCreateCollection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody15** | [**RequestBody15**](RequestBody15.md)|  |

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

<a name="pOSTRemoveproductsbyimportfile"></a>
# **pOSTRemoveproductsbyimportfile**
> pOSTRemoveproductsbyimportfile(contentType, accept, collectionId, file)

Remove products from Collection by imported file

Removes products from a collection from the request body file. The file must be an imported template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CollectionBetaApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val collectionId : kotlin.Int = 56 // kotlin.Int | Collection's unique identifier
val file : kotlin.Any =  // kotlin.Any | XLS file with information about products to be added to a Collection. The file must be an imported template from [Import Collection file example](https://developers.vtex.com/vtex-developer-docs/reference/get-importfileexample) endpoint.
try {
    apiInstance.pOSTRemoveproductsbyimportfile(contentType, accept, collectionId, file)
} catch (e: ClientException) {
    println("4xx response calling CollectionBetaApi#pOSTRemoveproductsbyimportfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionBetaApi#pOSTRemoveproductsbyimportfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;multipart/form-data&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **collectionId** | **kotlin.Int**| Collection&#39;s unique identifier | [default to 1]
 **file** | [**kotlin.Any**](kotlin.Any.md)| XLS file with information about products to be added to a Collection. The file must be an imported template from [Import Collection file example](https://developers.vtex.com/vtex-developer-docs/reference/get-importfileexample) endpoint. | [optional]

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

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

