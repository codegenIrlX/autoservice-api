package com.autoservice.autoservice_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Entity representing a completed repair order.
 */
@Entity
@Table(name = "completed_orders")
@Getter
@Setter
@ToString
public class CompletedOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "repair_id", nullable = false)
    private RepairHistory repairHistory;

    @ManyToOne
    @JoinColumn(name = "mechanic_id", nullable = false)
    private Mechanic mechanic;

    private LocalDate completionDate;
    private Integer timeSpent;
    private Integer customerRating;
}