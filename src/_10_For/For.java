package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //반복문 - for
        /*
        * for (선언; 조건; 증감) {
        *   반복할 코드
        * }
        * */
//        for (int i = 0; i < 10; i++) {
//            System.out.println("안녕" + i);
//        }
//
//        for (int i = 0; i < 51; i += 2) {
//            System.out.println(i);
//        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //문제
        //1~100까지 다 더한 총합을 구하시오
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        //문제
        //1~100까지 중에 짝수만 더한 총합을 구하시오
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //구구단 출력하기 (한 단만)
        //특정 단을 입력받아서 1~9까지 구구단 출력하기
//        Scanner scanner = new Scanner(System.in);
//        int dan = scanner.nextInt();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(dan + "x" + i + "=" + (dan * i));
//        }
        //구구단 전체 출력하기
        for (int dan = 1; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
        }


        /*
        *   *
        *   **
        *   ***
        *   ****
        *   *****
        * */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *   *****
        *   ****
        *   ***
        *   **
        *   *
        * */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //break, continue

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        //1~50까지 수 중에서 3의 배수 빼고 출력하기
        //단 3의 배수는 " " 띄어쓰기 한칸 출력으로 대체
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) { //3의 배수 조건
                System.out.println(" ");
                continue;
            }
            System.out.println(i);
        }

        //1부터 계속 합계를 구하되 합계가 200이 넘어가면 스탑
        //마지막은 최종 합과 마지막으로 더한 수를 출력
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 200) {
                System.out.println("마지막 더한 수 : " + i);
                System.out.println("최종 합계 : " + sum);
                break;
            }
        }


        //1부터 100까지 수 중에서 3의 배수와 5의 배수의 갯수를
        //각각 출력하시오
        int cnt3 = 0;
        int cnt5 = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                cnt3++;
            }
            if (i % 5 == 0) {
                cnt5++;
            }
        }
        System.out.println(cnt3);
        System.out.println(cnt5);



        //정수 5개를 입력받고 입력받은 수 중 가장 큰 값 출력
        //범위는 1에서 100사이 만약 1에서 100사이가 아니라면
        //범위를 벗어났습니다 출력 후 스탑
        Scanner scanner = new Scanner(System.in);
//        int max = 0;
//        for (int i = 0; i < 5; i++) {
//            int inputNum = scanner.nextInt();
//            if (inputNum > 100 || inputNum < 1) {
//                System.out.println("범위를 벗어났습니다.");
//                break;
//            }
//            if (max < inputNum) {
//                max = inputNum;
//            }
//        }
//        System.out.println("최댓값 :" + max);


        //팩토리얼 구하기
        //숫자를 입력받아 팩토리얼 구하기
        //단 1~10까지만 입력받기
//        int num = scanner.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);


        //1~50까지 반복하는데
        //3 6 9 일때는 박수 출력
        //5 일때는 으악 출력

        for (int i = 1; i <= 50; i++) {
            boolean flag = true;

            if (i % 10 == 3 || i % 10 == 6 || i % 10 ==9) {
                System.out.println("박수");
                flag = false;
            } else if (i % 10 == 5) {
                System.out.println("으악");
                flag = false;
            }
            if (i / 10 == 3) {
                System.out.println("박수");
                flag = false;
            }
            if (i == 50) {
                System.out.println("으악");
                flag = false;
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
