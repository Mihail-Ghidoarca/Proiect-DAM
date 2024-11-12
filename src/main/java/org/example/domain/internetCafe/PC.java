package org.example.domain.internetCafe;

public class PC extends Device {
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
    public int getDeviceID() {
        return idDev;
    }

    @Override
    public void setDeviceID(int idDev) {
        this.idDev = idDev;
    }

    @Override
    public String getDeviceName() {
        return devName;
    }

    @Override
    public void setDeviceName(String devName) {
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

