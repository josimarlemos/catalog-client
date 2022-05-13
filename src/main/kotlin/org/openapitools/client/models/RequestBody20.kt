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
 * @param name Supplier Name
 * @param corporateName Supplier Corporate Name
 * @param stateInscription State Inscription
 * @param cnpj Business ID
 * @param phone Supplier Phone
 * @param cellPhone Supplier Cellphone
 * @param corportePhone Supplier Corporate Phone
 * @param email Supplier email
 * @param isActive If Supplier is active or not
 */

data class RequestBody20 (

    /* Supplier Name */
    @Json(name = "Name")
    val name: kotlin.String = "",

    /* Supplier Corporate Name */
    @Json(name = "CorporateName")
    val corporateName: kotlin.String = "",

    /* State Inscription */
    @Json(name = "StateInscription")
    val stateInscription: kotlin.String = "",

    /* Business ID */
    @Json(name = "Cnpj")
    val cnpj: kotlin.String = "",

    /* Supplier Phone */
    @Json(name = "Phone")
    val phone: kotlin.String = "",

    /* Supplier Cellphone */
    @Json(name = "CellPhone")
    val cellPhone: kotlin.String = "",

    /* Supplier Corporate Phone */
    @Json(name = "CorportePhone")
    val corportePhone: kotlin.String = "",

    /* Supplier email */
    @Json(name = "Email")
    val email: kotlin.String = "",

    /* If Supplier is active or not */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean = false

)

