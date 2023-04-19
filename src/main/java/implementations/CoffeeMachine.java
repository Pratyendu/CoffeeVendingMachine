package implementations;

import enums.TypesOfIngredients;
import interfaces.IDispenseIngredients;

import java.util.Map;

public class CoffeeMachine {
    private IDispenseIngredients ingredientFiller;

    private CoffeeSelector coffeeSelector;

    public CoffeeMachine(){
        ingredientFiller = new DispenseIngredients();
        coffeeSelector = new CoffeeSelector();
    }

     public void buyCoffee(String type){
        coffeeSelector.setStrategy(type);
        coffeeSelector.buy();
    }

     public void fillIngredients(Map<TypesOfIngredients, Float> ingredients){
        for (Map.Entry<TypesOfIngredients, Float> entrySet : ingredients.entrySet()){
            ingredientFiller.fill(entrySet.getKey() , entrySet.getValue());
        }
    }
}
