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

import org.openapitools.client.models.Example10
import org.openapitools.client.models.SpecificationsInsertFieldValueRequest
import org.openapitools.client.models.SpecificationsUpdateFieldValueRequest

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

class SpecificationFieldValueApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Get Specifications Field Value
    * Retrieves details from a specification field&#39;s value by this value&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldValueId  
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun specificationsGetFieldValue(contentType: kotlin.String, accept: kotlin.String, fieldValueId: kotlin.String) : Unit {
        val localVarResponse = specificationsGetFieldValueWithHttpInfo(contentType = contentType, accept = accept, fieldValueId = fieldValueId)

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
    * Get Specifications Field Value
    * Retrieves details from a specification field&#39;s value by this value&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldValueId  
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun specificationsGetFieldValueWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, fieldValueId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = specificationsGetFieldValueRequestConfig(contentType = contentType, accept = accept, fieldValueId = fieldValueId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation specificationsGetFieldValue
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldValueId  
    * @return RequestConfig
    */
    fun specificationsGetFieldValueRequestConfig(contentType: kotlin.String, accept: kotlin.String, fieldValueId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/catalog_system/pvt/specification/fieldValue/{fieldValueId}".replace("{"+"fieldValueId"+"}", "$fieldValueId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Create Specifications Field Value
    * Creates a specification field value by the specification field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsInsertFieldValueRequest  
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun specificationsInsertFieldValue(contentType: kotlin.String, accept: kotlin.String, specificationsInsertFieldValueRequest: SpecificationsInsertFieldValueRequest) : Unit {
        val localVarResponse = specificationsInsertFieldValueWithHttpInfo(contentType = contentType, accept = accept, specificationsInsertFieldValueRequest = specificationsInsertFieldValueRequest)

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
    * Create Specifications Field Value
    * Creates a specification field value by the specification field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsInsertFieldValueRequest  
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun specificationsInsertFieldValueWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, specificationsInsertFieldValueRequest: SpecificationsInsertFieldValueRequest) : ApiResponse<Unit?> {
        val localVariableConfig = specificationsInsertFieldValueRequestConfig(contentType = contentType, accept = accept, specificationsInsertFieldValueRequest = specificationsInsertFieldValueRequest)

        return request<SpecificationsInsertFieldValueRequest, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation specificationsInsertFieldValue
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsInsertFieldValueRequest  
    * @return RequestConfig
    */
    fun specificationsInsertFieldValueRequestConfig(contentType: kotlin.String, accept: kotlin.String, specificationsInsertFieldValueRequest: SpecificationsInsertFieldValueRequest) : RequestConfig<SpecificationsInsertFieldValueRequest> {
        val localVariableBody = specificationsInsertFieldValueRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog_system/pvt/specification/fieldValue",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update Specifications Field Value
    * Updates a specification field value by the specification field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsUpdateFieldValueRequest  
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun specificationsUpdateFieldValue(contentType: kotlin.String, accept: kotlin.String, specificationsUpdateFieldValueRequest: SpecificationsUpdateFieldValueRequest) : Unit {
        val localVarResponse = specificationsUpdateFieldValueWithHttpInfo(contentType = contentType, accept = accept, specificationsUpdateFieldValueRequest = specificationsUpdateFieldValueRequest)

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
    * Update Specifications Field Value
    * Updates a specification field value by the specification field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsUpdateFieldValueRequest  
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun specificationsUpdateFieldValueWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, specificationsUpdateFieldValueRequest: SpecificationsUpdateFieldValueRequest) : ApiResponse<Unit?> {
        val localVariableConfig = specificationsUpdateFieldValueRequestConfig(contentType = contentType, accept = accept, specificationsUpdateFieldValueRequest = specificationsUpdateFieldValueRequest)

        return request<SpecificationsUpdateFieldValueRequest, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation specificationsUpdateFieldValue
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param specificationsUpdateFieldValueRequest  
    * @return RequestConfig
    */
    fun specificationsUpdateFieldValueRequestConfig(contentType: kotlin.String, accept: kotlin.String, specificationsUpdateFieldValueRequest: SpecificationsUpdateFieldValueRequest) : RequestConfig<SpecificationsUpdateFieldValueRequest> {
        val localVariableBody = specificationsUpdateFieldValueRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/catalog_system/pvt/specification/fieldValue",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get Specifications Values By Field Id
    * Gets a list of all specification values from a Specification Field by this field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldId Specification Field ID 
    * @return kotlin.collections.List<Example10>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun specificationsValuesByFieldId(contentType: kotlin.String, accept: kotlin.String, fieldId: kotlin.Int) : kotlin.collections.List<Example10> {
        val localVarResponse = specificationsValuesByFieldIdWithHttpInfo(contentType = contentType, accept = accept, fieldId = fieldId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Example10>
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
    * Get Specifications Values By Field Id
    * Gets a list of all specification values from a Specification Field by this field&#39;s ID.
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldId Specification Field ID 
    * @return ApiResponse<kotlin.collections.List<Example10>?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun specificationsValuesByFieldIdWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, fieldId: kotlin.Int) : ApiResponse<kotlin.collections.List<Example10>?> {
        val localVariableConfig = specificationsValuesByFieldIdRequestConfig(contentType = contentType, accept = accept, fieldId = fieldId)

        return request<Unit, kotlin.collections.List<Example10>>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation specificationsValuesByFieldId
    *
    * @param contentType Describes the type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param fieldId Specification Field ID 
    * @return RequestConfig
    */
    fun specificationsValuesByFieldIdRequestConfig(contentType: kotlin.String, accept: kotlin.String, fieldId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/catalog_system/pub/specification/fieldvalue/{fieldId}".replace("{"+"fieldId"+"}", "$fieldId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
