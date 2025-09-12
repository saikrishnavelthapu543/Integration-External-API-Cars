package com.example.Cars.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseByCar {
    @JsonProperty("Cars")
    private List<Car> car;

    public ResponseByCar(List<Car> car) {
        this.car = car;
    }

    public ResponseByCar() {
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
