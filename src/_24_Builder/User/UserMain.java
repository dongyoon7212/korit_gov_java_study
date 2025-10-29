package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .userId(10)
                .email("dongyoon7212@naver.com")
                .password("1234")
                .username("abc")
                .build();
    }
}
