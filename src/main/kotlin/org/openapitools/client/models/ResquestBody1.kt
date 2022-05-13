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
 * @param name Collection Name
 * @param searchable Whether the Collection is searchale or not
 * @param highlight If the Collection is highlighted or not
 * @param dateFrom Initial value date for the Collection
 * @param dateTo Final value date for the Collection
 */

data class ResquestBody1 (

    /* Collection Name */
    @Json(name = "Name")
    val name: kotlin.String = "Test",

    /* Whether the Collection is searchale or not */
    @Json(name = "Searchable")
    val searchable: kotlin.Boolean = true,

    /* If the Collection is highlighted or not */
    @Json(name = "Highlight")
    val highlight: kotlin.Boolean = false,

    /* Initial value date for the Collection */
    @Json(name = "DateFrom")
    val dateFrom: kotlin.String = "2017-09-27T10:47:00",

    /* Final value date for the Collection */
    @Json(name = "DateTo")
    val dateTo: kotlin.String = "2017-09-27T10:47:00"

)

