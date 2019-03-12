package org.sda.algorithms.otomoto;

public class Address {

    private String street;
    private String postalCode;
    private String city;
    private String houseNumber;


    public Address(String street, String postalCode, String city, String houseNumber) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
