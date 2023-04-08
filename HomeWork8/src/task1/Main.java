package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product("Молоко", 10, 2.3f));
        products.put(2, new Product("Хлеб", 25, 1.8f));
        products.put(3, new Product("Сыр", 13, 4.2f));
        products.put(4, new Product("Рыба", 9, 6.5f));

        getEntrySet(products);
        getKeySet(products);
        getValues(products);
    }

    //Перебрать и распечатать пары значений - entrySet().
    public static void getEntrySet(Map<Integer, Product> map) {
        System.out.println("Общая информация о продуктах:");
        for (Map.Entry<Integer, Product> val : map.entrySet()) {
            System.out.printf("\"%s\" в количестве %d шт., по цене %.2f руб. (с кодом = %d)", val.getValue().getNameProduct(),
                    val.getValue().getCount(), val.getValue().getPrice(), val.getKey());
            System.out.println();
        }
        System.out.println();
    }

    //Перебрать и распечатать набор из имен продуктов - keySet().
    public static void getKeySet(Map<Integer, Product> map) {
        System.out.println("Коды продуктов:");
        for (Integer val : map.keySet()) {
            System.out.println(val);
        }
        System.out.println();
    }

    //Перебрать и распечатать значения продуктов - values().
    public static void getValues(Map<Integer, Product> map) {
        System.out.println("Продукты:");
        for (Product val : map.values()) {
            System.out.printf("\"%s\" в количестве %d шт., по цене %.2f руб.", val.getNameProduct(), val.getCount(), val.getPrice());
            System.out.println();
        }
    }
}
