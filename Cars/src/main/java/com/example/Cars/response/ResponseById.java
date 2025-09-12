package com.example.Cars.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseById {
    @JsonProperty("Car")
    private Car car;

    public ResponseById(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ResponseById() {
    }
}
