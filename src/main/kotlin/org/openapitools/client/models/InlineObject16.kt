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
 * @param fieldTypeId Field Type ID can be `1 - Text`, `2 - Multi-Line Text`, `4 - Number`, `5 - Combo`, `6 - Radio`, `7 - Checkbox`, `8 - Indexed Text`, `9 - Indexed Multi-Line Text`.
 * @param fieldGroupId ID of the group of specifications that contains the new specification.
 * @param name Specification name.
 * @param categoryId Category ID associated with this specification.
 * @param description 
 * @param position Store Framework - Deprecated.  Classic CMS - This position number is used in ordering the specifications both in the navigation menu and in the specification listing on the product page.  
 * @param isFilter Store Framework - Deprecated.  Classic CMS - To allow the specification to be used as a facet (filter) on the search navigation bar.  
 * @param isRequired Makes the specification mandatory (`true`) or optional (`false`).
 * @param isOnProductDetails Store Framework - Deprecated.  Classic CMS -If specification is visible on the product page.  
 * @param isStockKeepingUnit If `true`, it will be added as a SKU specification. If `false`, it will be added as a product specification field.
 * @param isWizard 
 * @param isActive Enable (`true`) or disable (`false`) specification.
 * @param isTopMenuLinkActive Store Framework - Deprecated.  Classic CMS - To make the specification visible in the store's upper menu.  
 * @param isSideMenuLinkActive Store Framework - Deprecated.  Classic CMS - To make the specification field clickable in the search navigation bar.  
 * @param defaultValue Specification default value.
 */

data class InlineObject16 (

    /* Field Type ID can be `1 - Text`, `2 - Multi-Line Text`, `4 - Number`, `5 - Combo`, `6 - Radio`, `7 - Checkbox`, `8 - Indexed Text`, `9 - Indexed Multi-Line Text`. */
    @Json(name = "FieldTypeId")
    val fieldTypeId: kotlin.Int = 1,

    /* ID of the group of specifications that contains the new specification. */
    @Json(name = "FieldGroupId")
    val fieldGroupId: kotlin.Int = 22,

    /* Specification name. */
    @Json(name = "Name")
    val name: kotlin.String = "Test",

    /* Category ID associated with this specification. */
    @Json(name = "CategoryId")
    val categoryId: kotlin.Int? = 1,

    @Json(name = "Description")
    @Deprecated(message = "This property is deprecated.")
    val description: kotlin.String? = null,

    /* Store Framework - Deprecated.  Classic CMS - This position number is used in ordering the specifications both in the navigation menu and in the specification listing on the product page.   */
    @Json(name = "Position")
    val position: kotlin.Int? = 1,

    /* Store Framework - Deprecated.  Classic CMS - To allow the specification to be used as a facet (filter) on the search navigation bar.   */
    @Json(name = "IsFilter")
    val isFilter: kotlin.Boolean? = false,

    /* Makes the specification mandatory (`true`) or optional (`false`). */
    @Json(name = "IsRequired")
    val isRequired: kotlin.Boolean? = false,

    /* Store Framework - Deprecated.  Classic CMS -If specification is visible on the product page.   */
    @Json(name = "IsOnProductDetails")
    val isOnProductDetails: kotlin.Boolean? = true,

    /* If `true`, it will be added as a SKU specification. If `false`, it will be added as a product specification field. */
    @Json(name = "IsStockKeepingUnit")
    val isStockKeepingUnit: kotlin.Boolean? = false,

    @Json(name = "IsWizard")
    @Deprecated(message = "This property is deprecated.")
    val isWizard: kotlin.Boolean? = null,

    /* Enable (`true`) or disable (`false`) specification. */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean? = true,

    /* Store Framework - Deprecated.  Classic CMS - To make the specification visible in the store's upper menu.   */
    @Json(name = "IsTopMenuLinkActive")
    val isTopMenuLinkActive: kotlin.Boolean? = false,

    /* Store Framework - Deprecated.  Classic CMS - To make the specification field clickable in the search navigation bar.   */
    @Json(name = "IsSideMenuLinkActive")
    val isSideMenuLinkActive: kotlin.Boolean? = false,

    /* Specification default value. */
    @Json(name = "DefaultValue")
    val defaultValue: kotlin.String? = "Test"

)

