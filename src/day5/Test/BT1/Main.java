package day5.Test.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // mang hinh hoc
        HinhHoc[] arr = new HinhHoc[4];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhVuong(4);
        arr[2] = new HinhTron(10);
        arr[3] = new HinhLucGiacDeu(11);

        //dien tich lon nhat
        HinhHoc hinhHocMax = null;
        double dtMax =  0;
        for (HinhHoc h: arr){
            if (h.tinhDienTich() > dtMax){
                dtMax = h.tinhDienTich();
                hinhHocMax = h;
            }
        }
        System.out.println("Hinh co dien tich lon nhat la: ");
        System.out.println(hinhHocMax);
        // chu vi be nhat
        HinhHoc hinhHocMin = null;
        double cvMin = arr[0].tinhChuVi();
        for (HinhHoc h2: arr){
            if (h2.tinhChuVi() < cvMin){
                cvMin = h2.tinhChuVi();
                hinhHocMin = h2;
            }
        }
        System.out.println("Hinh co chu vi be nhat la: ");
        System.out.println(hinhHocMin);

    }
}
