package com.autoservice.autoservice_api.service;

import com.autoservice.autoservice_api.dto.CarDTO;
import com.autoservice.autoservice_api.entity.Car;
import com.autoservice.autoservice_api.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для работы с автомобилями.
 */
@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    /**
     * Получить список всех автомобилей.
     *
     * @return список DTO автомобилей
     */
    public List<CarDTO> getAllCars() {
        return carRepository.findAll().stream()
                .map(car -> CarDTO.builder()
                        .carId(car.getCarId())
                        .clientId(car.getClient().getClientId())
                        .make(car.getMake())
                        .model(car.getModel())
                        .year(car.getYear())
                        .vinNumber(car.getVinNumber())
                        .color(car.getColor())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * Получить автомобиль по идентификатору.
     *
     * @param carId идентификатор автомобиля
     * @return DTO автомобиля
     * @throws ResponseStatusException если автомобиль не найден
     */
    public CarDTO getCarById(Long carId) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));
        return CarDTO.builder()
                .carId(car.getCarId())
                .clientId(car.getClient().getClientId())
                .make(car.getMake())
                .model(car.getModel())
                .year(car.getYear())
                .vinNumber(car.getVinNumber())
                .color(car.getColor())
                .build();
    }
}
