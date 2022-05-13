
# UpdateSellerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerId** | **kotlin.String** | ID that identifies the seller in the marketplace. It can be the same as the seller name or a unique number. Check the **Sellers management** section in the Admin to get the correct ID. | 
**name** | **kotlin.String** | Name of the account in the seller&#39;s environment. You can find it on **Account settings &gt; Account &gt; Account Name**). Applicable only if the seller uses their own payment method. | 
**email** | **kotlin.String** | Email of the admin responsible for the seller.  | 
**description** | **kotlin.String** | Text describing the seller with a marketing tone. You can display this text in the marketplace window display by [customizing the CMS](https://help.vtex.com/en/tutorial/list-of-controls-for-templates--tutorials_563). | 
**exchangeReturnPolicy** | **kotlin.String** | Text describing the exchange and return policy previously agreed between the marketplace and the seller. | 
**deliveryPolicy** | **kotlin.String** | Text describing the delivery policy previously agreed between the marketplace and the seller. | 
**useHybridPaymentOptions** | **kotlin.Boolean** | Allows customers to use gift cards from the seller to buy their products on the marketplace. It identifies purchases made with a gift card so that only the final price (with discounts applied) is paid to the seller.  | 
**userName** | **kotlin.String** | Seller username. | 
**password** | **kotlin.String** | Seller password. | 
**secutityPrivacyPolicy** | **kotlin.String** | Text describing the security policy previously agreed between the marketplace and the seller. | 
**CNPJ** | **kotlin.String** | Company registration number. | 
**csCIdentification** | **kotlin.String** | CSC identification. | 
**archiveId** | **kotlin.Int** | Seller archive ID. | 
**urlLogo** | **kotlin.String** | Seller URL logo. | 
**productCommissionPercentage** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: &#x60;0.00&#x60;. | 
**freightCommissionPercentage** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: &#x60;0.00&#x60;. | 
**fulfillmentEndpoint** | **kotlin.String** | URL of the endpoint for fulfillment of seller&#39;s orders, which the marketplace will use to communicate with the seller. This field applies to all sellers, regardless of their type. However, for &#x60;VTEX Stores&#x60;, you don’t need to fill it in because the system will do that automatically. You can edit this field once the seller has been successfully added. | 
**catalogSystemEndpoint** | **kotlin.String** | URL of the endpoint of the seller&#39;s catalog. This field will only be displayed if the seller type is VTEX Store. The field format will be as follows: &#x60;http://{sellerName}.vtexcommercestable.com.br/api/catalog_system/&#x60;. | 
**isActive** | **kotlin.Boolean** | If the selle is active (&#x60;true&#x60;) or not (&#x60;false&#x60;). | 
**fulfillmentSellerId** | **kotlin.Int** | Identification code of the seller responsible for fulfilling the order. This is an optional field used when a seller sells SKUs from another seller. If the seller sells their own SKUs, it must be left blank. | 
**sellerType** | **kotlin.Int** | Seller type. | 
**isBetterScope** | **kotlin.Boolean** | Indicates whether it is a [comprehensive seller](https://help.vtex.com/en/tutorial/comprehensive-seller--5Qn4O2GpjUIzWTPpvLUfkI). | 
**categoryCommissionPercentage** | **kotlin.String** | The percentage that must be filled in as agreed between the marketplace and the seller. If there is no such commission, please fill in the field with the value: &#x60;0.00&#x60;. |  [optional]
**merchantName** | **kotlin.String** | Name of the marketplace, used to guide payments. This field should be nulled if the marketplace is responsible for processing payments. Check out our [Split Payment](https://help.vtex.com/en/tutorial/split-de-pagamento--6k5JidhYRUxileNolY2VLx) article to know more. |  [optional]
**trustPolicy** | **kotlin.String** | Seller trust policy. The default value is &#x60;&#39;Default&#39;&#x60;, but if your store is a B2B marketplace and you want to share the customers&#39;emails with the sellers you need to set this field as &#x60;&#39;AllowEmailSharing&#39;&#x60;. |  [optional]



