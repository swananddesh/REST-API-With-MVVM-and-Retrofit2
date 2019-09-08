package com.stalwart.foodrecipes.requests;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.stalwart.foodrecipes.model.Recipe;

import java.util.List;

public class RecipeApiClient {

    private static RecipeApiClient apiClientInstance;
    private MutableLiveData<List<Recipe>> recipes;

    private RecipeApiClient() {
        recipes = new MutableLiveData<>();
    }

    public static RecipeApiClient getApiClientInstance() {
        if (apiClientInstance == null) {
            apiClientInstance = new RecipeApiClient();
        }
        return apiClientInstance;
    }


    public LiveData<List<Recipe>> getRecipes() {
        return recipes;
    }
}
