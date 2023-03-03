package day2a;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // co bao nhieu so le trong khoang (a,b)
        Scanner in= new Scanner(System.in);
        System.out.print("nhap a,b: ");
        int a= in.nextInt();
        int b= in.nextInt();
        in.close();
        if (a>=b){
            System.out.print("khong thoa man");
            System.exit(0);
        }
            int dem = 0;
            for (int i = a+1; i<b ; i++){
                if (i % 2 != 0){
                    dem = dem +1;
                }
            }
            System.out.printf("co ta ca %d so le trong (%d, %d)", dem,a,b);


    }
}
