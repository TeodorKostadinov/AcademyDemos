package com.inveitix.recyclerdemo;

/**
 * Created by fos on 16.1.2016 г..
 */
public class Post {
    private int imageResource;
    private String title;
    private int rating;

    public Post(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
        this.rating = 0;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
