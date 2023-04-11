package implementations;

import interfaces.ICoffeeStrategy;

import java.util.Objects;

public class CoffeeContext {
    private ICoffeeStrategy coffeeStrategy;
    void setStrategy(String coffeeType){
        if(Objects.equals(coffeeType , "Latte")){
            coffeeStrategy = new LatteStrategy();
        } else if (Objects.equals(coffeeType , "Cappuccino")) {
            coffeeStrategy = new CappuccinoStrategy();
        }else {
            coffeeStrategy = new EspressoStrategy();
        }
    }

    void buy(){
        coffeeStrategy.createCoffee();
    }
}
