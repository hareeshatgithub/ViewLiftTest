package com.example.harishreddy.viewlifttest.network;

import com.example.harishreddy.viewlifttest.model.Feed;
import com.example.harishreddy.viewlifttest.model.Film;
import com.example.harishreddy.viewlifttest.model.Films;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceAPI {

    @GET("/apis/films.json?limit=10")
    Call<Feed> getFeed();




}
