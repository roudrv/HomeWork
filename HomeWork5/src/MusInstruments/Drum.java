package MusInstruments;

public class Drum implements Instrument {
    private final int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public String play() {
        return String.format("Играем \"%s\" на барабане. Его ширина состовляет - %d см.", KEY, this.size);
    }
}
