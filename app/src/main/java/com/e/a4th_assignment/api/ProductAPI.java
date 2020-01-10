package com.e.a4th_assignment.api;

import com.e.a4th_assignment.model.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {

    @GET("products/allProducts")
    Call<List<Products>> getAllProducts();
}
