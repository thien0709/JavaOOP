package org.example;

public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if((trenTrai.getTung()>duoiPhai.getTung()) && (duoiPhai.getHoanh()>trenTrai.getHoanh())){
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        }
        else throw new Exception("Loi du lieu");

    }
    public Diem getTrenTrai() {
        return trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
    public double tinhDienTich(){
        return (this.duoiPhai.getHoanh() - this.trenTrai.getHoanh())*(this.trenTrai.getTung() - this.duoiPhai.getTung());
    }
    public double tinhChuVi(){
     return (this.duoiPhai.getHoanh() - this.trenTrai.getHoanh()+ this.trenTrai.getTung() - this.duoiPhai.getTung())*2;
    }
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn = new HinhChuNhat(new Diem(5,4), new Diem(6,2));
        System.out.printf("Toa do hinh chu nhat { tren trai (%.1f,%.1f) duoi phai (%.1f,%.1f)}", hcn.trenTrai.getHoanh(),hcn.trenTrai.getTung(),hcn.duoiPhai.getHoanh(),hcn.duoiPhai.getTung());
        System.out.printf("\nChu vi hcn la: %.2f",hcn.tinhChuVi());
        System.out.printf("\nDien tich hcn la: %.2f",hcn.tinhDienTich());
    }

}
