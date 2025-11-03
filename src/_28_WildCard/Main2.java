package _28_WildCard;

import java.util.List;

public class Main2 {
     static Box<? extends Dog> boxView() {
         Box<Dog> dogBox = new Box<>();
         dogBox.setValue(new Dog());
         Box<Animal> animalBox = new Box<>();
         animalBox.setValue(new Animal());
         Box<Corgi> corgiBox = new Box<>();
         corgiBox.setValue(new Corgi());
         return corgiBox;
     }

    public static void main(String[] args) {
        Box<? extends Dog> view = boxView();
        System.out.println(view.getValue());
    }
}
