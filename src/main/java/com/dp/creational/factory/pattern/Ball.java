package com.dp.creational.factory.pattern;

public interface Ball {

    void design();

    default void created(String ball){
        System.out.println(ball + " created!!!");
    }
}
