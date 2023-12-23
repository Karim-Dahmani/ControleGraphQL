package com.example.controlegraphql.sevice;

import com.example.controlegraphql.dtos.CarDTO;
import com.example.controlegraphql.entities.Car;
import org.hibernate.annotations.WhereJoinTable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarManager {

    public List<CarDTO> getCarByModel(String model);
    public List<CarDTO> getCarByModelAndPrice(String model , double price);
    public CarDTO saveCar(Car car);
    public CarDTO DeleteCar(Long id);
}
