package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.RepairRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for RepairRequest entity.
 */
@Repository
public interface RepairRequestRepository extends JpaRepository<RepairRequest, Long> {
}