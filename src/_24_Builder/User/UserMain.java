package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .userId(2)
                .username("이동윤")
                .password("1234")
                .email("dongyoon7212@naver.com")
                .build();

        System.out.println(user);
    }
}
