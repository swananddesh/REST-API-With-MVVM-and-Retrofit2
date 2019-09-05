package com.stalwart.foodrecipes.requests;

import com.stalwart.foodrecipes.response.RecipeResponse;
import com.stalwart.foodrecipes.response.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {

    // GET RECIPE REQUEST
    @GET("api/get")
    Call<RecipeResponse> getRecipe(@Query("key") String apiKey,
                                   @Query("rId") String recipeId);

    //SEARCH
    @GET("api/search")
    Call<RecipeSearchResponse> searchRecipe(@Query("key") String apiKey,
                                            @Query("q") String seachKeyword,
                                            @Query("page") String page);
}
