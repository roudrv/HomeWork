package Polyclinic;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
        setType("Кот");
    }

    @Override
    public String  makeNoise() {
        return "Мяу!";
    }
}
