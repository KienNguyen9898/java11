package day4a;

public class HinhChuNhat {
    private  double chieuDai = 1.0;
    private  double chieuRong = 1.0;
    public HinhChuNhat(){

    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if ( chieuDai <= 0 || chieuRong <=0){
            System.out.println("Canh phai la so duong");
            System.out.println("Kich thuoc mac dinh 1x1");
        }
        else {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        }
        else System.out.println("Chieu dai khong hop le");
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong >0) {
            this.chieuRong = chieuRong;
        }
        else System.out.println("Chieu rong khong hop le");
    }

    public double chuvi(){
        return (chieuDai + chieuRong) * 2;
    }
    public double dienTich(){
        return chieuDai * chieuRong;
    }


    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

}
