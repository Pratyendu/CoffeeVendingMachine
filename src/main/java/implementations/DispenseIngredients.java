package implementations;

import enums.TypesOfIngredients;
import interfaces.IDispenseIngredients;

public class DispenseIngredients implements IDispenseIngredients {
    private IngredientDispenser ingredientDispenser;

    public DispenseIngredients(){
        ingredientDispenser = IngredientDispenser.getInstance();
    }
    @Override
    public void fill(TypesOfIngredients typesOfIngredients, float quantity) {
        ingredientDispenser.setIngredientQuantity(typesOfIngredients, quantity);
    }
}
