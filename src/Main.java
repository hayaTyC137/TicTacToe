import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person  employee1 = new Person("1","1", 1);
        Employee employee2 = new Employee("2", "2",2,2,2,"2");
        List<Person> personList = Arrays.asList(employee1, employee2);
        massGreeting(personList);
}
    static class Person{
        private String firstName;
        private String secondName;
        private int age;

        public Person(String firstName, String secondName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }
        public void greetings(){
            System.out.printf("Привет я человек и меня зовут %s\n",this.firstName);
        }
        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public String getFullName() {
            return this.firstName + " " + this.secondName;
        }
        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setAge(int age) {
            if (age <= 0){
                System.out.println("не корректный возраст");
            }
            else {
                this.age = age;
            }
        }
    }
    static class Employee extends Person{
        private int inn;
        private int number;
        private String snils;

        public Employee(String firstName, String secondName, int age, int inn, int number, String snils) {
            super(firstName, secondName, age);
            this.inn = inn;
            this.number = number;
            this.snils = snils;
        }
        public void greetings(){
            System.out.printf("Привет я работник и меня зовут %s\n", this.getFirstName());
        }
        public int getInn() {
            return inn;
        }

        public int getNumber() {
            return number;
        }

        public String getSnils() {
            return snils;
        }

        public void setInn(int inn) {
            this.inn = inn;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setSnils(String snils) {
            this.snils = snils;
        }
    }
    public static void massGreeting(List<Person> personList) {
        for (Person person : personList) {
            person.greetings();
        }
    }
}
