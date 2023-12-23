package com.example.controlegraphql;

import com.example.controlegraphql.entities.Car;
import com.example.controlegraphql.repository.CarRepository;
import com.example.controlegraphql.sevice.CarManager;
import com.example.controlegraphql.sevice.CarManagerAction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleGraphQlApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CarRepository carRepository){
        return args -> {
            Car car = Car.builder()
                    .id(1L)
                    .model("mercedes")
                    .color("black")
                    .price(150000)
                    .matricul("A51A122").build();
            Car car1 = Car.builder()
                    .id(2L)
                    .model("bmw")
                    .color("black")
                    .price(154000)
                    .matricul("B55444").build();
            Car car2 = Car.builder()
                    .id(3L)
                    .model("audi")
                    .color("white")
                    .price(177000)
                    .matricul("A55133").build();
            Car car4 = Car.builder()
                    .id(4L)
                    .model("ford")
                    .color("gray")
                    .price(100000)
                    .matricul("C221455").build();

            carRepository.saveAll(List.of(car1,car2,car,car4));

        };
    }

}
