package lines;

import java.util.Scanner;

public class Lines5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        String date = scanner.nextLine();
        if (date.matches("((1[0-9]{3})|(20(0|1)[0-2]))\\/((0[0-9])|(1[0-2]))\\/([0-2][0-9]|30) (((0|1)[0-9])|(2[0-4])):([0-5][0-9])")) {
            System.out.println(date + " - существет");
        } else {
            System.out.println(date + " - не существет");
        }
        scanner.close();
    }
}
