package p2;

public class Document implements Xerox.Printer{
    @Override
    public void print() {
        System.out.println("Hello");
    }
}
