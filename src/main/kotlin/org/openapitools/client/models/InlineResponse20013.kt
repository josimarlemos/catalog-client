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
 * @param id ID of the association of the specification and the SKU. This ID is used to update or delete the specification.
 * @param skuId SKU ID.
 * @param fieldId Specification ID.
 * @param fieldValueId Specification Value ID. Required only for `FieldTypeId` as `5`, `6` and `7`.
 * @param text Value of specification. Only for `FieldTypeId` different from `5`, `6` and `7`.
 */

data class InlineResponse20013 (

    /* ID of the association of the specification and the SKU. This ID is used to update or delete the specification. */
    @Json(name = "Id")
    val id: kotlin.Int? = null,

    /* SKU ID. */
    @Json(name = "SkuId")
    val skuId: kotlin.Int? = null,

    /* Specification ID. */
    @Json(name = "FieldId")
    val fieldId: kotlin.Int? = null,

    /* Specification Value ID. Required only for `FieldTypeId` as `5`, `6` and `7`. */
    @Json(name = "FieldValueId")
    val fieldValueId: kotlin.Int? = null,

    /* Value of specification. Only for `FieldTypeId` different from `5`, `6` and `7`. */
    @Json(name = "Text")
    val text: kotlin.String? = null

)
