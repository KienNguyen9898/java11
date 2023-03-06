package day3b;

import java.util.Scanner;

public class Main_hinhTron {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        do {
            System.out.print("Nhap kich thuoc mang n: ");
            n = in.nextInt();
            if (n < 1) {
                System.out.println("Mang khong hop le, nhap lai: ");
            }
        }while ( n<1);
        HinhTron[] arr = new HinhTron[n] ;
        for (int i = 0; i< n; i++){
            System.out.println("Hinh tron thu " +i);
            System.out.print("Ban kinh: ");
            double banKinh = in.nextDouble();
            arr[i] = new HinhTron(banKinh);
        }
        in.close();
        for (int i= 0; i< n;i++){
            System.out.println(arr[i].toString());
        }
        //tinh chu vi lon nhat
        double cvMax = arr[0].tinhChuViHinhTron();
        int vtMax = 0;
        for (int i = 1; i<arr.length; i++){
            if (cvMax < arr[i].tinhChuViHinhTron()){
                cvMax = arr[i].tinhChuViHinhTron();
                vtMax = i;
            }
        }
        System.out.println("Hinh tron co chu vi lon nhat la");
        System.out.println(arr[vtMax].toString());
        System.out.println("Chu vi Max la "+cvMax);
        //tinh dien tich be nhat
        double dtMin = arr[0].tinhDienTichHinhTron();
        int vtMin = 0;
        for (int i=1; i<arr.length; i++){
            if (dtMin > arr[i].tinhDienTichHinhTron()){
                dtMin = arr[i].tinhDienTichHinhTron();
                vtMin = i;
            }
        }
        System.out.println("Hinh tron co dien tich be nhat la");
        System.out.println(arr[vtMin].toString());
        System.out.println("Dien tich Min la "+dtMin);
        // tinh trung binh cua cac chu vi hinh tron
        double total = 0;
        for (int i = 0; i<n;i++){
            total += arr[i].tinhChuViHinhTron();
        }
        System.out.printf("Trung binh chu vi la: %.2f\n", (float) total/n);
        //co bao nhieu hinh co chu vi lon hon tbc
        int dem = 0;
        for (int i = 0; i<n;i++){
            if (arr[i].tinhChuViHinhTron() > (total/n)){
                dem++;
            }
        }
        System.out.printf("So hinh tron co chu vi lon hon tbc chu vi la: %d\n", dem);
        //sap xep theo ban kinh tang dan va in ra
        for (int i= 0;i<n;i++){
            for (int j=0; j<n;j++) {
                if (arr[i].banKinh < arr[j].banKinh) {
                    HinhTron tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }

        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i].toString()+"\t");
        }

    }
}
