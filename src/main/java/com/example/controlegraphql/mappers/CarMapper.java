package com.example.controlegraphql.mappers;

import com.example.controlegraphql.dtos.CarDTO;
import com.example.controlegraphql.entities.Car;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

public class CarMapper {

    ModelMapper modelMapper = new ModelMapper();
    public CarDTO mapCarToCarDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }

    public Car mapCarDTOToCar(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }

}
