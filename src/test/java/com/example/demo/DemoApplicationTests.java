package com.example.demo;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    CarRepository carRepository;

    @Test
    void asdwferrf() {
        Car myCar = new Car();
        myCar.setBrand("asfw");
        myCar.setModel("asdw");

        carRepository.save(myCar);
    }

    @Test
    void contexsdwtLoads() {
        Optional<Car> audi = carRepository.findById(2L);

        if (audi.isPresent()) {
            System.out.println(audi.get());
        } else {
            System.out.println("could not find the car");
        }
//		carRepository.save(myCar);

    }

}
