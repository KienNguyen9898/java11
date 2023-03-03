package day2b;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*/tao 1 mang gom 5 phan tu so nguyen, in ra phan tu dau tien va cuoi cung
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[4]); */

        //tao mot mang gom n phan tu, nhap gia tri cho mang va in ra
        Scanner in= new Scanner(System.in);
        System.out.println("Nhap kich thuong mang: ");
        int n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("khong hop le");
            System.exit(0);
        }
        Random random = new Random();
        int[] arr = new int[n];        //tao mang
        for (int i = 0; i < n; i++){
            arr[i] = random.nextInt(1000);
        }
        for (int i = 0; i<n;i++){
            System.out.printf("arr[%d]= %d \n",i,arr[i]);    //in ra mang vua tao
        }
    }
}
