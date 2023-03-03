package day1b;

import java.util.Scanner;

public class ex83 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print(" nhap a , b: ");
        double a= in.nextDouble();
        double b= in.nextDouble();
        in.close();
        if (a==0 && b==0){
            System.out.println("hai so bang nhau va bang 0");
        }
        if(a * b > 0) {
            System.out.println(" hai so cung dau");
        }
        else System.out.println("hai so khac dau");

    }
}
