package implementations;

import enums.TypesOfIngredients;

import java.util.HashMap;
import java.util.Map;

public class IngredientDispenser {

    private static IngredientDispenser instance;

    private Map<TypesOfIngredients, Float> ingredient_quantity = new HashMap<>();
    private IngredientDispenser(){
        ingredient_quantity.put(TypesOfIngredients.Water , 0.0f);
        ingredient_quantity.put(TypesOfIngredients.Beans , 0.0f);
        ingredient_quantity.put(TypesOfIngredients.Milk , 0.0f);
    }

    public static IngredientDispenser getInstance(){
        if (instance == null){
            instance = new IngredientDispenser();
        }
        return instance;
    }

    public void setIngredientQuantity(TypesOfIngredients typesOfIngredients, float quantity){
        ingredient_quantity.put(typesOfIngredients, ingredient_quantity.get(typesOfIngredients) + quantity);
    }

    public void reduceIngredientQuantity(TypesOfIngredients typesOfIngredients, float quantity){
        ingredient_quantity.put(typesOfIngredients, ingredient_quantity.get(typesOfIngredients) - quantity);
    }

    public float getIngredientQuantity(TypesOfIngredients typesOfIngredients){
        return ingredient_quantity.get(typesOfIngredients);
    }
}
