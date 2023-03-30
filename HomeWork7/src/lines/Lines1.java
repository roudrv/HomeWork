package lines;

import java.util.Scanner;

public class Lines1 {
    public static void main(String[] args) {
        int a, b;
        String action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число A");
        a = scanner.nextInt();
        System.out.println("Введите целое число B");
        b = scanner.nextInt();
        scanner.nextLine();
        while (true) {
            System.out.println("Введите действие над числами А и B");
            action = scanner.nextLine();
            if (action.matches("^[+/*%]$")) {
                break;
            } else {
                System.out.println("Не корректно введено действие. Повторите еще раз");
            }
        }

        StringBuilder stringBuilder = createLine(a, b, action);
        int index = stringBuilder.indexOf("=");
        stringBuilder.replace(index, index + 1, "равно");
        System.out.print("Результат: ");
        System.out.println(stringBuilder);

        scanner.close();
    }

    public static StringBuilder createLine(int a, int b, String action) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(" " + action + " ");
        stringBuilder.append(b);
        int result = 0;
        switch (action) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Не корректно введено действие");
                break;
        }
        stringBuilder.append(String.format(" = %d", result));

        return stringBuilder;
    }
}
