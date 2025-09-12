package com.example.Cars.controller;

import com.example.Cars.response.ResponseAllCars;
import com.example.Cars.response.ResponseByCar;
import com.example.Cars.response.ResponseById;
import com.example.Cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarService carservice;

    @GetMapping("getbyId/{id}")
    public ResponseEntity<ResponseById> getnyId(@PathVariable int id)
    {
        return carservice.getId(id);
    }

    @GetMapping("getbyCar/{car}")
    public ResponseEntity<ResponseByCar> getbyName(@PathVariable String car)
    {
        return carservice.getbyName(car);
    }

    @GetMapping("getbyColor/{car_color}")
    public ResponseEntity<ResponseByCar> getbyColor(@PathVariable String car_color)
    {
        return carservice.getbyColor(car_color);
    }

    @GetMapping("getbyYear/{car_model_year}")
    public ResponseEntity<ResponseByCar> getbyYear(@PathVariable int car_model_year)
    {
        return carservice.getbyYear(car_model_year);
    }

    @GetMapping("getcars/{car_model_year}")
    public ResponseEntity<ResponseByCar> getcar(@PathVariable int car_model_year,@RequestParam String q)
    {
        return carservice.getcar(car_model_year,q);
    }

    @GetMapping("getallcars")
    public ResponseEntity<ResponseAllCars> getcars()
    {
        return carservice.getcars();
    }

}
