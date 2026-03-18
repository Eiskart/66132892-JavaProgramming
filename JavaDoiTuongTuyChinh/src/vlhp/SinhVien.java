package vlhp;

public class SinhVien {
	 private String maSV;
	    private String hoTen;
	    private double diemTB;
	    
	    public SinhVien(String maSV, String hoTen, double diemTB) {
	        this.maSV = maSV;
	        this.hoTen = hoTen;
	        this.diemTB = diemTB;
	    }
	    
	    // Getter
	    public String getMaSV() { return maSV; }
	    public String getHoTen() { return hoTen; }
	    public double getDiemTB() { return diemTB; }
	    
	    public String toString() {
	        return String.format("Mã: %s - Họ Tên: %s - Điểm Trung Bình: %.2f",maSV,hoTen,diemTB);
	    }
}
