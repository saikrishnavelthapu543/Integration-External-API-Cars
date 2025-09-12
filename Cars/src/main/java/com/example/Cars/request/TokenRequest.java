package com.example.Cars.request;

public class TokenRequest {
    public TokenRequest(String token) {
        this.token = token;
    }

    private String token;

    public TokenRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
