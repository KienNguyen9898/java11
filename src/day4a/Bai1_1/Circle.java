package day4a.Bai1_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
         return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ){
            System.out.println("Ban kinh khong hop le");
        }
        else this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
