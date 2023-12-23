package com.example.controlegraphql.web;

import com.example.controlegraphql.dtos.CarDTO;
import com.example.controlegraphql.entities.Car;
import com.example.controlegraphql.sevice.CarManagerAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CarGraphQLController {
    @Autowired

    private CarManagerAction carQueryService;

    @QueryMapping
    public List<CarDTO> getCarByModel(@PathVariable String model) {
        return carQueryService.getCarByModel(model);
    }

    @QueryMapping
    public List<CarDTO> getCarByModelAndPrice(@Argument String model, @Argument double price) {
        return carQueryService.getCarByModelAndPrice(model, price);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument Car car) {
        return carQueryService.saveCar(car);
    }

    @MutationMapping
    public CarDTO deleteCar(@Argument Long id) {
        return carQueryService.DeleteCar(id);
    }
}
