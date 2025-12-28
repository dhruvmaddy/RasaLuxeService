package com.rasaluxe.entity;

import com.rasaluxe.enums.ProductTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_type")
@Getter
@Setter
public class ProductType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_type_id")
	private Integer productTypeId;

	@Enumerated(EnumType.STRING)
	@Column(name = "product_type_name", nullable = false)
	private ProductTypeEnum productTypeName;

	@Column(name = "is_active")
	private Boolean isActive;

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public ProductTypeEnum getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String ProductTypeEnum) {
		this.productTypeName = productTypeName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
