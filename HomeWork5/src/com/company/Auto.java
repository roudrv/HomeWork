package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Auto {
    public static void main(String[] args) {
        Car Invencible = new SportCar("Lamborghini", "Supercar", 1550,
                         new Driver("Max Emilian Verstappen", 9),
                         new Engine(780, "Lamborghini"), 370);
        Car Actros    =  new Lorry("MERCEDES-BENZ","Lorry",7000,
                         new Driver("Фёдор Иванович Афанасьев", 32),
                         new Engine(449,"Mercedes Benz"),1800);

        System.out.println(Invencible.toString());
        System.out.println(Actros.toString());
    }
}
