package vlhp;

public class DongVat {
	protected String ten;
    protected int tuoi;
    protected double canNang;
    
    public DongVat(String ten, int tuoi, double canNang) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
    }
    
    public void an() {
        System.out.println(ten + " đang ăn...");
    }
    
    public void ngu() {
        System.out.println(ten + " đang ngủ...");
    }
    
    
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi + " năm");
        System.out.println("Cân nặng: " + canNang + " kg");
    }
}
