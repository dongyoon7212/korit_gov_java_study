package _17_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    //AllArgs 생성자 하나 생성하시고 getter/setter 다 만드시고


    public Animal() {
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //메소드에 move만들기
    //움직입니다. 출력
    public void move() {
        System.out.println("움직입니다.");
    }
}
