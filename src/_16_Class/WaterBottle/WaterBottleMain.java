package _16_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.drink(300);
        waterBottle.fill(1500);
        waterBottle.drink(900);
        waterBottle.fill(0);
        waterBottle.drink(0);
    }
}
