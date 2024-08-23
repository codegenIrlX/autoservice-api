package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.RepairHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for RepairHistory entity.
 */
@Repository
public interface RepairHistoryRepository extends JpaRepository<RepairHistory, Long> {
}