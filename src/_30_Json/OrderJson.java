package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

//{
//  "orderId": "ORD123456",
//  "customer": "곽두팔",
//  "product": "에어팟 프로 2세대",
//  "quantity": 1,
//  "price": 349000,
//  "address": {
//      "receiver": "곽두팔",
//      "phone": "010-5678-1234",
//      "city": "서울",
//      "district": "마포구",
//      "zipCode": "04123"
//      }
//}
//jsonObject객체를 만들고 gsonBuilder를 이용해 json형태로 변환 후 위와 같이 출력하시오
public class OrderJson {
    public static void main(String[] args) {
        JsonObject orderInfo = new JsonObject();
        orderInfo.addProperty("orderId", "ORD123456");
        orderInfo.addProperty("customer", "곽두팔");
        orderInfo.addProperty("product", "에어팟 프로 2세대");
        orderInfo.addProperty("quantity", 1);
        orderInfo.addProperty("price", 349000);

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽두팔");
        address.addProperty("phone", "010-5678-1234");
        address.addProperty("city", "서울");
        address.addProperty("district", "마포구");
        address.addProperty("zipCode", "04123");

        orderInfo.add("address", address);

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String json = gsonBuilder.toJson(orderInfo);
        System.out.println(json);

    }
}
