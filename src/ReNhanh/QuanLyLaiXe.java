package ReNhanh;

import Chay.MainRun;
import Chinh.BangPhanCong;
import Chinh.LaiXe;

import java.util.Scanner;

public class QuanLyLaiXe {


        public static void sortLaiXe() {
            System.out.println("Nhập lựa chọn của bạn: ");
            System.out.println("1. Sắp xếp theo tên lai xe.");
            System.out.println("2. Sắp xếp theo số luong tuyen (giảm dần).");
            int luaChon = 0;
            do {
                luaChon = new Scanner(System.in).nextInt();
                if (luaChon == 1 || luaChon == 2) {
                    break;
                }
                System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
            } while (true);
            if (luaChon == 1) { // sắp xếp theo tên lái xe
                for (int i = 0; i < MainRun.bangphancongs.length - 1; i++) {
                    if (MainRun.bangphancongs[i] == null) {
                        continue;
                    }
                    for (int j = i + 1; j < MainRun.bangphancongs.length; j++) {
                        if (MainRun.bangphancongs[j] == null) {
                            continue;
                        }

                    }
                }
                showSoLuotTuyen();
            } else if (luaChon == 2) {

            }
        }

    private static void showSoLuotTuyen() {
        for (int i = 0; i < MainRun.bangphancongs.length; i++) {
            if (MainRun.bangphancongs[i] != null) {
                System.out.println(MainRun.bangphancongs[i]);
            }
        }
    }

    public static void timTenlaiXe() {
        System.out.print("Nhập tên lai xe  mà bạn muốn tìm kiếm: ");
        String keyword = new Scanner(System.in).nextLine();
        for (int i = 0; i < MainRun.laiXes.length; i++) {
            if (MainRun.bangphancongs[i] != null && MainRun.bangphancongs[i].getLaixe().getTen().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(MainRun.bangphancongs[i]);
            }
        }
    }
    
    
    
   
    




}
