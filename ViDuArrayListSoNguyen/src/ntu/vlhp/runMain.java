package ntu.vlhp;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {
	public static void main(String[] args) {
		ArrayList<Integer> dsNguyen = new ArrayList<Integer>();
		Scanner banPhim = new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			System.out.printf("Moi nhap nhan tu thu %d:",i);
			Integer tam = banPhim.nextInt();
			dsNguyen.add(tam);
		}
//		in ra danh sach vua nhap
		System.out.println("Danh sach vua nhap la:");
		for(int i=0;i<dsNguyen.size();i++) {
			Integer moi = dsNguyen.get(i);
			System.out.printf(moi+" ");
		}
//		 dem so phan tu chan
		int ptChan = 0;
		for(Integer x:dsNguyen) {
			if(x%2 == 0) ptChan =ptChan + 1;
		}
		System.out.println("So phan tu chan la" + ptChan);
		
		int TongAll=0;
		for(Integer x: dsNguyen) {
			TongAll = TongAll + x;
		}
		System.out.println("tong la" + TongAll);

	}
	
}
