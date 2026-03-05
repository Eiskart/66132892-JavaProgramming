package tiilaz.edu;

public class MayTinh {
	String hang;
	int ram;
	int oCung;
	long gia;
	public void kiemTraCauHinh() {
		System.out.printf("May tinh thuoc hang %s, ram: %d GB, o cung: %d GB, gia: &ld d",hang,ram,oCung,gia);
		return;
	}
	public boolean coTheChoiGame() {
		if(ram >= 8)
			return true;
		else
			return false;
				
	}
	public long tinhThue() {
		return gia+(gia*1/10);
	}
	
}
