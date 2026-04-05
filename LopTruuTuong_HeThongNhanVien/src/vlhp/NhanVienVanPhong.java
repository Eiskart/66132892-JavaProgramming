package vlhp;

public class NhanVienVanPhong extends NhanVien implements CoTheTinhLuong {
	public double luongVanPhong = 5000;
	
	public NhanVienVanPhong(double luongVanPhong,String tenNV, double luong, int gioLam) {
		super(tenNV,luong, gioLam);
		if(luongVanPhong > luong) {
			super.setLuong(luongVanPhong);
		}
	}

	@Override
	public double tinhLuong() {
		return super.getLuong()*super.getGioLam();
	}

}
