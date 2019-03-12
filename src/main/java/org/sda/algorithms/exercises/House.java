package org.sda.algorithms.exercises;

import java.math.BigDecimal;

public class House {

    private int offerNumber;
    private BigDecimal price;
    private double size;
    private int rooms;
    private boolean garage;


    public House(int number ,BigDecimal price, double size, int rooms, boolean garage) {
        this.offerNumber = number;
        this.price = price;
        this.size = size;
        this.rooms = rooms;
        this.garage = garage;

    }

    public int getOfferNumber() {
        return offerNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isGarage(){ return garage;}


    @Override
    public String toString() {
        /*return "Offer details: " +
                "price " + price +
                " $, size " + size +
                " m2, number of rooms " + rooms;*/
        return  String.format("%7d %13.2f %10.2f %8d %10b",offerNumber, price, size, rooms, garage);

    }
}
