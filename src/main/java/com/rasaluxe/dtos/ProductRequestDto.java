package com.rasaluxe.dtos;

import java.math.BigDecimal;

import com.rasaluxe.enums.ProductTypeEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProductRequestDto {

	@NotBlank
	private String productName;

	@NotBlank
	private String productCode;

	@NotNull
	private ProductTypeEnum productType;

	private String productCollectionName;

	private String productWaxType;

	private String productWickType;

	@Positive
	private Integer productNetWeightG;

	@Positive
	private Integer productGrossWeightG;

	@Positive
	private Integer productBurnTimeHours;

	private String fragranceName;

	@NotNull
	@Positive
	private BigDecimal productPriceMrp;

	@NotNull
	@Positive
	private BigDecimal productPriceSelling;

	@NotNull
	@PositiveOrZero
	private Integer productStockQuantity;

	private String productDescription;

	private String productStory;

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

}
