package com.dp.creational.abstractfactory.pizza.toppingfactory;

import com.dp.creational.abstractfactory.pizza.cheese.Cheese;
import com.dp.creational.abstractfactory.pizza.sauce.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}