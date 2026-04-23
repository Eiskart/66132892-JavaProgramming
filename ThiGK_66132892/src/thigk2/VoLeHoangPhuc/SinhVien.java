package thigk2.VoLeHoangPhuc;

public class SinhVien {
	protected String mssv;
	protected String hoTen;
	protected int namSinh;
	protected String sdt;
	
	public SinhVien(String mssv, String hoTen, int namSinh, String sdt) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.sdt = sdt;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
	
	
	
}
