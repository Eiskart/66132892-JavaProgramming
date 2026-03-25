package vlhp;

public class TaiKhoanThanhToan extends TaiKhoan {
	int hanMucRut;
	double phiGiaoDich;
	public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan, double soDu, int hanMucRut, double phiGiaoDich) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaoDich = phiGiaoDich;
	}
	@Override
	public double rutTien(double rut) {
			soDu -= rut+phiGiaoDich;
			return rut;
		
	}
	public void thanhToanHoaDon(double rut) {
		soDu -= rut+phiGiaoDich;
	}
}
