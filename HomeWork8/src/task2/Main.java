package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 4};
        //System.out.println(arrayToMap(array));
        printMap(arrayToMap(array));

        String[] array1 = {"Один", "Два", "Два", "Два", "Три"};
        //System.out.println(arrayToMap(array1));
        printMap(arrayToMap(array1));
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

    public static <K> void  printMap(Map<K, Integer> map){
        System.out.print("{");
        int count = 0;
        for(Map.Entry<K, Integer> val: map.entrySet()){
            if(count != 0){
                System.out.print(", " + val.getKey() + ":" + val.getValue());
            }else{
                System.out.print(val.getKey() + ":" + val.getValue());
            }
            count++;
        }
        System.out.println("}");
    }
}