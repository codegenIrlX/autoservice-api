package com.autoservice.autoservice_api.repository;

import com.autoservice.autoservice_api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Client entity.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}