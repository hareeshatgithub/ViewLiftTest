package com.example.harishreddy.viewlifttest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feed {
    @SerializedName("films")
    @Expose
    private Films films;

    public Films getFilms() {
        return films;
    }

    public void setFilms(Films films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "films=" + films +
                '}';
    }
}
