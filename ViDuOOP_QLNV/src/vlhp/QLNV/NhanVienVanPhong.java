package vlhp.QLNV;

public class NhanVienVanPhong extends NhanVien {
	private double soGioLamThem;
	private double LuongThemMoiGio;
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		LuongThemMoiGio = luongThemMoiGio;
	}
	public double getSoGioLamThem() {
		return soGioLamThem;
	}
	public void setSoGioLamThem(double soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}
	public double getLuongThemMoiGio() {
		return LuongThemMoiGio;
	}
	public void setLuongThemMoiGio(double luongThemMoiGio) {
		LuongThemMoiGio = luongThemMoiGio;
	}
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan()+soGioLamThem*LuongThemMoiGio;
	}
	
	@Override
	public String toString() {
		String xuat = super.toString();
		xuat = xuat + "\nSố giờ làm thêm:" + soGioLamThem;
		xuat = xuat + "\nLương mỗi giờ làm thêm:" + LuongThemMoiGio;
		xuat = xuat + "\nLương được nhận:" + this.tinhLuong();
		return xuat;


		
	}
	
}
