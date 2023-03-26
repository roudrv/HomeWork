package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String classCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String classCar, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот на право");
    }
    public void turnLeft(){
        System.out.println("Поворот на лево");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.getFullName() + " с опытом - " + driver.getExperience() + " лет" +
                ", engine=" + engine.getPower() + "л.с. Производитель=" + engine.getMaker() +
                '}';
    }
}
