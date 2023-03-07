package day4a.Bai1_1;

public class Main_Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0, "pink");
        System.out.println("Hinh tron co ban kinh la " +c1.getRadius() + "\nDien tich la: " +c1.getArea() + "Chu vi la: "+c1.getCircumference());
        System.out.println("Hinh tron co ban kinh la "+c2.getRadius() + "\nDien tich la: "+c2.getArea() + "Chu vi la: "+c2.getCircumference());

    }
}
