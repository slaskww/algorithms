package org.sda.algorithms.otomoto;

import java.math.BigDecimal;

public class Car {

    private BigDecimal price;

    private String color;

    private String model;

    private String brand;

    private boolean combi;

    private Owner owner;

    public Car(BigDecimal price, String color, String model, String brand, boolean combi, Owner owner) {
        this.price = price;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.combi = combi;
        this.owner = owner;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isCombi() {
        return combi;
    }

    public void setCombi(boolean combi) {
        this.combi = combi;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
