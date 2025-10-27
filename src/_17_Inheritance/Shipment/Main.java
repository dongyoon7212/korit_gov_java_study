package _17_Inheritance.Shipment;

public class Main {
    public static void main(String[] args) {
        TruckShipment truckShipment = new TruckShipment("부산", "서울");

        System.out.println(truckShipment.calcFee(1000, 320));

        BikeShipment bikeShipment = new BikeShipment("서면", "해운대");

        System.out.println(bikeShipment.calcFee(5, 14));
    }
}
