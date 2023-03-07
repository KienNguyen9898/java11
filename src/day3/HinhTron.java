package day3;

public class HinhTron {
    double banKinh;
    public HinhTron(){

    }
    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }
    public double tinhChuViHinhTron(){
        return banKinh * 2 * 3.14;
    }
    public double tinhDienTichHinhTron(){ return banKinh * banKinh * 3.14;}

    @Override
    public String toString() {
        return "hinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
