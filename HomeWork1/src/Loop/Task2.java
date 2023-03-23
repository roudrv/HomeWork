package Loop;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a % 5 == 0) {
                System.out.println("Число " + a + " делится на 5.");
            }
            a++;
        } while (a <= 100);
    }
}
