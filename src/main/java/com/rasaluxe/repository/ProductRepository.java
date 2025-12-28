package com.rasaluxe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rasaluxe.entity.ProductInfo;
import com.rasaluxe.enums.ProductTypeEnum;

@Repository
public interface ProductRepository extends JpaRepository<ProductInfo, Integer> {

    List<ProductInfo> findByProductType(ProductTypeEnum productType);
}
