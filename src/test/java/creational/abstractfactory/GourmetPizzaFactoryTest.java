package creational.abstractfactory;

import com.dp.creational.abstractfactory.pizza.Pizza;
import com.dp.creational.abstractfactory.pizza.pizzafactory.BasePizzaFactory;
import com.dp.creational.abstractfactory.pizza.pizzafactory.GourmetPizzaFactory;
import org.junit.jupiter.api.Test;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
    BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}