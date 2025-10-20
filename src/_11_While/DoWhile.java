package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 - Do While
        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 최초 1회는 실행
        // while은 조건 검사 후 실행

        /*
        * do {
        *   반복할 코드 -- 최초 한번은 실행
        * } while (조건);
        * */

        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("===메뉴===");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("0. 종료");
//            System.out.print("선택: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("주문을 합니다.");
//                    break;
//                case 2:
//                    System.out.println("취소를 합니다.");
//                    break;
//                case 0:
//                    System.out.println("종료합니다.");
//                    break;
//                default:
//                    System.out.println("올바른 번호를 입력하세요.");
//            }
//        } while (choice != 0);

        //1부터 n까지 합 (do-while)
//        System.out.print("n : ");
//        int n = scanner.nextInt();
//
//        i = 1;
//        int sum = 0;
//        do {
//            sum += i;
//            i++;
//        } while (i <= n);
//        System.out.println("1~" + n + "까지의 총합: " + sum);

        //숫자 맞추기 게임
        //숫자를 입력받아서 정답을 맞추기
        //업 다운 출력
        //시도한 횟수를 나중에 정답 맞췄을때 같이 출력
        int answer = (int) (Math.random() * 100) + 1;
        int tries = 0;
        int guess;

        do {
            System.out.print("숫자(1~100):");
            guess = scanner.nextInt();
            tries++;

            if (guess < answer) {
                System.out.println("UP");
            } else if (guess > answer) {
                System.out.println("DOWN");
            }
        } while (guess != answer);
        System.out.println("정답! 시도 횟수:" + tries);
    }
}
