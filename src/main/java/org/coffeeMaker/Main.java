package org.coffeeMaker;

import enums.TypesOfIngredients;
import implementations.CoffeeMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Buy Coffee");
        System.out.println("2.Show Ingredient Holder");
        System.out.println("3.Analytics");
        System.out.println("4.Fill Ingredients");
        System.out.println("Please enter desired option!");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n == 1){
            System.out.println("Please select coffee type");
            String coffeeType = scn.nextLine();
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            coffeeMachine.buyCoffee(coffeeType);
        } else if (n == 4) {
            Map<TypesOfIngredients, Float> ingredientPour = new HashMap<>();
            System.out.println("Please fill the amount of ingredients poured!");
            for(int i = 0 ; i<3;i++){
                System.out.println("Enter Ingredient Type");

            }
        } else {
            System.out.println("Invalid input!!");
        }

    }
}