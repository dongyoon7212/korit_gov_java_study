package _16_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    public int getCurrentWater() {
        return currentWater;
    }

    public void fill(int amount) {
        if (amount > 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println(amount + "의 양만큼 물병의 물을 채웠습니다. 현재 물 용량 : " + currentWater);
        } else {
            System.out.println("0 초과의 물을 채우거나 물병의 최대 용량을 넘어설 수 없습니다.");
        }
    }

    public void drink(int amount) {
        if (amount > 0 && currentWater - amount >= 0) {
            currentWater -= amount;
            System.out.println(amount + "만큼 물을 마셨습니다. 현재 물 용량 : " + currentWater);
        } else {
            System.out.println("0 초과의 물을 마시거나 현재 물 용량보다 초과해서 마실 수 없습니다.");
        }
    }
}
