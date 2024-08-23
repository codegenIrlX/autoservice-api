package com.autoservice.autoservice_api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO для автомобиля.
 */
@Getter
@Setter
@Builder
@ToString
public class CarDTO {
    private Long carId;
    private Long clientId;
    private String make;
    private String model;
    private Integer year;
    private String vinNumber;
    private String color;
}