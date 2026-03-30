package vlhp;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		HocSinh hs3 = new HocSinh();
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Nhap ten cua hoc sinh thu 3:");
		hs3.setTenHS(banPhim.nextLine());
		System.out.print("Nhap tuoi cua hoc sinh thu 3:");
		hs3.setTuoiHS(banPhim.nextInt());
		System.out.print("Nhap lop cua hoc sinh thu 3:");
		hs3.setLopHS(banPhim.nextLine());
		
		System.out.println(hs3.toString());
		
		
		ArrayList<HocSinh> dsHS = new ArrayList<HocSinh>();
		System.out.print("Nhap n cua danh sach hoc sinh:");

		int n = banPhim.nextInt();
		
		for(int i = 0;i < n;i++) {
			HocSinh hsI = new HocSinh();
			System.out.printf("Nhap ten cua hoc sinh thu %d:",i);
			hsI.setTenHS(banPhim.nextLine());
			System.out.printf("Nhap tuoi cua hoc sinh thu %d:",i);
			hsI.setTuoiHS(banPhim.nextInt());
			System.out.printf("Nhap lop cua hoc sinh thu %d:",i);
			hsI.setLopHS(banPhim.nextLine());
			dsHS.add(hsI);

		}
		
		
		
	}

}
