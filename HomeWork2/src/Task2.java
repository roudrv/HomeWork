import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
        } while (size <= 0);


        System.out.print("Введите минимальное значение в массиве: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение в массиве: ");
        int max = scanner.nextInt();

        while (max <= min) {
            System.out.println("\nМаксимальное значение, должно быть больше минимального. Введите значения еще раз!");
            System.out.print("\nВведите минимальное значение в массиве: ");
            min = scanner.nextInt();
            System.out.print("Введите максимальное значение в массиве: ");
            max = scanner.nextInt();
        }

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min)) + min;
        }

        System.out.print("\nМассив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }
    }
}
