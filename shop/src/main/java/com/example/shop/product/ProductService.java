package com.example.shop.product;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.shop.product.dto.ProductCreateRequest;
import com.example.shop.product.dto.ProductUpdateRequest;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // 상품 등록
    public Long createProduct(ProductCreateRequest request) {
        Product product = new Product(
                request.getName(),
                request.getPrice(),
                request.getStock()
        );

        productRepository.save(product);
        return product.getId();
    }

    // 전체 상품 조회
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 단건 상품 조회
    public Product getProduct(Long id) {
        Product product = productRepository.findById(id);

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }

        return product;
    }

    // 상품 정보 수정
    public void updateProduct(Long id, ProductUpdateRequest request) {
        Product product = productRepository.findById(id);

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }

        // 상품 정보 수정 (도메인 객체의 메서드 사용)
        product.updateInfo(request.getPrice(), request.getStock());
    }

    // 상품 삭제
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id);

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }

        productRepository.deleteById(id);
    }
}