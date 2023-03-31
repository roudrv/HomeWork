package exceptions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО и возраст(через пробел)");
        int age = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String fio;
        try {
            String data = scanner.nextLine();
            String[] arrays = data.split(" ");
            for (int i = 0; i < arrays.length - 1; i++) {
                if (i == 0) {
                    stringBuilder.append(arrays[i]);
                } else {
                    stringBuilder.append(" ").append(arrays[i]);
                }
            }
            fio = stringBuilder.toString();
            age = Integer.parseInt(arrays[arrays.length - 1]);
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Возраст некорректен", age, fio);
            } else if (fio.length() > 200 || Pattern.compile("[^а-яА-Яa-zA-Z ]").matcher(fio).find()) {
                throw new IncorrectInfoException("данные некорректены", age, fio);
            }
            System.out.println("Данные приняты.");
            System.out.println("ФИО: " + fio);
            System.out.println("Возраст: " + age);
        } catch (IncorrectInfoException e) {
            e.printStackTrace();
        } finally {
            scanner.close();

        }
    }
}
