package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(11,"Nokia");
        Phone phone2 = new Phone(10,"LG", 100);
        Phone phone3 = new Phone(13, "Samsung", 165);

        System.out.println("Phone1 :" + "number = " + phone1.getNumber() + ", model = " + phone1.getModel() + ", weight = " + phone1.getWeight());
        phone1.receiveCall("Петя");
        phone1.receiveCall("Петя",123456);
        phone1.sendMessage(12345,23456,34567);
        System.out.println();
        System.out.println("Phone2 :" + "number = " + phone2.getNumber() + ", model = " + phone2.getModel() + ", weight = " + phone2.getWeight());
        phone2.receiveCall("Вася");
        phone2.receiveCall("Вася",34567678);
        phone2.sendMessage(54321,65432,76543);
        System.out.println();
        System.out.println("Phone3 :" + "number = " + phone3.getNumber() + ", model = " + phone3.getModel() + ", weight = " + phone3.getWeight());
        phone3.receiveCall("Андрей");
        phone1.receiveCall("Андрей",654321);
        phone3.sendMessage(98765,87654,76543);
    }
}