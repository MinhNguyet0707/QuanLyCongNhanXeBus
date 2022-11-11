package Chay;

import Chinh.BangPhanCong;
import Chinh.LaiXe;
import Chinh.Tuyen;
import ReNhanh.LaiXeMoi;
import ReNhanh.QuanLyBangPhanCong;
import ReNhanh.TuyenLaiXe;

import java.util.Scanner;

public class MainRun {
     public static LaiXe[] laiXes = new LaiXe[100];
    public static Tuyen[] tuyens = new Tuyen[100];
    public static BangPhanCong[] bangphancongs = new BangPhanCong[100];

    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    LaiXeMoi.nhapLaiXeThemMoi();
                    break;
                case 2:
                    LaiXeMoi.showLaiXe();
                    break;
                case 3:
                    TuyenLaiXe.nhapTuyenThemMoi();
                    break;
                case 4:
                	TuyenLaiXe.showTuyen();
                    break;
                case 5:
                	QuanLyBangPhanCong.nhapSoLieuBangPhanCong();
                	for (int i = 0; i < bangphancongs.length; i++) {
						bangphancongs[i].toString();
					}
                    break;
                case 6:
                    QuanLyBangPhanCong.sapXepTen();



                    break;
                case 7:

                    break;
                case 8:
//                    System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionChoice() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("\n\n\n----------PHẦN MỀM QUẢN LÝ Cong Nhan lai xe Bus------------");
        System.out.println("1. Nhập Lai xe moi.");
        System.out.println("2. In ra danh sách sách Lai xe sau khi nhap.");
        System.out.println("3. Nhập tuyen moi.");
        System.out.println("4. In ra danh sách tuyen vua nhap.");
        System.out.println("5. nhao danh sach phan cong cho moi lai xe va in danh sach ra man hinh.");
        System.out.println("6. Sắp xếp danh sách phan cong theo hoj ten va theo so luong tuyen dam bao moi nagy.");
        System.out.println("7. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe.");
        System.out.println("8. Thoát chương trình.");
    }

}

