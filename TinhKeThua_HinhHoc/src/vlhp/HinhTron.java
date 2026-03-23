package vlhp;

public class HinhTron extends HinhHoc {
	double banKinh;
	
	
	public HinhTron(double banKinh) {
		this.banKinh = banKinh;
	}


	@Override
	public double TinhDienTich() {
		return Math.PI*banKinh*banKinh;
	}
	
	@Override
	public double TinhChuVi() {
		return Math.PI*banKinh*2;

	}
	@Override 
	public void HienThiThongTin() {
		super.ten = "Hinh Tron";
		super.mauSac = "do";
		super.HienThiThongTin();
		System.out.printf("Co ban kinh: %.2f",banKinh);
	}
	
}
