/**
 * Catalog API
 *
 * Methods for collecting product/sku catalog data, categories, brands and other information. <br><br> All content that comes between {{}} keys must be replaced with the correct data before performing the request. <br><br> Common parameters that must be changed in most VTEX requests <br> {{accountName}} => Store account name <br> {{environment}} => The environment that will be called. Change for vtexcommercestable or vtexcommmercebeta <br> {{X-VTEX-API-AppKey}} => Located in the headers of the requests, user authentication key <br> {{X-VTEX-API-AppToken}} => Located in the headers of the requests, authentication password
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException

import org.openapitools.client.models.GetSKUseller

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class SKUSellerApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Change Notification with Seller ID and Seller SKU ID
    * The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  There are two information expected by the marketplace in this request: the &#x60;sellerId&#x60;, which identifies the seller, and the &#x60;sellerSkuId&#x60;, which identifies the binding of the seller with the SKU.  Both information are passed through the request URL. The body of the request should be empty.
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId ID of the binding of the seller with the SKU. 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : Unit {
        val localVarResponse = apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPostWithHttpInfo(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Change Notification with Seller ID and Seller SKU ID
    * The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  There are two information expected by the marketplace in this request: the &#x60;sellerId&#x60;, which identifies the seller, and the &#x60;sellerSkuId&#x60;, which identifies the binding of the seller with the SKU.  Both information are passed through the request URL. The body of the request should be empty.
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId ID of the binding of the seller with the SKU. 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPostRequestConfig(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost
    *
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId ID of the binding of the seller with the SKU. 
    * @return RequestConfig
    */
    fun apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPostRequestConfig(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog_system/pvt/skuseller/changenotification/{sellerId}/{sellerSkuId}".replace("{"+"sellerId"+"}", "$sellerId").replace("{"+"sellerSkuId"+"}", "$sellerSkuId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Change Notification with SKU ID
    * The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  The body of the request should be empty.
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuId A string that identifies the SKU in the marketplace. This is the ID that the marketplace will use to look for the SKU whose change the seller wants to inform. If the marketplace finds this ID, it responds with status code 200. Otherwise, it responds with status code 404. 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun changeNotification(contentType: kotlin.String, accept: kotlin.String, skuId: kotlin.String) : Unit {
        val localVarResponse = changeNotificationWithHttpInfo(contentType = contentType, accept = accept, skuId = skuId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Change Notification with SKU ID
    * The seller is responsible for suggesting new SKUs to be sold in the VTEX marketplace and also for informing the marketplace about changes in their SKUs that already exist in the marketplace. Both actions start with a catalog notification, which is made by this request./n/nWith this notification, the seller is telling the marketplace that something has changed about a specific SKU, like price or inventory, or that this is a new SKU that the seller would like to offer to the marketplace.  The body of the request should be empty.
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuId A string that identifies the SKU in the marketplace. This is the ID that the marketplace will use to look for the SKU whose change the seller wants to inform. If the marketplace finds this ID, it responds with status code 200. Otherwise, it responds with status code 404. 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun changeNotificationWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, skuId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = changeNotificationRequestConfig(contentType = contentType, accept = accept, skuId = skuId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation changeNotification
    *
    * @param contentType Describes the type of the content being sent. 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuId A string that identifies the SKU in the marketplace. This is the ID that the marketplace will use to look for the SKU whose change the seller wants to inform. If the marketplace finds this ID, it responds with status code 200. Otherwise, it responds with status code 404. 
    * @return RequestConfig
    */
    fun changeNotificationRequestConfig(contentType: kotlin.String, accept: kotlin.String, skuId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog_system/pvt/skuseller/changenotification/{skuId}".replace("{"+"skuId"+"}", "$skuId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete an SKU seller association
    * Remove the Seller SKU binding
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteSKUsellerassociation(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : Unit {
        val localVarResponse = deleteSKUsellerassociationWithHttpInfo(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Delete an SKU seller association
    * Remove the Seller SKU binding
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteSKUsellerassociationWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteSKUsellerassociationRequestConfig(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation deleteSKUsellerassociation
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return RequestConfig
    */
    fun deleteSKUsellerassociationRequestConfig(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog_system/pvt/skuseller/remove/{sellerId}/{sellerSkuId}".replace("{"+"sellerId"+"}", "$sellerId").replace("{"+"sellerSkuId"+"}", "$sellerSkuId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get SKU seller
    * Retrieves the details of a seller&#39;s SKU by its ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return GetSKUseller
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSKUseller(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : GetSKUseller {
        val localVarResponse = getSKUsellerWithHttpInfo(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetSKUseller
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get SKU seller
    * Retrieves the details of a seller&#39;s SKU by its ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return ApiResponse<GetSKUseller?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getSKUsellerWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : ApiResponse<GetSKUseller?> {
        val localVariableConfig = getSKUsellerRequestConfig(contentType = contentType, accept = accept, sellerId = sellerId, sellerSkuId = sellerSkuId)

        return request<Unit, GetSKUseller>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation getSKUseller
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. 
    * @param sellerSkuId  
    * @return RequestConfig
    */
    fun getSKUsellerRequestConfig(contentType: kotlin.String, accept: kotlin.String, sellerId: kotlin.String, sellerSkuId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/catalog_system/pvt/skuseller/{sellerId}/{sellerSkuId}".replace("{"+"sellerId"+"}", "$sellerId").replace("{"+"sellerSkuId"+"}", "$sellerSkuId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
