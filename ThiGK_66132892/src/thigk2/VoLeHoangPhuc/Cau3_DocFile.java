package thigk2.VoLeHoangPhuc;

import java.io.*;
import java.util.*;

public class Cau3_DocFile {
	/* tạo SoNguyen.txt trong folder dự án, dùng FileReader để dọc folder và BufferedReader để bọc
	 , dùng boolean flag để kiểm tra X( X = 2) có nằm trong danh sách số hay không */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String text = "SoNguyen.txt";
		List<Integer> so = new ArrayList<>();
		
		BufferedReader bf = new BufferedReader(new FileReader(text));
		String dong;
		while ((dong = bf.readLine()) != null) {
			so.add(Integer.parseInt(dong.trim()));
		}
		System.out.println("Danh sach so nguyen la:");
		boolean flag = false;
		
		for(Integer x : so) {
			System.out.println(x);
			if(x == 2) flag = true;
		}
		if(flag == true)
		System.out.println("Gia tri X co trong danh sach");
		else System.out.println("Gia tri X khong co trong danh sach");
		bf.close();
	}

}
