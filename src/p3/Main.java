package p3;

public class Main {

    public static void main(String[] args) {
        Button button= new Button(new CloseHandler());
        button.click();

        Button electricBtn = new Button(new Closer()
        {
            private boolean on = false;
            public void close(){
                if (on){
                    System.out.println("Electicity is off");
                    on = false;
                }else{
                    System.out.println("Electicity is on");
                    on = true;
                }
            }
        });

        Button printBtn = new Button(new Closer() {
            @Override
            public void close() {
                System.out.println("Print");
            }
        });

        electricBtn.click();
        electricBtn.click();
        printBtn.click();
    }
}


