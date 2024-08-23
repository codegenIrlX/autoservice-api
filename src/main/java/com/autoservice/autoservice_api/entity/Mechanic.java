package com.autoservice.autoservice_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity representing a mechanic in the system.
 */
@Entity
@Table(name = "mechanics")
@Getter
@Setter
@ToString
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mechanicId;

    private String firstName;
    private String lastName;
    private String specialization;
    private String status;
}