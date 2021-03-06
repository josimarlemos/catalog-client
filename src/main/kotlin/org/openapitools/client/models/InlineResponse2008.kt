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
 * @param id SKU ID.
 * @param productId Product ID.
 * @param isActive Shows if the SKU is active (`true`) or not (`false`).
 * @param activateIfPossible When set to `true`, this attribute will automatically update the SKU as active once associated with an image or an active component.
 * @param name SKU Name.
 * @param refId SKU RefId.
 * @param packagedHeight Packaged Height.
 * @param packagedLength Packaged Length.
 * @param packagedWidth Packaged Width.
 * @param packagedWeightKg Packaged Weight in Kilos.
 * @param height SKU Height.
 * @param length SKU Length.
 * @param width SKU Width.
 * @param weightKg SKU Weight in Kilos.
 * @param cubicWeight [Cubic Weight](https://help.vtex.com/tutorial/understanding-the-cubic-weight-factor--tutorials_128).
 * @param isKit Shows if the SKU is a Kit (`true`) or not (`false`).
 * @param creationDate SKU Creation Date.
 * @param rewardValue How much the client will get rewarded by buying the SKU.
 * @param estimatedDateArrival An explanation about the purpose of this instance.
 * @param manufacturerCode SKU Estimated Date Arrival.
 * @param commercialConditionId Manufacturer Code.
 * @param measurementUnit Commercial Condition ID.
 * @param unitMultiplier Measurement Unit.
 * @param modalType Multiplies the amount of SKUs inserted on the cart.
 * @param kitItensSellApart Defines if Kit components can be sold apart.
 * @param videos Video URLs.
 */

data class InlineResponse2008 (

    /* SKU ID. */
    @Json(name = "Id")
    val id: kotlin.Int? = null,

    /* Product ID. */
    @Json(name = "ProductId")
    val productId: kotlin.Int? = null,

    /* Shows if the SKU is active (`true`) or not (`false`). */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean? = null,

    /* When set to `true`, this attribute will automatically update the SKU as active once associated with an image or an active component. */
    @Json(name = "ActivateIfPossible")
    val activateIfPossible: kotlin.Boolean? = null,

    /* SKU Name. */
    @Json(name = "Name")
    val name: kotlin.String? = null,

    /* SKU RefId. */
    @Json(name = "RefId")
    val refId: kotlin.String? = null,

    /* Packaged Height. */
    @Json(name = "PackagedHeight")
    val packagedHeight: java.math.BigDecimal? = null,

    /* Packaged Length. */
    @Json(name = "PackagedLength")
    val packagedLength: java.math.BigDecimal? = null,

    /* Packaged Width. */
    @Json(name = "PackagedWidth")
    val packagedWidth: java.math.BigDecimal? = null,

    /* Packaged Weight in Kilos. */
    @Json(name = "PackagedWeightKg")
    val packagedWeightKg: java.math.BigDecimal? = null,

    /* SKU Height. */
    @Json(name = "Height")
    val height: java.math.BigDecimal? = null,

    /* SKU Length. */
    @Json(name = "Length")
    val length: java.math.BigDecimal? = null,

    /* SKU Width. */
    @Json(name = "Width")
    val width: java.math.BigDecimal? = null,

    /* SKU Weight in Kilos. */
    @Json(name = "WeightKg")
    val weightKg: java.math.BigDecimal? = null,

    /* [Cubic Weight](https://help.vtex.com/tutorial/understanding-the-cubic-weight-factor--tutorials_128). */
    @Json(name = "CubicWeight")
    val cubicWeight: java.math.BigDecimal? = null,

    /* Shows if the SKU is a Kit (`true`) or not (`false`). */
    @Json(name = "IsKit")
    val isKit: kotlin.Boolean? = null,

    /* SKU Creation Date. */
    @Json(name = "CreationDate")
    val creationDate: kotlin.String? = null,

    /* How much the client will get rewarded by buying the SKU. */
    @Json(name = "RewardValue")
    val rewardValue: java.math.BigDecimal? = null,

    /* An explanation about the purpose of this instance. */
    @Json(name = "EstimatedDateArrival")
    val estimatedDateArrival: kotlin.String? = null,

    /* SKU Estimated Date Arrival. */
    @Json(name = "ManufacturerCode")
    val manufacturerCode: kotlin.String? = null,

    /* Manufacturer Code. */
    @Json(name = "CommercialConditionId")
    val commercialConditionId: kotlin.Int? = null,

    /* Commercial Condition ID. */
    @Json(name = "MeasurementUnit")
    val measurementUnit: kotlin.String? = null,

    /* Measurement Unit. */
    @Json(name = "UnitMultiplier")
    val unitMultiplier: java.math.BigDecimal? = null,

    /* Multiplies the amount of SKUs inserted on the cart. */
    @Json(name = "ModalType")
    val modalType: kotlin.String? = null,

    /* Defines if Kit components can be sold apart. */
    @Json(name = "KitItensSellApart")
    val kitItensSellApart: kotlin.Boolean? = null,

    /* Video URLs. */
    @Json(name = "Videos")
    val videos: kotlin.String? = null

)

