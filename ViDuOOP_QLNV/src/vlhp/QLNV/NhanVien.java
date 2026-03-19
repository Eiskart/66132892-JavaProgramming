package vlhp.QLNV;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public double tinhLuong() {
		return luongCoBan;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	
}
