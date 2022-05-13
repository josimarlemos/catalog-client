# SpecificationGroupApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogPvtSpecificationgroupGroupIdPut**](SpecificationGroupApi.md#apiCatalogPvtSpecificationgroupGroupIdPut) | **PUT** /api/catalog/pvt/specificationgroup/{groupId} | Update Specification Group
[**specificationGroupInsert**](SpecificationGroupApi.md#specificationGroupInsert) | **POST** /api/catalog_system/pvt/specification/group | Create Specification Group
[**specificationGroupInsert2**](SpecificationGroupApi.md#specificationGroupInsert2) | **POST** /api/catalog/pvt/specificationgroup | Create Specification Group
[**specificationGroupUpdate**](SpecificationGroupApi.md#specificationGroupUpdate) | **PUT** /api/catalog_system/pvt/specification/group | Update Specification Group
[**specificationsGroupGet**](SpecificationGroupApi.md#specificationsGroupGet) | **GET** /api/catalog_system/pub/specification/groupGet/{groupId} | Get Specifications Group
[**specificationsGroupListbyCategory**](SpecificationGroupApi.md#specificationsGroupListbyCategory) | **GET** /api/catalog_system/pvt/specification/groupbycategory/{categoryId} |  List Specifications Group by Category


<a name="apiCatalogPvtSpecificationgroupGroupIdPut"></a>
# **apiCatalogPvtSpecificationgroupGroupIdPut**
> apiCatalogPvtSpecificationgroupGroupIdPut(contentType, accept, groupId, requestBody19)

Update Specification Group

Update a specification group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val groupId : kotlin.Int = 56 // kotlin.Int | Group’s unique numerical identifier
val requestBody19 : RequestBody19 =  // RequestBody19 | 
try {
    apiInstance.apiCatalogPvtSpecificationgroupGroupIdPut(contentType, accept, groupId, requestBody19)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#apiCatalogPvtSpecificationgroupGroupIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#apiCatalogPvtSpecificationgroupGroupIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **groupId** | **kotlin.Int**| Group’s unique numerical identifier | [default to 1]
 **requestBody19** | [**RequestBody19**](RequestBody19.md)|  | [optional]

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

<a name="specificationGroupInsert"></a>
# **specificationGroupInsert**
> Example13 specificationGroupInsert(contentType, accept, specificationGroupInsertRequest)

Create Specification Group

Create a specification group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationGroupInsertRequest : SpecificationGroupInsertRequest = {"CategoryId":1,"Name":"GroupName1"} // SpecificationGroupInsertRequest | 
try {
    val result : Example13 = apiInstance.specificationGroupInsert(contentType, accept, specificationGroupInsertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#specificationGroupInsert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#specificationGroupInsert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationGroupInsertRequest** | [**SpecificationGroupInsertRequest**](SpecificationGroupInsertRequest.md)|  |

### Return type

[**Example13**](Example13.md)

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

<a name="specificationGroupInsert2"></a>
# **specificationGroupInsert2**
> InlineResponse20021 specificationGroupInsert2(contentType, accept, specificationGroupInsertRequest)

Create Specification Group

Create a specification group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationGroupInsertRequest : SpecificationGroupInsertRequest = {"CategoryId":1,"Name":"GroupName1"} // SpecificationGroupInsertRequest | 
try {
    val result : InlineResponse20021 = apiInstance.specificationGroupInsert2(contentType, accept, specificationGroupInsertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#specificationGroupInsert2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#specificationGroupInsert2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationGroupInsertRequest** | [**SpecificationGroupInsertRequest**](SpecificationGroupInsertRequest.md)|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

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

<a name="specificationGroupUpdate"></a>
# **specificationGroupUpdate**
> specificationGroupUpdate(contentType, accept, specificationGroupUpdateRequest)

Update Specification Group

Update a specification group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val specificationGroupUpdateRequest : SpecificationGroupUpdateRequest = {"Id":31,"Name":"NewGroupName"} // SpecificationGroupUpdateRequest | 
try {
    apiInstance.specificationGroupUpdate(contentType, accept, specificationGroupUpdateRequest)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#specificationGroupUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#specificationGroupUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **specificationGroupUpdateRequest** | [**SpecificationGroupUpdateRequest**](SpecificationGroupUpdateRequest.md)|  |

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

<a name="specificationsGroupGet"></a>
# **specificationsGroupGet**
> Example11 specificationsGroupGet(contentType, accept, groupId)

Get Specifications Group

Retrieves details from a specification group by the ID of this group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val groupId : kotlin.String = groupId_example // kotlin.String | 
try {
    val result : Example11 = apiInstance.specificationsGroupGet(contentType, accept, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#specificationsGroupGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#specificationsGroupGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **groupId** | **kotlin.String**|  |

### Return type

[**Example11**](Example11.md)

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

<a name="specificationsGroupListbyCategory"></a>
# **specificationsGroupListbyCategory**
> kotlin.collections.List&lt;Example12&gt; specificationsGroupListbyCategory(contentType, accept, categoryId)

 List Specifications Group by Category

Retrieves a list of specification groups by the category ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpecificationGroupApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Example12> = apiInstance.specificationsGroupListbyCategory(contentType, accept, categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpecificationGroupApi#specificationsGroupListbyCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpecificationGroupApi#specificationsGroupListbyCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **categoryId** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Example12&gt;**](Example12.md)

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

