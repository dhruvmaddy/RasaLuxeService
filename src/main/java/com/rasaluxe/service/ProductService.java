package com.rasaluxe.service;

import java.util.List;

import com.rasaluxe.dtos.ProductRequestDto;
import com.rasaluxe.dtos.ProductResponseDto;
import com.rasaluxe.enums.ProductTypeEnum;

public interface ProductService {

    ProductResponseDto createProduct(ProductRequestDto request);

    ProductResponseDto updateProduct(Integer productId, ProductRequestDto request);

    ProductResponseDto getProductById(Integer productId);

    List<ProductResponseDto> getAllProducts();

    List<ProductResponseDto> getProductsByType(ProductTypeEnum type);

    void updateProductStatus(Integer productId, Boolean active);

    void deleteProduct(Integer productId);
}
