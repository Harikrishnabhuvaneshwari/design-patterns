package com.dp.creational.abstractfactory.pizza;

import com.dp.creational.abstractfactory.pizza.toppingfactory.BaseToppingFactory;

public class VeggiePizza extends Pizza {
    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}