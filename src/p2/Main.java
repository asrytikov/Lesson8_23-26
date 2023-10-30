package p2;

public class Main {

    public static void main(String[] args) {
        Xerox.Printer printer = new Document();
        printer.print();

        Saller saller = createSaller("Test", true);
        saller.sale();

        runSale(new Market());
        runSale(new OnlineMarket());

    }

    static void runSale(Saller saller){
        saller.sale();
    }


    static Saller createSaller(String text, boolean isOnline){

        if (isOnline){
            return new OnlineMarket();
        }else{
            return new Market();
        }
    }

}
