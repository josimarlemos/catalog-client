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
 * @param id Created Specification’s ID
 * @param fieldTypeId Field Type can be `1 - Text`, `2 - Multi-Line Text`, `4 - Number`, `5 - Combo`, `6 - Radio`, `7 - Checkbox`, `8 - Indexed Text`, `9 - Indexed Multi-Line Text`
 * @param categoryId Specification Category ID
 * @param fieldGroupId Numerical ID of the Group of Specifications that contains the new Specification
 * @param name Specification Name
 * @param description Specification Description
 * @param position The current Specification position in comparison to the others
 * @param isFilter If the Specification can be used as a Filter
 * @param isRequired If the Specification is required or not
 * @param isOnProductDetails If the Specification will be  shown on the Product screen in the specification area
 * @param isStockKeepingUnit If the Specification is applied to a specific SKU
 * @param isWizard Deprecated
 * @param isActive If the Specification is active or not 
 * @param isTopMenuLinkActive Shows if the Specification is shown in the main menu of the site
 * @param isSideMenuLinkActive Shows if the Specification is shown in the side menu  
 * @param defaultValue Specification Default Value 
 */

data class RequestBody16 (

    /* Created Specification’s ID */
    @Json(name = "Id")
    val id: kotlin.Int = 32,

    /* Field Type can be `1 - Text`, `2 - Multi-Line Text`, `4 - Number`, `5 - Combo`, `6 - Radio`, `7 - Checkbox`, `8 - Indexed Text`, `9 - Indexed Multi-Line Text` */
    @Json(name = "FieldTypeId")
    val fieldTypeId: kotlin.Int = 1,

    /* Specification Category ID */
    @Json(name = "CategoryId")
    val categoryId: kotlin.Int = 0,

    /* Numerical ID of the Group of Specifications that contains the new Specification */
    @Json(name = "FieldGroupId")
    val fieldGroupId: kotlin.Int = 0,

    /* Specification Name */
    @Json(name = "Name")
    val name: kotlin.String = "",

    /* Specification Description */
    @Json(name = "Description")
    val description: kotlin.String = "",

    /* The current Specification position in comparison to the others */
    @Json(name = "Position")
    val position: kotlin.Int = 0,

    /* If the Specification can be used as a Filter */
    @Json(name = "IsFilter")
    val isFilter: kotlin.Boolean = false,

    /* If the Specification is required or not */
    @Json(name = "IsRequired")
    val isRequired: kotlin.Boolean = false,

    /* If the Specification will be  shown on the Product screen in the specification area */
    @Json(name = "IsOnProductDetails")
    val isOnProductDetails: kotlin.Boolean = false,

    /* If the Specification is applied to a specific SKU */
    @Json(name = "IsStockKeepingUnit")
    val isStockKeepingUnit: kotlin.Boolean = false,

    /* Deprecated */
    @Json(name = "IsWizard")
    @Deprecated(message = "This property is deprecated.")
    val isWizard: kotlin.Boolean = false,

    /* If the Specification is active or not  */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean = false,

    /* Shows if the Specification is shown in the main menu of the site */
    @Json(name = "IsTopMenuLinkActive")
    val isTopMenuLinkActive: kotlin.Boolean = false,

    /* Shows if the Specification is shown in the side menu   */
    @Json(name = "IsSideMenuLinkActive")
    val isSideMenuLinkActive: kotlin.Boolean = false,

    /* Specification Default Value  */
    @Json(name = "DefaultValue")
    val defaultValue: kotlin.String? = ""

)

