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
 * @param sellerId ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID.
 * @param name Name of the account in the seller's environment. You can find it on **Account settings > Account > Account Name**). Applicable only if the seller uses their own payment method.
 * @param email Email of the admin responsible for the seller. 
 * @param description Text describing the seller with a marketing tone. You can display this text in the marketplace window display by [customizing the CMS](https://help.vtex.com/en/tutorial/list-of-controls-for-templates--tutorials_563).
 * @param exchangeReturnPolicy Text describing the exchange and return policy previously agreed between the marketplace and the seller.
 * @param deliveryPolicy Text describing the delivery policy previously agreed between the marketplace and the seller.
 * @param useHybridPaymentOptions Allows customers to use gift cards from the seller to buy their products on the marketplace. It identifies purchases made with a gift card so that only the final price (with discounts applied) is paid to the seller. 
 * @param userName Seller username.
 * @param password Seller password.
 * @param secutityPrivacyPolicy Text describing the security policy previously agreed between the marketplace and the seller.
 * @param CNPJ Company registration number.
 * @param csCIdentification CSC identification.
 * @param archiveId Seller archive ID.
 * @param urlLogo Seller URL logo.
 * @param productCommissionPercentage The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`.
 * @param freightCommissionPercentage The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`.
 * @param fulfillmentEndpoint URL of the endpoint for fulfillment of seller's orders, which the marketplace will use to communicate with the seller. This field applies to all sellers, regardless of their type. However, for `VTEX Stores`, you don’t need to fill it in because the system will do that automatically. You can edit this field once the seller has been successfully added.
 * @param catalogSystemEndpoint URL of the endpoint of the seller's catalog. This field will only be displayed if the seller type is VTEX Store. The field format will be as follows: `http://{sellerName}.vtexcommercestable.com.br/api/catalog_system/`.
 * @param isActive If the selle is active (`true`) or not (`false`).
 * @param fulfillmentSellerId Identification code of the seller responsible for fulfilling the order. This is an optional field used when a seller sells SKUs from another seller. If the seller sells their own SKUs, it must be left blank.
 * @param sellerType Seller type.
 * @param isBetterScope Indicates whether it is a [comprehensive seller](https://help.vtex.com/en/tutorial/comprehensive-seller--5Qn4O2GpjUIzWTPpvLUfkI).
 * @param categoryCommissionPercentage The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`.
 * @param merchantName Name of the marketplace, used to guide payments. This field should be nulled if the marketplace is responsible for processing payments. Check out our [Split Payment](https://help.vtex.com/en/tutorial/split-de-pagamento--6k5JidhYRUxileNolY2VLx) article to know more.
 * @param trustPolicy Seller trust policy. The default value is `'Default'`, but if your store is a B2B marketplace and you want to share the customers'emails with the sellers you need to set this field as `'AllowEmailSharing'`.
 */

data class UpdateSellerRequest (

    /* ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. */
    @Json(name = "SellerId")
    val sellerId: kotlin.String = "pedrostore",

    /* Name of the account in the seller's environment. You can find it on **Account settings > Account > Account Name**). Applicable only if the seller uses their own payment method. */
    @Json(name = "Name")
    val name: kotlin.String = "My pedrostore",

    /* Email of the admin responsible for the seller.  */
    @Json(name = "Email")
    val email: kotlin.String = "breno@breno.com",

    /* Text describing the seller with a marketing tone. You can display this text in the marketplace window display by [customizing the CMS](https://help.vtex.com/en/tutorial/list-of-controls-for-templates--tutorials_563). */
    @Json(name = "Description")
    val description: kotlin.String = "Brief description",

    /* Text describing the exchange and return policy previously agreed between the marketplace and the seller. */
    @Json(name = "ExchangeReturnPolicy")
    val exchangeReturnPolicy: kotlin.String = "Exchange return policy text",

    /* Text describing the delivery policy previously agreed between the marketplace and the seller. */
    @Json(name = "DeliveryPolicy")
    val deliveryPolicy: kotlin.String = "Delivery policy text",

    /* Allows customers to use gift cards from the seller to buy their products on the marketplace. It identifies purchases made with a gift card so that only the final price (with discounts applied) is paid to the seller.  */
    @Json(name = "UseHybridPaymentOptions")
    val useHybridPaymentOptions: kotlin.Boolean = false,

    /* Seller username. */
    @Json(name = "UserName")
    val userName: kotlin.String = "myseller",

    /* Seller password. */
    @Json(name = "Password")
    val password: kotlin.String = "passoword",

    /* Text describing the security policy previously agreed between the marketplace and the seller. */
    @Json(name = "SecutityPrivacyPolicy")
    val secutityPrivacyPolicy: kotlin.String = "Secutity privacy policy text",

    /* Company registration number. */
    @Json(name = "CNPJ")
    val CNPJ: kotlin.String = "12035072751",

    /* CSC identification. */
    @Json(name = "CSCIdentification")
    val csCIdentification: kotlin.String = "pedrostore",

    /* Seller archive ID. */
    @Json(name = "ArchiveId")
    val archiveId: kotlin.Int = 1,

    /* Seller URL logo. */
    @Json(name = "UrlLogo")
    val urlLogo: kotlin.String = "/myseller",

    /* The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`. */
    @Json(name = "ProductCommissionPercentage")
    val productCommissionPercentage: java.math.BigDecimal = 0.0,

    /* The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`. */
    @Json(name = "FreightCommissionPercentage")
    val freightCommissionPercentage: java.math.BigDecimal = 0.0,

    /* URL of the endpoint for fulfillment of seller's orders, which the marketplace will use to communicate with the seller. This field applies to all sellers, regardless of their type. However, for `VTEX Stores`, you don’t need to fill it in because the system will do that automatically. You can edit this field once the seller has been successfully added. */
    @Json(name = "FulfillmentEndpoint")
    val fulfillmentEndpoint: kotlin.String = "http://pedrostore.vtexcommercestable.com.br/api/fulfillment?affiliateid=LDB&sc=1",

    /* URL of the endpoint of the seller's catalog. This field will only be displayed if the seller type is VTEX Store. The field format will be as follows: `http://{sellerName}.vtexcommercestable.com.br/api/catalog_system/`. */
    @Json(name = "CatalogSystemEndpoint")
    val catalogSystemEndpoint: kotlin.String = "http://pedrostore.vtexcommercestable.com.br/api/catalog_system/",

    /* If the selle is active (`true`) or not (`false`). */
    @Json(name = "IsActive")
    val isActive: kotlin.Boolean = true,

    /* Identification code of the seller responsible for fulfilling the order. This is an optional field used when a seller sells SKUs from another seller. If the seller sells their own SKUs, it must be left blank. */
    @Json(name = "FulfillmentSellerId")
    val fulfillmentSellerId: kotlin.Int = 1,

    /* Seller type. */
    @Json(name = "SellerType")
    val sellerType: kotlin.Int = 1,

    /* Indicates whether it is a [comprehensive seller](https://help.vtex.com/en/tutorial/comprehensive-seller--5Qn4O2GpjUIzWTPpvLUfkI). */
    @Json(name = "IsBetterScope")
    val isBetterScope: kotlin.Boolean = false,

    /* The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: `0.00`. */
    @Json(name = "CategoryCommissionPercentage")
    val categoryCommissionPercentage: kotlin.String? = "[{\"CategoryId\":14,\"ProductCommission\":15.0,\"FreightCommission\":0.0}]",

    /* Name of the marketplace, used to guide payments. This field should be nulled if the marketplace is responsible for processing payments. Check out our [Split Payment](https://help.vtex.com/en/tutorial/split-de-pagamento--6k5JidhYRUxileNolY2VLx) article to know more. */
    @Json(name = "MerchantName")
    val merchantName: kotlin.String? = "pedrostore",

    /* Seller trust policy. The default value is `'Default'`, but if your store is a B2B marketplace and you want to share the customers'emails with the sellers you need to set this field as `'AllowEmailSharing'`. */
    @Json(name = "TrustPolicy")
    val trustPolicy: kotlin.String? = "Default"

)

