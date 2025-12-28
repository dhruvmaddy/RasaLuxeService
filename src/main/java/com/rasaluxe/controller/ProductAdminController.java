package com.rasaluxe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rasaluxe.dtos.ProductRequestDto;
import com.rasaluxe.dtos.ProductResponseDto;
import com.rasaluxe.enums.ProductTypeEnum;
import com.rasaluxe.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin/products")
public class ProductAdminController {

    private final ProductService productService;

    public ProductAdminController(ProductService productService) {
        this.productService = productService;
    }

    // ✅ CREATE
    @PostMapping
    public ProductResponseDto createProduct(
            @Valid @RequestBody ProductRequestDto request) {
        return productService.createProduct(request);
    }

    // ✅ UPDATE
    @PutMapping("/{productId}")
    public ProductResponseDto updateProduct(
            @PathVariable Integer productId,
            @Valid @RequestBody ProductRequestDto request) {
        return productService.updateProduct(productId, request);
    }

    // ✅ GET ALL
    @GetMapping
    public List<ProductResponseDto> getAllProducts() {
        return productService.getAllProducts();
    }

    // ✅ GET BY TYPE
    @GetMapping("/type/{type}")
    public List<ProductResponseDto> getProductsByType(
            @PathVariable ProductTypeEnum type) {
        return productService.getProductsByType(type);
    }

    // ✅ GET BY ID
    @GetMapping("/{productId}")
    public ProductResponseDto getProductById(
            @PathVariable Integer productId) {
        return productService.getProductById(productId);
    }

    // ✅ ACTIVATE / DEACTIVATE
    @PatchMapping("/{productId}/status")
    public void updateProductStatus(
            @PathVariable Integer productId,
            @RequestParam Boolean active) {
        productService.updateProductStatus(productId, active);
    }

    // ✅ DELETE
    @DeleteMapping("/{productId}")
    public void deleteProduct(
            @PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }
}
