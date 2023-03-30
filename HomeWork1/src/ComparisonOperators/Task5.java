package ComparisonOperators;

public class Task5 {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 5.7;
        int n = 3;

        if (b == 0) {
            System.out.println("Измените значение числа b. Не должно равняться 0");
        } else {
            switch (n) {
                case 1:
                    System.out.println("Результат сложения чисел  = " + (a + b));
                    break;
                case 2:
                    System.out.println("Результат вычитания чисел = " + (a - b));
                    break;
                case 3:
                    System.out.println("Результат умножения чисел = " + (a * b));
                    break;
                case 4:
                    System.out.println("Результат деления чисел = " + (a / b));
                    break;
                default:
                    System.out.println("Введен не верный номер операции (значение n).");
            }
        }
    }
}
