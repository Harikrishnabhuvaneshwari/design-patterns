package com.dp.creational.abstractfactory.vehicle.factory;

public interface Factory {
    Car createCar();

    Bike createBike();
}

class TataFactory implements Factory {
    @Override
    public Car createCar() {
        return new TataCar();
    }

    @Override
    public Bike createBike() {
        return new TataBike();
    }
}

class TeslaFactory implements Factory {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public Bike createBike() {
        return new TeslaBike();
    }
}

class Ford implements Factory {
    @Override
    public Car createCar() {
        return new FordCar();
    }

    @Override
    public Bike createBike() {
        return new TataBike();
    }
}
