package com.autoservice.autoservice_api.service;

import com.autoservice.autoservice_api.dto.ClientDTO;
import com.autoservice.autoservice_api.entity.Client;
import com.autoservice.autoservice_api.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Сервис для работы с клиентами.
 */
@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    /**
     * Получить список всех клиентов.
     *
     * @return список DTO клиентов
     */
    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll().stream()
                .map(client -> ClientDTO.builder()
                        .clientId(client.getClientId())
                        .firstName(client.getFirstName())
                        .lastName(client.getLastName())
                        .phone(client.getPhone())
                        .address(client.getAddress())
                        .email(client.getEmail())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * Получить клиента по идентификатору.
     *
     * @param clientId идентификатор клиента
     * @return DTO клиента
     * @throws ResponseStatusException если клиент не найден
     */
    public ClientDTO getClientById(Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found"));
        return ClientDTO.builder()
                .clientId(client.getClientId())
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .phone(client.getPhone())
                .address(client.getAddress())
                .email(client.getEmail())
                .build();
    }

    /**
     * Удалить клиента по идентификатору.
     *
     * @param clientId идентификатор клиента
     * @return сообщение об успешном удалении
     * @throws ResponseStatusException если клиент не найден
     */
    public String deleteClientById(Long clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            clientRepository.deleteById(clientId);
            return "Клиент с id " + clientId + " успешно удален";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found");
        }
    }
}