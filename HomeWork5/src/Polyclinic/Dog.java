package Polyclinic;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
        setType("Собака");
    }

    @Override
    public String  makeNoise() {
        return "Гав!";
    }
}
