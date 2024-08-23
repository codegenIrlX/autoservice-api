package com.autoservice.autoservice_api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO для клиента.
 */
@Getter
@Setter
@Builder
@ToString
public class ClientDTO {
    private Long clientId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String email;
}