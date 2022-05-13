# org.openapitools.client - Kotlin client library for Catalog API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://{accountName}.{environment}.com.br*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentApi* | [**apiCatalogPvtAttachmentAttachmentidDelete**](docs/AttachmentApi.md#apicatalogpvtattachmentattachmentiddelete) | **DELETE** /api/catalog/pvt/attachment/{attachmentid} | Delete attachment
*AttachmentApi* | [**apiCatalogPvtAttachmentAttachmentidGet**](docs/AttachmentApi.md#apicatalogpvtattachmentattachmentidget) | **GET** /api/catalog/pvt/attachment/{attachmentid} | Get attachment
*AttachmentApi* | [**apiCatalogPvtAttachmentAttachmentidPut**](docs/AttachmentApi.md#apicatalogpvtattachmentattachmentidput) | **PUT** /api/catalog/pvt/attachment/{attachmentid} | Update attachment
*AttachmentApi* | [**apiCatalogPvtAttachmentPost**](docs/AttachmentApi.md#apicatalogpvtattachmentpost) | **POST** /api/catalog/pvt/attachment | Create attachment
*BrandApi* | [**apiCatalogPvtBrandBrandIdDelete**](docs/BrandApi.md#apicatalogpvtbrandbrandiddelete) | **DELETE** /api/catalog/pvt/brand/{brandId} | Delete Brand
*BrandApi* | [**apiCatalogPvtBrandBrandIdGet**](docs/BrandApi.md#apicatalogpvtbrandbrandidget) | **GET** /api/catalog/pvt/brand/{brandId} | Get Brand and context
*BrandApi* | [**apiCatalogPvtBrandBrandIdPut**](docs/BrandApi.md#apicatalogpvtbrandbrandidput) | **PUT** /api/catalog/pvt/brand/{brandId} | Update Brand
*BrandApi* | [**apiCatalogPvtBrandPost**](docs/BrandApi.md#apicatalogpvtbrandpost) | **POST** /api/catalog/pvt/brand | Create Brand
*BrandApi* | [**brand**](docs/BrandApi.md#brand) | **GET** /api/catalog_system/pvt/brand/{brandId} | Get Brand
*BrandApi* | [**brandList**](docs/BrandApi.md#brandlist) | **GET** /api/catalog_system/pvt/brand/list | Get Brand List
*BrandApi* | [**brandListPerPage**](docs/BrandApi.md#brandlistperpage) | **GET** /api/catalog_system/pvt/brand/pagedlist | Get Brand List Per Page
*BrandSubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdBrandBrandIdDelete**](docs/BrandSubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidbrandbrandiddelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/brand/{brandId} | Delete Brand SubCollection
*BrandSubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdBrandPost**](docs/BrandSubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidbrandpost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/brand | Associate SubCollection to Brand
*CategoryApi* | [**apiCatalogPvtCategoryCategoryIdGet**](docs/CategoryApi.md#apicatalogpvtcategorycategoryidget) | **GET** /api/catalog/pvt/category/{categoryId} | Get Category by ID
*CategoryApi* | [**apiCatalogPvtCategoryCategoryIdPut**](docs/CategoryApi.md#apicatalogpvtcategorycategoryidput) | **PUT** /api/catalog/pvt/category/{categoryId} | Update Category
*CategoryApi* | [**apiCatalogPvtCategoryPost**](docs/CategoryApi.md#apicatalogpvtcategorypost) | **POST** /api/catalog/pvt/category | Create Category
*CategoryApi* | [**categoryTree**](docs/CategoryApi.md#categorytree) | **GET** /api/catalog_system/pub/category/tree/{categoryLevels} | Get Category Tree
*CategorySpecificationApi* | [**specificationsByCategoryId**](docs/CategorySpecificationApi.md#specificationsbycategoryid) | **GET** /api/catalog_system/pub/specification/field/listByCategoryId/{categoryId} | Get Specifications By Category Id
*CategorySpecificationApi* | [**specificationsTreeByCategoryId**](docs/CategorySpecificationApi.md#specificationstreebycategoryid) | **GET** /api/catalog_system/pub/specification/field/listTreeByCategoryId/{categoryId} | Get Specifications Tree By Category Id
*CategorySubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdBrandCategoryIdDelete**](docs/CategorySubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidbrandcategoryiddelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/brand/{categoryId} | Delete Category SubCollection
*CategorySubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdCategoryPost**](docs/CategorySubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidcategorypost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/category | Associate SubCollection to Category
*CollectionApi* | [**apiCatalogPvtCollectionCollectionIdDelete**](docs/CollectionApi.md#apicatalogpvtcollectioncollectioniddelete) | **DELETE** /api/catalog/pvt/collection/{collectionId} | Delete Collection
*CollectionApi* | [**apiCatalogPvtCollectionCollectionIdGet**](docs/CollectionApi.md#apicatalogpvtcollectioncollectionidget) | **GET** /api/catalog/pvt/collection/{collectionId} | Get Collection
*CollectionApi* | [**apiCatalogPvtCollectionCollectionIdPut**](docs/CollectionApi.md#apicatalogpvtcollectioncollectionidput) | **PUT** /api/catalog/pvt/collection/{collectionId} | Update Collection
*CollectionBetaApi* | [**gETAllCollections**](docs/CollectionBetaApi.md#getallcollections) | **GET** /api/catalog_system/pvt/collection/search | Get All Collections
*CollectionBetaApi* | [**gETAllInactiveCollections**](docs/CollectionBetaApi.md#getallinactivecollections) | **GET** /api/catalog/pvt/collection/inactive | Get All Inactive Collections
*CollectionBetaApi* | [**gETCollectionsbyseachterms**](docs/CollectionBetaApi.md#getcollectionsbyseachterms) | **GET** /api/catalog_system/pvt/collection/search/{searchTerms} | Get Collections by search terms
*CollectionBetaApi* | [**gETImportfileexample**](docs/CollectionBetaApi.md#getimportfileexample) | **GET** /api/catalog/pvt/collection/stockkeepingunit/importfileexample | Import Collection file example
*CollectionBetaApi* | [**gETProductsfromacollection**](docs/CollectionBetaApi.md#getproductsfromacollection) | **GET** /api/catalog/pvt/collection/{collectionId}/products | Get products from a collection
*CollectionBetaApi* | [**pOSTAddproductsbyimportfile**](docs/CollectionBetaApi.md#postaddproductsbyimportfile) | **POST** /api/catalog/pvt/collection/{collectionId}/stockkeepingunit/importinsert | Add products to Collection by imported file
*CollectionBetaApi* | [**pOSTCreateCollection**](docs/CollectionBetaApi.md#postcreatecollection) | **POST** /api/catalog/pvt/collection/ | Create Collection
*CollectionBetaApi* | [**pOSTRemoveproductsbyimportfile**](docs/CollectionBetaApi.md#postremoveproductsbyimportfile) | **POST** /api/catalog/pvt/collection/{collectionId}/stockkeepingunit/importexclude | Remove products from Collection by imported file
*CollectionCMSApi* | [**apiCatalogPvtCollectionPost**](docs/CollectionCMSApi.md#apicatalogpvtcollectionpost) | **POST** /api/catalog/pvt/collection | Create Collection
*CommercialConditionsApi* | [**getAllCommercialConditions**](docs/CommercialConditionsApi.md#getallcommercialconditions) | **GET** /api/catalog_system/pvt/commercialcondition/list | Get all commercial conditions
*CommercialConditionsApi* | [**getCommercialConditions**](docs/CommercialConditionsApi.md#getcommercialconditions) | **GET** /api/catalog_system/pvt/commercialcondition/{commercialConditionId} | Get a commercial condition
*NonStructuredSpecificationApi* | [**apiCatalogPvtSpecificationNonstructuredDelete**](docs/NonStructuredSpecificationApi.md#apicatalogpvtspecificationnonstructureddelete) | **DELETE** /api/catalog/pvt/specification/nonstructured | Delete Specification Non Structured by SkuId
*NonStructuredSpecificationApi* | [**apiCatalogPvtSpecificationNonstructuredGet**](docs/NonStructuredSpecificationApi.md#apicatalogpvtspecificationnonstructuredget) | **GET** /api/catalog/pvt/specification/nonstructured | Get Specification Non Structured by SkuId
*NonStructuredSpecificationApi* | [**apiCatalogPvtSpecificationNonstructuredIdDelete**](docs/NonStructuredSpecificationApi.md#apicatalogpvtspecificationnonstructurediddelete) | **DELETE** /api/catalog/pvt/specification/nonstructured/{Id} | Delete Specification Non Structured
*NonStructuredSpecificationApi* | [**apiCatalogPvtSpecificationNonstructuredIdGet**](docs/NonStructuredSpecificationApi.md#apicatalogpvtspecificationnonstructuredidget) | **GET** /api/catalog/pvt/specification/nonstructured/{Id} | Get Specification Non Structured
*ProductApi* | [**apiCatalogPvtProductPost**](docs/ProductApi.md#apicatalogpvtproductpost) | **POST** /api/catalog/pvt/product | Create Product
*ProductApi* | [**apiCatalogPvtProductProductIdPut**](docs/ProductApi.md#apicatalogpvtproductproductidput) | **PUT** /api/catalog/pvt/product/{productId} | Update Product
*ProductApi* | [**getProductbyid**](docs/ProductApi.md#getproductbyid) | **GET** /api/catalog/pvt/product/{productId} | Get Product by ID
*ProductApi* | [**productAndSkuIds**](docs/ProductApi.md#productandskuids) | **GET** /api/catalog_system/pvt/products/GetProductAndSkuIds | Get Product and SKU IDs
*ProductApi* | [**productVariations**](docs/ProductApi.md#productvariations) | **GET** /api/catalog_system/pub/products/variations/{productId} | Get Product's SKUs by Product ID
*ProductApi* | [**productandTradePolicy**](docs/ProductApi.md#productandtradepolicy) | **GET** /api/catalog_system/pvt/products/productget/{productId} | Get Product and its general context
*ProductApi* | [**productbyRefId**](docs/ProductApi.md#productbyrefid) | **GET** /api/catalog_system/pvt/products/productgetbyrefid/{refId} | Get Product by RefId
*ProductApi* | [**reviewRateProduct**](docs/ProductApi.md#reviewrateproduct) | **GET** /api/addon/pvt/review/GetProductRate/{productId} | Get Product Review Rate by Product ID
*ProductIndexedApi* | [**indexedInfo**](docs/ProductIndexedApi.md#indexedinfo) | **GET** /api/catalog_system/pvt/products/GetIndexedInfo/{productId} | Get Indexed Info
*ProductSpecificationApi* | [**apiCatalogPvtProductProductIdSpecificationPost**](docs/ProductSpecificationApi.md#apicatalogpvtproductproductidspecificationpost) | **POST** /api/catalog/pvt/product/{productId}/specification | Associate Product Specification
*ProductSpecificationApi* | [**apiCatalogPvtProductProductIdSpecificationvaluePut**](docs/ProductSpecificationApi.md#apicatalogpvtproductproductidspecificationvalueput) | **PUT** /api/catalog/pvt/product/{productId}/specificationvalue | Associate product specification using specification and group names
*ProductSpecificationApi* | [**deleteAllProductSpecification**](docs/ProductSpecificationApi.md#deleteallproductspecification) | **DELETE** /api/catalog/pvt/product/{productId}/specification | Delete all Product Specification
*ProductSpecificationApi* | [**deleteProductSpecification**](docs/ProductSpecificationApi.md#deleteproductspecification) | **DELETE** /api/catalog/pvt/product/{productId}/specification/{specificationId} | Delete Product Specification
*ProductSpecificationApi* | [**getProductSpecification**](docs/ProductSpecificationApi.md#getproductspecification) | **GET** /api/catalog_system/pvt/products/{productId}/specification | Get Product Specification by Product ID
*ProductSpecificationApi* | [**getProductSpecificationbyProductID**](docs/ProductSpecificationApi.md#getproductspecificationbyproductid) | **GET** /api/catalog/pvt/product/{productId}/specification | Get Product Specification and its information by Product ID
*ProductSpecificationApi* | [**updateProductSpecification**](docs/ProductSpecificationApi.md#updateproductspecification) | **POST** /api/catalog_system/pvt/products/{productId}/specification | Update Product Specification by Product ID
*SKUApi* | [**apiCatalogPvtStockkeepingunitGet**](docs/SKUApi.md#apicatalogpvtstockkeepingunitget) | **GET** /api/catalog/pvt/stockkeepingunit | Get SKU by RefId
*SKUApi* | [**apiCatalogPvtStockkeepingunitPost**](docs/SKUApi.md#apicatalogpvtstockkeepingunitpost) | **POST** /api/catalog/pvt/stockkeepingunit | Create SKU
*SKUApi* | [**apiCatalogPvtStockkeepingunitSkuIdPut**](docs/SKUApi.md#apicatalogpvtstockkeepingunitskuidput) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId} | Update SKU
*SKUApi* | [**listallSKUsID**](docs/SKUApi.md#listallskusid) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitids | List all SKU IDs
*SKUApi* | [**sku**](docs/SKUApi.md#sku) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId} | Get SKU
*SKUApi* | [**skuContext**](docs/SKUApi.md#skucontext) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyid/{skuId} | Get SKU and context
*SKUApi* | [**skuIdbyRefId**](docs/SKUApi.md#skuidbyrefid) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitidbyrefid/{refId} | Get SkuId by RefId
*SKUApi* | [**skuIdlistbyRefIdlist**](docs/SKUApi.md#skuidlistbyrefidlist) | **POST** /api/catalog_system/pub/sku/stockkeepingunitidsbyrefids | Retrieve SkuId list by RefId list
*SKUApi* | [**skubyAlternateId**](docs/SKUApi.md#skubyalternateid) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyalternateId/{alternateId} | Get SKU by Alternate ID
*SKUApi* | [**skulistbyProductId**](docs/SKUApi.md#skulistbyproductid) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitByProductId/{productId} | Get SKU list by ProductId
*SKUAttachmentApi* | [**apiCatalogPvtSkuattachmentDelete**](docs/SKUAttachmentApi.md#apicatalogpvtskuattachmentdelete) | **DELETE** /api/catalog/pvt/skuattachment | Dissociate attachments and SKUs
*SKUAttachmentApi* | [**apiCatalogPvtSkuattachmentPost**](docs/SKUAttachmentApi.md#apicatalogpvtskuattachmentpost) | **POST** /api/catalog/pvt/skuattachment | Associate SKU Attachment
*SKUAttachmentApi* | [**apiCatalogPvtSkuattachmentSkuAttachmentAssociationIdDelete**](docs/SKUAttachmentApi.md#apicatalogpvtskuattachmentskuattachmentassociationiddelete) | **DELETE** /api/catalog/pvt/skuattachment/{skuAttachmentAssociationId} | Delete SKU Attachment by SKU Attachment Association ID
*SKUAttachmentApi* | [**apiCatalogPvtSkuattachmentSkuAttachmentIdDelete**](docs/SKUAttachmentApi.md#apicatalogpvtskuattachmentskuattachmentiddelete) | **DELETE** /api/catalog/pvt/skuattachment/{skuAttachmentId} | Delete SKU Complement
*SKUAttachmentApi* | [**apiCatalogPvtStockkeepingunitSkuIdAttachmentGet**](docs/SKUAttachmentApi.md#apicatalogpvtstockkeepingunitskuidattachmentget) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/attachment | Get SKU Attachment by SKU ID
*SKUAttachmentApi* | [**associateattachmentstoSKU**](docs/SKUAttachmentApi.md#associateattachmentstosku) | **POST** /api/catalog_system/pvt/sku/associateattachments | Associate attachments to SKU
*SKUComplementApi* | [**createSKUComplement**](docs/SKUComplementApi.md#createskucomplement) | **POST** /api/catalog/pvt/skucomplement | Create SKU Complement
*SKUComplementApi* | [**deleteSKUComplementbySKUComplementID**](docs/SKUComplementApi.md#deleteskucomplementbyskucomplementid) | **DELETE** /api/catalog/pvt/skucomplement/{skuComplementId} | Delete SKU Complement by SKU Complement ID
*SKUComplementApi* | [**getSKUComplementbySKUComplementID**](docs/SKUComplementApi.md#getskucomplementbyskucomplementid) | **GET** /api/catalog/pvt/skucomplement/{skuComplementId} | Get SKU Complement by SKU Complement ID
*SKUComplementApi* | [**getSKUComplementbySKUID**](docs/SKUComplementApi.md#getskucomplementbyskuid) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/complement | Get SKU Complement by SKU ID
*SKUComplementApi* | [**getSKUComplementsbyComplementTypeID**](docs/SKUComplementApi.md#getskucomplementsbycomplementtypeid) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/complement/{complementTypeId} | Get SKU Complements by Complement Type ID
*SKUComplementApi* | [**getSKUcomplementsbytype**](docs/SKUComplementApi.md#getskucomplementsbytype) | **GET** /api/catalog_system/pvt/sku/complements/{skuId}/{type} | Get SKU complements by type
*SKUEANApi* | [**apiCatalogPvtStockkeepingunitSkuIdEanDelete**](docs/SKUEANApi.md#apicatalogpvtstockkeepingunitskuideandelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/ean | Delete all SKU EAN
*SKUEANApi* | [**apiCatalogPvtStockkeepingunitSkuIdEanEanDelete**](docs/SKUEANApi.md#apicatalogpvtstockkeepingunitskuideaneandelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/ean/{ean} | Delete SKU EAN
*SKUEANApi* | [**apiCatalogPvtStockkeepingunitSkuIdEanEanPost**](docs/SKUEANApi.md#apicatalogpvtstockkeepingunitskuideaneanpost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/ean/{ean} | Create SKU EAN
*SKUEANApi* | [**apiCatalogPvtStockkeepingunitSkuIdEanGet**](docs/SKUEANApi.md#apicatalogpvtstockkeepingunitskuideanget) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/ean | Get EAN by SkuId
*SKUEANApi* | [**skubyEAN**](docs/SKUEANApi.md#skubyean) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitbyean/{ean} | Get SKU by EAN
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitCopySkuIdfromSkuIdtoFilePut**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitcopyskuidfromskuidtofileput) | **PUT** /api/catalog/pvt/stockkeepingunit/copy/{skuIdfrom}/{skuIdto}/file/ | Copy All Files from an SKU to other SKU
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitDisassociateSkuIdFileSkuFileIdDelete**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitdisassociateskuidfileskufileiddelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/disassociate/{skuId}/file/{skuFileId} | Disassociate SKU File
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitSkuIdFileDelete**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitskuidfiledelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Delete All SKU File
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitSkuIdFileGet**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitskuidfileget) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Get SKU File
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitSkuIdFilePost**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitskuidfilepost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/file | Create SKU File
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdDelete**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitskuidfileskufileiddelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/file/{skuFileId} | Delete SKU Image by File ID
*SKUFileApi* | [**apiCatalogPvtStockkeepingunitSkuIdFileSkuFileIdPut**](docs/SKUFileApi.md#apicatalogpvtstockkeepingunitskuidfileskufileidput) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId}/file/{skuFileId} | Update SKU File
*SKUKitApi* | [**apiCatalogPvtStockkeepingunitkitDelete**](docs/SKUKitApi.md#apicatalogpvtstockkeepingunitkitdelete) | **DELETE** /api/catalog/pvt/stockkeepingunitkit | Delete SKU Kit by SKU ID or Parent SKU ID
*SKUKitApi* | [**apiCatalogPvtStockkeepingunitkitGet**](docs/SKUKitApi.md#apicatalogpvtstockkeepingunitkitget) | **GET** /api/catalog/pvt/stockkeepingunitkit | Get SKU Kit by SKU ID or Parent SKU ID
*SKUKitApi* | [**apiCatalogPvtStockkeepingunitkitKitIdDelete**](docs/SKUKitApi.md#apicatalogpvtstockkeepingunitkitkitiddelete) | **DELETE** /api/catalog/pvt/stockkeepingunitkit/{kitId} | Delete SKU Kit by KitId
*SKUKitApi* | [**apiCatalogPvtStockkeepingunitkitKitIdGet**](docs/SKUKitApi.md#apicatalogpvtstockkeepingunitkitkitidget) | **GET** /api/catalog/pvt/stockkeepingunitkit/{kitId} | Get SKU Kit
*SKUKitApi* | [**apiCatalogPvtStockkeepingunitkitPost**](docs/SKUKitApi.md#apicatalogpvtstockkeepingunitkitpost) | **POST** /api/catalog/pvt/stockkeepingunitkit | Create SKU Kit
*SKUSellerApi* | [**apiCatalogSystemPvtSkusellerChangenotificationSellerIdSellerSkuIdPost**](docs/SKUSellerApi.md#apicatalogsystempvtskusellerchangenotificationselleridsellerskuidpost) | **POST** /api/catalog_system/pvt/skuseller/changenotification/{sellerId}/{sellerSkuId} | Change Notification with Seller ID and Seller SKU ID
*SKUSellerApi* | [**changeNotification**](docs/SKUSellerApi.md#changenotification) | **POST** /api/catalog_system/pvt/skuseller/changenotification/{skuId} | Change Notification with SKU ID
*SKUSellerApi* | [**deleteSKUsellerassociation**](docs/SKUSellerApi.md#deleteskusellerassociation) | **POST** /api/catalog_system/pvt/skuseller/remove/{sellerId}/{sellerSkuId} | Delete an SKU seller association
*SKUSellerApi* | [**getSKUseller**](docs/SKUSellerApi.md#getskuseller) | **GET** /api/catalog_system/pvt/skuseller/{sellerId}/{sellerSkuId} | Get SKU seller
*SKUServiceApi* | [**apiCatalogPvtSkuservicePost**](docs/SKUServiceApi.md#apicatalogpvtskuservicepost) | **POST** /api/catalog/pvt/skuservice | Associate SKU Service
*SKUServiceApi* | [**apiCatalogPvtSkuserviceSkuServiceIdDelete**](docs/SKUServiceApi.md#apicatalogpvtskuserviceskuserviceiddelete) | **DELETE** /api/catalog/pvt/skuservice/{skuServiceId} | Dissociate SKU Service
*SKUServiceApi* | [**apiCatalogPvtSkuserviceSkuServiceIdPut**](docs/SKUServiceApi.md#apicatalogpvtskuserviceskuserviceidput) | **PUT** /api/catalog/pvt/skuservice/{skuServiceId} | Update SKU Service
*SKUServiceAttachmentApi* | [**apiCatalogPvtSkuservicetypeattachmentDelete**](docs/SKUServiceAttachmentApi.md#apicatalogpvtskuservicetypeattachmentdelete) | **DELETE** /api/catalog/pvt/skuservicetypeattachment | Dissociate Attachment by Attachment ID or SKU Service Type ID
*SKUServiceAttachmentApi* | [**apiCatalogPvtSkuservicetypeattachmentPost**](docs/SKUServiceAttachmentApi.md#apicatalogpvtskuservicetypeattachmentpost) | **POST** /api/catalog/pvt/skuservicetypeattachment | Associate SKU Service Attachment
*SKUServiceAttachmentApi* | [**apiCatalogPvtSkuservicetypeattachmentSkuServiceTypeAttachmentIdDelete**](docs/SKUServiceAttachmentApi.md#apicatalogpvtskuservicetypeattachmentskuservicetypeattachmentiddelete) | **DELETE** /api/catalog/pvt/skuservicetypeattachment/{skuServiceTypeAttachmentId} | Dissociate Attachment from SKU Service Type
*SKUServiceTypeApi* | [**apiCatalogPvtSkuservicetypePost**](docs/SKUServiceTypeApi.md#apicatalogpvtskuservicetypepost) | **POST** /api/catalog/pvt/skuservicetype | Create SKU Service Type
*SKUServiceTypeApi* | [**apiCatalogPvtSkuservicetypeSkuServiceTypeIdDelete**](docs/SKUServiceTypeApi.md#apicatalogpvtskuservicetypeskuservicetypeiddelete) | **DELETE** /api/catalog/pvt/skuservicetype/{skuServiceTypeId} | Delete SKU Service Type
*SKUServiceTypeApi* | [**apiCatalogPvtSkuservicetypeSkuServiceTypeIdPut**](docs/SKUServiceTypeApi.md#apicatalogpvtskuservicetypeskuservicetypeidput) | **PUT** /api/catalog/pvt/skuservicetype/{skuServiceTypeId} | Update SKU Service Type
*SKUServiceValueApi* | [**apiCatalogPvtSkuservicevaluePost**](docs/SKUServiceValueApi.md#apicatalogpvtskuservicevaluepost) | **POST** /api/catalog/pvt/skuservicevalue | Create SKU Service Value
*SKUServiceValueApi* | [**apiCatalogPvtSkuservicevalueSkuServiceValueIdDelete**](docs/SKUServiceValueApi.md#apicatalogpvtskuservicevalueskuservicevalueiddelete) | **DELETE** /api/catalog/pvt/skuservicevalue/{skuServiceValueId} | Delete SKU Service Value
*SKUServiceValueApi* | [**apiCatalogPvtSkuservicevalueSkuServiceValueIdPut**](docs/SKUServiceValueApi.md#apicatalogpvtskuservicevalueskuservicevalueidput) | **PUT** /api/catalog/pvt/skuservicevalue/{skuServiceValueId} | Update SKU Service Value
*SKUSpecificationApi* | [**apiCatalogPvtStockkeepingunitSkuIdSpecificationDelete**](docs/SKUSpecificationApi.md#apicatalogpvtstockkeepingunitskuidspecificationdelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Delete all SKU Specifications
*SKUSpecificationApi* | [**apiCatalogPvtStockkeepingunitSkuIdSpecificationGet**](docs/SKUSpecificationApi.md#apicatalogpvtstockkeepingunitskuidspecificationget) | **GET** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Get SKU Specifications
*SKUSpecificationApi* | [**apiCatalogPvtStockkeepingunitSkuIdSpecificationPost**](docs/SKUSpecificationApi.md#apicatalogpvtstockkeepingunitskuidspecificationpost) | **POST** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Associate SKU Specification
*SKUSpecificationApi* | [**apiCatalogPvtStockkeepingunitSkuIdSpecificationPut**](docs/SKUSpecificationApi.md#apicatalogpvtstockkeepingunitskuidspecificationput) | **PUT** /api/catalog/pvt/stockkeepingunit/{skuId}/specification | Update SKU Specification
*SKUSpecificationApi* | [**apiCatalogPvtStockkeepingunitSkuIdSpecificationSpecificationIdDelete**](docs/SKUSpecificationApi.md#apicatalogpvtstockkeepingunitskuidspecificationspecificationiddelete) | **DELETE** /api/catalog/pvt/stockkeepingunit/{skuId}/specification/{specificationId} | Delete SKU Specification
*SKUSubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitGet**](docs/SKUSubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidstockkeepingunitget) | **GET** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit | Get Subcollection's SKUs
*SKUSubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitPost**](docs/SKUSubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidstockkeepingunitpost) | **POST** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit | Associate SubCollection to SKU
*SKUSubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdStockkeepingunitSkuIdDelete**](docs/SKUSubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidstockkeepingunitskuiddelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId}/stockkeepingunit/{skuId} | Delete SKU SubCollection
*SalesChannelApi* | [**salesChannelList**](docs/SalesChannelApi.md#saleschannellist) | **GET** /api/catalog_system/pvt/saleschannel/list | Get Sales Channel List
*SalesChannelApi* | [**salesChannelbyId**](docs/SalesChannelApi.md#saleschannelbyid) | **GET** /api/catalog_system/pub/saleschannel/{salesChannelId} | Get Sales Channel by Id
*SellerApi* | [**createSeller**](docs/SellerApi.md#createseller) | **POST** /api/catalog_system/pvt/seller | Create Seller
*SellerApi* | [**getSellerbyId**](docs/SellerApi.md#getsellerbyid) | **GET** /api/catalog_system/pvt/seller/{sellerId} | Get Seller by ID
*SellerApi* | [**getSellersbyId**](docs/SellerApi.md#getsellersbyid) | **GET** /api/catalog_system/pvt/sellers/{sellerId} | Get Seller by ID
*SellerApi* | [**sellerList**](docs/SellerApi.md#sellerlist) | **GET** /api/catalog_system/pvt/seller/list | Get Seller List
*SellerApi* | [**updateSeller**](docs/SellerApi.md#updateseller) | **PUT** /api/catalog_system/pvt/seller | Update Seller
*SimilarCategoryApi* | [**apiCatalogPvtProductProductIdSimilarcategoryCategoryIdDelete**](docs/SimilarCategoryApi.md#apicatalogpvtproductproductidsimilarcategorycategoryiddelete) | **DELETE** /api/catalog/pvt/product/{productId}/similarcategory/{categoryId} | Delete Similar Product Category
*SimilarCategoryApi* | [**apiCatalogPvtProductProductIdSimilarcategoryCategoryIdPost**](docs/SimilarCategoryApi.md#apicatalogpvtproductproductidsimilarcategorycategoryidpost) | **POST** /api/catalog/pvt/product/{productId}/similarcategory/{categoryId} | Create Similar Product Category
*SimilarCategoryApi* | [**apiCatalogPvtProductProductIdSimilarcategoryGet**](docs/SimilarCategoryApi.md#apicatalogpvtproductproductidsimilarcategoryget) | **GET** /api/catalog/pvt/product/{productId}/similarcategory/ | Get Similar Product Category
*SpecificationApi* | [**apiCatalogPvtSpecificationPost**](docs/SpecificationApi.md#apicatalogpvtspecificationpost) | **POST** /api/catalog/pvt/specification | Create Specification
*SpecificationApi* | [**apiCatalogPvtSpecificationSpecificationIdGet**](docs/SpecificationApi.md#apicatalogpvtspecificationspecificationidget) | **GET** /api/catalog/pvt/specification/{specificationId} | Get Specification
*SpecificationApi* | [**apiCatalogPvtSpecificationSpecificationIdPut**](docs/SpecificationApi.md#apicatalogpvtspecificationspecificationidput) | **PUT** /api/catalog/pvt/specification/{specificationId} | Update Specification
*SpecificationFieldApi* | [**specificationsField**](docs/SpecificationFieldApi.md#specificationsfield) | **GET** /api/catalog_system/pub/specification/fieldGet/{fieldId} | Get Specifications Field
*SpecificationFieldApi* | [**specificationsInsertField**](docs/SpecificationFieldApi.md#specificationsinsertfield) | **POST** /api/catalog_system/pvt/specification/field | Create Specifications Field
*SpecificationFieldApi* | [**specificationsInsertFieldUpdate**](docs/SpecificationFieldApi.md#specificationsinsertfieldupdate) | **PUT** /api/catalog_system/pvt/specification/field | Update Specifications Field
*SpecificationFieldValueApi* | [**specificationsGetFieldValue**](docs/SpecificationFieldValueApi.md#specificationsgetfieldvalue) | **GET** /api/catalog_system/pvt/specification/fieldValue/{fieldValueId} | Get Specifications Field Value
*SpecificationFieldValueApi* | [**specificationsInsertFieldValue**](docs/SpecificationFieldValueApi.md#specificationsinsertfieldvalue) | **POST** /api/catalog_system/pvt/specification/fieldValue | Create Specifications Field Value
*SpecificationFieldValueApi* | [**specificationsUpdateFieldValue**](docs/SpecificationFieldValueApi.md#specificationsupdatefieldvalue) | **PUT** /api/catalog_system/pvt/specification/fieldValue | Update Specifications Field Value
*SpecificationFieldValueApi* | [**specificationsValuesByFieldId**](docs/SpecificationFieldValueApi.md#specificationsvaluesbyfieldid) | **GET** /api/catalog_system/pub/specification/fieldvalue/{fieldId} | Get Specifications Values By Field Id
*SpecificationGroupApi* | [**apiCatalogPvtSpecificationgroupGroupIdPut**](docs/SpecificationGroupApi.md#apicatalogpvtspecificationgroupgroupidput) | **PUT** /api/catalog/pvt/specificationgroup/{groupId} | Update Specification Group
*SpecificationGroupApi* | [**specificationGroupInsert**](docs/SpecificationGroupApi.md#specificationgroupinsert) | **POST** /api/catalog_system/pvt/specification/group | Create Specification Group
*SpecificationGroupApi* | [**specificationGroupInsert2**](docs/SpecificationGroupApi.md#specificationgroupinsert2) | **POST** /api/catalog/pvt/specificationgroup | Create Specification Group
*SpecificationGroupApi* | [**specificationGroupUpdate**](docs/SpecificationGroupApi.md#specificationgroupupdate) | **PUT** /api/catalog_system/pvt/specification/group | Update Specification Group
*SpecificationGroupApi* | [**specificationsGroupGet**](docs/SpecificationGroupApi.md#specificationsgroupget) | **GET** /api/catalog_system/pub/specification/groupGet/{groupId} | Get Specifications Group
*SpecificationGroupApi* | [**specificationsGroupListbyCategory**](docs/SpecificationGroupApi.md#specificationsgrouplistbycategory) | **GET** /api/catalog_system/pvt/specification/groupbycategory/{categoryId} |  List Specifications Group by Category
*SpecificationValueApi* | [**apiCatalogPvtSpecificationvaluePost**](docs/SpecificationValueApi.md#apicatalogpvtspecificationvaluepost) | **POST** /api/catalog/pvt/specificationvalue | Create Specification Value
*SpecificationValueApi* | [**apiCatalogPvtSpecificationvalueSpecificationValueIdGet**](docs/SpecificationValueApi.md#apicatalogpvtspecificationvaluespecificationvalueidget) | **GET** /api/catalog/pvt/specificationvalue/{specificationValueId} | Get Specification Value
*SpecificationValueApi* | [**apiCatalogPvtSpecificationvalueSpecificationValueIdPut**](docs/SpecificationValueApi.md#apicatalogpvtspecificationvaluespecificationvalueidput) | **PUT** /api/catalog/pvt/specificationvalue/{specificationValueId} | Update Specification Value
*SubcollectionApi* | [**apiCatalogPvtCollectionCollectionIdPositionPost**](docs/SubcollectionApi.md#apicatalogpvtcollectioncollectionidpositionpost) | **POST** /api/catalog/pvt/collection/{collectionId}/position | Reposition SKU on the SubCollection
*SubcollectionApi* | [**apiCatalogPvtCollectionCollectionIdSubcollectionGet**](docs/SubcollectionApi.md#apicatalogpvtcollectioncollectionidsubcollectionget) | **GET** /api/catalog/pvt/collection/{collectionId}/subcollection | Get Subcollection by Collection ID
*SubcollectionApi* | [**apiCatalogPvtSubcollectionPost**](docs/SubcollectionApi.md#apicatalogpvtsubcollectionpost) | **POST** /api/catalog/pvt/subcollection | Create SubCollection
*SubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdDelete**](docs/SubcollectionApi.md#apicatalogpvtsubcollectionsubcollectioniddelete) | **DELETE** /api/catalog/pvt/subcollection/{subCollectionId} | Delete SubCollection
*SubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdGet**](docs/SubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidget) | **GET** /api/catalog/pvt/subcollection/{subCollectionId} | Get SubCollection
*SubcollectionApi* | [**apiCatalogPvtSubcollectionSubCollectionIdPut**](docs/SubcollectionApi.md#apicatalogpvtsubcollectionsubcollectionidput) | **PUT** /api/catalog/pvt/subcollection/{subCollectionId} | Update SubCollection
*SupplierApi* | [**apiCatalogPvtSupplierPost**](docs/SupplierApi.md#apicatalogpvtsupplierpost) | **POST** /api/catalog/pvt/supplier | Create Supplier
*SupplierApi* | [**apiCatalogPvtSupplierSupplierIdDelete**](docs/SupplierApi.md#apicatalogpvtsuppliersupplieriddelete) | **DELETE** /api/catalog/pvt/supplier/{supplierId} | Delete Supplier
*SupplierApi* | [**apiCatalogPvtSupplierSupplierIdPut**](docs/SupplierApi.md#apicatalogpvtsuppliersupplieridput) | **PUT** /api/catalog/pvt/supplier/{supplierId} | Update Supplier
*TradePolicyApi* | [**apiCatalogPvtProductProductIdSalespolicyGet**](docs/TradePolicyApi.md#apicatalogpvtproductproductidsalespolicyget) | **GET** /api/catalog/pvt/product/{productId}/salespolicy | Get Trade Policy by Product ID
*TradePolicyApi* | [**apiCatalogPvtProductProductIdSalespolicyTradepolicyIdDelete**](docs/TradePolicyApi.md#apicatalogpvtproductproductidsalespolicytradepolicyiddelete) | **DELETE** /api/catalog/pvt/product/{productId}/salespolicy/{tradepolicyId} | Delete Product to Trade Policy
*TradePolicyApi* | [**apiCatalogPvtProductProductIdSalespolicyTradepolicyIdPost**](docs/TradePolicyApi.md#apicatalogpvtproductproductidsalespolicytradepolicyidpost) | **POST** /api/catalog/pvt/product/{productId}/salespolicy/{tradepolicyId} | Create Product to Trade Policy
*TradePolicyApi* | [**apiCatalogSystemPvtSkuStockkeepingunitidsbysaleschannelGet**](docs/TradePolicyApi.md#apicatalogsystempvtskustockkeepingunitidsbysaleschannelget) | **GET** /api/catalog_system/pvt/sku/stockkeepingunitidsbysaleschannel | List all SKUs of a Trade Policy


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AlternateIds](docs/AlternateIds.md)
 - [org.openapitools.client.models.AssociateattachmentstoSKURequest](docs/AssociateattachmentstoSKURequest.md)
 - [org.openapitools.client.models.Attachment](docs/Attachment.md)
 - [org.openapitools.client.models.Brand](docs/Brand.md)
 - [org.openapitools.client.models.Child](docs/Child.md)
 - [org.openapitools.client.models.CreateSellerRequest](docs/CreateSellerRequest.md)
 - [org.openapitools.client.models.Dimension](docs/Dimension.md)
 - [org.openapitools.client.models.Example](docs/Example.md)
 - [org.openapitools.client.models.Example1](docs/Example1.md)
 - [org.openapitools.client.models.Example10](docs/Example10.md)
 - [org.openapitools.client.models.Example11](docs/Example11.md)
 - [org.openapitools.client.models.Example12](docs/Example12.md)
 - [org.openapitools.client.models.Example13](docs/Example13.md)
 - [org.openapitools.client.models.Example2](docs/Example2.md)
 - [org.openapitools.client.models.Example3](docs/Example3.md)
 - [org.openapitools.client.models.Example4](docs/Example4.md)
 - [org.openapitools.client.models.Example5](docs/Example5.md)
 - [org.openapitools.client.models.Example7](docs/Example7.md)
 - [org.openapitools.client.models.Example8](docs/Example8.md)
 - [org.openapitools.client.models.Example9](docs/Example9.md)
 - [org.openapitools.client.models.Field](docs/Field.md)
 - [org.openapitools.client.models.GetSKUseller](docs/GetSKUseller.md)
 - [org.openapitools.client.models.Image](docs/Image.md)
 - [org.openapitools.client.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.client.models.InlineObject1](docs/InlineObject1.md)
 - [org.openapitools.client.models.InlineObject10](docs/InlineObject10.md)
 - [org.openapitools.client.models.InlineObject13](docs/InlineObject13.md)
 - [org.openapitools.client.models.InlineObject14](docs/InlineObject14.md)
 - [org.openapitools.client.models.InlineObject15](docs/InlineObject15.md)
 - [org.openapitools.client.models.InlineObject16](docs/InlineObject16.md)
 - [org.openapitools.client.models.InlineObject17](docs/InlineObject17.md)
 - [org.openapitools.client.models.InlineObject2](docs/InlineObject2.md)
 - [org.openapitools.client.models.InlineObject3](docs/InlineObject3.md)
 - [org.openapitools.client.models.InlineObject4](docs/InlineObject4.md)
 - [org.openapitools.client.models.InlineObject5](docs/InlineObject5.md)
 - [org.openapitools.client.models.InlineObject6](docs/InlineObject6.md)
 - [org.openapitools.client.models.InlineObject7](docs/InlineObject7.md)
 - [org.openapitools.client.models.InlineObject8](docs/InlineObject8.md)
 - [org.openapitools.client.models.InlineObject9](docs/InlineObject9.md)
 - [org.openapitools.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [org.openapitools.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [org.openapitools.client.models.InlineResponse20010](docs/InlineResponse20010.md)
 - [org.openapitools.client.models.InlineResponse20011](docs/InlineResponse20011.md)
 - [org.openapitools.client.models.InlineResponse20012](docs/InlineResponse20012.md)
 - [org.openapitools.client.models.InlineResponse20013](docs/InlineResponse20013.md)
 - [org.openapitools.client.models.InlineResponse20014](docs/InlineResponse20014.md)
 - [org.openapitools.client.models.InlineResponse20015](docs/InlineResponse20015.md)
 - [org.openapitools.client.models.InlineResponse20016](docs/InlineResponse20016.md)
 - [org.openapitools.client.models.InlineResponse20016Items](docs/InlineResponse20016Items.md)
 - [org.openapitools.client.models.InlineResponse20017](docs/InlineResponse20017.md)
 - [org.openapitools.client.models.InlineResponse20018](docs/InlineResponse20018.md)
 - [org.openapitools.client.models.InlineResponse20019](docs/InlineResponse20019.md)
 - [org.openapitools.client.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [org.openapitools.client.models.InlineResponse20020](docs/InlineResponse20020.md)
 - [org.openapitools.client.models.InlineResponse20021](docs/InlineResponse20021.md)
 - [org.openapitools.client.models.InlineResponse20022](docs/InlineResponse20022.md)
 - [org.openapitools.client.models.InlineResponse20023](docs/InlineResponse20023.md)
 - [org.openapitools.client.models.InlineResponse20024](docs/InlineResponse20024.md)
 - [org.openapitools.client.models.InlineResponse20025](docs/InlineResponse20025.md)
 - [org.openapitools.client.models.InlineResponse2003](docs/InlineResponse2003.md)
 - [org.openapitools.client.models.InlineResponse2004](docs/InlineResponse2004.md)
 - [org.openapitools.client.models.InlineResponse2005](docs/InlineResponse2005.md)
 - [org.openapitools.client.models.InlineResponse2006](docs/InlineResponse2006.md)
 - [org.openapitools.client.models.InlineResponse2007](docs/InlineResponse2007.md)
 - [org.openapitools.client.models.InlineResponse2008](docs/InlineResponse2008.md)
 - [org.openapitools.client.models.InlineResponse2009](docs/InlineResponse2009.md)
 - [org.openapitools.client.models.InlineResponse200Data](docs/InlineResponse200Data.md)
 - [org.openapitools.client.models.InlineResponse200Range](docs/InlineResponse200Range.md)
 - [org.openapitools.client.models.Paging](docs/Paging.md)
 - [org.openapitools.client.models.ProductSpecification](docs/ProductSpecification.md)
 - [org.openapitools.client.models.RealDimension](docs/RealDimension.md)
 - [org.openapitools.client.models.RequestBody](docs/RequestBody.md)
 - [org.openapitools.client.models.RequestBody1](docs/RequestBody1.md)
 - [org.openapitools.client.models.RequestBody10](docs/RequestBody10.md)
 - [org.openapitools.client.models.RequestBody11](docs/RequestBody11.md)
 - [org.openapitools.client.models.RequestBody12](docs/RequestBody12.md)
 - [org.openapitools.client.models.RequestBody13](docs/RequestBody13.md)
 - [org.openapitools.client.models.RequestBody14](docs/RequestBody14.md)
 - [org.openapitools.client.models.RequestBody15](docs/RequestBody15.md)
 - [org.openapitools.client.models.RequestBody16](docs/RequestBody16.md)
 - [org.openapitools.client.models.RequestBody17](docs/RequestBody17.md)
 - [org.openapitools.client.models.RequestBody18](docs/RequestBody18.md)
 - [org.openapitools.client.models.RequestBody19](docs/RequestBody19.md)
 - [org.openapitools.client.models.RequestBody2](docs/RequestBody2.md)
 - [org.openapitools.client.models.RequestBody20](docs/RequestBody20.md)
 - [org.openapitools.client.models.RequestBody21](docs/RequestBody21.md)
 - [org.openapitools.client.models.RequestBody3](docs/RequestBody3.md)
 - [org.openapitools.client.models.RequestBody4](docs/RequestBody4.md)
 - [org.openapitools.client.models.RequestBody5](docs/RequestBody5.md)
 - [org.openapitools.client.models.RequestBody6](docs/RequestBody6.md)
 - [org.openapitools.client.models.RequestBody7](docs/RequestBody7.md)
 - [org.openapitools.client.models.RequestBody8](docs/RequestBody8.md)
 - [org.openapitools.client.models.RequestBody9](docs/RequestBody9.md)
 - [org.openapitools.client.models.ResquestBody](docs/ResquestBody.md)
 - [org.openapitools.client.models.ResquestBody1](docs/ResquestBody1.md)
 - [org.openapitools.client.models.ResquetBody](docs/ResquetBody.md)
 - [org.openapitools.client.models.ResquetBody1](docs/ResquetBody1.md)
 - [org.openapitools.client.models.SKUFileURL](docs/SKUFileURL.md)
 - [org.openapitools.client.models.SkuSeller](docs/SkuSeller.md)
 - [org.openapitools.client.models.SkuSpecification](docs/SkuSpecification.md)
 - [org.openapitools.client.models.SpecificationGroupInsertRequest](docs/SpecificationGroupInsertRequest.md)
 - [org.openapitools.client.models.SpecificationGroupUpdateRequest](docs/SpecificationGroupUpdateRequest.md)
 - [org.openapitools.client.models.SpecificationsInsertFieldRequest](docs/SpecificationsInsertFieldRequest.md)
 - [org.openapitools.client.models.SpecificationsInsertFieldUpdateRequest](docs/SpecificationsInsertFieldUpdateRequest.md)
 - [org.openapitools.client.models.SpecificationsInsertFieldValueRequest](docs/SpecificationsInsertFieldValueRequest.md)
 - [org.openapitools.client.models.SpecificationsUpdateFieldValueRequest](docs/SpecificationsUpdateFieldValueRequest.md)
 - [org.openapitools.client.models.UpdateProductSpecificationRequest](docs/UpdateProductSpecificationRequest.md)
 - [org.openapitools.client.models.UpdateSellerRequest](docs/UpdateSellerRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="appKey"></a>
### appKey

- **Type**: API key
- **API key parameter name**: X-VTEX-API-AppKey
- **Location**: HTTP header

<a name="appToken"></a>
### appToken

- **Type**: API key
- **API key parameter name**: X-VTEX-API-AppToken
- **Location**: HTTP header

