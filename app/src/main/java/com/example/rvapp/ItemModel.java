package com.example.rvapp;

public class ItemModel {

    String name;
    String type;
    int image;

    public ItemModel(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getimage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

