package day2a;

import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        double t = 0;
        in.close();
        if (n<1){
            System.out.print("khong hop le");
        }
        for (int i= 1; i<= n; i++){
            t= Math.sqrt(2+t);
        }
        System.out.printf("S= %f", t);

    }
}
