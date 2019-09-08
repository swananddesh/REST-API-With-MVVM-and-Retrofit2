package com.stalwart.foodrecipes.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.stalwart.foodrecipes.model.Recipe;
import com.stalwart.foodrecipes.repositories.RecipeRepository;

import java.util.List;

public class RecipeListViewModel extends ViewModel {

    private RecipeRepository recipeRepository;

    public RecipeListViewModel() {
        recipeRepository = RecipeRepository.getRecipeRepositoryInstance();
    }

    public LiveData<List<Recipe>> getRecipes() {
        return recipeRepository.getRecipes();
    }
}
