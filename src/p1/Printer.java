package p1;

public interface Printer extends Paint {

    int WORKTIME = 8;


    default void print(){
        System.out.println(textForPrint());
    }

    static void counterPrint(){
        System.out.println("Print");
    }

    private String textForPrint(){
        return "TEST TEXT";
    }

}
