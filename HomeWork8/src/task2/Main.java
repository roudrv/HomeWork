package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 4};
        System.out.println(arrayToMap(array));

        String[] array1 = {"Один", "Два", "Два", "Два", "Три"};
        System.out.println(arrayToMap(array1));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K val : ks) {
            int count = 0;
            for (K val1 : ks) {
                if (val.equals(val1)) {
                    count++;
                }
            }
            map.put(val, count);
        }
        return map;
    }
}