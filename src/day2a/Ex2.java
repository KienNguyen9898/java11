package day2a;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //nhập chuỗi từ bàn phím -> in ra chuỗi viết hoa bkacad -> BKACAD
        // chương trình dừng khi nhập exit.
        Scanner in= new Scanner(System.in);
        String s= "";
        while (true){
            System.out.print("Nhap chuoi:  ");
            s= in.nextLine();
            if (s.equalsIgnoreCase("exit")){
                break; // thoat khoi vong lap
            }
            s= s.toUpperCase();
            System.out.println("Viet hoa: " +s);
        }
        in.close();
    }
}
