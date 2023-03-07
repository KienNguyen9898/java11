package day4a.Bai4_1cach2;

public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2,3);
        // tinh the tich
        System.out.println(c1.getVolume());
        //tinh dien tich day
        System.out.println(c1.getCircle().getArea());
    }
}
