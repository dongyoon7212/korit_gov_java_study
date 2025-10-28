package _22_Bean;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserEntityLombok {
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
