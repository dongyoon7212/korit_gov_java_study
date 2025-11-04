package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

//Book 클래스 만들고 객체 생성
//isbn, title, author, price, publisher => String
//"978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
//Book객체 => Json 문자열
//Json => Map
//Map => pretty Json
//Json => Book 객체
@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );
        String jsonBook = gson.toJson(book);
        System.out.println("book객체 => json 문자열");
        System.out.println(jsonBook);

        Map<String, String> bookMap = gson.fromJson(jsonBook, Map.class);
        System.out.println("json 문자열 => Map");
        System.out.println(bookMap);

        String prettyJsonFromMap = gsonBuilder.toJson(bookMap);
        System.out.println("Map => Pretty Json");
        System.out.println(prettyJsonFromMap);

        Book parsedBook = gson.fromJson(jsonBook, Book.class);
        System.out.println("json => book 객체");
        System.out.println(parsedBook);

        Book parsedBook2 = gson.fromJson(prettyJsonFromMap, Book.class);
        System.out.println(parsedBook2);
    }
}









