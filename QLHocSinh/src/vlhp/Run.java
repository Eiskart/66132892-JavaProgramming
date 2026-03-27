package vlhp;

public class Run {

	public static void main(String[] args) {
		//2a
		HocSinh hs1 = new HocSinh();
		hs1.setTenHS("Tran Van A");
		hs1.setTuoiHS(10);
		hs1.setLopHS("10A3");
		
		HocSinh hs2 = new HocSinh("Tran Thi Tuoi",12,"12A3");
		
		System.out.println(hs1.toString());
		System.out.println(hs2.toString());

		
	}

}
