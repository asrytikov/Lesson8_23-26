package p3;

public class CloseHandler implements Closer{
    @Override
    public void close() {
        System.out.println("Close window");
    }
}
