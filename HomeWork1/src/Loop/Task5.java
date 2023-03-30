package Loop;

public class Task5 {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int res = 0;

        if (a <= b) {
            System.out.println("Вы ввели не корректное значение. A должно быть больше B.");
        } else {
            while (a != -999) {
                a -= b;
                if (a < 0) {
                    res = a + b;
                    a = -999;
                }
            }
            System.out.println("Длина остатка А равна = " + res);
        }
    }
}
