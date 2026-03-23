package vlhp;

public class HinhHoc {
	String ten;
	String mauSac;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double TinhDienTich() {
		return 0;
	}
	public double TinhChuVi() {
		return 0;
	}
	public void HienThiThongTin() {
	String in = String.format("Hinh la %s, co mau %s.",ten,mauSac);
	System.out.println(in);
	return;
	}
}
