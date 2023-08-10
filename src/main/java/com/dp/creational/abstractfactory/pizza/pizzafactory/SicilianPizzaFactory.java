package com.dp.creational.abstractfactory.pizza.pizzafactory;


import com.dp.creational.abstractfactory.pizza.CheesePizza;
import com.dp.creational.abstractfactory.pizza.PepperoniPizza;
import com.dp.creational.abstractfactory.pizza.Pizza;
import com.dp.creational.abstractfactory.pizza.VeggiePizza;
import com.dp.creational.abstractfactory.pizza.toppingfactory.BaseToppingFactory;
import com.dp.creational.abstractfactory.pizza.toppingfactory.SicilianToppingFactory;

public class SicilianPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
       BaseToppingFactory toppingFactory= new SicilianToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}