package com.example.controlegraphql.repository;

import com.example.controlegraphql.dtos.CarDTO;
import com.example.controlegraphql.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findByModel(String model);

    List<Car> findByModelAndPrice(String model, double price);
}
