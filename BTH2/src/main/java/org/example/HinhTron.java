package org.example;

public class HinhTron {
    private Diem toaDo;
    private double banKinh;

    public HinhTron(Diem toaDo, double banKinh) {
        this.toaDo = toaDo;
        this.banKinh = banKinh;
    }
    public Diem getToaDo() {
        return toaDo;
    }

    public void setToaDo(Diem toaDo) {
        this.toaDo = toaDo;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhDienTich(){
        return Math.pow(this.banKinh,2)*Math.PI;
    }
    public int tinhTuongDoi(Diem a ){
        if(this.banKinh < this.toaDo.distance(a)){
            return 1 ;
        }
        else if(this.banKinh > this.toaDo.distance(a)){
            return -1;
        }
        return 0;
    }
    public int tinhTuongDoiHinhTron(HinhTron a){
        if(this.banKinh + a.banKinh < this.toaDo.distance(a.toaDo)){
            return 1 ;
        }
        else if(this.banKinh + a.banKinh > this.toaDo.distance(a.toaDo)){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        HinhTron ht1 = new HinhTron(new Diem(4,2),5);
        HinhTron ht2 = new HinhTron(new Diem(10,8),2);
        int tuongDoi = ht1.tinhTuongDoi(new Diem(9,2));
        int tuongDoiTron = ht1.tinhTuongDoiHinhTron(ht2);
        if(tuongDoi >=0){
            if(tuongDoi > 0)
            System.out.println("Diem nam ngoai hinh tron");
            else System.out.println("Diem nam tren hinh tron");
        }
        else System.out.println("Diem nam trong hinh tron");
       if(tuongDoiTron>=0){
           if(tuongDoiTron >0)
               System.out.println("Hai hinh tron khong giao nhau");
           else System.out.println("Hai hinh tron tiep xuc nhau");
       }
       else System.out.println("Hai hinh tron giao nhau");

    }

}
