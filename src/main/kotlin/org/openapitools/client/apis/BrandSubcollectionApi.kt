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

import org.openapitools.client.models.RequestBody14

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

class BrandSubcollectionApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://{accountName}.{environment}.com.br")
        }
    }

    /**
    * Delete Brand SubCollection
    * Deletes a Brand from a SubCollection
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param brandId Brand???s unique numerical identifier 
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, brandId: kotlin.Int) : Unit {
        val localVarResponse = apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDeleteWithHttpInfo(contentType = contentType, accept = accept, subCollectionId = subCollectionId, brandId = brandId)

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
    * Delete Brand SubCollection
    * Deletes a Brand from a SubCollection
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param brandId Brand???s unique numerical identifier 
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDeleteWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, brandId: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDeleteRequestConfig(contentType = contentType, accept = accept, subCollectionId = subCollectionId, brandId = brandId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param brandId Brand???s unique numerical identifier 
    * @return RequestConfig
    */
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDeleteRequestConfig(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, brandId: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/catalog/pvt/subcollection/{subCollectionId}/brand/{brandId}".replace("{"+"subCollectionId"+"}", "$subCollectionId").replace("{"+"brandId"+"}", "$brandId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Associate SubCollection to Brand
    * Associates a SubCollection to a single Brand
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param requestBody14  (optional)
    * @return void
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandPost(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, requestBody14: RequestBody14?) : Unit {
        val localVarResponse = apiCatalogPvtSubcollectionSubCollectionIdBrandPostWithHttpInfo(contentType = contentType, accept = accept, subCollectionId = subCollectionId, requestBody14 = requestBody14)

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
    * Associate SubCollection to Brand
    * Associates a SubCollection to a single Brand
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param requestBody14  (optional)
    * @return ApiResponse<Unit?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandPostWithHttpInfo(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, requestBody14: RequestBody14?) : ApiResponse<Unit?> {
        val localVariableConfig = apiCatalogPvtSubcollectionSubCollectionIdBrandPostRequestConfig(contentType = contentType, accept = accept, subCollectionId = subCollectionId, requestBody14 = requestBody14)

        return request<RequestBody14, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apiCatalogPvtSubcollectionSubCollectionIdBrandPost
    *
    * @param contentType Type of the content being sent 
    * @param accept HTTP Client Negotiation _Accept_ Header. Indicates the types of responses the client can understand  
    * @param subCollectionId Subcollection???s unique numerical identifier 
    * @param requestBody14  (optional)
    * @return RequestConfig
    */
    fun apiCatalogPvtSubcollectionSubCollectionIdBrandPostRequestConfig(contentType: kotlin.String, accept: kotlin.String, subCollectionId: kotlin.Int, requestBody14: RequestBody14?) : RequestConfig<RequestBody14> {
        val localVariableBody = requestBody14
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType.apply { localVariableHeaders["Content-Type"] = this.toString() }
        accept.apply { localVariableHeaders["Accept"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/catalog/pvt/subcollection/{subCollectionId}/brand".replace("{"+"subCollectionId"+"}", "$subCollectionId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
