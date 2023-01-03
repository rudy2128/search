package com.maple.search.controllers;

import com.maple.search.model.Car;
import com.maple.search.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CarController {

    @Autowired
    CarService carService;


    @PostMapping("/save-car")
    public void save(@RequestBody Car car){
        car.setId("");
        car.setBrand(car.getBrand());
        car.setType(car.getType());
        car.setPrice(car.getPrice());
        car.setQuantity(car.getQuantity());
        car.setSubtotal(car.getPrice() * car.getQuantity());
        carService.save(car);
    }


    @GetMapping("get-all")
    public Iterable<Car>getAllCar(){
        return carService.getALlCar();
    }
}
