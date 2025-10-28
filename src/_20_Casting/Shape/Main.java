package _20_Casting.Shape;

/*
*
* */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 2);
        Shape s3 = new Triangle(5, 3);

        s1.render();
        s2.render();
        s3.render();

        Shape[] shapes = {
                s1, s2, s3
        };
        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }
        System.out.println(total);

    }
}
