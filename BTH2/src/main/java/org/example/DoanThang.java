package org.example;
public class DoanThang {
    private Diem a ;
    private Diem b;

    public Diem getA() {
        return a;
    }

    public Diem getB() {
        return b;
    }

    public void setA(Diem a) {
        this.a = a;
    }

    public void setB(Diem b) {
        this.b = b;
    }

    public DoanThang(Diem a, Diem b){
        this.a = a;
        this.b = b;
    }
    public void displayLine(){
        System.out.printf("Doan thang:[(%.2f,%.2f),(%.2f,%.2f)]",this.a.getHoanh(),this.a.getTung(),this.b.getHoanh(),this.b.getTung());
    }
    public double distanceLine(){
        return this.a.distance(this.b);
    }
    public Diem avarange(){
        double y= (this.a.getTung()+this.b.getTung())/2;
        double x= (this.a.getHoanh()+this.b.getHoanh())/2;
        return new Diem(x,y);
    }
    public boolean isSongSong(DoanThang ab){
      return this.a.getHoanh() - this.b.getHoanh() / this.a.getTung() - this.b.getTung() == ab.a.getHoanh() - ab.b.getHoanh() / ab.a.getTung() - ab.b.getTung();
    }
    public static void main(String[] args) {
        Diem a = new Diem(1,0);
        Diem b = new Diem(0,2);
        Diem c = new Diem(2,0);
        Diem d = new Diem(0,4);
        DoanThang ab  = new DoanThang(a ,b);
        DoanThang cd = new DoanThang(c,d);
        System.out.printf("Diem trung binh la : (%.2f,%.2f)",ab.avarange().getTung(),ab.avarange().getHoanh());
        System.out.printf("\nDoan thang ab va cd song song: %b",ab.isSongSong(cd) );
    }
}
