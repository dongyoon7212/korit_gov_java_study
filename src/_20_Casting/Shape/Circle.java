package _20_Casting.Shape;
/*
* 속성으로 double r (반지름)
* allArgs
* area() => 원의 넓이 구하는 공식 (원주율 3.14)
* drawInternal() => 출력 (원 그리기 r = **)
* */
public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    protected void drawInternal() {
        System.out.println("원 그리기 => r = " + r);
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }
}
