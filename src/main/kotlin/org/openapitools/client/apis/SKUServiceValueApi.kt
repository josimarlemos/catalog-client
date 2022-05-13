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

import org.openapitools.client.models.RequestBody10
import org.openapitools.client.models.RequestBody11

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

class SKUServiceValueApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Create SKU Service Value
    * Creates an SKU Service Value for an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody10  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicevaluePost(contentType: kotlin.String, accept: kotlin.String, requestBody10: RequestBody10?) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicevaluePostWithHttpInfo(contentType = contentType, accept = accept, requestBody10 = requestBody10)

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
    * Create SKU Service Value
    * Creates an SKU Service Value for an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody10  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicevaluePostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, requestBody10: RequestBody10?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicevaluePostRequestConfig(contentType = contentType, accept = accept, requestBody10 = requestBody10)

        return request<RequestBody10, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicevaluePost
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody10  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicevaluePostRequestConfig(contentType: kotlin.String, accept: kotlin.String, requestBody10: RequestBody10?) : RequestConfig<RequestBody10> {
        val localVariableBody = requestBody10
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog/pvt/skuservicevalue",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete SKU Service Value
    * Deletes an existing SKU Service Value
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicevalueSkuServiceValueIdDeleteWithHttpInfo(contentType = contentType, accept = accept, skuServiceValueId = skuServiceValueId)

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
    * Delete SKU Service Value
    * Deletes an existing SKU Service Value
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdDeleteWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicevalueSkuServiceValueIdDeleteRequestConfig(contentType = contentType, accept = accept, skuServiceValueId = skuServiceValueId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdDeleteRequestConfig(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/catalog/pvt/skuservicevalue/{skuServiceValueId}".replace("{"+"skuServiceValueId"+"}", "$skuServiceValueId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update SKU Service Value
    * Updates an existing SKU Service Value
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @param requestBody11  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdPut(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int, requestBody11: RequestBody11?) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicevalueSkuServiceValueIdPutWithHttpInfo(contentType = contentType, accept = accept, skuServiceValueId = skuServiceValueId, requestBody11 = requestBody11)

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
    * Update SKU Service Value
    * Updates an existing SKU Service Value
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @param requestBody11  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdPutWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int, requestBody11: RequestBody11?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicevalueSkuServiceValueIdPutRequestConfig(contentType = contentType, accept = accept, skuServiceValueId = skuServiceValueId, requestBody11 = requestBody11)

        return request<RequestBody11, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicevalueSkuServiceValueIdPut
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceValueId SKU Service Value unique identifier 
    * @param requestBody11  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicevalueSkuServiceValueIdPutRequestConfig(contentType: kotlin.String, accept: kotlin.String, skuServiceValueId: kotlin.Int, requestBody11: RequestBody11?) : RequestConfig<RequestBody11> {
        val localVariableBody = requestBody11
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/catalog/pvt/skuservicevalue/{skuServiceValueId}".replace("{"+"skuServiceValueId"+"}", "$skuServiceValueId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
