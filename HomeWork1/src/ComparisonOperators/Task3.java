package ComparisonOperators;

public class Task3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 4;

        if (a < b && a < c) {
            System.out.println(b + c);
        } else if (b < a && b < c) {
            System.out.println(a + c);
        } else if (c < a && c < b) {
            System.out.println(a + b);
        } else {
            System.out.println("Некоторые числа равны!");
        }
    }
}
