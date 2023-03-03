package day1b;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //nhap vao thang va nam, in ra ngay trong thang.

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int thang = in.nextInt();
        System.out.println("nhap nam: ");
        int nam = in.nextInt();
        in.close();
        if (thang<1 || thang>12){
            System.out.println("khong hop le");
            System.exit(0);

        }
        switch (thang){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf(thang+" co 30 ngay");
                break;
            case 2:
                if (nam < 1582){
                    System.out.println("khong hop le");
                    System.exit(0);
                }
                if (nam % 400 ==0 || (nam % 4 == 0 && nam % 100 != 0)){
                    System.out.printf(thang+ " co 29 ngay ");
                    System.exit(0);
                }
                else
                    System.out.printf(thang+" co 28 ngay");
                            System.exit(0);
            default:
                System.out.println(thang+ " co 31 ngay");
                break;



        }
    }
}
