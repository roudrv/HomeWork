package AdditionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntArray {
    private int[] arrays;

    public IntArray() {
        this.arrays = new int[10];
    }

    public IntArray(int countValArr) {
        this.arrays = new int[countValArr];
    }

    public IntArray(int[] arrays) {
        this.arrays = arrays;
    }

    public void sort(int num) {
        if (num > 0) {
            Arrays.sort(arrays);
        } else {
            Arrays.sort(arrays);
            int[] arrays1 = new int[arrays.length];
            for (int i = arrays.length - 1; i >=0 ; i--) {
                arrays1[(arrays.length - 1)- i] = arrays[i];
            }
            arrays = arrays1;
        }
    }

    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }
}
