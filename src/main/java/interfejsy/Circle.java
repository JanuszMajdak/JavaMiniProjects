package interfejsy;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Shape.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * radius;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Circle:");
        sb.append(" radius = " + radius);
        sb.append(", area = " + calculateArea());
        sb.append(", perimeter = " + calculatePerimeter());
        return sb.toString();
    }


}
