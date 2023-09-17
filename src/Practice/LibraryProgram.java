package Practice;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Reader {
    String fullName;
    private int readerCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerCardNumber = readerCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }
}

class StudentReader extends Reader {
    public StudentReader(String fullName, int readerCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        super(fullName, readerCardNumber, faculty, dateOfBirth, phoneNumber);
    }

    @Override
    public void takeBook(int numberOfBooks) {
        System.out.println(getFullName() + " (студент) взял " + numberOfBooks + " книги.");
    }

    @Override
    public void returnBook(int numberOfBooks) {
        System.out.println(getFullName() + " (студент) вернул " + numberOfBooks + " книги.");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(boolean fullName) {
        this.fullName = String.valueOf(fullName);
    }
}

public class LibraryProgram {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 123456, "Физика", "01.01.1990", "123-456-7890");
        StudentReader student1 = new StudentReader("Иванов А. В.", 789012, "Химия", "02.02.1995", "987-654-3210");
        Book book1 = new Book("Роман", "Сидоров Н. С.");
        Book book2 = new Book("Учебник", "Петров И. П.");

        reader1.takeBook(3);
        reader1.takeBook("Книга1", "Книга2", "Книга3");
        reader1.returnBook(2);
        reader1.returnBook("Книга1", "Книга2");

        student1.takeBook(4);
        student1.takeBook("Книга4", "Книга5", "Книга6", "Книга7");
        student1.returnBook(3);
        student1.returnBook("Книга4", "Книга5", "Книга6");
    }
}
