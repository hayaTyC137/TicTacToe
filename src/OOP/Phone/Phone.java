package OOP.Phone;
import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
    public Phone(String number, String model) {
        this(number, model, 0); // Вызываем конструктор с тремя параметрами, устанавливаем param3 в значение по умолчанию (например, 0)
    }

    void receiveCall(String name){
        System.out.printf("Звонит %s!\n", name);
    }

    void receiveCall(String name, String number){
        System.out.printf("Звонит %s, номер которого: %s%n\n", name, number);
    }
    String getNumber(String number){
        return number;
    }
    public void sendMessage(String... phoneNumbers){
        System.out.println("Отправить сообщения на эти номера: ");
        Arrays.stream(phoneNumbers).forEach(System.out::println);
    }


}

