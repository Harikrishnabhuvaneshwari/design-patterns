package com.dp.creational.abstractfactory.pizza.pizzafactory;

import com.dp.creational.abstractfactory.pizza.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
}