package p1;

public class Document implements Printer, Search{

    private String name;
    private String author;

    public Document(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s - %s \n", name, author);
        System.out.println(Printer.WORKTIME);
    }

    @Override
    public void search() {
        System.out.println("Go to search");
    }

    @Override
    public void paint() {
    }
}
