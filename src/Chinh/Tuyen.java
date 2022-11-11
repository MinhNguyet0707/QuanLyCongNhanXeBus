package Chinh;

import java.util.Scanner;

public class Tuyen implements HamNhap {
    private static int AUTO_ID = 100;
private String maTuyen;
private Double khoangCach;
private int soDiemDung;


    public Tuyen() {
    }

    public String getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public Double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(Double khoangCach) {
        this.khoangCach = khoangCach;
    }

    public int getSoDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }

    @Override
    public String toString() {
        return "Tuyen{" +
                "maTuyen='" + maTuyen + '\'' +
                ", khoangCach=" + khoangCach +
                ", soDiemDung=" + soDiemDung +
                '}';
    }

    @Override
    public void nhapThongTin() {
        this.maTuyen = String.valueOf(Tuyen.AUTO_ID++);
        System.out.print("Nhập khoang cach: ");
        this.khoangCach = new Scanner(System.in).nextDouble();
        System.out.print("Nhập so diem dung: ");
        this.soDiemDung = new Scanner(System.in).nextInt();
    }
}
