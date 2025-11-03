package _29_Collections.Map;

import java.util.*;

/*
* 1. 스캐너 객체 하나 생성하고 변수명이 productMap인 hashMap선언 (키는 String, 값은 Integer)
* 2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키)입력받고 가격(값)입력받고
*       productMap에 넣기
* 3. 전체 상품 출력하기 => 향상된 for문 순회하면서 "- 아이폰17 => 1250000원" 이런식으로 출력
* 4. 상품 가격 수정 => 수정할 상품명 입력받고 입력한 상품이 productMap에 있으면 수정할 가격입력받고
*   없으면 "해당 상품이 없습니다" 출력 => 만약 수정 성공시 "가격이 수정되었습니다." 출력
* 5. 특정 상품 검색 => 검색할 상품명 입력받고 입력한 상품이 있으면 출력 없으면 "해당 상품이 없습니다." 출력
* 6. 정렬하기 => 키 기준 정렬후 출력
* 7. 내림차순 정렬하기 => 키 기준 내림차순 정렬후 출력
* */
public class ProductMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        System.out.println("상품 등록");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 입력: ");
            String name = scanner.nextLine();
            System.out.print("가격 입력: ");
            Integer price = scanner.nextInt();
            scanner.nextLine();

            productMap.put(name, price);
        }

        System.out.println("전체 상품 조회");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("- " + entry.getKey() + " => " + entry.getValue() + "원");
        }

        System.out.print("가격을 수정할 상품명: ");
        String updateName = scanner.nextLine();
        if (productMap.containsKey(updateName)) {
            System.out.print("수정할 가격: ");
            Integer newPrice = scanner.nextInt();
            productMap.put(updateName, newPrice);
            scanner.nextLine();
            System.out.println("가격이 수정되었습니다.");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        System.out.print("검색할 상품명을 입력하세요: ");
        String searchProductName = scanner.nextLine();
        if (productMap.containsKey(searchProductName)) {
            System.out.println("- " + searchProductName + " => " + productMap.get(searchProductName) + "원");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(productMap.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        System.out.println("오름차순 정렬");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("- " + entry.getKey() + " => " + entry.getValue() + "원");
        }

        entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("내림차순 정렬");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("- " + entry.getKey() + " => " + entry.getValue() + "원");
        }
    }
}











