package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        //속성값이 아무것도 없는 객체
        Car audi = new Car(); //NoArgs
        audi.carName = "A7";

        //속성값 중 carName만 주입된 객체
//        Car santafe = new Car("붕붕이");
//        System.out.println(santafe.carName);
//        santafe.showInfo();

        //속성값 모두 주입된 객체
        Car sorrento = new Car("쏘렌토", 2025, "검정색");
        sorrento.showInfo();
        sorrento.startCar();
        sorrento.drive();
    }
}
