package com.autoservice.autoservice_api.repository;


import com.autoservice.autoservice_api.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Part entity.
 */
@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
}