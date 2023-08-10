package com.dp.creational.abstractfactory.pizza.toppingfactory;

import com.dp.creational.abstractfactory.pizza.sauce.CaliforniaOilSauce;
import com.dp.creational.abstractfactory.pizza.cheese.Cheese;
import com.dp.creational.abstractfactory.pizza.cheese.GoatCheese;
import com.dp.creational.abstractfactory.pizza.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}