package org.example.domain.internetCafe;

public class Console extends Device {
    private int idDev;
    private String devName;
    private double pricePerHour;

    // Constructor
    public Console(int idDev, String devName, double pricePerHour) {
        this.idDev = idDev;
        this.devName = devName;
        this.pricePerHour = pricePerHour;
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

    // toString method
    @Override
    public String toString() {
        return "Console{" +
                "idDev=" + idDev +
                ", devName='" + devName + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
