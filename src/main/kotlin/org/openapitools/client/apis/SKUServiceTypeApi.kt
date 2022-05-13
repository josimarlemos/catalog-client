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

import org.openapitools.client.models.RequestBody8
import org.openapitools.client.models.RequestBody9

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

class SKUServiceTypeApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Create SKU Service Type
    * Creates an SKU Service Type from scratch
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody8  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicetypePost(contentType: kotlin.String, accept: kotlin.String, requestBody8: RequestBody8?) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicetypePostWithHttpInfo(contentType = contentType, accept = accept, requestBody8 = requestBody8)

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
    * Create SKU Service Type
    * Creates an SKU Service Type from scratch
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody8  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicetypePostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, requestBody8: RequestBody8?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicetypePostRequestConfig(contentType = contentType, accept = accept, requestBody8 = requestBody8)

        return request<RequestBody8, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicetypePost
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param requestBody8  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicetypePostRequestConfig(contentType: kotlin.String, accept: kotlin.String, requestBody8: RequestBody8?) : RequestConfig<RequestBody8> {
        val localVariableBody = requestBody8
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog/pvt/skuservicetype",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete SKU Service Type
    * Deletes an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicetypeSkuServiceTypeIdDeleteWithHttpInfo(contentType = contentType, accept = accept, skuServiceTypeId = skuServiceTypeId)

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
    * Delete SKU Service Type
    * Deletes an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdDeleteWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicetypeSkuServiceTypeIdDeleteRequestConfig(contentType = contentType, accept = accept, skuServiceTypeId = skuServiceTypeId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdDeleteRequestConfig(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/catalog/pvt/skuservicetype/{skuServiceTypeId}".replace("{"+"skuServiceTypeId"+"}", "$skuServiceTypeId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update SKU Service Type
    * Updates an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @param requestBody9  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int, requestBody9: RequestBody9?) : Unit {
        val localVarResponse = apiCatalogPvtSkuservicetypeSkuServiceTypeIdPutWithHttpInfo(contentType = contentType, accept = accept, skuServiceTypeId = skuServiceTypeId, requestBody9 = requestBody9)

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
    * Update SKU Service Type
    * Updates an existing SKU Service Type
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @param requestBody9  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdPutWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int, requestBody9: RequestBody9?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSkuservicetypeSkuServiceTypeIdPutRequestConfig(contentType = contentType, accept = accept, skuServiceTypeId = skuServiceTypeId, requestBody9 = requestBody9)

        return request<RequestBody9, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param skuServiceTypeId SKU Service Type unique identifier 
    * @param requestBody9  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSkuservicetypeSkuServiceTypeIdPutRequestConfig(contentType: kotlin.String, accept: kotlin.String, skuServiceTypeId: kotlin.Int, requestBody9: RequestBody9?) : RequestConfig<RequestBody9> {
        val localVariableBody = requestBody9
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/catalog/pvt/skuservicetype/{skuServiceTypeId}".replace("{"+"skuServiceTypeId"+"}", "$skuServiceTypeId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
