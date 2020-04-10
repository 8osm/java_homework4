package com.osm8.javahomework;

import com.osm8.javahomework.venicle.Car;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("Toyota", "Corolla", "5H42HJ2426J625");
        System.out.println(car.toString() + "\n");
        car.setFuelGaugeValue(50);
        car.setVendorName("Tesla");
        car.setModelName("Model S");
        car.setSerialNumber("41HH52J26J3K34");
        System.out.println(car.toString() + "\n");
        car.printFuelLevel();
    }
}
