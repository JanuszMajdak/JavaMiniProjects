package interfejsy;

public class Triangle implements Shape {
    private double height;
    private double a;
    private double b;
    private double c;


    public Triangle(double height, double a, double b, double c) {
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public double calculateArea() {
        return 0.5 * a * height;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Triangle: ");
        sb.append("  Side A= " + a);
        sb.append(",  Side B= " + b);
        sb.append(",  Side C= " + c);
        sb.append(",  Height = " + height);
        sb.append(",  Area  = " + calculateArea());
        sb.append(",  Perimeter = " + calculatePerimeter());

        return sb.toString();
    }
}
