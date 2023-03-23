import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение N: ");
        int n = scanner.nextInt();
        System.out.print("Введите значение A: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение B: ");
        int b = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a)) + a;
        }

        int max = 0;
        System.out.print("\nМассив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
            if (val > max) {
                max = val;
            }
        }
        System.out.println("\nМаксимальное значение в массиве: " + max);
    }
}
