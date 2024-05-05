package htw.berlin.wi.prog2.domain;

import java.util.ArrayList;
import java.util.List;

public class PrecomputedBurger implements Burger {

    private List<Ingredient> ingredients;
    private double price;
    private int calories;

    public PrecomputedBurger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        for (Ingredient ingredient : ingredients) {
        this.price += ingredient.getPrice();
        this.calories += ingredient.getCalories();
        };


    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public int calculateCalories() {
        return calories;
    }

    @Override
    public List<String> getIngredientNames() {
        List<String> ingredientNames = new ArrayList<String>();

        for (Ingredient ingredient : ingredients) {
            ingredientNames.add(ingredient.getName());
        }
        return ingredientNames;
    }
}
