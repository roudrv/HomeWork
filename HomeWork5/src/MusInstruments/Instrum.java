package MusInstruments;

import java.util.Arrays;
import java.util.List;

public class Instrum {
    public static void main(String[] args) {
        List<Instrument> arrays = Arrays.asList(new Guiter(12), new Drum(65), new Tuba(88, 185));

        for (Instrument val : arrays) {
            System.out.println(val.play());
        }
    }
}
