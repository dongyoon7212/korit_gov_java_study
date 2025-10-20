package _12_Array;

public class Array02 {
    public static void main(String[] args) {
        //배열 순회
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        //반복문(for) 순회
        for (int i = 0; i < 5; i++) {
            System.out.println(countries[i]);
        }

        //반복문(for) 순회, 근데 이제 배열 길이를 곁들인...
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        //enhanced for (for-each) / 향상된 for문
        for (String country : countries) {
            System.out.println(country);
        }

        //본인이 좋아하는 음식 5가지 배열에 저장하고
        //향상된 for문을 이용해서 출력해보기
        //"내가 좋아하는 음식 1번 ***"
        //"내가 좋아하는 음식 2번 ***"
        String[] foods = {"돼지고기고추장찌개", "치킨", "피자", "국밥", "제육볶음"};
        int i = 1;
        for (String food : foods) {
            System.out.println("내가 좋아하는 " + i + "번 음식 " + food);
            i++;
        }

    }
}
