package org.sda.algorithms.exercises;

import java.math.BigDecimal;

public class House {

    private int offerNumber;
    private BigDecimal price;
    private double size;
    private int rooms;


    public House(int number ,BigDecimal price, double size, int rooms) {
        this.offerNumber = number;
        this.price = price;
        this.size = size;
        this.rooms = rooms;
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

    @Override
    public String toString() {
        /*return "Offer details: " +
                "price " + price +
                " $, size " + size +
                " m2, number of rooms " + rooms;*/
        return  String.format("%7d %13.2f %10.2f %8d",offerNumber, price, size, rooms);

    }
}
