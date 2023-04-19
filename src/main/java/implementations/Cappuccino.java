package implementations;

import enums.TypesOfIngredients;
import interfaces.ISelectCoffee;

import java.util.HashMap;
import java.util.Map;

public class Cappuccino implements ISelectCoffee {
    private Map<TypesOfIngredients, Float> ingredient_quantity = new HashMap<>();

    private IngredientDispenser ingredientDispenser;
    public Cappuccino(){
        ingredient_quantity.put(TypesOfIngredients.Water , 200f);
        ingredient_quantity.put(TypesOfIngredients.Milk , 100f);
        ingredient_quantity.put(TypesOfIngredients.Beans , 12f);
        ingredientDispenser = IngredientDispenser.getInstance();
    }

    @Override
    public void createCoffee() {
        if (checkIngredient()){
            consumeIngredients();
            System.out.println("Cappuccino Dispatched");
        }else {
            throw new RuntimeException("Ingredients for Cappuccino is not sufficient");
        }
    }

    @Override
    public boolean checkIngredient() {
        for (Map.Entry<TypesOfIngredients, Float> mapEntry : ingredient_quantity.entrySet()){
            if (ingredientDispenser.getIngredientQuantity(mapEntry.getKey()) < mapEntry.getValue())
                return false;
        }
        return true;
    }

    @Override
    public float getPrice() {
        return 6;
    }

    private void consumeIngredients(){
        for (Map.Entry<TypesOfIngredients, Float> mapEntry : ingredient_quantity.entrySet()){
            ingredientDispenser.reduceIngredientQuantity(mapEntry.getKey() , mapEntry.getValue());
        }
    }
}
