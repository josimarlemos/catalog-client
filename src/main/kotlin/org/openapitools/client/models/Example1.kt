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

import org.openapitools.client.models.Child

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id Category ID.
 * @param name Category name.
 * @param hasChildren If the category has a category child (`true`) or not (`false`).
 * @param url Category URL
 * @param children Object with information about the category's children
 */

data class Example1 (

    /* Category ID. */
    @Json(name = "id")
    val id: kotlin.Int,

    /* Category name. */
    @Json(name = "name")
    val name: kotlin.String,

    /* If the category has a category child (`true`) or not (`false`). */
    @Json(name = "hasChildren")
    val hasChildren: kotlin.Boolean,

    /* Category URL */
    @Json(name = "url")
    val url: kotlin.String,

    /* Object with information about the category's children */
    @Json(name = "children")
    val children: kotlin.collections.List<Child>

)

