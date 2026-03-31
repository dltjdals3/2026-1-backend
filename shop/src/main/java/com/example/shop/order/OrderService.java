package com.example.shop.order;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.shop.order.dto.OrderCreateRequest;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    // 주문 생성
    public Long createOrder(OrderCreateRequest request) {
        Order order = new Order(
                request.getMemberId(),
                request.getProductId(),
                request.getQuantity()
        );

        orderRepository.save(order);
        return order.getId();
    }

    // 전체 주문 조회
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // 단건 주문 조회
    public Order getOrder(Long id) {
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        return order;
    }

    // 주문 취소
    public void deleteOrder(Long id) {
        Order order = orderRepository.findById(id);

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다.");
        }

        orderRepository.deleteById(id);
    }
}