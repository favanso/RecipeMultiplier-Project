package Proj4;

import java.util.ArrayList;

public class Recipe {

    private String directions;
    private ArrayList<Ingredients> ingredients;

    public Recipe(String directions, ArrayList<Ingredients> ingredients) {
        this.directions = directions;
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

}
