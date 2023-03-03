package day2a;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 3;
        boolean isLogin = false;
        String user, pass;
        while (count != 0) {
            count = count -1;
            System.out.print("user: ");
            user = in.nextLine();
            System.out.print("pass: ");
            pass = in.nextLine();
            if (user.equals("admin") && pass.equals("admin")) {
                isLogin = true;
                break;
            }
            System.out.printf("Ban con %d lan dang nhap\n", count);

        }
        if (!isLogin) {
            System.out.println("Dang nhap that bai");
        }
        else System.out.println("Dang nhap thanh cong");
    }
}
