package Phone;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String nameCall) {
        System.out.println("Звонит " + nameCall);
    }

    public void receiveCall(String nameCall, int number){
        System.out.println("Звонит " + nameCall + ", с номера " + number);
    }

    public void sendMessage(int ... numbers){
        System.out.print("Сообщения будут отправлены на номера:");
        for(int val:numbers){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return this.weight;
    }
}
