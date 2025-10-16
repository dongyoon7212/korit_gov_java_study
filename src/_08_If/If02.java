package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        //else if 다중 조건문
        /*
        * if (조건1) {
        *   조건1이 참일때
        * } else if (조건2) {
        *   조건2가 참일때
        * } else {
        *   조건1과 조건2가 모두 거짓일때
        * }
        *
        * */

        int avgScore = 77;
        /*
        * 90점 이상 A
        * 80점 이상 B
        * 70점 이상 C
        * 나머지 D
        * */

        if (avgScore >= 90) {
            System.out.println("등급 : A");
        } else if (avgScore >= 80) {
            System.out.println("등급 : B");
        } else if (avgScore >= 70) {
            System.out.println("등급 : C");
        } else {
            System.out.println("등급 : D");
        }

        //사분면
        //x, y 를 입력받으세요
        //입력했을때 몇사분면에 존재하는지 출력하시오
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("x값을 입력하세요 >> ");
        x = scanner.nextInt();
        System.out.println("y값을 입력하세요 >> ");
        y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면");
        } else {
            System.out.println("4사분면");
        }


    }
}
