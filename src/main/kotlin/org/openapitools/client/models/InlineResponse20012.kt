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
 * @param id ID of the association of the SKU and the image (`SkuFileId`). This is the ID that is used to update or delete it.
 * @param archiveId Unique identifier of the image file.
 * @param skuId SKU ID.
 * @param isMain Set the image as the main image for the product.
 * @param label Image label.
 */

data class InlineResponse20012 (

    /* ID of the association of the SKU and the image (`SkuFileId`). This is the ID that is used to update or delete it. */
    @Json(name = "Id")
    val id: kotlin.Int? = null,

    /* Unique identifier of the image file. */
    @Json(name = "ArchiveId")
    val archiveId: kotlin.Int? = null,

    /* SKU ID. */
    @Json(name = "SkuId")
    val skuId: kotlin.Int? = null,

    /* Set the image as the main image for the product. */
    @Json(name = "IsMain")
    val isMain: kotlin.Boolean? = null,

    /* Image label. */
    @Json(name = "Label")
    val label: kotlin.String? = null

)

