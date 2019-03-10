package org.sda.algorithms.otomoto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Address address = new Address("Długa","50-456","Wrocław","13/12");
        Owner owner = new Owner("Jan","Dzban",address);
        Car car = new Car(new BigDecimal("90000"),"czerwony","C-90","Volvo", true, owner);

        cars.add(car);

        String cityResult = cars.get(0).getOwner().getAddress().getCity();

        Car someCar = cars.get(0);
        Owner someOwner = someCar.getOwner();
        Address someAddress = someOwner.getAddress();
        String someCity = someAddress.getCity();
        String somePostalCode = someAddress.getPostalCode();

    }
}
