package day1a;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        //nhap so nguyen a, b. in ra thuong va so du cua a/b
         int a,b;
        Scanner in= new Scanner(System.in);
        System.out.print("nhap a,b: ");
        a= in.nextInt();
        b= in.nextInt();
        in.close();
        int c = a % b;
        System.out.printf("\nSo du la: %d", c);

    }
}
