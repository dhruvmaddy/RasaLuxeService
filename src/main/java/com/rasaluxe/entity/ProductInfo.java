package com.rasaluxe.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_info")
@Getter
@Setter
public class ProductInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_code")
	private String productCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fragrance_id", nullable = false)
	private Fragrance fragrance;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_type_id", nullable = false)
	private ProductType productType;

	@Column(name = "product_collection_name")
	private String productCollectionName;

	@Column(name = "product_wax_type")
	private String productWaxType;

	@Column(name = "product_wick_type")
	private String productWickType;

	@Column(name = "product_net_weight_g")
	private Integer productNetWeightG;

	@Column(name = "product_gross_weight_g")
	private Integer productGrossWeightG;

	@Column(name = "product_burn_time_hours")
	private Integer productBurnTimeHours;

	@Column(name = "product_price_mrp")
	private BigDecimal productPriceMrp;

	@Column(name = "product_price_selling")
	private BigDecimal productPriceSelling;

	@Column(name = "product_stock_quantity")
	private Integer productStockQuantity;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "product_story")
	private String productStory;

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProductImage> productImages;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

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

	public Fragrance getFragrance() {
		return fragrance;
	}

	public void setFragrance(Fragrance fragrance) {
		this.fragrance = fragrance;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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

	public List<ProductImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}