package day1b;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //viet chuong trinh nhap vao so nguyen n, hoi n la so chan hay le.
        //viet chuong trinh nhap vao so nam x, hoi x la nam nhuan hayu ko nhuan.

        Scanner in= new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = in.nextInt();
        in.close();
        if (n%2 == 0){
            System.out.printf(n+" la so chan");
        }
        if (n%2 != 0){
            System.out.printf(n+" la so le");
        }
    }
}
