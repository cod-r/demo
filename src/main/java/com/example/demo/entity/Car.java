package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(generator = "car_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_gen", sequenceName = "car_seq", allocationSize = 1)
    private Long id;

    private String brand;

    private String model;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}

