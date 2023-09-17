package OOP.Phone;

import OOP.Phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = "=12131432";
        phone1.model = "samsung";
        phone1.weight = 124.1;
        System.out.println(phone1.model);
        phone1.receiveCall("Коля");
        phone1.receiveCall("Коля", "+2939241");
        phone1.getNumber("Коля ");
        phone1.sendMessage("Q24824","423523");
    }
}
