package com.osm8.javahomework.venicle;

public class Car {
    private int fuelGaugeValue;
    private String vendorName;
    private String modelName;
    private String serialNumber;

    public Car(String vendorName, String modelName, String serialNumber) {
        this.vendorName = vendorName;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.fuelGaugeValue = 0;
    }

    public int getFuelGaugeValue() {
        return fuelGaugeValue;
    }

    public void setFuelGaugeValue(int fuelGaugeValue) {
        this.fuelGaugeValue = fuelGaugeValue;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void printFuelLevel(){
        System.out.println(String.format("Fuel Level: %d", fuelGaugeValue));
    }

    @Override
    public String toString() {
        return String.format("Vendor name: %s\nModel name: %s\nFuel Level: %d\nSerial number:%s", vendorName, modelName, fuelGaugeValue, serialNumber);
    }
}
