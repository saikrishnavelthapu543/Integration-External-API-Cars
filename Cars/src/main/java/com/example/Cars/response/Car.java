package com.example.Cars.response;

public class Car {
    private int id;
    private String car;
    private String car_model;
    private String car_color;
    private int car_model_year;
    private String car_vin;
    private String price;
    private boolean availability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public int getCar_model_year() {
        return car_model_year;
    }

    public void setCar_model_year(int car_model_year) {
        this.car_model_year = car_model_year;
    }

    public String getCar_vin() {
        return car_vin;
    }

    public void setCar_vin(String car_vin) {
        this.car_vin = car_vin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Car() {
    }

    public Car(int id, String car, String car_model, String car_color, int car_model_year, String car_vin, String price, boolean availability) {
        this.id = id;
        this.car = car;
        this.car_model = car_model;
        this.car_color = car_color;
        this.car_model_year = car_model_year;
        this.car_vin = car_vin;
        this.price = price;
        this.availability = availability;
    }
}
