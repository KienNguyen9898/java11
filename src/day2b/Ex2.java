package day2b;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //tao 1 mang ngau nhien gom n so tu nhien 0-9999.
        //in ra mang vua tao
        // in ra mang max, min
        // tinh trung binh cong ca gia tri trong mang

        Scanner in= new Scanner(System.in);
        System.out.print(" nhap n: ");
        int n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("Khong hop le");
            System.exit(0);
        }
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = random.nextInt(10000);
        }
        for (int i =0; i<n;i++){
            System.out.printf("a[%d]=%d \n", i,arr[i]);
        }
        //min,max
        int min = arr[0], max = arr[0];
        for (int i= 0; i< arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.printf("Min = %d, Max = %d \n",min,max);
        // tinh tb cong
        double tbc = 0;
        for (int i: arr){
            tbc = tbc + i;
        }
        System.out.println("Trung binh cong: " + (tbc/n));




    }
}
