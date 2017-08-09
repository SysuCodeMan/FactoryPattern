/*
Created by ChrisChan on 2017/8/9.
*/
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}
