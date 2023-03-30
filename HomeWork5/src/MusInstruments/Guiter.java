package MusInstruments;

public class Guiter implements Instrument {
    private final int numString;

    public Guiter(int numString) {
        this.numString = numString;
    }

    @Override
    public String play() {
        return String.format("Играем \"%s\" на гитаре. У нее %d струн.", KEY, this.numString);
    }
}
