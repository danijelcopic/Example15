package com.danijelcopic.example15dc.model;

public class Jelo {

    private int id;
    private String image;
    private String name;
    private float rating;
    private String description;
    private String category;
    private String ingridients;
    private String calory;
    private double price;
    private Category category2;

    public Jelo() {
    }

    public Jelo(int id, String image, String name, float rating, String description, String category, String ingridients, String calory, double price, Category category2) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.category = category;
        this.ingridients = ingridients;
        this.calory = calory;
        this.price = price;
        this.category2 = category2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory2() {
        return category2;
    }

    public void setCategory2(Category category2) {
        this.category2 = category2;
    }

    @Override
    public String toString() {
        return name;
    }
}
