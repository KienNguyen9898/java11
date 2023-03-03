package day1a;

import java.util.Scanner;

public class example3 {
    public static void  main(String[] args){
        /*Nhap 2 so nguyen(long) x va y in ra trung binh cong cua 2 so do(nextLong())*/

        long x;
        long y;
        Scanner in= new Scanner(System.in);
        System.out.print("x= ");
        x= in.nextLong();
        System.out.print("y= ");
        y= in.nextLong();
        in.close();
        double tb = (x + y)/ 2.0;
        System.out.printf("trung binh cong x va y la: %.2f", tb );


    }
}
