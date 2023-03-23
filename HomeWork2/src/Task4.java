import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение N: ");
        int n = scanner.nextInt();
        System.out.print("Введите значение A: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение B: ");
        int b = scanner.nextInt();
        int temp;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a)) + a;
        }

        System.out.print("\nМассив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.print("\nМассив после сортировки: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }
    }
}
