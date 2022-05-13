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
 * @param productId Product's ID associated with this SKU.
 * @param name SKU name, meaning the variation of the previously added product. For example: **Product** - _Fridge_, **SKU** - _110V_.
 * @param packagedHeight Height used for shipping calculation.
 * @param packagedLength Length used for shipping calculation.
 * @param packagedWidth Width used for shipping calculation.
 * @param packagedWeightKg Weight used for shipping calculation.
 * @param isActive Shows if the SKU is active (`true`) or not (`false`).
 * @param refId Reference code used internally for organizational purposes. Must be unique. It is not required only if EAN code already exists. If not, this field must be provided.
 * @param height SKU real height.
 * @param length SKU real length.
 * @param width SKU real width.
 * @param weightKg SKU Weight.
 * @param cubicWeight [Cubic weight](https://help.vtex.com/en/tutorial/understanding-the-cubic-weight-factor--tutorials_128).
 * @param isKit Flag to set whether the product SKU is made up of one or more SKUs, thereby becoming a bundle. Must be enabled if you are adding a bundle. Once activated, the flag cannot be reverted.
 * @param creationDate Date and time of the SKU's creation.
 * @param rewardValue Credit that the customer receives when finalizing an order of one specific SKU unit. By filling this field out with `1`, the customer gets U$ 1 credit on the site.
 * @param estimatedDateArrival To add the product as pre-sale, enter the product estimated arrival date. You must take into consideration both the launch date and the freight calculation for the arrival date.
 * @param manufacturerCode Provided by the manufacturers to identify their product. This field should be completed if the product has a specific manufacturer’s code.
 * @param commercialConditionId Used to define SKU specific promotions or installment rules. Find out more by reading the Commercial Condition article. In case of no specific condition, use the default value.
 * @param measurementUnit Used only in cases when you need to convert the unit of measure for sale. If a product is sold in boxes for example, but customers want to buy per square meter (m²). In common cases, use `'un'`.
 * @param unitMultiplier This is the multiple number of SKU. If the Multiplier is 5, the product can be added in multiple quantities of 5, 10, 15, 20, onward.
 * @param modalType Links an unusual type of product to a carrier specialized in delivering it. To learn more about this feature, read our articles [How the modal works](https://help.vtex.com/en/tutorial/how-does-the-modal-work--tutorials_125) and [Setting up modal for carriers](https://help.vtex.com/en/tutorial/configure-modal--3jhLqxuPhuiq24UoykCcqy).
 * @param kitItensSellApart Defines if Kit components can be sold apart
 * @param activateIfPossible When set to `true`, this attribute will automatically update the SKU as active once associated with an image or an active component.
 */

data class InlineObject5 (

    /* Product's ID associated with this SKU. */
    @Json(name = "ProductId")
    val productId: kotlin.Int,

    /* SKU name, meaning the variation of the previously added product. For example: **Product** - _Fridge_, **SKU** - _110V_. */
    @Json(name = "Name")
    val name: kotlin.String,

    /* Height used for shipping calculation. */
    @Json(name = "PackagedHeight")
    val packagedHeight: java.math.BigDecimal,

    /* Length used for shipping calculation. */
    @Json(name = "PackagedLength")
    val packagedLength: java.math.BigDecimal,

    /* Width used for shipping calculation. */
    @Json(name = "PackagedWidth")
    val packagedWidth: java.math.BigDecimal,

    /* Weight used for shipping calculation. */
    @Json(name = "PackagedWeightKg")
    val packagedWeightKg: kotlin.Int,

    /* Shows if the SKU is active (`true`) or not (`false`). */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean? = null,

    /* Reference code used internally for organizational purposes. Must be unique. It is not required only if EAN code already exists. If not, this field must be provided. */
    @Json(name = "RefId")
    val refId: kotlin.String? = null,

    /* SKU real height. */
    @Json(name = "Height")
    val height: java.math.BigDecimal? = null,

    /* SKU real length. */
    @Json(name = "Length")
    val length: java.math.BigDecimal? = null,

    /* SKU real width. */
    @Json(name = "Width")
    val width: java.math.BigDecimal? = null,

    /* SKU Weight. */
    @Json(name = "WeightKg")
    val weightKg: java.math.BigDecimal? = null,

    /* [Cubic weight](https://help.vtex.com/en/tutorial/understanding-the-cubic-weight-factor--tutorials_128). */
    @Json(name = "CubicWeight")
    val cubicWeight: java.math.BigDecimal? = null,

    /* Flag to set whether the product SKU is made up of one or more SKUs, thereby becoming a bundle. Must be enabled if you are adding a bundle. Once activated, the flag cannot be reverted. */
    @Json(name = "IsKit")
    val isKit: kotlin.Boolean? = null,

    /* Date and time of the SKU's creation. */
    @Json(name = "CreationDate")
    val creationDate: kotlin.String? = null,

    /* Credit that the customer receives when finalizing an order of one specific SKU unit. By filling this field out with `1`, the customer gets U$ 1 credit on the site. */
    @Json(name = "RewardValue")
    val rewardValue: java.math.BigDecimal? = null,

    /* To add the product as pre-sale, enter the product estimated arrival date. You must take into consideration both the launch date and the freight calculation for the arrival date. */
    @Json(name = "EstimatedDateArrival")
    val estimatedDateArrival: kotlin.String? = null,

    /* Provided by the manufacturers to identify their product. This field should be completed if the product has a specific manufacturer’s code. */
    @Json(name = "ManufacturerCode")
    val manufacturerCode: kotlin.String? = null,

    /* Used to define SKU specific promotions or installment rules. Find out more by reading the Commercial Condition article. In case of no specific condition, use the default value. */
    @Json(name = "CommercialConditionId")
    val commercialConditionId: kotlin.Int? = null,

    /* Used only in cases when you need to convert the unit of measure for sale. If a product is sold in boxes for example, but customers want to buy per square meter (m²). In common cases, use `'un'`. */
    @Json(name = "MeasurementUnit")
    val measurementUnit: kotlin.String? = null,

    /* This is the multiple number of SKU. If the Multiplier is 5, the product can be added in multiple quantities of 5, 10, 15, 20, onward. */
    @Json(name = "UnitMultiplier")
    val unitMultiplier: kotlin.Int? = null,

    /* Links an unusual type of product to a carrier specialized in delivering it. To learn more about this feature, read our articles [How the modal works](https://help.vtex.com/en/tutorial/how-does-the-modal-work--tutorials_125) and [Setting up modal for carriers](https://help.vtex.com/en/tutorial/configure-modal--3jhLqxuPhuiq24UoykCcqy). */
    @Json(name = "ModalType")
    val modalType: kotlin.String? = null,

    /* Defines if Kit components can be sold apart */
    @Json(name = "KitItensSellApart")
    val kitItensSellApart: kotlin.Boolean? = null,

    /* When set to `true`, this attribute will automatically update the SKU as active once associated with an image or an active component. */
    @Json(name = "ActivateIfPossible")
    val activateIfPossible: kotlin.Boolean? = null

)

