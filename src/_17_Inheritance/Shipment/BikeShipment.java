package _17_Inheritance.Shipment;

public class BikeShipment extends Shipment {
    public BikeShipment(String from, String to) {
        super(from, to);
    }

    @Override
    public int calcFee(int weight, int distance) {
        if (weight < 0) {
            weight = 0;
        }
        if (distance < 0) {
            distance = 0;
        }
        int fee = 2000 + (weight * 20) + (distance * 50);
        return fee;
    }
}
