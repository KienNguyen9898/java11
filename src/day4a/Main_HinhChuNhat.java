package day4a;

public class Main_HinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat();
        HinhChuNhat h2 = new HinhChuNhat();
        h1.setChieuDai(0);
        h1.setChieuRong(4);
        h2.setChieuDai(1.5);
        h2.setChieuRong(3);
        System.out.println(h1);
        System.out.println("Chu vi 1: "+h1.chuvi());
        System.out.println("Dien tich 1: "+h1.dienTich());
        System.out.println(h2);
        System.out.println("Chu vi 2: "+h2.chuvi());
        System.out.println("Dien tich 2: "+h2.dienTich());

    }
}
