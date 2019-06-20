package com.epam.entity.car;

public class Car {

    public Car(String brand, String model, String color, int release_year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.release_year = release_year;
    }

    private String brand;
    private String model;
    private String color;
    private int release_year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
}
