package org.example;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public PhanSo(){
        this(0,1);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public static int ucln(int a , int b){
        if(a == 0 || b ==0){
            return 1 ;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        while(a!=b){
            if(a>b){
                a -=b;
            }
            else b-=a;
        }
        return a;
    }
    public PhanSo rutGon(){
        int tuSo = this.tuSo/ucln(this.tuSo,this.mauSo);
        int mauSo = this.mauSo/ucln(this.tuSo,this.mauSo);
        return new PhanSo(tuSo,mauSo);
    }
    public PhanSo cong(PhanSo a){
        int tu = this.tuSo*a.mauSo + a.tuSo*this.mauSo;
        int mau = this.mauSo * a.mauSo;
        return new PhanSo(tu,mau).rutGon();
    }
    public PhanSo tru(PhanSo a){
        int tu = this.tuSo*a.mauSo - a.tuSo*this.mauSo;
        int mau = this.mauSo * a.mauSo;
        return new PhanSo(tu,mau).rutGon();
    }
    public PhanSo nhan(PhanSo a){
        int tu = this.tuSo* a.tuSo;
        int mau = this.mauSo * a.mauSo;
        return new PhanSo(tu,mau).rutGon();
    }
    public PhanSo chia(PhanSo a){
        int tu = this.tuSo* a.mauSo;
        int mau = this.mauSo * a.tuSo;
        return new PhanSo(tu,mau).rutGon();
    }
    public int soSanh(PhanSo a){
        if((this.tuSo*1.0/this.mauSo) < (a.tuSo*1.0/a.mauSo)){
            return 1;
        }
        else if((this.tuSo*1.0/this.mauSo) > (a.tuSo*1.0/a.mauSo)){
            return -1;
        }
        return 0;
    }
    public void displayPhanSo(){
        System.out.printf("Phan so : %d / %d \n" , this.tuSo,this.mauSo);
    }

    public static void main(String[] args) {
        PhanSo[] a = {
                new PhanSo(2,3),
                new PhanSo(2,7),
                new PhanSo(3,7),
                new PhanSo(1,9)
        };
        for(var x  : a ){
            x.displayPhanSo();
        }
        PhanSo result = new PhanSo();
        for(var x : a ){
            result = result.cong(x).rutGon();
        }
        System.out.printf("Tong cua cac phan so trong mang: %d / %d \n", result.tuSo, result.mauSo);
        PhanSo max = a[0];
        for(var x : a ){
            max = (max.soSanh(x) == 1 )? x : max;
        }
        System.out.printf("Phan so lon nhat la: %d / %d " , max.tuSo,max.mauSo);

    }
}
