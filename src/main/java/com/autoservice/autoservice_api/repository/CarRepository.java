package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Car entity.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}