package com.example.catalogodeproductos;

public class List_element {
    private String color;
    private String name;
    private String city;
    private String status;

    // Constructor
    public List_element(String color, String name, String city, String status) {
        this.color = color;
        this.name = name;
        this.city = city;
        this.status = status;
    }


    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
