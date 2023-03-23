package AdditionalTask;

public class Test {
    public static void main(String[] args) {
        IntArray intArray = new IntArray();
        intArray.setArrays(new int[]{-5,2,19,1,6,4});
        System.out.println("Изначальный массив");
        showArrays(intArray);
        System.out.println("Сортировка по возрастанию");
        intArray.sort(1);
        showArrays(intArray);
        System.out.println("Сортировка по убыванию");
        intArray.sort(-1);
        showArrays(intArray);
    }
    public static void showArrays(IntArray intArray){
        for(int val:intArray.getArrays()){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
