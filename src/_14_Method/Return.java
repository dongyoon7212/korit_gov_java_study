package _14_Method;

public class Return {

    public static String getName() {
//        String name = "이동윤";
        return "이동윤";
    }

    public static int getAge() {
//        int age = 27;
        return 27;
    }
    public static void main(String[] args) {
        //반환값
        //void는 반환값이 없다라는 의미
        String name = getName();
        System.out.println(name);

        int myAge = getAge();
        System.out.println(myAge);

    }
}
