package Loop;

public class Task8 {
    public static void main(String[] args) {
        double startContr = 1000;
        double p = 5.6;
        int countMonth = 0;

        while (startContr <= 1100) {
            startContr += startContr * (p / 100);
            countMonth++;
        }
        System.out.println("Количество месяцев = " + countMonth);
        System.out.println("Итоговый размер вклада = " + startContr + " руб.");
    }
}
