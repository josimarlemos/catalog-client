
# InlineResponse2009

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | SKU unique identifier. |  [optional]
**productId** | **kotlin.Int** | Product&#39;s ID associated with this SKU. |  [optional]
**isActive** | **kotlin.Boolean** | Shows if the SKU is active (&#x60;true&#x60;) or not (&#x60;false&#x60;). |  [optional]
**name** | **kotlin.String** | SKU name, meaning the variation of the previously added product. For example: **Product** - _Fridge_, **SKU** - _110V_. |  [optional]
**refId** | **kotlin.String** | Reference code used internally for organizational purposes. Must be unique. It is not required only if EAN code already exists. If not, this field must be provided. |  [optional]
**packagedHeight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Height used for shipping calculation. |  [optional]
**packagedLength** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Length used for shipping calculation. |  [optional]
**packagedWidth** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Width used for shipping calculation. |  [optional]
**packagedWeightKg** | **kotlin.Int** | Weight used for shipping calculation. |  [optional]
**height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | SKU real height. |  [optional]
**length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | SKU real length. |  [optional]
**width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | SKU real width. |  [optional]
**weightKg** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | SKU Weight. |  [optional]
**cubicWeight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | [Cubic weight](https://help.vtex.com/en/tutorial/understanding-the-cubic-weight-factor--tutorials_128). |  [optional]
**isKit** | **kotlin.Boolean** | Flag to set whether the product SKU is made up of one or more SKUs, thereby becoming a bundle. Must be enabled if you are adding a bundle. Once activated, the flag cannot be reverted. |  [optional]
**creationDate** | **kotlin.String** | Date and time of the SKU&#39;s creation. |  [optional]
**rewardValue** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Credit that the customer receives when finalizing an order of one specific SKU unit. By filling this field out with &#x60;1&#x60;, the customer gets U$ 1 credit on the site. |  [optional]
**estimatedDateArrival** | **kotlin.String** | To add the product as pre-sale, enter the product estimated arrival date. You must take into consideration both the launch date and the freight calculation for the arrival date. |  [optional]
**manufacturerCode** | **kotlin.String** | Provided by the manufacturers to identify their product. This field should be completed if the product has a specific manufacturer’s code. |  [optional]
**commercialConditionId** | **kotlin.Int** | Used to define SKU specific promotions or installment rules. Find out more by reading the Commercial Condition article. In case of no specific condition, use the default value. |  [optional]
**measurementUnit** | **kotlin.String** | Used only in cases when you need to convert the unit of measure for sale. If a product is sold in boxes for example, but customers want to buy per square meter (m²). In common cases, use &#x60;&#39;un&#39;&#x60;. |  [optional]
**unitMultiplier** | **kotlin.Int** | This is the multiple number of SKU. If the Multiplier is 5, the product can be added in multiple quantities of 5, 10, 15, 20, onward. |  [optional]
**modalType** | **kotlin.String** | Links an unusual type of product to a carrier specialized in delivering it. To learn more about this feature, read our articles [How the modal works](https://help.vtex.com/en/tutorial/how-does-the-modal-work--tutorials_125) and [Setting up modal for carriers](https://help.vtex.com/en/tutorial/configure-modal--3jhLqxuPhuiq24UoykCcqy). |  [optional]
**kitItensSellApart** | **kotlin.Boolean** | Defines if Kit components can be sold apart |  [optional]
**activateIfPossible** | **kotlin.Boolean** | When set to &#x60;true&#x60;, this attribute will automatically update the SKU as active once associated with an image or an active component. |  [optional]



