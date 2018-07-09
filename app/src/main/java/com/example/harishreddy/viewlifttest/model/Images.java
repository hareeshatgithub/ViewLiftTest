
package com.example.harishreddy.viewlifttest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Images {

    @SerializedName("image")
    private List<Image> mImage;

    public List<Image> getImage() {
        return mImage;
    }

    public void setImage(List<Image> image) {
        mImage = image;
    }

}
