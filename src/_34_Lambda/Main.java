package _34_Lambda;

/*
* 람다식(Lambda Expression)
* Java8에서 도입된 '함수형 프로그래밍(Functional Programming)'을 지원하기 위한 표현식
*
* 람다식의 구조
* 1. 매개변수 목록
* 2. 화살표(->)
* 3. 구현부/실행문
* */

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Runnable job1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 방식으로 실행");
            }
        };
        job1.run();

        Runnable job2 = () -> System.out.println("람다 방식으로 실행");
        job2.run();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//두 Integer 객체를 받아 비교
                return o1.compareTo(o2);
                //두 객체 중 만약 앞의 객체가 더 작다면 -1, 같다면 0, 크다면 1을 반환
            }
        };
        System.out.println(comparator.compare(5, 8));

        Comparator<Integer> lambdaComparator = (o1, o2) -> o1.compareTo(o2);
        System.out.println(lambdaComparator.compare(10, 5));

        /*
        * 람다 장점
        * 코드 간결화
        * 표현력 향상
        *
        * 람다 단점
        * 디버깅 어려움 - 람다식 내부에서 발생하는 오류의 디버깅이 어렵다 => 간결하게 코드를 쓰니까
        * 재사용성 낮음 - 익명 클래스에 비해서 재사용이 어려움 => 한줄로 한번만 사용하고 마니까
        * 복잡한 로직 표현에 부적합 - 단순 로직의 경우 람다, 아닌 경우는 익명 클래스
        *
        * 주요 함수형 인터페이스
        * Runnable - void run();
        * 매개변수도 없고 반환값도 없는 단순 실행을 위한 인터페이스
        *
        * Supplier - T get();
        * 매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급'하는 역할
        * */
    }
}









