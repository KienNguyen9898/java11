package day2a;

import java.util.Scanner;

public class Example34 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = in.nextInt();
        double t = 0;
        if (n < 1){
            System.out.print("khong hop le");
        }
        for (int i = 1; i<=n; i++){
            t = Math.sqrt(i+ t);
        }
        System.out.printf("S= %f", t);

    }
}
