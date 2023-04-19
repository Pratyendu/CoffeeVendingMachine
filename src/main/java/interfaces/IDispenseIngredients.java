package interfaces;

import enums.TypesOfIngredients;

public interface IDispenseIngredients {
    void fill(TypesOfIngredients typesOfIngredients, float quantity);
}
