package p3;

public class Button {

    Closer closer;
    public Button(Closer closer){
        this.closer = closer;
    }
    public void click(){
        closer.close();
    }

}
