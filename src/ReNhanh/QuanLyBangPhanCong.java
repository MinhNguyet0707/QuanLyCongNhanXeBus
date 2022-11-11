package ReNhanh;

import java.util.Iterator;
import java.util.Scanner;

import Chay.MainRun;
import Chinh.BangPhanCong;
import Chinh.BangPhanCongChiTiet;
import Chinh.LaiXe;
import Chinh.Tuyen;

public class QuanLyBangPhanCong {
	public static void nhapSoLieuBangPhanCong() {

		BangPhanCong bangPhanCong = new BangPhanCong();
		BangPhanCongChiTiet bangPhanCongChiTiet[] = new BangPhanCongChiTiet[MainRun.tuyens.length];
		for (int i = 0; i < MainRun.bangphancongs.length; i++) {
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
				bangPhanCongChiTietNhap.setTuyen(MainRun.tuyens[tuyenNhap - 1]);

				System.out.println("Nhap so luot cho moi tuyen : ");
				int soLuotChoMoiTuyenNhap = sc.nextInt();
				bangPhanCongChiTietNhap.setSoLuong(soLuotChoMoiTuyenNhap);

				bangPhanCongChiTiet[j] = bangPhanCongChiTietNhap;

			}

			bangPhanCong.setBangPhanCongChiTiet(bangPhanCongChiTiet);
			MainRun.bangphancongs[i] = bangPhanCong;
		}

	}
	
//	public static void inBangPhanCong(BangPhanCong bangPhanCongs) {
//		
//			bangPhanCongs.toString();
//		}
	}


