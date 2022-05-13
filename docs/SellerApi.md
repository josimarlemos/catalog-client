# SellerApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSeller**](SellerApi.md#createSeller) | **POST** /api/catalog_system/pvt/seller | Create Seller
[**getSellerbyId**](SellerApi.md#getSellerbyId) | **GET** /api/catalog_system/pvt/seller/{sellerId} | Get Seller by ID
[**getSellersbyId**](SellerApi.md#getSellersbyId) | **GET** /api/catalog_system/pvt/sellers/{sellerId} | Get Seller by ID
[**sellerList**](SellerApi.md#sellerList) | **GET** /api/catalog_system/pvt/seller/list | Get Seller List
[**updateSeller**](SellerApi.md#updateSeller) | **PUT** /api/catalog_system/pvt/seller | Update Seller


<a name="createSeller"></a>
# **createSeller**
> InlineResponse20022 createSeller(contentType, accept, createSellerRequest)

Create Seller

Creates a new seller.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val createSellerRequest : CreateSellerRequest = {"SellerId":"myseller","Name":"My Seller","Email":"myseller@vtex.com","Description":"","ExchangeReturnPolicy":"","DeliveryPolicy":"","UseHybridPaymentOptions":false,"UserName":"","Password":"","SecutityPrivacyPolicy":"","CNPJ":"12345678912345","CSCIdentification":"myseller","ArchiveId":1,"UrlLogo":"","ProductCommissionPercentage":1.5,"FreightCommissionPercentage":0,"FulfillmentEndpoint":"http://fulfillment.vtexcommerce.com.br/api/fulfillment?affiliateid=VTX&sc=1&an=myseller","CatalogSystemEndpoint":"http://myseller.vtexcommercestable.com.br/api/catalog_system/","IsActive":true,"FulfillmentSellerId":2,"SellerType":1,"IsBetterScope":false} // CreateSellerRequest | 
try {
    val result : InlineResponse20022 = apiInstance.createSeller(contentType, accept, createSellerRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SellerApi#createSeller")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SellerApi#createSeller")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **createSellerRequest** | [**CreateSellerRequest**](CreateSellerRequest.md)|  |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

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

<a name="getSellerbyId"></a>
# **getSellerbyId**
> InlineResponse20023 getSellerbyId(contentType, accept, sellerId)

Get Seller by ID

Retrieves the seller&#39;s details by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sellerId : kotlin.String = sellerId_example // kotlin.String | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
try {
    val result : InlineResponse20023 = apiInstance.getSellerbyId(contentType, accept, sellerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SellerApi#getSellerbyId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SellerApi#getSellerbyId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sellerId** | **kotlin.String**| ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. | [default to &quot;pedrostore&quot;]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

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

<a name="getSellersbyId"></a>
# **getSellersbyId**
> InlineResponse20024 getSellersbyId(contentType, accept, sellerId)

Get Seller by ID

Retrieves the seller&#39;s details by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sellerId : kotlin.String = sellerId_example // kotlin.String | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
try {
    val result : InlineResponse20024 = apiInstance.getSellersbyId(contentType, accept, sellerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SellerApi#getSellersbyId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SellerApi#getSellersbyId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sellerId** | **kotlin.String**| ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. | [default to &quot;pedrostore&quot;]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

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

<a name="sellerList"></a>
# **sellerList**
> InlineResponse20022 sellerList(contentType, accept, sc, sellerType, isBetterScope)

Get Seller List

Retrieves the seller&#39;s details by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sc : kotlin.Int = 56 // kotlin.Int | Trade policy ID.
val sellerType : kotlin.Int = 56 // kotlin.Int | Seller type.
val isBetterScope : kotlin.Boolean = true // kotlin.Boolean | If the seller is better scope.
try {
    val result : InlineResponse20022 = apiInstance.sellerList(contentType, accept, sc, sellerType, isBetterScope)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SellerApi#sellerList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SellerApi#sellerList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sc** | **kotlin.Int**| Trade policy ID. | [optional] [default to 1]
 **sellerType** | **kotlin.Int**| Seller type. | [optional] [default to 1]
 **isBetterScope** | **kotlin.Boolean**| If the seller is better scope. | [optional] [default to false]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

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

<a name="updateSeller"></a>
# **updateSeller**
> InlineResponse20022 updateSeller(contentType, accept, updateSellerRequest)

Update Seller

Updates a seller.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val updateSellerRequest : UpdateSellerRequest =  // UpdateSellerRequest | 
try {
    val result : InlineResponse20022 = apiInstance.updateSeller(contentType, accept, updateSellerRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SellerApi#updateSeller")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SellerApi#updateSeller")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **updateSellerRequest** | [**UpdateSellerRequest**](UpdateSellerRequest.md)|  |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

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

