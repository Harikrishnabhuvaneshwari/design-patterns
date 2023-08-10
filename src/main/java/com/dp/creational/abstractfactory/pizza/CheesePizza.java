package com.dp.creational.abstractfactory.pizza;

import com.dp.creational.abstractfactory.pizza.toppingfactory.BaseToppingFactory;

public class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }

}