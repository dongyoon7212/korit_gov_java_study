package _26_Singleton.ex1;

public class Main {
    public static void main(String[] args) {
        Ex1 ex1 = Ex1.getInstance();
        Ex1 ex12 = Ex1.getInstance();
        System.out.println(ex1 == ex12);
    }
}
