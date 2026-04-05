package vlhp;

public class NhanVienKinhDoanh extends NhanVien implements CoTheTinhLuong{
public double luongKinhDoanh = 50000;
	
	public NhanVienKinhDoanh(double luongKinhDoanh,String tenNV, double luong, int gioLam) {
		super(tenNV,luong, gioLam);
		if(luongKinhDoanh > luong) {
			super.setLuong(luongKinhDoanh);
		}
	}

	@Override
	public double tinhLuong() {
		return super.getLuong()*super.getGioLam();
	}

}
