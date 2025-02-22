package com.example.lab1.model;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;
    private int quantity;

    public MenuItem() {
    }

    public MenuItem(String name, String description, double price, boolean isVegetarian, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                isVegetarian == menuItem.isVegetarian &&
                quantity == menuItem.quantity &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, isVegetarian, quantity);
    }
}
