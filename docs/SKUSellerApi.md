# SKUSellerApi

All URIs are relative to *https://{accountName}.{environment}.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost**](SKUSellerApi.md#apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost) | **POST** /api/catalog_system/pvt/skuseller/changenotification/{sellerId}/{sellerSkuId} | Change Notification with Seller ID and Seller SKU ID
[**changeNotification**](SKUSellerApi.md#changeNotification) | **POST** /api/catalog_system/pvt/skuseller/changenotification/{skuId} | Change Notification with SKU ID
[**deleteSKUsellerassociation**](SKUSellerApi.md#deleteSKUsellerassociation) | **POST** /api/catalog_system/pvt/skuseller/remove/{sellerId}/{sellerSkuId} | Delete an SKU seller association
[**getSKUseller**](SKUSellerApi.md#getSKUseller) | **GET** /api/catalog_system/pvt/skuseller/{sellerId}/{sellerSkuId} | Get SKU seller


<a name="apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost"></a>
# **apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost**
> apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost(contentType, accept, sellerId, sellerSkuId)

Change Notification with Seller ID and Seller SKU ID

The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  There are two information expected by the marketplace in this request: the &#x60;sellerId&#x60;, which identifies the seller, and the &#x60;sellerSkuId&#x60;, which identifies the binding of the seller with the SKU.  Both information are passed through the request URL. The body of the request should be empty.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent.
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sellerId : kotlin.String = sellerId_example // kotlin.String | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
val sellerSkuId : kotlin.String = sellerSkuId_example // kotlin.String | ID of the binding of the seller with the SKU.
try {
    apiInstance.apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost(contentType, accept, sellerId, sellerSkuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSellerApi#apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSellerApi#apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent. | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sellerId** | **kotlin.String**| ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. |
 **sellerSkuId** | **kotlin.String**| ID of the binding of the seller with the SKU. |

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

<a name="changeNotification"></a>
# **changeNotification**
> changeNotification(contentType, accept, skuId)

Change Notification with SKU ID

The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  The body of the request should be empty.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent.
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val skuId : kotlin.String = skuId_example // kotlin.String | A string that identifies the SKU in the marketplace. This is the ID that the marketplace will use to look for the SKU whose change the seller wants to inform. If the marketplace finds this ID, it responds with status code 200. Otherwise, it responds with status code 404.
try {
    apiInstance.changeNotification(contentType, accept, skuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSellerApi#changeNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSellerApi#changeNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent. | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **skuId** | **kotlin.String**| A string that identifies the SKU in the marketplace. This is the ID that the marketplace will use to look for the SKU whose change the seller wants to inform. If the marketplace finds this ID, it responds with status code 200. Otherwise, it responds with status code 404. |

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

<a name="deleteSKUsellerassociation"></a>
# **deleteSKUsellerassociation**
> deleteSKUsellerassociation(contentType, accept, sellerId, sellerSkuId)

Delete an SKU seller association

Remove the Seller SKU binding

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sellerId : kotlin.String = sellerId_example // kotlin.String | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
val sellerSkuId : kotlin.String = sellerSkuId_example // kotlin.String | 
try {
    apiInstance.deleteSKUsellerassociation(contentType, accept, sellerId, sellerSkuId)
} catch (e: ClientException) {
    println("4xx response calling SKUSellerApi#deleteSKUsellerassociation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSellerApi#deleteSKUsellerassociation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sellerId** | **kotlin.String**| ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. |
 **sellerSkuId** | **kotlin.String**|  |

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

<a name="getSKUseller"></a>
# **getSKUseller**
> GetSKUseller getSKUseller(contentType, accept, sellerId, sellerSkuId)

Get SKU seller

Retrieves the details of a seller&#39;s SKU by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SKUSellerApi()
val contentType : kotlin.String = contentType_example // kotlin.String | Describes the type of the content being sent
val accept : kotlin.String = accept_example // kotlin.String | HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand 
val sellerId : kotlin.String = sellerId_example // kotlin.String | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
val sellerSkuId : kotlin.String = sellerSkuId_example // kotlin.String | 
try {
    val result : GetSKUseller = apiInstance.getSKUseller(contentType, accept, sellerId, sellerSkuId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SKUSellerApi#getSKUseller")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SKUSellerApi#getSKUseller")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**| Describes the type of the content being sent | [default to &quot;application/json&quot;]
 **accept** | **kotlin.String**| HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  | [default to &quot;application/json&quot;]
 **sellerId** | **kotlin.String**| ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. |
 **sellerSkuId** | **kotlin.String**|  |

### Return type

[**GetSKUseller**](GetSKUseller.md)

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

