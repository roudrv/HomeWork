package ComparisonOperators;

public class Task8 {
    public static void main(String[] args) {
        int n = 14;
        int m = 2;

        String nameM = null;
        String nameN = null;

        if((n < 6 && n > 14) || (m < 0 && m > 4) ){
            System.out.println("Вы ввели не корректные значения.");
        }else{
            switch (m) {
                case 1:
                    nameM = "пики";
                    break;
                case 2:
                    nameM = "треф";
                    break;
                case 3:
                    nameM = "бубен";
                    break;
                case 4:
                    nameM = "червей";
                    break;
            }

            switch (n){
                case 6:
                    nameN = "шестёрка";
                    break;
                case 7:
                    nameN = "семь";
                    break;
                case 8:
                    nameN = "восемь";
                    break;
                case 9:
                    nameN = "девять";
                    break;
                case 10:
                    nameN = "десять";
                    break;
                case 11:
                    nameN = "валет";
                    break;
                case 12:
                    nameN = "дама";
                    break;
                case 13:
                    nameN = "король";
                    break;
                case 14:
                    nameN = "туз";
                    break;
            }
            System.out.println(nameN + " " + nameM);
        }

    }
}
