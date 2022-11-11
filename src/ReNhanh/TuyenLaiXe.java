package ReNhanh;

import Chay.MainRun;
import Chinh.Tuyen;

import java.util.Scanner;

import static Chay.MainRun.tuyens;

public class TuyenLaiXe {

    public static void showTuyen() {
        for (int i = 0; i < tuyens.length; i++) {
            if (tuyens[i] == null) {
                continue;
            }
            System.out.println((i+1)+ " : " + tuyens[i]);
        }
    }
    public static void nhapTuyenThemMoi() {
        System.out.println("Nhập số lượng tuyen ban muon them mới: ");
        int soTuyen = new Scanner(System.in).nextInt();
        for (int i = 0; i < soTuyen; i++) {
            Tuyen tuyen = new Tuyen();
            tuyen.nhapThongTin();
            luuTuyen(tuyen);
        }
    }




    private static void luuTuyen(Tuyen tuyen) {
        for (int j = 0; j < tuyens.length; j++) {
            if (tuyens[j] == null) {
               tuyens[j]=tuyen;
                break;
            }
        }
    }
    public static boolean isEmptyTuyen() {
        for (int i = 0; i < tuyens.length; i++) {
            if (tuyens[i] != null) {
                return false;
            }
        }
        return true;
    }

}






