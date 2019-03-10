package org.sda.algorithms.otomoto;

public class Owner {

    private String firstName;

    private String secondName;

    private Address address;

    public Owner(String firstName, String secondName, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
