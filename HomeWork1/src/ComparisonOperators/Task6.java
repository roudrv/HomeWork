package ComparisonOperators;

public class Task6 {
    public static void main(String[] args) {
        int val = 50;

        if (val < 0 || val > 999) {
            System.out.println("Введено не верное число(диапазон от 0 до 999(включительно))");
        } else {
            if (val % 2 == 0) {
                if (val < 10) {
                    System.out.println(val + " - четное однозначное число.");
                } else if (val < 100) {
                    System.out.println(val + " - четное двухзначное число.");
                } else {
                    System.out.println(val + " - четное трехзначное число.");
                }
            } else {
                if (val < 10) {
                    System.out.println(val + " - не четное однозначное число.");
                } else if (val < 100) {
                    System.out.println(val + " - не четное двухзначное число.");
                } else {
                    System.out.println(val + " - не четное трехзначное число.");
                }
            }
        }
    }
}
