package day1b;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // nhap so nguyen x, hoi x co la so chinh phuong ko
        Scanner in = new Scanner(System.in);
        System.out.print("nhap x: ");
        long x = in.nextLong();
        in.close();
        if ( Math.sqrt(x) % 1 == 0  ){
            System.out.printf(x+ " la so chinh phuong");
            System.exit(0);

        }
        else System.out.printf(x+ " ko la so chinh phuong");
    }
}
