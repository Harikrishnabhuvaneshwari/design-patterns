package com.dp.creational.abstractfactory.pizza.toppingfactory;

import com.dp.creational.abstractfactory.pizza.cheese.Cheese;
import com.dp.creational.abstractfactory.pizza.cheese.MozzarellaCheese;
import com.dp.creational.abstractfactory.pizza.sauce.Sauce;
import com.dp.creational.abstractfactory.pizza.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public Sauce createSauce(){return new TomatoSauce();}
}