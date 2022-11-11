package Chinh;

import java.util.Scanner;

public abstract class Nguoi implements HamNhap {
    protected String ten;

    protected String diaChi;
    protected String soDT;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }


    public void nhapThongTin() {
        System.out.print("Nhập tên : ");
        this.setTen(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ : ");
        this.setDiaChi(new Scanner(System.in).nextLine());
        System.out.print("Nhập so dt: ");
        this.setSoDT(new Scanner(System.in).nextLine());
    }

    public abstract void inputInfo();

}
