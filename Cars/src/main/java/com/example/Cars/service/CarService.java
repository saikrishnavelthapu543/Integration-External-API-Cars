package com.example.Cars.service;
import com.example.Cars.request.TokenRequest;
import com.example.Cars.response.ResponseAllCars;
import com.example.Cars.response.ResponseByCar;
import com.example.Cars.response.ResponseById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    @Autowired
    private RestTemplate restTemplate;




    @Value("${GetbyId.url}")
    private String getbyidurl;

    @Value("${GetbyName.url}")
    private String getbynameurl;

    @Value(("${GetbyColor.url}"))
    private String getbycolorurl;

    @Value("${GetbyYear.url}")
    private String getbyyearurl;

    @Value("${Getcar.url}")
    private String getcarurl;

    @Value("${myapp.token}")
    private String token;

    @Value("${car.url}")
    private String carurl;


    public ResponseEntity<ResponseById> getId(int id) {
        ResponseById response = restTemplate.getForObject(getbyidurl, ResponseById.class,id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<ResponseByCar> getbyName(String car) {
        ResponseByCar response=restTemplate.getForObject(getbynameurl,ResponseByCar.class,car);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    public ResponseEntity<ResponseByCar> getbyColor(String car_color) {
        ResponseByCar response=restTemplate.getForObject(getbycolorurl,ResponseByCar.class,car_color);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }


    public ResponseEntity<ResponseByCar> getbyYear(int car_model_year) {
        ResponseByCar response=restTemplate.getForObject(getbyyearurl,ResponseByCar.class,car_model_year);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    public ResponseEntity<ResponseByCar> getcar(int carModelYear, String q) {
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity=new HttpEntity(httpHeaders);
        ResponseEntity<ResponseByCar> response=restTemplate.exchange(getbyyearurl,HttpMethod.GET,httpEntity,ResponseByCar.class,carModelYear,q);
        return new ResponseEntity<ResponseByCar>(response.getBody(),HttpStatus.OK);
    }

    public ResponseEntity<ResponseAllCars> getcars() {
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
       httpHeaders.set("token",token);
        HttpEntity httpEntity=new HttpEntity(httpHeaders);
        ResponseEntity<ResponseAllCars> response=restTemplate.exchange(carurl,HttpMethod.GET,httpEntity,ResponseAllCars.class);
        return new ResponseEntity<ResponseAllCars>(response.getBody(),HttpStatus.OK);
    }
}
