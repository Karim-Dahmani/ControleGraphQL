package com.example.controlegraphql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class Car {
    @Id
    private Long id;
    private String model;
    private String color;
    private String matricul;
    private double price;


}
