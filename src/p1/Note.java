package p1;

public class Note implements Printer{

    private String text;

    public Note(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void print() {
        System.out.println("Text: " + text);
    }

    @Override
    public void paint() {
    }
}
