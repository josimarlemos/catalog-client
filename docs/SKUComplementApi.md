# SKUComplementApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSKUComplement**](SKUComplementApi.md#createSKUComplement) | **POST** /api/catalog/pvt/skucomplement | Create SKU Complement
[**deleteSKUComplementbySKUComplementID**](SKUComplementApi.md#deleteSKUComplementbySKUComplementID) | **DELETE** /api/catalog/pvt/skucomplement/{skuComplementId} | Delete SKU Complement by SKU Complement ID
[**getSKUComplementbySKUComplementID**](SKUComplementApi.md#getSKUComplementbySKUComplementID) | **GET** /api/catalog/pvt/skucomplement/{skuComplementId} | Get SKU Complement by SKU Complement ID
[**getSKUComplementbySKUID**](SKUComplementApi.md#getSKUComplementbySKUID) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/complement | Get SKU Complement by SKU ID
[**getSKUComplementsbyComplementTypeID**](SKUComplementApi.md#getSKUComplementsbyComplementTypeID) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/complement/{complementTypeId} | Get SKU Complements by Complement Type ID
[**getSKUcomplementsbytype**](SKUComplementApi.md#getSKUcomplementsbytype) | **GET** /api/catalog_system/pvt/sku/complements/{skuId}/{type} | Get SKU complements by type


<a name="createSKUComplement"></a>
# **createSKUComplement**
> createSKUComplement(contentType, accept, requestBody)

Create SKU Complement

Creates a new SKU Complement on a Parent SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val requestBody : RequestBody =  // RequestBody | 
try {
    apiInstance.createSKUComplement(contentType, accept, requestBody)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#createSKUComplement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#createSKUComplement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **requestBody** | [**RequestBody**](RequestBody.md)|  | [optional]

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

<a name="deleteSKUComplementbySKUComplementID"></a>
# **deleteSKUComplementbySKUComplementID**
> deleteSKUComplementbySKUComplementID(contentType, accept, skuComplementId, requestBody1)

Delete SKU Complement by SKU Complement ID

Deletes a previously existing Complement of an SKU by SKU Complement ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuComplementId : kotlin.Int = 56 // kotlin.Int |  SKU Complement’s unique numerical identifier
val requestBody1 : RequestBody1 =  // RequestBody1 | 
try {
    apiInstance.deleteSKUComplementbySKUComplementID(contentType, accept, skuComplementId, requestBody1)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#deleteSKUComplementbySKUComplementID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#deleteSKUComplementbySKUComplementID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuComplementId** | **kotlin.Int**|  SKU Complement’s unique numerical identifier | [default to 1]
 **requestBody1** | [**RequestBody1**](RequestBody1.md)|  | [optional]

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

<a name="getSKUComplementbySKUComplementID"></a>
# **getSKUComplementbySKUComplementID**
> getSKUComplementbySKUComplementID(contentType, accept, skuComplementId)

Get SKU Complement by SKU Complement ID

Retrieves a existing Complement of an SKU by its SKU Complement ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuComplementId : kotlin.Int = 56 // kotlin.Int |  SKU Complement’s unique numerical identifier
try {
    apiInstance.getSKUComplementbySKUComplementID(contentType, accept, skuComplementId)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#getSKUComplementbySKUComplementID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#getSKUComplementbySKUComplementID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuComplementId** | **kotlin.Int**|  SKU Complement’s unique numerical identifier | [default to 1]

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

<a name="getSKUComplementbySKUID"></a>
# **getSKUComplementbySKUID**
> getSKUComplementbySKUID(contentType, accept, skuId)

Get SKU Complement by SKU ID

Retrieves a existing Complement of an SKU by its SKU ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int |  SKU’s unique numerical identifier
try {
    apiInstance.getSKUComplementbySKUID(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#getSKUComplementbySKUID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#getSKUComplementbySKUID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**|  SKU’s unique numerical identifier | [default to 1]

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

<a name="getSKUComplementsbyComplementTypeID"></a>
# **getSKUComplementsbyComplementTypeID**
> getSKUComplementsbyComplementTypeID(contentType, accept, skuId, complementTypeId)

Get SKU Complements by Complement Type ID

Retrieves all the existing SKU Complements with the same Complement Type ID of a specific SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int |  SKU’s unique numerical identifier
val complementTypeId : kotlin.Int = 56 // kotlin.Int |  Type of the complement you are inserting on the SKU. The possible values are: `1` to *assessor*; `2` to *suggestion*; `3` to *similar*; 5 to *show together*.
try {
    apiInstance.getSKUComplementsbyComplementTypeID(contentType, accept, skuId, complementTypeId)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#getSKUComplementsbyComplementTypeID")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#getSKUComplementsbyComplementTypeID")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**|  SKU’s unique numerical identifier | [default to 1]
 **complementTypeId** | **kotlin.Int**|  Type of the complement you are inserting on the SKU. The possible values are: &#x60;1&#x60; to *assessor*; &#x60;2&#x60; to *suggestion*; &#x60;3&#x60; to *similar*; 5 to *show together*. | [default to 1]

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

<a name="getSKUcomplementsbytype"></a>
# **getSKUcomplementsbytype**
> InlineResponse20011 getSKUcomplementsbytype(contentType, accept, skuId, type)

Get SKU complements by type

Retrieves all the existing SKU complements with the same complement type ID of a specific SKU

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUComplementApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.Int = 56 // kotlin.Int |  SKU’s unique numerical identifier
val type : kotlin.Int = 56 // kotlin.Int |  Type of the complement you are inserting on the SKU. The possible values are: `1` to *assessor*; `2` to *suggestion*; `3` to *similar*; 5 to *show together*.
try {
    val result : InlineResponse20011 = apiInstance.getSKUcomplementsbytype(contentType, accept, skuId, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUComplementApi#getSKUcomplementsbytype")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUComplementApi#getSKUcomplementsbytype")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.Int**|  SKU’s unique numerical identifier | [default to 1]
 **type** | **kotlin.Int**|  Type of the complement you are inserting on the SKU. The possible values are: &#x60;1&#x60; to *assessor*; &#x60;2&#x60; to *suggestion*; &#x60;3&#x60; to *similar*; 5 to *show together*. | [default to 1]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

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

