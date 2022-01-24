package com.sinch.gamehighscore.dto;

public class CategoryDto {

    String name;

    String imagePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public CategoryDto(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }
    
}
