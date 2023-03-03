package day2b;

import java.util.Random;
import java.util.Scanner;

public class Exam122 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("Khong hop le");
            System.exit(0);
        }
        Random rd = new Random();
        float[] arr = new float[n];
        for (int i=0;i<n;i++){
            arr[i] = rd.nextFloat();
        }
        for (int i = 0; i<n; i++){
            System.out.printf("arr[%d] = %.2f \n", i,arr[i]);
        }
        System.out.println();
        double max = arr[0];
        for ( int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.printf("Max = %.2f" ,max);
    }
}
