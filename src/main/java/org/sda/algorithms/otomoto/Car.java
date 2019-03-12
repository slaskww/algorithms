package org.sda.algorithms.otomoto;

import java.math.BigDecimal;

public class Car {

    private BigDecimal price;
    private  String color;
    private  String model;
    private  String brand;

    public BigDecimal getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isCombi() {
        return combi;
    }

    public Owner getOwner() {
        return owner;
    }

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


}
