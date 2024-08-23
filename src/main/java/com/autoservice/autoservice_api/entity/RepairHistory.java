package com.autoservice.autoservice_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Entity representing the repair history of a car.
 */
@Entity
@Table(name = "repair_history")
@Getter
@Setter
@ToString
public class RepairHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long repairId;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    private LocalDate startDate;
    private LocalDate endDate;
    private String workDescription;
    private Double cost;
}