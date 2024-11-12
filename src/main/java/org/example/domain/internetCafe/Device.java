package org.example.domain.internetCafe;

public abstract class Device {
    abstract int getDeviceID();
    abstract void setDeviceID(int idDev);

    abstract String getDeviceName();
    abstract void setDeviceName(String devName);

    abstract double getPricePerHour();
    abstract void setPricePerHour(double pricePerHour);
}

