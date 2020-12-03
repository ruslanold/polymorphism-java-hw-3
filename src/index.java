import java.util.ArrayList;

public class index {
    public static void main(String[] args) {

        Book book = new Book("Java", 2020);
        Jornal jornal = new Jornal("Java in Ukraine", 2020);
        ArrayList<Printable> magazin = new ArrayList<>();
        magazin.add(book);
        magazin.add(jornal);
        Magazine.printBook(magazin);
        Magazine.printJornal(magazin);
    }
}
