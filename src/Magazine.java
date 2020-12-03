import java.util.ArrayList;

public class Magazine {
    public Magazine() {
    }

    public static void printBook(ArrayList<Printable> products) {

        for (Printable product:products) {
            if (product instanceof Book) {
                System.out.println("Book - " + ((Book) product).getName());
            }
        }
    }

    public static void printJornal(ArrayList<Printable> products) {

        for (Printable product:products) {
            if (product instanceof Jornal) {
                System.out.println("Jornal - " + ((Jornal) product).getName());
            }
        }
    }
}
