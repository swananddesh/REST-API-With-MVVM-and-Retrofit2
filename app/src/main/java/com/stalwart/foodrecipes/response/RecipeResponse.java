package com.stalwart.foodrecipes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stalwart.foodrecipes.model.Recipe;

public class RecipeResponse {

    @SerializedName("recipe")
    @Expose() // To serialize or deserialize data depending on the situation.
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeResponse{" +
                "recipe=" + recipe +
                '}';
    }
}
