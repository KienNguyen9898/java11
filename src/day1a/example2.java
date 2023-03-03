package day1a;

import java.util.Scanner;

public class example2 {
    public  static  void  main(String[] args){
        int a;              //khai bao bien
        int b;
        Scanner in= new Scanner(System.in); //nhap du lieu
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        in.close();     //dong nhap du lieu tu ban phim
        int t = a + b;  // tinh tong va in
        System.out.printf("%d + %d = %d",a,b,t);
    }
}
