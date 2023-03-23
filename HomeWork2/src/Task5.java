import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int min = 10;
        int max = 99;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min)) + min;
        }

        System.out.print("Массив: ");
        for (int val : arr) {
            System.out.print(val + ", ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число, для поиска в массиве: ");
        int n = scanner.nextInt();
        int ind = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                ind = i;
            }
        }

        if(ind == -1){
            System.out.println("Введенное число не найдено в массиве.");
        }else {
            System.out.println("Введенное число найдено в массиве, под индексом: " + ind);
        }
    }
}
