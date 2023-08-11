package com.dp.creational.abstractfactory.vehicle.factory;

public interface Car {
    void printName();
}
class TataCar implements Car{
    @Override
    public void printName() {
        System.out.println("Tata car");
    }
}
class FordCar implements Car{
    @Override
    public void printName() {
        System.out.println("Ford car");
    }
}
class TeslaCar implements Car{
    @Override
    public void printName() {
        System.out.println("Tesla car");
    }
}
