package org.sda.algorithms.otomoto;

public class Owner {

    private String firtName;
    private String secondName;
    private Address address;


    public String getFirtName() {
        return firtName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Address getAddress() {
        return address;
    }

    public Owner(String firtName, String secondName, Address address) {
        this.firtName = firtName;
        this.secondName = secondName;
        this.address = address;
    }
}
