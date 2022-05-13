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

class SimilarCategoryApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Delete Similar Product Category
    * Deletes a Similar Category from a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDeleteWithHttpInfo(contentType = contentType, accept = accept, productId = productId, categoryId = categoryId)

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
    * Delete Similar Product Category
    * Deletes a Similar Category from a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDeleteWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDeleteRequestConfig(contentType = contentType, accept = accept, productId = productId, categoryId = categoryId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDeleteRequestConfig(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/catalog/pvt/product/{productId}/similarcategory/{categoryId}".replace("{"+"productId"+"}", "$productId").replace("{"+"categoryId"+"}", "$categoryId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Create Similar Product Category
    * Creates a Similar Category to a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPostWithHttpInfo(contentType = contentType, accept = accept, productId = productId, categoryId = categoryId)

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
    * Create Similar Product Category
    * Creates a Similar Category to a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPostRequestConfig(contentType = contentType, accept = accept, productId = productId, categoryId = categoryId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @param categoryId Similar Category’s unique numerical identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPostRequestConfig(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int, categoryId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog/pvt/product/{productId}/similarcategory/{categoryId}".replace("{"+"productId"+"}", "$productId").replace("{"+"categoryId"+"}", "$categoryId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Similar Product Category
    * Retrieves Similars Categories from a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryGet(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtProductProductIdSimilarcategoryGetWithHttpInfo(contentType = contentType, accept = accept, productId = productId)

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
    * Get Similar Product Category
    * Retrieves Similars Categories from a Product
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtProductProductIdSimilarcategoryGetWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtProductProductIdSimilarcategoryGetRequestConfig(contentType = contentType, accept = accept, productId = productId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtProductProductIdSimilarcategoryGet
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param productId Product’s unique numerical identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtProductProductIdSimilarcategoryGetRequestConfig(contentType: kotlin.String, accept: kotlin.String, productId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/catalog/pvt/product/{productId}/similarcategory/".replace("{"+"productId"+"}", "$productId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}