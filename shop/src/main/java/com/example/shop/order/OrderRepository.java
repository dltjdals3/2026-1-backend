package com.example.shop.order;

import org.springframework.stereotype.Repository;
import java.util.*;

/**
 * Repository
 * 현재 구현: 메모리 저장소 (Map 사용)
 */
@Repository
public class OrderRepository {

    /**
     * 메모리 저장소
     * - HashMap: Key-Value 쌍으로 데이터를 저장
     * - Key: 주문 ID (Long), Value: 주문 객체 (Order)
     */
    private final Map<Long, Order> store = new HashMap<>();

    /**
     * ID 자동 생성기
     * - 주문이 추가될 때마다 1씩 증가
     */
    private long sequence = 0L;

    /**
     * 주문 저장
     *
     * @param order 저장할 주문 객체
     * @return 저장된 주문 객체 (ID가 할당된 상태)
     */
    public Order save(Order order) {
        if (order.getId() == null) {
            sequence++;
            order.setId(sequence);
        }
        store.put(order.getId(), order);
        return order;
    }

    /**
     * ID로 주문 조회
     *
     * @param id 조회할 주문의 ID
     * @return Order - 주문이 있으면 Order 객체, 없으면 null 반환
     */
    public Order findById(Long id) {
        return store.get(id);
    }

    /**
     * 전체 주문 조회
     *
     * @return 모든 주문의 리스트
     */
    public List<Order> findAll() {
        return new ArrayList<>(store.values());
    }

    /**
     * 주문 삭제
     *
     * @param id 삭제할 주문의 ID
     */
    public void deleteById(Long id) {
        store.remove(id);
    }
}