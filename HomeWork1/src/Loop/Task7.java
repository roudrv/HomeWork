package Loop;


public class Task7 {
    public static void main(String[] args) {
        int n = 135;

        if (n < 0) {
            System.out.println("Неверное число. Должно быть больше 0");
        } else {
            int count = 0;
            int temp = n;
            boolean isHave = false;
            int sum = 0;
            //Находим разряд числа
            for (int i = 1; i < n; i *= 10) {
                count++;
            }
            //ищем наличие 2
            for (int i = count - 1; i >= 0; i--) {
                int aa = 1;

                for (int j = 0; j < i; j++) {
                    aa *= 10;
                }

                if (temp / aa == 2) {
                    isHave = true;
                }
                //получаем сумму чисел
                sum += (temp / aa);

                temp %= aa;
            }

            if (isHave) {
                System.out.println("Цифра 2 имеется в числе " + n);
            } else {
                System.out.println("Цифра 2 не имеется в числе " + n);
            }

            System.out.println("Сумма чисел числа " + n + " равна = " + sum);
            System.out.println("Количество знаков в числе, равно = " + count);


            int revers = 0;
            while (n != 0) {
                revers = revers * 10 + n % 10;
                n /= 10;
            }
            System.out.println("Перевернутое число равно = " + revers);
        }
    }
}
