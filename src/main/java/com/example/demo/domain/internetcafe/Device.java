package com.example.demo.domain.internetcafe;

public interface Device {
    int getIdDev();
    void setIdDev(int idDev);

    String getDevName();
    void setDevName(String devName);

    double getPricePerHour();
    void setPricePerHour(double pricePerHour);
}

