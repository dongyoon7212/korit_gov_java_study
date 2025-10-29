package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.builder()
                .name("이동윤")
                .age(27)
                .email("dongyoon7212@naver.com")
                .build();
    }
}
