public class Jornal implements Printable {

    private String name;
    private int year;

    public Jornal() {
    }

    public Jornal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(this.name + " - " + this.year);
    }
}
