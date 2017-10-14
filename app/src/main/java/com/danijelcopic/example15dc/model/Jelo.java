package com.danijelcopic.example15dc.model;

public class Jelo {

    private int id;
    private String image;
    private String name;
    private float rating;
    private String description;
    private String calory;
    private double price;
    private Category category2; // broj 2 je dodan zato sto sam koristio ovaj naziv u Example14
    private Ingridients ingridients2; // broj 2 je dodan zato sto sam koristio ovaj naziv u Example14

    public Jelo() {
    }

    public Jelo(int id, String image, String name, float rating, String description, Category category2, Ingridients ingridients2, String calory, double price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.category2 = category2;
        this.ingridients2 = ingridients2;
        this.calory = calory;
        this.price = price;
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

    public Ingridients getIngridients2() {
        return ingridients2;
    }

    public void setIngridients2(Ingridients ingridients2) {
        this.ingridients2 = ingridients2;
    }

    @Override
    public String toString() {
        return name;
    }
}
