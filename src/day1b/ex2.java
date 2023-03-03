package day1b;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        ////viet chuong trinh nhap vao so nam x, hoi x la nam nhuan hay ko nhuan.
        Scanner in = new Scanner(System.in);
        System.out.print("nhap x: ");
        int x = in.nextInt();
        in.close();
        if(x < 1582){
            System.out.printf("Khong hop le");
            System.exit(0);
        }
        if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            System.out.printf(x + " la nam nhuan");
            System.exit(0);
        }
        System.out.printf(x+" la nam ko nhuan");

    }
}
