package dz6;

public class Phone {

   private String number;
   private String model;
   private double weight;

    public Phone() {
        System.out.println("dz6.Phone is created");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.printf("Call %s\n", name);
    }

    public void info(){
        System.out.printf("dz6.Phone: model=%s, number=%s, weight=%.2f\n", this.getModel(), this.getNumber(), this.getWeight());
    }

}
