package com.dp.creational.abstractfactory.pizza.cheese;

public class GoatCheese implements Cheese {

    public  GoatCheese(){
       prepareCheese();
    }
    @Override
    public void prepareCheese(){
        System.out.println("Preparing goat cheese...");
    }
}