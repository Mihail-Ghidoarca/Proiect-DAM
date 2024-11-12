package com.example.demo.domain.internetcafe;

import com.example.demo.domain.internetcafe.Device;

public class PC implements Device {
    private int idDev;
    private String devName;
    private double pricePerHour;
    private String peripheral;
    private String specs;

    // Constructor
    public PC(int idDev, String devName, double pricePerHour, String peripheral, String specs) {
        this.idDev = idDev;
        this.devName = devName;
        this.pricePerHour = pricePerHour;
        this.peripheral = peripheral;
        this.specs = specs;
    }

    // Implementarea metodelor din interfața Device
    @Override
    public int getIdDev() {
        return idDev;
    }

    @Override
    public void setIdDev(int idDev) {
        this.idDev = idDev;
    }

    @Override
    public String getDevName() {
        return devName;
    }

    @Override
    public void setDevName(String devName) {
        this.devName = devName;
    }

    @Override
    public double getPricePerHour() {
        return pricePerHour;
    }

    @Override
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    // Getter și Setter pentru peripheral
    public String getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(String peripheral) {
        this.peripheral = peripheral;
    }

    // Getter și Setter pentru specs
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    // toString method
    @Override
    public String toString() {
        return "PC{" +
                "idDev=" + idDev +
                ", devName='" + devName + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", peripheral='" + peripheral + '\'' +
                ", specs='" + specs + '\'' +
                '}';
    }
}

