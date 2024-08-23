package com.autoservice.autoservice_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity representing a part in the system.
 */
@Entity
@Table(name = "parts")
@Getter
@Setter
@ToString
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partId;

    private String partName;
    private Integer quantityInStock;
    private Double price;
}