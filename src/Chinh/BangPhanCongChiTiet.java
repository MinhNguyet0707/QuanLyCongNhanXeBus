package Chinh;

public class BangPhanCongChiTiet {
	private Tuyen tuyen;
	private int soLuong;
	
	
	
	public BangPhanCongChiTiet() {
		super();
	}
	public Tuyen getTuyen() {
		return tuyen;
	}
	public void setTuyen(Tuyen tuyen) {
		this.tuyen = tuyen;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public BangPhanCongChiTiet(Tuyen tuyen, int soLuong) {
		super();
		this.tuyen = tuyen;
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "BangPhanCongChiTiet [tuyen=" + tuyen + ", soLuong=" + soLuong + "]";
	}
	
	
}
