package implementations;

import interfaces.ISelectCoffee;

import java.util.Objects;

public class CoffeeSelector {
    private ISelectCoffee coffeeStrategy;
    void setStrategy(String coffeeType){
        if(Objects.equals(coffeeType , "Latte")){
            coffeeStrategy = new Latte();
        } else if (Objects.equals(coffeeType , "Cappuccino")) {
            coffeeStrategy = new Cappuccino();
        }else {
            coffeeStrategy = new Espresso();
        }
    }

    void buy(){
        coffeeStrategy.createCoffee();
    }
}
