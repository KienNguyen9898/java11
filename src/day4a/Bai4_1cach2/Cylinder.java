package day4a.Bai4_1cach2;

public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder() {
        circle = new Circle();
    }

    public Cylinder(double height, Circle circle) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = circle;
    }

    public Cylinder(double height, double radius) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius);
    }
    public Cylinder(double height, double radius, String color ){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius, color);
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    public double getVolume(){
        return circle.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", circle=" + circle +
                '}';
    }
}
