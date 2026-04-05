package vlhp;

public abstract class NhanVien {
	protected String tenNV;
	protected double luong;
	protected int gioLam;
	
	
	public NhanVien() {
		super();
	}

	public NhanVien(String tenNV, double luong, int gioLam) {
		super();
		this.tenNV = tenNV;
		this.luong = luong;
		this.gioLam = gioLam;
	}
	
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public int getGioLam() {
		return gioLam;
	}
	public void setGioLam(int gioLam) {
		this.gioLam = gioLam;
	}
	
	
}
