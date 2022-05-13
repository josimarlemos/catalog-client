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
 * @param fieldId Specification Field ID
 * @param name Specification Field Value Name
 * @param text Specification Field Value Description
 * @param isActive If the Specification Field Value is active
 * @param position Specification Field Value Position
 */

data class SpecificationsInsertFieldValueRequest (

    /* Specification Field ID */
    @Json(name = "FieldId")
    val fieldId: kotlin.Int,

    /* Specification Field Value Name */
    @Json(name = "Name")
    val name: kotlin.String,

    /* Specification Field Value Description */
    @Json(name = "Text")
    val text: kotlin.String,

    /* If the Specification Field Value is active */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean,

    /* Specification Field Value Position */
    @Json(name = "Position")
    val position: kotlin.Int

)

