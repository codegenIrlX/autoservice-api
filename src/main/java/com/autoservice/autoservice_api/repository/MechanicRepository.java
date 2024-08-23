package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Mechanic entity.
 */
@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Long> {
}