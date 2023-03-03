package day1a;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        // nhap 3 so thuc x,y,z. In ra tbc va tbn cua x,y,z. kq lam tron so thap phan thu 3.
        float x;
        float y;
        float z;
        Scanner in= new Scanner(System.in);
        System.out.print("x= ");
        x= in.nextFloat();
        System.out.print("y= ");
        y= in.nextFloat();
        System.out.print("z= ");
        z= in.nextFloat();
        in.close();
        float tbc= (x+y+z)/3;
        double tbn= Math.pow(x*y*z, 1.0/3 );
        System.out.printf("trung binh nhan la: %.3f\ntrung binh cong la: %.3f", tbn,tbc);
    }
}
