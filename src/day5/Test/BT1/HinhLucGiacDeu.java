package day5.Test.BT1;

public class HinhLucGiacDeu extends HinhHoc{
    private double canhLucGiac=1.0;

    public HinhLucGiacDeu() {
    }

    public HinhLucGiacDeu(double canhLucGiac) {
        this.canhLucGiac = canhLucGiac;
    }

    public HinhLucGiacDeu(String mauSac, double canhLucGiac) {
        super(mauSac);
        this.canhLucGiac = canhLucGiac;
    }

    public double getCanhLucGiac() {
        return canhLucGiac;
    }

    public void setCanhLucGiac(double canhLucGiac) {
        this.canhLucGiac = canhLucGiac;
    }

    @Override
    public double tinhChuVi() {
        return 6*canhLucGiac;
    }

    @Override
    public double tinhDienTich() {
        return (3*Math.sqrt(3)*canhLucGiac*canhLucGiac)/2;
    }

    @Override
    public String toString() {
        return "HinhLucGiacDeu{" + super.toString()+
                "canhLucGiac=" + canhLucGiac +
                '}';
    }
}
