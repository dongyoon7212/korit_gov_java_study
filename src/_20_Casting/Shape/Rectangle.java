package _20_Casting.Shape;
/*
* 속성으로 double w, h (가로 세로)
* allArgs
* area() => 직사각형 넓이 구하기
* drawInternal() => 직사각형 그리기 (가로 - **, 세로 - **)
* */
public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    protected void drawInternal() {
        System.out.println("직사각형 그리기 (가로 - "+ w + ", 세로 - " + h + ")");
    }

    @Override
    public double area() {
        return w * h;
    }
}
