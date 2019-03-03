package org.sda.algorithms.exercises;

public class House {

   private   double price;
   private  double size;
   private int rooms;


    public House(double price, double size, int rooms) {
        this.price = price;
        this.size = size;
        this.rooms = rooms;
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
        return "Offer details: " +
                "price " + price +
                " $, size " + size +
                " m2, number of rooms " + rooms;
    }
}
