package day2b;

public class Example124 {
    public static void main(String[] args) {
        //
        int[] testArr = {199,3001,2001,2000,2005};
        boolean check = false;
        for (int i=0; i< testArr.length;i++){
            if (testArr[i]%2 == 0 && testArr[i]<2004){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("co gia tri thoa man");
        }
        else System.out.println("ko co gia tri thoa man");
    }
}
