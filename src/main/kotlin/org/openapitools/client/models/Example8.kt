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

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param _123 
 * @param D25133K_B2 
 * @param _14_556 
 * @param DCF880L2_BR 
 */

data class Example8 (

    @Json(name = "123")
    val _123: kotlin.String?,

    @Json(name = "D25133K-B2")
    val D25133K_B2: kotlin.String,

    @Json(name = "14-556")
    val _14_556: kotlin.String,

    @Json(name = "DCF880L2-BR")
    val DCF880L2_BR: kotlin.String

)

