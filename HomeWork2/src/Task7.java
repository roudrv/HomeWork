import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        System.out.println("Введите нижний диапазон");
        int a = scanner.nextInt();
        System.out.println("Введите верхний диапазон");
        int b = scanner.nextInt();
        int temp;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a)) + a;
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
        System.out.print("Массив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }

        System.out.println("\nВведите искомое значение");
        int k = scanner.nextInt();
        int count = 0;

        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == k) {
                ind = i;
                break;
            }

        }

        int firstVal = 0;
        int lastVal = arr.length - 1;
        int ind1 = 0;
        int count1 = 0;


        while (firstVal <= lastVal) {
            count1++;
            int ave = (firstVal + lastVal) / 2;
            if (k == arr[ave]) {
                ind1 = ave;
                break;
            } else if (arr[ave] < k) {
                firstVal = ave + 1;
            } else {
                lastVal = ave - 1;
            }

        }
        System.out.println("Индекс элемента: " + ind);
        System.out.println("Линейный поиск: " + count + "  шаг(-а)(-ов)");
        System.out.println("Двоичный поиск: " + count1 + "  шаг(-а)(-ов)");
    }
}
