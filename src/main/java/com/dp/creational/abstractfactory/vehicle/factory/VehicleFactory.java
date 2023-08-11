package com.dp.creational.abstractfactory.vehicle.factory;

public class VehicleFactory {
    public static Factory createFactory(String brand) {
        switch (brand.toUpperCase()) {
            case "TATA" -> {
                return new TataFactory();
            }
            case "FORD" -> {
                return new Ford();
            }
            default -> {
                return new TeslaFactory();
            }
        }
    }
}
