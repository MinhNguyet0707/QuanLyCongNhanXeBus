package ReNhanh;

import Chay.MainRun;
import Chinh.LaiXe;


import java.util.Scanner;

public class LaiXeMoi {
    public static void showLaiXe() {
        for (int i = 0; i < MainRun.laiXes.length; i++) {
            if (MainRun.laiXes[i] == null) {
                continue;
            }
            System.out.println((i+1)+ " : " + MainRun.laiXes[i]);
        }
    }
    public static void nhapLaiXeThemMoi() {
        System.out.print("Xin mời nhập số lượng lai xe them moi ");
        int soLaiXeMoi = new Scanner(System.in).nextInt();
        for (int i = 0; i < soLaiXeMoi; i++) {
            LaiXe laixe = new LaiXe();
            laixe.nhapThongTin();
            saveLaiXe(laixe);
        }
    }

    private static void saveLaiXe(LaiXe laixe) {
        for (int j = 0; j < MainRun.laiXes.length; j++) {
            if (MainRun.laiXes[j] == null) {
                MainRun.laiXes[j] = laixe;
                return;
            }
        }
    }

    public static boolean isEmptyLaiXeMoi() {
        for (int i = 0; i < MainRun.laiXes.length; i++) {
            if (MainRun.laiXes[i] != null) {
                return false;
            }
        }
        return true;
    }




}



