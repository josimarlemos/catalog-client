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

import org.openapitools.client.models.InlineObject16
import org.openapitools.client.models.InlineResponse20019
import org.openapitools.client.models.RequestBody16
import org.openapitools.client.models.RequestBody17

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

class SpecificationApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Create Specification
    * Creates a new Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param inlineObject16  (optional)
    * @return InlineResponse20019
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSpecificationPost(contentType: kotlin.String, accept: kotlin.String, inlineObject16: InlineObject16?) : InlineResponse20019 {
        val localVarResponse = apiCatalogPvtSpecificationPostWithHttpInfo(contentType = contentType, accept = accept, inlineObject16 = inlineObject16)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InlineResponse20019
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
    * Create Specification
    * Creates a new Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param inlineObject16  (optional)
    * @return ApiResponse<InlineResponse20019?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSpecificationPostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, inlineObject16: InlineObject16?) : ApiResponse<InlineResponse20019?> {
        val localVariableConfig = apiCatalogPvtSpecificationPostRequestConfig(contentType = contentType, accept = accept, inlineObject16 = inlineObject16)

        return request<InlineObject16, InlineResponse20019>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSpecificationPost
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param inlineObject16  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSpecificationPostRequestConfig(contentType: kotlin.String, accept: kotlin.String, inlineObject16: InlineObject16?) : RequestConfig<InlineObject16> {
        val localVariableBody = inlineObject16
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog/pvt/specification",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Specification
    * Retrieves information of a Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @return RequestBody16
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSpecificationSpecificationIdGet(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int) : RequestBody16 {
        val localVarResponse = apiCatalogPvtSpecificationSpecificationIdGetWithHttpInfo(contentType = contentType, accept = accept, specificationId = specificationId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RequestBody16
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
    * Get Specification
    * Retrieves information of a Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @return ApiResponse<RequestBody16?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSpecificationSpecificationIdGetWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int) : ApiResponse<RequestBody16?> {
        val localVariableConfig = apiCatalogPvtSpecificationSpecificationIdGetRequestConfig(contentType = contentType, accept = accept, specificationId = specificationId)

        return request<Unit, RequestBody16>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSpecificationSpecificationIdGet
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtSpecificationSpecificationIdGetRequestConfig(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/catalog/pvt/specification/{specificationId}".replace("{"+"specificationId"+"}", "$specificationId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update Specification
    * Updates a Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @param requestBody17  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSpecificationSpecificationIdPut(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int, requestBody17: RequestBody17?) : Unit {
        val localVarResponse = apiCatalogPvtSpecificationSpecificationIdPutWithHttpInfo(contentType = contentType, accept = accept, specificationId = specificationId, requestBody17 = requestBody17)

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
    * Update Specification
    * Updates a Product or SKU Specification
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @param requestBody17  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSpecificationSpecificationIdPutWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int, requestBody17: RequestBody17?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSpecificationSpecificationIdPutRequestConfig(contentType = contentType, accept = accept, specificationId = specificationId, requestBody17 = requestBody17)

        return request<RequestBody17, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSpecificationSpecificationIdPut
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationId Specification’s unique numerical identifier 
    * @param requestBody17  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSpecificationSpecificationIdPutRequestConfig(contentType: kotlin.String, accept: kotlin.String, specificationId: kotlin.Int, requestBody17: RequestBody17?) : RequestConfig<RequestBody17> {
        val localVariableBody = requestBody17
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/catalog/pvt/specification/{specificationId}".replace("{"+"specificationId"+"}", "$specificationId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}