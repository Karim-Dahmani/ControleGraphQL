package com.example.controlegraphql.dtos;

import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CarDTO {
    private String model;
    private String color;
    private  double price;
}
