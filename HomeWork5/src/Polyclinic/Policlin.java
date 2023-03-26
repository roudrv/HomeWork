package Polyclinic;

import java.util.Arrays;
import java.util.List;

public class Policlin {
    public static void main(String[] args) {
        List<Animal> arrays = Arrays.asList(new Cat("Барсик", 3), new Dog("Барбоскин", 5), new Rat("Семён Семеныч", 2));
        for (Animal val : arrays) {
            System.out.println(val.getType() + " \"" + val.getName() + "\" производит звук - \"" + val.makeNoise() + "\"");
        }
    }
}
