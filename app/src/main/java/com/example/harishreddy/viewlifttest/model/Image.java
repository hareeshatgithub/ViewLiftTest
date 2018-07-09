
package com.example.harishreddy.viewlifttest.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Image {

   private String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "Image{" +
                "src='" + src + '\'' +
                '}';
    }
}
