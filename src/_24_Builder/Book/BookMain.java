package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookId(3)
                .author("홍길동")
                .isbn("254874123")
                .build();
        System.out.println(book);
    }
}
