package creational.abstractfactory;


import com.dp.creational.abstractfactory.pizza.Pizza;
import com.dp.creational.abstractfactory.pizza.pizzafactory.BasePizzaFactory;
import com.dp.creational.abstractfactory.pizza.pizzafactory.SicilianPizzaFactory;
import org.junit.jupiter.api.Test;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}