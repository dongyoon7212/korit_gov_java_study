package _24_Builder.StaticMember;

public class StaticMemberMain {
    public static void main(String[] args) {
        StaticMember staticMember = new StaticMember.Builder() //builder객체 생성
                .age(27)
                .name("이동윤")
                .email("dongyoon7212@naver.com")
                .build();

        /*
        * Builder 패턴을 써야하는 이유
        * 1. 필요한 필드 데이터만 설정 가능
        * 2. 유연성 확보
        * 3. 가독성 향상
        * 4. 변경 가능성을 최소화
        * */
    }
}
