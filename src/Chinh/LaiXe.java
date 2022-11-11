package Chinh;


import Chinh.HamNhap;
import Chinh.Nguoi;
import Phu.TrinhDoLaiXe;

import java.util.Scanner;

public class LaiXe extends Nguoi {

    private static int AUTO_ID = 10000;
    private String maLaiXe;
    private TrinhDoLaiXe trinhdolaixe;

    public LaiXe() {
        if (AUTO_ID == 0) {
            AUTO_ID = 9999;
        }
        AUTO_ID++;
        this.maLaiXe = String.valueOf(AUTO_ID);
    }




    public String getMaLaiXe() {
        return maLaiXe;
    }

    public void setMaLaiXe(String maLaiXe) {
        this.maLaiXe = maLaiXe;
    }

    public TrinhDoLaiXe getTrinhdolaixe() {
        return trinhdolaixe;
    }

    public void setTrinhdolaixe(TrinhDoLaiXe trinhdolaixe) {
        this.trinhdolaixe = trinhdolaixe;
    }

    @Override
    public String toString() {
        return "LaiXe{" +
                "maLaiXe=" + maLaiXe +
                ", trinhdolaixe=" + trinhdolaixe +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDT='" + soDT + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        this.nhapTrinhDoLaiXe();
    }



    public void nhapTrinhDoLaiXe() {
        System.out.println("Nhập loại Trinh Do, vui lòng chọn 1 trong các lựa chọn dưới đây: ");
        System.out.println("1. Hang A1");
        System.out.println("2. Hang A2");
        System.out.println("3. Hang A3");
        System.out.println("4. Hang A4");
        System.out.println("5. Hang B1");
        System.out.println("6. Hang B2");
        System.out.println("7. Hang C");
        System.out.println("8. Hang D");
        System.out.println("9. Hang E");
        System.out.println("10. Hang F");

        int trinhDo = 0;
        do {
            trinhDo = new Scanner(System.in).nextInt();
            if (trinhDo >= 1 && trinhDo <= 10) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (trinhDo) {
            case 1:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HạngA1.value));
                break;
            case 2:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangA2.HangA2.value));
                break;
            case 3:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangA3.value));
                break;
            case 4:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangA4.value));
                break;
            case 5:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangB1.value));
                break;
            case 6:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangB2.value));
                break;
            case 7:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangC.value));
                break;
            case 8:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangD.value));
                break;
            case 9:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangE.value));
                break;
            case 10:
                this.setTrinhdolaixe(TrinhDoLaiXe.valueOf(TrinhDoLaiXe.HangF.value));
                break;

        }
    }




//    @Override
//    public int compareTo(LaiXe o) {
//        if (this.maLaiXe > o.getMaLaiXe()) {
//            return 1;
//        } else if (this.maLaiXe < o.getMaLaiXe()) {
//            return -1;
//        }
//        return 0;
//    }
    }




