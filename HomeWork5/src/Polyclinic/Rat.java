package Polyclinic;

public class Rat extends Animal {
    public Rat(String name, int age) {
        super(name, age);
        setType("Крыса");
    }

    @Override
    public String makeNoise() {
        return "Пи-пи-пи!";
    }
}
