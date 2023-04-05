import java.util.ArrayList;

public class Reader {
    private String nameReader;
    private int numReadTicket;
    private String faculty;
    private String dateBirth;
    private String phoneNumber;
    private ArrayList<Book> books = new ArrayList<>(10);

    public Reader(String nameReader, int numReadTicket, String faculty, String dateBirth, String phoneNumber) {
        this.nameReader = nameReader;
        this.numReadTicket = numReadTicket;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public int getNumReadTicket() {
        return numReadTicket;
    }

    public void printStatus() {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }

        String a;
        if (count == 0) {
            a = " книг\n";
        } else if (count == 1) {
            a = " книгу: ";
        } else {
            a = " книги: ";
        }

        System.out.print(nameReader + " взял " + count + a);
        if (count != 0) {
            int val = 0;
            for (Book book : books) {
                if (book != null) {
                    if (val == 0) {
                        System.out.print(book.getName());
                    } else {
                        System.out.print(", " + book.getName());
                    }
                    val++;
                }
            }
            System.out.println();
        }

    }

    public void takeBook(Book book) {
        if (books.size() >= 10) {
            System.out.println("Читатель может взять не больше 10 книг.");
        }
        books.add(book);
        System.out.println(nameReader + " взял книгу " + book.getName());
    }

    public void returnBook(String nameBook) {
        boolean check = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(nameBook)) {
                books.remove(i);
                System.out.println(nameReader + " вернул книгу " + nameBook);
                System.out.println();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(nameReader + " не хранит книгу " + nameBook);
            System.out.println();
        }
    }
}
