public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int min = 10;
        int max = 99;
        boolean check = true;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min)) + min;
        }

        System.out.print("Массив: ");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

            if (i == 0) {
                temp = arr[i];
            } else {
                if (check) {
                    if (arr[i] < temp) {
                        check = false;
                    }
                }
                temp = arr[i];
            }
        }
        if (check) {
            System.out.println("\nМассив имеет строго возврастающую последовательность.");
        } else {
            System.out.println("\nМассив не имеет строго возврастающуей последовательности.");
        }
    }
}
