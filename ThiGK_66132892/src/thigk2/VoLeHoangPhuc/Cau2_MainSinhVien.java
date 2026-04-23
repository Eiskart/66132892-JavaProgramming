package thigk2.VoLeHoangPhuc;

import java.util.*;

public class Cau2_MainSinhVien {
	/* */
	public static void main() {
		List<SinhVien> dsSV = new ArrayList<>();
		SinhVien sv1 = new SinhVien("111","Nguyen Van A", "2000", "099432321");
		SinhVien sv2 = new SinhVien("112","Nguyen Van B", "2002", "095267588");
		SinhVien sv3 = new SinhVien("113","Nguyen Van C", "2005", "092532767");
		dsSV.add(sv1);
		dsSV.add(sv2);
		dsSV.add(sv3);
		System.out.println("Danh sach sinh vien la:");
		for(SinhVien sv : dsSV) {
			System.out.println(sv.toString());
		}
		
		SinhVien sv4 = new SinhVien();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ma so sinh vien:");
		sv4.setMssv(sc.nextLine());
		System.out.print("nhap ten sinh vien:");
		sv4.setHoTen(sc.nextLine());
		System.out.print("nhap nam sinh :");
		sv4.setNamSinh(sc.nextLine());
		System.out.print("nhap ma so dien thoai:");
		sv4.setSdt(sc.nextLine());
		dsSV.add(sv4);
		
		System.out.println("Danh sach sinh vien la:");
		for(SinhVien sv : dsSV) {
			System.out.println(sv.toString());
		}
		
		System.out.println("Danh sach sinh vien lon hon 20 tuoi la:");
		for(SinhVien sv : dsSV) {
			if(sv.getTuoi() > 20)
			System.out.println(sv.toString());
		}
	}
	
	
}
