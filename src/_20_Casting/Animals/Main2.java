package _20_Casting.Animals;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal1 = new Animal();

        //instanceof
        //객체 instanceof 클래스
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);
        //true => 확인하고자 하는 객체가 해당 클래스의 인스턴스 이거나
        //자식클래스의 인스턴스인지 확인

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);

        Animal animal2 = new Dog();
//        ((Dog) animal2).wagTail();
        if (animal2 instanceof Dog dog2) {
//            Dog dog2 = (Dog) animal2;
            dog2.wagTail(); //ClassCastException 방지
        } else {
            System.out.println("불가능한 다운캐스팅 입니다.");
        }
    }
}
