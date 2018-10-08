package ru.gordinmitya.androidogram;

public class PostModel {
    private String description;
    private String date;
    private int imageRes;

    public PostModel(String description, String date, int imageRes) {
        this.description = description;
        this.date = date;
        this.imageRes = imageRes;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getImageRes() {
        return imageRes;
    }
}
