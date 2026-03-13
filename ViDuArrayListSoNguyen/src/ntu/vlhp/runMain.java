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
	}
	
}
