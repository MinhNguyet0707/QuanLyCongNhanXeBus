package ReNhanh;

import java.util.Iterator;
import java.util.Scanner;

import Chay.MainRun;
import Chinh.BangPhanCong;
import Chinh.BangPhanCongChiTiet;
import Chinh.LaiXe;
import Chinh.Tuyen;

public class QuanLyBangPhanCong {
	public static void sapXepTen(){

		System.out.println("Nhập lựa chọn của bạn: ");
		System.out.println("1. Sắp xếp theo tên lai xe .");
		System.out.println("2. Sắp xếp theo số lượng tuyen dam bao trong ngay (giảm dần).");
		int choice = 0;
		do {
			choice = new Scanner(System.in).nextInt();
			if (choice == 1 || choice == 2) {
				break;
			}
			System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
		} while (true);
		if (choice == 1) { // sắp xếp theo tên bạn đọc
			for (int i = 0; i < MainRun.bangphancongs.length - 1; i++) {
				if (MainRun.bangphancongs[i] == null) {
					continue;
				}
				for (int j = i + 1; j < MainRun.
					 bangphancongs.length; j++) {
					if (MainRun.
					bangphancongs[j] == null) {
						continue;
					}
					if (MainRun.bangphancongs[i].getLaixe().getTen().compareTo(MainRun.bangphancongs[j].getLaixe().getTen()) > 0) {
						BangPhanCong temp = MainRun.bangphancongs[i];
						MainRun.bangphancongs[i] = MainRun.bangphancongs[j];
						MainRun.bangphancongs[j] = temp;
					}
				}
			}
			showSoLuongTuyen();
		} else if (choice == 2) { // sắp xếp theo số lượng cuốn sách
		}
	}

	private static void showSoLuongTuyen() {
		for (int i = 0; i < MainRun.bangphancongs.length; i++) {
			if (MainRun.bangphancongs[i] != null) {
				System.out.println(MainRun.bangphancongs[i]);
			}
		}
	}
//	public static void timTenLaiXe() {
//		System.out.print("Nhập tên lai xe mà bạn muốn tìm kiếm: ");
//		String keyword = new Scanner(System.in).nextLine();
//		for (int i = 0; i < MainRun.bangphancongs.length; i++) {
//			if (MainRun.bangphancongs[i] != null && MainRun.bangphancongs[i].getLaixe().getTen().toLowerCase().contains(keyword.toLowerCase())) {
//				System.out.println(MainRun.bangphancongs[i]);
//			}
//		}
//	}







	public static void nhapSoLieuBangPhanCong() {
		BangPhanCong bangPhanCong = new BangPhanCong();
		for (int i = 0; i < MainRun.bangphancongs.length; i++) {

			BangPhanCongChiTiet bangPhanCongChiTiet[] = new BangPhanCongChiTiet[MainRun.tuyens.length];
			if (i != 0) {
				if (MainRun.bangphancongs[i] == null) {
					break;
				}
			}
			LaiXe laixe = new LaiXe();
			LaiXeMoi.showLaiXe();
			Scanner sc = new Scanner(System.in);
			System.out.println("Chon lai xe (nhap so thu tu lai xe ban muon chon):  ");
			int soThuTuCuaLaiXe = sc.nextInt();
			laixe = (MainRun.laiXes[soThuTuCuaLaiXe - 1]);
			bangPhanCong.setLaixe(laixe);

			System.out.println("Nhap so luong tuyen cua lai xe: ");
			int soLuongTuyen = sc.nextInt();
			for (int j = 0; j < soLuongTuyen; j++) {
				BangPhanCongChiTiet bangPhanCongChiTietNhap = new BangPhanCongChiTiet();

				TuyenLaiXe.showTuyen();
				System.out.println("Chon tuyen thu " + (j + 1) + "(nhap so thu tu so tuyen ban muon chon):  ");

				int tuyenNhap = sc.nextInt();
				if(tuyenNhap>15) {
					System.out.println("Vui long nhap nho hon 15");
				}

				if(bangPhanCong.kiemTraTongSoLuot(bangPhanCongChiTiet)>15) {
					System.out.println("lai xe da co so luot lon hon 15");
					break;
				}

				bangPhanCongChiTietNhap.setTuyen(MainRun.tuyens[tuyenNhap - 1]);

				System.out.println("Nhap so luot cho moi tuyen : ");
				int soLuotChoMoiTuyenNhap = sc.nextInt();
				bangPhanCongChiTietNhap.setSoLuong(soLuotChoMoiTuyenNhap);

				bangPhanCongChiTiet[j] = bangPhanCongChiTietNhap;

			}

			bangPhanCong.setBangPhanCongChiTiet(bangPhanCongChiTiet);
			MainRun.bangphancongs[i]=bangPhanCong;
		}





	}









}


