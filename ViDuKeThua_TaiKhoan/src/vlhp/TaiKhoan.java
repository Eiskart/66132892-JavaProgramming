package vlhp;

public class TaiKhoan {
	String soTaiKhoan;
	String tenChuTaiKhoan;
	double soDu;
	public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
	}
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getTenChuTaiKhoan() {
		return tenChuTaiKhoan;
	}
	public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
		this.tenChuTaiKhoan = tenChuTaiKhoan;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	
	public void guiTien(double gui) {
		soDu += gui;
	}
	
	public double rutTien(double rut) {
		soDu -= rut;
		return rut;
	}
	public String hienThiThongTin() {
		return "TaiKhoan [soTaiKhoan=" + soTaiKhoan + ", tenChuTaiKhoan=" + tenChuTaiKhoan + ", soDu=" + soDu + "]";
	}
	
	
}
