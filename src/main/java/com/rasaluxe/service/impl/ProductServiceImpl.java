package com.rasaluxe.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rasaluxe.dtos.ProductRequestDto;
import com.rasaluxe.dtos.ProductResponseDto;
import com.rasaluxe.entity.ProductInfo;
import com.rasaluxe.enums.ProductTypeEnum;
import com.rasaluxe.repository.ProductRepository;
import com.rasaluxe.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ✅ CREATE
    @Override
    public ProductResponseDto createProduct(ProductRequestDto request) {

        ProductInfo product = new ProductInfo();
        mapRequestToEntity(request, product);

        product.setIsActive(true); // default active

        ProductInfo saved = productRepository.save(product);
        return mapEntityToResponse(saved);
    }

    // ✅ UPDATE
    @Override
    public ProductResponseDto updateProduct(Integer productId, ProductRequestDto request) {

        ProductInfo product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        mapRequestToEntity(request, product);

        ProductInfo updated = productRepository.save(product);
        return mapEntityToResponse(updated);
    }

    // ✅ GET BY ID
    @Override
    public ProductResponseDto getProductById(Integer productId) {

        ProductInfo product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return mapEntityToResponse(product);
    }

    // ✅ GET ALL
    @Override
    public List<ProductResponseDto> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(this::mapEntityToResponse)
                .collect(Collectors.toList());
    }

    // ✅ GET BY TYPE
    @Override
    public List<ProductResponseDto> getProductsByType(ProductTypeEnum type) {

        return productRepository.findByProductType(type)
                .stream()
                .map(this::mapEntityToResponse)
                .collect(Collectors.toList());
    }

    // ✅ ACTIVATE / DEACTIVATE
    @Override
    public void updateProductStatus(Integer productId, Boolean active) {

        ProductInfo product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setIsActive(active);
        productRepository.save(product);
    }

    // ✅ DELETE
    @Override
    public void deleteProduct(Integer productId) {

        if (!productRepository.existsById(productId)) {
            throw new RuntimeException("Product not found");
        }
        productRepository.deleteById(productId);
    }

    // 🔁 MAPPERS

    private void mapRequestToEntity(ProductRequestDto request, ProductInfo product) {

        product.setProductName(request.getProductName());
        product.setProductCode(request.getProductCode());
        //product.setProductType(request.getProductType());

        product.setProductCollectionName(request.getProductCollectionName());
        product.setProductWaxType(request.getProductWaxType());
        product.setProductWickType(request.getProductWickType());

        product.setProductNetWeightG(request.getProductNetWeightG());
        product.setProductGrossWeightG(request.getProductGrossWeightG());
        product.setProductBurnTimeHours(request.getProductBurnTimeHours());

        //product.setFragranceName(request.getFragranceName());

        product.setProductPriceMrp(request.getProductPriceMrp());
        product.setProductPriceSelling(request.getProductPriceSelling());

        product.setProductStockQuantity(request.getProductStockQuantity());

        product.setProductDescription(request.getProductDescription());
        product.setProductStory(request.getProductStory());
    }

    private ProductResponseDto mapEntityToResponse(ProductInfo product) {

        ProductResponseDto dto = new ProductResponseDto();

        dto.setProductId(product.getProductId());
        dto.setProductName(product.getProductName());
        dto.setProductCode(product.getProductCode());
        //dto.setProductType(product.getProductType());

        dto.setProductCollectionName(product.getProductCollectionName());
        dto.setProductWaxType(product.getProductWaxType());
        dto.setProductWickType(product.getProductWickType());

        dto.setProductNetWeightG(product.getProductNetWeightG());
        dto.setProductGrossWeightG(product.getProductGrossWeightG());
        dto.setProductBurnTimeHours(product.getProductBurnTimeHours());

        //dto.setFragranceName(product.getFragrance());

        dto.setProductPriceMrp(product.getProductPriceMrp());
        dto.setProductPriceSelling(product.getProductPriceSelling());

        dto.setProductStockQuantity(product.getProductStockQuantity());
        dto.setActive(product.getIsActive());

        dto.setProductDescription(product.getProductDescription());
        dto.setProductStory(product.getProductStory());

        // images handled separately
        dto.setProductImages(null);

        return dto;
    }
}
