package _35_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
* product => name, price
* 브랜드 명을 입력받고 그리고 최대 가격을 입력받는다
* 해당 브랜드의 상품중 최대 가격보다 아래인 제품 목록 출력
* 만약 없다면 해당 조건에 맞는 제품이 없습니다. 출력
* */
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북3 프로", 1850000),
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시탭 S9", 950000),
                new Product("삼성 갤럭시 S24 울트라", 1590000),
                new Product("애플 맥북에어 M2", 1690000),
                new Product("애플 맥북프로 M3", 2490000),
                new Product("애플 아이패드 에어 5세대", 929000),
                new Product("애플 아이폰 15 프로", 1550000),
                new Product("LG 그램 17", 2190000),
                new Product("LG 울트라PC", 1140000)
        );

        System.out.print("브랜드 명을 입력하세요: ");
        String brandName = scanner.nextLine();

        System.out.println("최대 가격을 입력하세요: ");
        int maxPrice = scanner.nextInt();

        System.out.println("[ 필터링 결과 ]");
        List<Product> filtered = products.stream()
                .filter(product -> product.getName().contains(brandName))
                .filter(product -> product.getPrice() <= maxPrice)
                .toList();

        if (filtered.isEmpty()) {
            System.out.println("해당 조건에 맞는 제품이 없습니다.");
        } else {
            filtered.forEach(System.out::println);
        }
    }
}
