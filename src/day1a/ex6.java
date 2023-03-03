package day1a;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int x,y,z,t;
        Scanner in= new Scanner(System.in);
        System.out.print("nhap x,y,z,t: ");
        x= in.nextInt();
        y= in.nextInt();
        z= in.nextInt();
        t= in.nextInt();
        in.close();
        boolean A= (2*x >5) && (3*y <10) || (5*z+6 >t);
        System.out.println(A);
    }
}
