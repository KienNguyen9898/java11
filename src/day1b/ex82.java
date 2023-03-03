package day1b;

import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap so thuc a,b,c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        if (a>b){
            if (a>c){
                System.out.printf(a+ " la so lon nhat");
            }
            else System.out.printf(c+" la so lon nhat");
        }
        else if (b<c){
            System.out.printf(c+" la so lon nhat");
        } else
            System.out.println(b+" la so lon nhat");
    }
}
