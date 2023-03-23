import java.util.Scanner;

public class Task6 {
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

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("\nМассив после инверта: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }

    }
}
