package vlhp;

public class TaiKhoanTietKiem extends TaiKhoan{
	int kyHan;
	double laiSuat;
	public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, int kyHan, double laiSuat) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	
	public double tinhLaiSuat() {
		return soDu *(laiSuat/100);
	}
	@Override
	public double rutTien(double rut) {
		if(kyHan < 0) {
			System.out.println("khong the rut");
			return 0;
		}
		else {
			soDu -= rut;
			return rut;
		}
	}
	
}
