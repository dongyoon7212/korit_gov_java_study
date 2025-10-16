package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner 입력받기

        Scanner scanner = new Scanner(System.in);

        //String 문자열 입력받기
        //next() => 토큰 단위로 읽는다.
        //토큰 => 공백문자(띄어쓰기, 탭, 엔터)
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);

        //nextLine() => 엔터 단위로 읽는다. 한 줄을 읽음
//        String str3 = scanner.nextLine();
//        System.out.println("str3 :" + str3);

        //int 정수 입력받기
        //nextInt() 개행문자를 무시하고 입력받는다
        //엔터를 치면 엔터전까지 입력받고 엔터의 개행문자는 남게 됨
//        int num1 = scanner.nextInt();
//        System.out.println("num1 :" + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("num2 :" + num2);

//        int num = scanner.nextInt(); //123\n
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        System.out.println("num : " + num + ", str : " + str);

        //나이와 이름을 입력받아서
        //출력 => 27살 이동윤입니다.
        //나이를 먼저 입력받아야한다.
        int age;
        String name;
        System.out.println("나이를 입력하세요 >>> ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("이름을 입력하세요 >>> ");
        name = scanner.nextLine();

        System.out.println(age + "살 " + name + "입니다.");
    }
}
