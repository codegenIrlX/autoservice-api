package com.autoservice.autoservice_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity representing a car in the system.
 */
@Entity
@Table(name = "cars")
@Getter
@Setter
@ToString
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    private String make;
    private String model;
    private Integer year;
    private String vinNumber;
    private String color;
}