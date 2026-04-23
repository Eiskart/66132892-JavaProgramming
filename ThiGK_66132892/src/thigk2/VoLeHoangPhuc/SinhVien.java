package thigk2.VoLeHoangPhuc;

public class SinhVien {
	protected String mssv;
	protected String hoTen;
	protected String namSinh;
	protected String sdt;
	
	public SinhVien() {
		
	}
	public SinhVien(String mssv, String hoTen, String namSinh, String sdt) {
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

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public int getTuoi() {
		int namHienTai = 2026;;
		int namSinhSo = Integer.parseInt(namSinh);
		return namHienTai - namSinhSo;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", sdt=" + sdt + "]";
	}
	
	
	
	
	
}
