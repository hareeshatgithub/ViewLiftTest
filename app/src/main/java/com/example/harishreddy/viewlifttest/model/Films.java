
package com.example.harishreddy.viewlifttest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Films {

  private String categories;

  private Film film;

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return "Films{" +
                "categories='" + categories + '\'' +
                ", film=" + film +
                '}';
    }
}
