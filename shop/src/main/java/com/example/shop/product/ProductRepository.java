package com.example.shop.product;

import org.springframework.stereotype.Repository;
import java.util.*;

/**
 * Repository
 * 현재 구현: 메모리 저장소 (Map 사용)
 */
@Repository
public class ProductRepository {

    /**
     * 메모리 저장소
     * - HashMap: Key-Value 쌍으로 데이터를 저장
     * - Key: 상품 ID (Long), Value: 상품 객체 (Product)
     */
    private final Map<Long, Product> store = new HashMap<>();

    /**
     * ID 자동 생성기
     * - 상품이 추가될 때마다 1씩 증가
     */
    private long sequence = 0L;

    /**
     * 상품 저장
     *
     * @param product 저장할 상품 객체
     * @return 저장된 상품 객체 (ID가 할당된 상태)
     */
    public Product save(Product product) {
        if (product.getId() == null) {
            sequence++;
            product.setId(sequence);
        }
        store.put(product.getId(), product);
        return product;
    }

    /**
     * ID로 상품 조회
     *
     * @param id 조회할 상품의 ID
     * @return Product - 상품이 있으면 Product 객체, 없으면 null 반환
     */
    public Product findById(Long id) {
        return store.get(id);
    }

    /**
     * 전체 상품 조회
     *
     * @return 모든 상품의 리스트
     */
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    /**
     * 상품 삭제
     *
     * @param id 삭제할 상품의 ID
     */
    public void deleteById(Long id) {
        store.remove(id);
    }
}