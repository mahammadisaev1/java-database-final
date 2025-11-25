package com.example.javadatabasefinal.repository;

import com.example.javadatabasefinal.model.OrderItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    @Modifying
    @Transactional
    public void deleteByProductId(Long productId);
}
