package com.maple.search.service;

import com.maple.search.model.Car;
import com.maple.search.repo.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarService {

    @Autowired
    CarRepository carRepository;

    public void save(Car car){
        carRepository.save(car);
    }

    public Iterable<Car>getALlCar(){
        return carRepository.findAll();
    }
}
