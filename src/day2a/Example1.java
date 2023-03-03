package day2a;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print(" nhap n: ");
        int n = in.nextInt();
        in.close();
        int s = 0;
        for (int i = 1; i<= n; i++){
            s = s + i;
        }
        System.out.printf("S= %d", s);
    }
}
