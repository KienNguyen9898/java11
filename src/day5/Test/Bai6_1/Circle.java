package day5.Test.Bai6_1;

public class Circle extends  Shape{
    protected double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ",color='" + color + '\'' +
                ",filled=" + filled +
                ']';
    }
}
