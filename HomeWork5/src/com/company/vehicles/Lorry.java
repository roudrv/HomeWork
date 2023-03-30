package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int capacity;

    public Lorry(String brand, String classCar, int weight, Driver driver, Engine engine, int capacity) {
        super(brand, classCar, weight, driver, engine);
        this.capacity = capacity;
    }
}
