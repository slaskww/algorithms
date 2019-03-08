package org.sda.algorithms.house;

public class House {

    private String name;

    private int price;

    private int size;

    private int rooms;

    public House(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", rooms=" + rooms +
                '}';
    }
}
