package Loop;

public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int count = 0;

        if (a >= b) {
            System.out.println("Вы ввели не корректное значение. A должно быть меньше B.");
        } else {
            for (int i = b - 1; i > a; i--) {
                System.out.println(i);
                count++;
            }
            System.out.println("Колличество символов, между " + b + " и " + a + ", равно = " + count);
        }
    }
}
