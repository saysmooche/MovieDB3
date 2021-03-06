package com.bb.moviedatabase.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service<MovieResponse> {

        @GET("movie/popular")
        Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);

        @GET("movie/top_rated")
        Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
    }