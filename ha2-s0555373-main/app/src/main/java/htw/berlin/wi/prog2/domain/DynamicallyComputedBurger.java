package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class DynamicallyComputedBurger implements Burger {

    List<Ingredient> ingredientList;

    public DynamicallyComputedBurger(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
        };

    @Override
    public double calculatePrice() {
        double price = 0;
        for (Ingredient ingredient : ingredientList) {
            price += (int) ingredient.getPrice();
        }
        return price;
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        for (Ingredient ingredient : ingredientList) {
            calories += (int) ingredient.getPrice();
        }
        return calories;    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientNameList = new ArrayList<String>();

        for (Ingredient ingredient : ingredientList) {
            ingredientNameList.add(ingredient.getName());
        }
        return ingredientNameList;    }
}
