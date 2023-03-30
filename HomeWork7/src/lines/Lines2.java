package lines;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("https?:\\/\\/[a-zA-Z.]+\\.com");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
