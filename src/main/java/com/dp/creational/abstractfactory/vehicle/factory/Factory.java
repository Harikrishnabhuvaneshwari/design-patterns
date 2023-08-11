package com.dp.creational.abstractfactory.vehicle.factory;

public interface Factory {
    void createCar();
    void createBike();
}

class TataFactory implements Factory {
    @Override
    public void createCar() {
        System.out.println("TATA -> CAR created");
    }

    @Override
    public void createBike() {
        System.out.println("TATA -> BIKE created");
    }
}
class TeslaFactory implements Factory {
    @Override
    public void createCar() {
        System.out.println("TESLA -> CAR created");
    }

    @Override
    public void createBike() {
        System.out.println("TESLA -> BIKE created");
    }
}
class Ford implements Factory {
    @Override
    public void createCar() {
        System.out.println("FORD -> CAR created");
    }

    @Override
    public void createBike() {
        System.out.println("FORD -> BIKE created");
    }

}
