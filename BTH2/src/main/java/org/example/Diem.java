package org.example;

public class Diem {
    private double hoanh,tung;
    public double getHoanh(){
        return hoanh;
    }
    public double getTung(){
        return tung;
    }
    public void setTung(float tung){
        this.tung= tung;
    }

    public void setHoanh(float hoanh) {
        this.hoanh = hoanh;
    }

    public Diem(double hoanh, double tung) {
        this.tung = tung;
        this.hoanh = hoanh;
    }
    public void displayPoint(){
        System.out.printf("(%.1f , %.1f)", this.hoanh , this.tung);
    }
    public double distance( Diem b){
        return Math.sqrt(Math.pow(this.hoanh-b.hoanh,2) + Math.pow(this.tung-b.tung,2));
    }
    public static void main(String[] args) {
        Diem a = new Diem(5,7);
        Diem b = new Diem(7,2);
        System.out.print("Toa do diem a la:");
        a.displayPoint();
        System.out.print("\nToa do diem b la:");
        b.displayPoint();
        System.out.printf("\nKhoang cach giua a va b la: %f", a.distance(b));


    }
}
