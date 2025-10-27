package _17_Inheritance.Shipment;

public class Shipment {
    private String from;
    private String to;

    public Shipment(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String route() {
        return this.from + " -> " + this.to;
    }

    public int calcFee(int weight, int distance) {
        return 0;
    }
}
