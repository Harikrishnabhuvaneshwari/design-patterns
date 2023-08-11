package com.dp.creational.abstractfactory.vehicle.client;

import com.dp.creational.abstractfactory.vehicle.factory.Factory;
import com.dp.creational.abstractfactory.vehicle.factory.VehicleFactory;

import java.util.Scanner;

public class TestVehicleAF {
    public static void main(String[] args) {
        System.out.println("###################");
        System.out.println("Enter vehicle factory brand");
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();
        Factory factory = VehicleFactory.createFactory(brand);
        factory.createBike();
        factory.createCar();
        System.out.println("###################");
    }
}
