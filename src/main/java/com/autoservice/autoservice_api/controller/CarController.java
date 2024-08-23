package com.autoservice.autoservice_api.controller;

import com.autoservice.autoservice_api.dto.CarDTO;
import com.autoservice.autoservice_api.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с автомобилями.
 */
@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    /**
     * Получить список всех автомобилей.
     *
     * @return список DTO автомобилей
     */
    @GetMapping
    public List<CarDTO> getAllCars() {
        return carService.getAllCars();
    }

    /**
     * Получить автомобиль по идентификатору.
     *
     * @param carId идентификатор автомобиля
     * @return DTO автомобиля
     */
    @GetMapping("/{carId}")
    public CarDTO getCarById(@PathVariable Long carId) {
        return carService.getCarById(carId);
    }
}