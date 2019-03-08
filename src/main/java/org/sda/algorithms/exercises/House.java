package org.sda.algorithms.exercises;

public class House {

    private int offerNumber;
    private double price;
    private double size;
    private int rooms;


    public House(int number ,double price, double size, int rooms) {
        this.offerNumber = number;
        this.price = price;
        this.size = size;
        this.rooms = rooms;
    }

    public int getOfferNumber() {
        return offerNumber;
    }

    public double getPrice() {
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
