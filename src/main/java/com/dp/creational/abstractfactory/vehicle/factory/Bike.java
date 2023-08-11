package com.dp.creational.abstractfactory.vehicle.factory;

public interface Bike {
    void printName();
}
class TataBike implements Bike {

    @Override
    public void printName() {
        System.out.println("Tata bike");
    }
}
class FordBike implements Bike {

    @Override
    public void printName() {
        System.out.println("Ford bike");
    }
}
class TeslaBike implements Bike {

    @Override
    public void printName() {
        System.out.println("Tesla bike");
    }
}
