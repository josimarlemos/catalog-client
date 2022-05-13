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

import org.openapitools.client.models.AlternateIds
import org.openapitools.client.models.Attachment
import org.openapitools.client.models.Dimension
import org.openapitools.client.models.Image
import org.openapitools.client.models.ProductSpecification
import org.openapitools.client.models.RealDimension
import org.openapitools.client.models.SkuSeller
import org.openapitools.client.models.SkuSpecification

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param productId 
 * @param nameComplete 
 * @param productName 
 * @param productDescription 
 * @param skuName 
 * @param isActive 
 * @param isTransported 
 * @param isInventoried 
 * @param isGiftCardRecharge 
 * @param imageUrl 
 * @param detailUrl 
 * @param csCIdentification 
 * @param brandId 
 * @param brandName 
 * @param dimension 
 * @param realDimension 
 * @param manufacturerCode 
 * @param isKit 
 * @param kitItems 
 * @param services 
 * @param categories 
 * @param attachments 
 * @param collections 
 * @param skuSellers 
 * @param salesChannels 
 * @param images 
 * @param skuSpecifications 
 * @param productSpecifications 
 * @param productClustersIds 
 * @param productCategoryIds 
 * @param productGlobalCategoryId 
 * @param productCategories 
 * @param commercialConditionId 
 * @param rewardValue 
 * @param alternateIds 
 * @param alternateIdValues 
 * @param estimatedDateArrival 
 * @param measurementUnit 
 * @param unitMultiplier 
 * @param informationSource 
 * @param modalType 
 */

data class Example4 (

    @Json(name = "Id")
    val id: kotlin.Int,

    @Json(name = "ProductId")
    val productId: kotlin.Int,

    @Json(name = "NameComplete")
    val nameComplete: kotlin.String,

    @Json(name = "ProductName")
    val productName: kotlin.String,

    @Json(name = "ProductDescription")
    val productDescription: kotlin.String,

    @Json(name = "SkuName")
    val skuName: kotlin.String,

    @Json(name = "IsActive")
    val isActive: kotlin.Boolean,

    @Json(name = "IsTransported")
    val isTransported: kotlin.Boolean,

    @Json(name = "IsInventoried")
    val isInventoried: kotlin.Boolean,

    @Json(name = "IsGiftCardRecharge")
    val isGiftCardRecharge: kotlin.Boolean,

    @Json(name = "ImageUrl")
    val imageUrl: kotlin.String,

    @Json(name = "DetailUrl")
    val detailUrl: kotlin.String,

    @Json(name = "CSCIdentification")
    val csCIdentification: kotlin.String?,

    @Json(name = "BrandId")
    val brandId: kotlin.String,

    @Json(name = "BrandName")
    val brandName: kotlin.String,

    @Json(name = "Dimension")
    val dimension: Dimension,

    @Json(name = "RealDimension")
    val realDimension: RealDimension,

    @Json(name = "ManufacturerCode")
    val manufacturerCode: kotlin.String,

    @Json(name = "IsKit")
    val isKit: kotlin.Boolean,

    @Json(name = "KitItems")
    val kitItems: kotlin.collections.List<kotlin.String>,

    @Json(name = "Services")
    val services: kotlin.collections.List<kotlin.String>,

    @Json(name = "Categories")
    val categories: kotlin.collections.List<kotlin.String>,

    @Json(name = "Attachments")
    val attachments: kotlin.collections.List<Attachment>,

    @Json(name = "Collections")
    val collections: kotlin.collections.List<kotlin.String>,

    @Json(name = "SkuSellers")
    val skuSellers: kotlin.collections.List<SkuSeller>,

    @Json(name = "SalesChannels")
    val salesChannels: kotlin.collections.List<kotlin.Int>,

    @Json(name = "Images")
    val images: kotlin.collections.List<Image>,

    @Json(name = "SkuSpecifications")
    val skuSpecifications: kotlin.collections.List<SkuSpecification>,

    @Json(name = "ProductSpecifications")
    val productSpecifications: kotlin.collections.List<ProductSpecification>,

    @Json(name = "ProductClustersIds")
    val productClustersIds: kotlin.String,

    @Json(name = "ProductCategoryIds")
    val productCategoryIds: kotlin.String,

    @Json(name = "ProductGlobalCategoryId")
    val productGlobalCategoryId: kotlin.String?,

    @Json(name = "ProductCategories")
    val productCategories: kotlin.collections.Map<kotlin.String, kotlin.String>,

    @Json(name = "CommercialConditionId")
    val commercialConditionId: kotlin.Int,

    @Json(name = "RewardValue")
    val rewardValue: java.math.BigDecimal,

    @Json(name = "AlternateIds")
    val alternateIds: AlternateIds,

    @Json(name = "AlternateIdValues")
    val alternateIdValues: kotlin.collections.List<kotlin.String>,

    @Json(name = "EstimatedDateArrival")
    val estimatedDateArrival: kotlin.String?,

    @Json(name = "MeasurementUnit")
    val measurementUnit: kotlin.String,

    @Json(name = "UnitMultiplier")
    val unitMultiplier: java.math.BigDecimal,

    @Json(name = "InformationSource")
    val informationSource: kotlin.String,

    @Json(name = "ModalType")
    val modalType: kotlin.String?

)
