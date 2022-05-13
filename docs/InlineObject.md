
# InlineObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Product&#39;s name. | 
**categoryId** | **kotlin.Int** | Category ID associated with this product. | 
**brandId** | **kotlin.Int** | Brand ID associated with this product. | 
**departmentId** | **kotlin.Int** | Department ID according to the product&#39;s category. This field should not be provided during product creation. |  [optional]
**linkId** | **kotlin.String** | String to be used to build the product URL. If it not informed, it will be generated according to product&#39;s name replacing space and special character by hifen (-). |  [optional]
**refId** | **kotlin.String** | Product Reference Code. |  [optional]
**isVisible** | **kotlin.Boolean** | Show (&#x60;true&#x60;) or hide (&#x60;false&#x60;) product in search result and product page but can be added into shopping cart. Usually applicable for gifts. |  [optional]
**description** | **kotlin.String** | Product description. |  [optional]
**descriptionShort** | **kotlin.String** | Product Short description. This information is presented by:  Store Framework:  $product.DescriptionShort control  Classic CMS:   And can be displayed on both the product page and the shelf.   |  [optional]
**releaseDate** | **kotlin.String** | Used to assist in the ordering of the search result of the site. Using the &#x60;O&#x3D;OrderByReleaseDateDESC&#x60; querystring, you can pull this value and show the display order by release date. This attribute is also used as a condition for dynamic collections. |  [optional]
**keyWords** | **kotlin.String** | Store Framework: Deprecated  Classic CMS: Synonyms of terms related to product. \&quot;Television\&quot;, for example, can have a substitute word like \&quot;TV\&quot;. This field is important to make your searches more comprehensive.   |  [optional]
**title** | **kotlin.String** | Product&#39;s Title tag. Is presented  in the browser tab and corresponds to the title of the product page. This field is important for SEO. |  [optional]
**isActive** | **kotlin.Boolean** | Activate (&#x60;true&#x60;) or inactivate (&#x60;false&#x60;) product. |  [optional]
**taxCode** | **kotlin.String** | Product fiscal number. Usually used for tax calculation. |  [optional]
**metaTagDescription** | **kotlin.String** | Brief description of the product for SEO. It&#39;s recommended that you don&#39;t exceed 150 characters. |  [optional]
**supplierId** | **kotlin.Int** |  |  [optional]
**showWithoutStock** | **kotlin.Boolean** | If &#x60;true&#x60;, activates &#x60;Notify Me&#x60; form when the product is out of stock. |  [optional]
**adWordsRemarketingCode** | **kotlin.String** | This is a legacy field. Do not take this information into consideration. |  [optional]
**lomadeeCampaignCode** | **kotlin.String** | This is a legacy field. Do not take this information into consideration. |  [optional]
**score** | **kotlin.Int** | Value used to set the priority on the search result page. |  [optional]



