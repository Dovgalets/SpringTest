package org.example2;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    private Person driver;

    public Car(Person driver) {
        this.driver = driver;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
