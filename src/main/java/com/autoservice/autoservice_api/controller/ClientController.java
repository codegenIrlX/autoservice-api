package com.autoservice.autoservice_api.controller;

import com.autoservice.autoservice_api.dto.ClientDTO;
import com.autoservice.autoservice_api.entity.Client;
import com.autoservice.autoservice_api.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Контроллер для работы с клиентами.
 */
@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    /**
     * Получить список всех клиентов.
     *
     * @return список DTO клиентов
     */
    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }

    /**
     * Получить клиента по идентификатору.
     *
     * @param clientId идентификатор клиента
     * @return DTO клиента
     */
    @GetMapping("/{clientId}")
    public ClientDTO getClientById(@PathVariable Long clientId) {
        return clientService.getClientById(clientId);
    }

    /**
     * Удалить клиента по идентификатору.
     *
     * @param clientId идентификатор клиента
     * @return ResponseEntity с сообщением об удалении
     */
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Map<String, Object>> deleteClientById(@PathVariable Long clientId) {
        String message = clientService.deleteClientById(clientId);
        Map<String, Object> response = Map.of(
                "status", message,
                "timestamp", LocalDateTime.now()
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}