package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        //java object => json
        User user1 = new User("dongyoon", "1q2w3e4r", "a@gmail.com", "이동윤");
        userJson = gson.toJson(user1);
        System.out.println("Gson 사용 결과: " + userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("GsonBuilder 사용 결과: " + userJson);

        //Map => Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("productName", "삼성 갤럭시북 프로 5");

        System.out.println("gson 사용 결과: " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 결과: " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);
        //Json => Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        //gson.fromJson(json데이터, 바꾸고자하는 클래스명.class);

        //Json => User 클래스의 인스턴스로 바꾸는 방법
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

    }
}
