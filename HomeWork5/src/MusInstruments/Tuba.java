package MusInstruments;

public class Tuba implements Instrument {
    private final int diameter;
    private final int length;

    public Tuba(int diameter, int length) {
        this.diameter = diameter;
        this.length = length;
    }

    @Override
    public String play() {
        return String.format("Играем \"%s\" на тубе. Она имеет радиус %d см. и длину %d см.", KEY, this.diameter, this.length);
    }
}
