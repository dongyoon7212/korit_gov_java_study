package _15_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        return (int) (doubleNum * doubleNum);
    }

    public static void printInfo(String name) {
        System.out.println(name);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러개 선언
        //전달값(파라미터)의 타입이 달라야한다.
        //또는 갯수가 달라야한다.
        //대신에 반환형은 같아도 된다.
        System.out.println(getPower(3));

        //printInfo()
        //문자열 이름만 전달해서 => 이름 출력
        //문자열 이름과 정수 나이 전달 => 이름, 나이 출력
        //문자열 이름과 정수 나이, 문자열 이메일 전달 => 이름, 나이 ,이메일 출력
        printInfo("이동윤");
        printInfo("이동윤", 27);
        printInfo("이동윤", 27, "dongyoon7212@naver.com");
    }
}
