package ComparisonOperators;

public class Task4 {
    public static void main(String[] args) {
        int year = 2000;

        if (year < 0) {
            System.out.println("Не верно введен год");
        } else if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " - не високосный год и насчитывает 365 дней.");
            } else {
                System.out.println(year + " - високосный год и насчитывает 366 дней.");
            }
        } else {
            System.out.println(year + " - не високосный год и насчитывает 365 дней.");
        }

    }
}
