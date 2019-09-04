package com.stalwart.foodrecipes.requests;

import com.stalwart.foodrecipes.util.AppConstants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofitInstance = retrofitBuilder.build();

    private static RecipeApi recipeApi = retrofitInstance.create(RecipeApi.class);

    public static RecipeApi getRecipeApi() {
        return recipeApi;
    }
}
