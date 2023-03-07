package com.dp.creational.singleton;

public final class Singleton {
    private Singleton() {
        System.out.println("Inside Singleton Constructor");
    }

    private final class Inner {
        private static final Singleton singleton = new Singleton();

    }

    public static Singleton getInstance(){
        return Inner.singleton;
    }

    static {
        System.out.println("Static Block");
    }
}
