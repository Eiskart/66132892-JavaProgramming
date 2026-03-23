package vlhp;

public class TamGiac extends HinhHoc {
	double canhA, canhB, canhC;

    public TamGiac(double a, double b, double c) {
        canhA = a;
        canhB = b;
        canhC = c;
    }

    public boolean kiemTraHopLe() {
        if (canhA <= 0 || canhB <= 0 || canhC <= 0) {
            return false;
        }
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }
    @Override 
	public void HienThiThongTin() {
		super.ten = "Hinh tam Giac";
		super.mauSac = "do";
		super.HienThiThongTin();
		System.out.printf("Co 3 canh lan luot la %.2f  %.2f  %.2f",canhA,canhB,canhC);
	}
    
}
