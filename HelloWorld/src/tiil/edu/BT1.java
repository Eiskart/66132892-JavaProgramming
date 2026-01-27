package tiil.edu;

public class BT1 {
	public static void main(String[] args) {
		int soGioLam =41;
		int luongTheoGio = 30000;
		if(soGioLam>40) {
			double luongPT= (soGioLam-40)*(1.5*luongTheoGio);
			System.out.println("Luong theo gio lam la:" +(40*luongTheoGio+luongPT)+"d");
			
		}
		else {
			System.out.println("Luong theo gio lam la:" +(soGioLam*luongTheoGio)+"d");
		}

	}
}
