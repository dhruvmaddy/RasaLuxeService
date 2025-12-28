package com.rasaluxe.dtos;

import java.math.BigDecimal;
import java.util.List;

import com.rasaluxe.entity.ProductImage;
import com.rasaluxe.enums.ProductTypeEnum;

public class ProductResponseDto {

	private Integer productId;
	private String productName;
	private String productCode;
	private ProductTypeEnum productType;

	private String productCollectionName;
	private String productWaxType;
	private String productWickType;

	private Integer productNetWeightG;
	private Integer productGrossWeightG;
	private Integer productBurnTimeHours;

	private String fragranceName;

	private BigDecimal productPriceMrp;
	private BigDecimal productPriceSelling;

	private Integer productStockQuantity;
	private boolean active;

	private String productDescription;
	private String productStory;

	private List<ProductImageResponseDto> productImages;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public ProductTypeEnum getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeEnum productType) {
		this.productType = productType;
	}

	public String getProductCollectionName() {
		return productCollectionName;
	}

	public void setProductCollectionName(String productCollectionName) {
		this.productCollectionName = productCollectionName;
	}

	public String getProductWaxType() {
		return productWaxType;
	}

	public void setProductWaxType(String productWaxType) {
		this.productWaxType = productWaxType;
	}

	public String getProductWickType() {
		return productWickType;
	}

	public void setProductWickType(String productWickType) {
		this.productWickType = productWickType;
	}

	public Integer getProductNetWeightG() {
		return productNetWeightG;
	}

	public void setProductNetWeightG(Integer productNetWeightG) {
		this.productNetWeightG = productNetWeightG;
	}

	public Integer getProductGrossWeightG() {
		return productGrossWeightG;
	}

	public void setProductGrossWeightG(Integer productGrossWeightG) {
		this.productGrossWeightG = productGrossWeightG;
	}

	public Integer getProductBurnTimeHours() {
		return productBurnTimeHours;
	}

	public void setProductBurnTimeHours(Integer productBurnTimeHours) {
		this.productBurnTimeHours = productBurnTimeHours;
	}

	public String getFragranceName() {
		return fragranceName;
	}

	public void setFragranceName(String fragranceName) {
		this.fragranceName = fragranceName;
	}

	public BigDecimal getProductPriceMrp() {
		return productPriceMrp;
	}

	public void setProductPriceMrp(BigDecimal productPriceMrp) {
		this.productPriceMrp = productPriceMrp;
	}

	public BigDecimal getProductPriceSelling() {
		return productPriceSelling;
	}

	public void setProductPriceSelling(BigDecimal productPriceSelling) {
		this.productPriceSelling = productPriceSelling;
	}

	public Integer getProductStockQuantity() {
		return productStockQuantity;
	}

	public void setProductStockQuantity(Integer productStockQuantity) {
		this.productStockQuantity = productStockQuantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductStory() {
		return productStory;
	}

	public void setProductStory(String productStory) {
		this.productStory = productStory;
	}

	public List<ProductImageResponseDto> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImageResponseDto> productImages) {
		this.productImages = productImages;
	}

}
