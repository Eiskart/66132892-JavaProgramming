package vlhp;

public class SanPham {
	private String maSP;
	private String tenSP;
	private long gia;
	private long soLuong;
	public SanPham(String maSP, String tenSP, long gia, long soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-20s %-20ld %.5ld", maSP,tenSP,gia,soLuong);
	}
	
}
