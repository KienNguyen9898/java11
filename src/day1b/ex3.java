package day1b;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // giai phuong trinh bac nhat ax + b =0
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap a, b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();
        double x= -b/a;
        if (a == 0 ){
            System.out.printf(" vo nghiem");
            System.exit(0);
        }
        if (a==0 && b==0){
            System.out.println("Vo so nghiem");
            System.exit(0);
        }
        System.out.printf("nghiem cua phuong trinh la: %.1f", x);
    }
}
