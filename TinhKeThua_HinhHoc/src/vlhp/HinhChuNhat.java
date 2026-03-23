package vlhp;

public class HinhChuNhat extends HinhHoc {
	double chieuDai;
	double chieuRong;
	
	
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double TinhDienTich() {
		return chieuDai*chieuRong;
	}
	
	@Override
	public double TinhChuVi() {
		return (chieuDai+chieuRong)*2;
	}
	
	@Override
	public void HienThiThongTin() {
		super.ten = "Hinh Chu Nhat";
		super.mauSac = "do";
		super.HienThiThongTin();
		System.out.printf("Co chieu dai : %.2f, chieu rong: %.2f",chieuDai,chieuRong);
	}
	
	
	
}
