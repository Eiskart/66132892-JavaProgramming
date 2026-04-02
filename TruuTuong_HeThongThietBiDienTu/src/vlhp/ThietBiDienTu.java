package vlhp;

public abstract class ThietBiDienTu {
	protected String ten;
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	protected double gia;
	protected String hangSanXuat;
	
	
	public abstract void bat();
	
	public abstract void tat();

	public void hienThiThongTin() {
		System.out.println("ThietBiDienTu [ten=" + ten + ", gia=" + gia + ", hangSanXuat=" + hangSanXuat + "]");
		return;
	}	
	
	
	
}
