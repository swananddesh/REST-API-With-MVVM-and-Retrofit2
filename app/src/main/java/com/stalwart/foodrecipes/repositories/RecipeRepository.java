package com.stalwart.foodrecipes.repositories;

import androidx.lifecycle.LiveData;

import com.stalwart.foodrecipes.model.Recipe;
import com.stalwart.foodrecipes.requests.RecipeApiClient;

import java.util.List;

public class RecipeRepository {

    private static RecipeRepository recipeRepositoryInstance;
    private RecipeApiClient recipeApiClient;

    private RecipeRepository() {
        recipeApiClient = RecipeApiClient.getApiClientInstance();
    }

    public static RecipeRepository getRecipeRepositoryInstance() {
        if (recipeRepositoryInstance == null) {
            recipeRepositoryInstance = new RecipeRepository();
        }
        return recipeRepositoryInstance;
    }

    public LiveData<List<Recipe>> getRecipes() {
        return recipeApiClient.getRecipes();
    }
}
