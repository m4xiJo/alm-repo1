package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import com.example.springdocker.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CarController {
    private final CarService service;

    @GetMapping("/foods")
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("/foods")
    public void saveNewCar(@RequestBody Food food) {
        service.saveNewCar(car);
    }

    @GetMapping("/foods/cookable")
    public List<String> getWorkingCars() {
        return service.getWorkingCars();
    }
}
