package Chinh;

import java.util.Arrays;

public class BangPhanCong {
	LaiXe laixe;
	BangPhanCongChiTiet[] bangPhanCongChiTiet;

	public LaiXe getLaixe() {
		return laixe;
	}

	public void setLaixe(LaiXe laixe) {
		this.laixe = laixe;
	}

	public BangPhanCongChiTiet[] getBangPhanCongChiTiet() {
		return bangPhanCongChiTiet;
	}

	public void setBangPhanCongChiTiet(BangPhanCongChiTiet[] bangPhanCongChiTiet) {
		this.bangPhanCongChiTiet = bangPhanCongChiTiet;
	}

	public BangPhanCong(LaiXe laixe, BangPhanCongChiTiet[] bangPhanCongChiTiet) {
		super();
		this.laixe = laixe;
		this.bangPhanCongChiTiet = bangPhanCongChiTiet;
	}

	public BangPhanCong() {
	}

	@Override
	public String toString() {
		return "BangPhanCong [laixe=" + laixe + ", bangPhanCongChiTiet=" + Arrays.toString(bangPhanCongChiTiet) + "]";
	}

	public int kiemTraTongSoLuot(BangPhanCongChiTiet[] bangPhanCongChiTiets) {
		int tong = 0;
		for (int i = 0; i < bangPhanCongChiTiets.length; i++) {
			tong = tong + bangPhanCongChiTiets[i].getSoLuong();
		}
		return tong;
//		if(tong>15) {
//			return false;
//		}
//
//		return true;
//	}

	}
}