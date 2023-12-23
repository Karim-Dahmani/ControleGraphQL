package com.example.controlegraphql.sevice;

import com.example.controlegraphql.dtos.CarDTO;
import com.example.controlegraphql.entities.Car;
import com.example.controlegraphql.mappers.CarMapper;
import com.example.controlegraphql.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarManagerAction implements CarManager{
    private CarRepository carRepository;
    private CarMapper carMapper;


    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        return cars.stream().map(carMapper::mapCarToCarDTO).collect(Collectors.toList());}

    @Override
    public List<CarDTO> getCarByModelAndPrice(String model, double price) {
        List<Car> cars = carRepository.findByModelAndPrice(model, price);
        return cars.isEmpty() ? null : (List<CarDTO>) carMapper.mapCarToCarDTO((cars.get(0)));
    }

    @Override
    public CarDTO saveCar(Car car) {
        if (car.getMatricul() == null || car.getMatricul().isEmpty()) {

            return null;
        }

        Car savedCar = carRepository.save(car);
        return carMapper.mapCarToCarDTO(savedCar);
    }

    @Override
    public CarDTO DeleteCar(Long id) {
        carRepository.deleteById(id);
        return new CarDTO();
    }
}
