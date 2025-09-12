package com.example.Cars.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseAllCars {
    @JsonProperty("cars")
    private List<Car> car;

    public ResponseAllCars(List<Car> car) {
        this.car = car;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public ResponseAllCars() {
    }
}
