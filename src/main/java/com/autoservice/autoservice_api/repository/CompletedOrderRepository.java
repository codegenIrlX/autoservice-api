package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.CompletedOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for CompletedOrder entity.
 */
@Repository
public interface CompletedOrderRepository extends JpaRepository<CompletedOrder, Long> {
}