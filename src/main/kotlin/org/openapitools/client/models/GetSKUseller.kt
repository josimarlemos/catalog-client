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
 * @param isPersisted 
 * @param isRemoved 
 * @param skuSellerId 
 * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
 * @param stockKeepingUnitId 
 * @param sellerStockKeepingUnitId 
 * @param isActive 
 * @param updateDate 
 * @param requestedUpdateDate 
 */

data class GetSKUseller (

    @Json(name = "IsPersisted")
    val isPersisted: kotlin.Boolean,

    @Json(name = "IsRemoved")
    val isRemoved: kotlin.Boolean,

    @Json(name = "SkuSellerId")
    val skuSellerId: kotlin.Int,

    /* ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. */
    @Json(name = "SellerId")
    val sellerId: kotlin.String,

    @Json(name = "StockKeepingUnitId")
    val stockKeepingUnitId: kotlin.Int,

    @Json(name = "SellerStockKeepingUnitId")
    val sellerStockKeepingUnitId: kotlin.String,

    @Json(name = "IsActive")
    val isActive: kotlin.Boolean,

    @Json(name = "UpdateDate")
    val updateDate: kotlin.String,

    @Json(name = "RequestedUpdateDate")
    val requestedUpdateDate: kotlin.String?

)
