package Loop;

public class Task3 {
    public static void main(String[] args) {
        int num = 10;
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + num + " равен = " + result);
    }
}
