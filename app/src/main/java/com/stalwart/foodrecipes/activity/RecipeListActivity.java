package com.stalwart.foodrecipes.activity;


import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.stalwart.foodrecipes.R;
import com.stalwart.foodrecipes.model.Recipe;
import com.stalwart.foodrecipes.viewmodels.RecipeListViewModel;

import java.util.List;

public class RecipeListActivity extends BaseActivity {

    private RecipeListViewModel recipeListViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        // Instantiate the ViewModel
        recipeListViewModel = ViewModelProviders.of(this).get(RecipeListViewModel.class);

        subscribeObservers();
    }

    private void subscribeObservers() {
        recipeListViewModel.getRecipes().observe(this, new Observer<List<Recipe>>() {
            @Override
            public void onChanged(List<Recipe> recipes) {

            }
        });
    }
}
