package _19_Interface.Zookeeper;

public class Zookeeper {
//    public void feed(Tiger tiger) {
//        System.out.println("사과를 던져준다.");
//    }
//
//    public void feed(Lion lion) {
//        System.out.println("바나나를 던져준다.");
//    }

    public void feed(Predator predator) {
        System.out.println(predator.getFood() + "를 던져준다.");
    }
}
