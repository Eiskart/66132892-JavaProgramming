package thigk2.VoLeHoangPhuc;

import java.util.*;

public class Cau1 {
	
	/* sử dụng lớp Scanner lấy thông tin cân nặng và chiều cao, BMI = cân nặng / chiều cao bình phương. 
	 in ra thông tin về cân nặng (thừa cân, thiếu cân, béo phì v.v.) dựa trên chỉ số BMI */
	
	public static void main() {
		double weight;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nhap can nang theo kg:");
		weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("nhap chieu cao theo met:");
		height = sc.nextDouble();
		sc.nextLine();
		double BMI = weight/(height*Math.PI);
		System.out.println("Chi so BMI cua ban la:"+BMI);
		if(BMI < 18.5) {
			System.out.println("Ban bi thieu hut can");
		}
		else if(BMI < 24.9) {
			System.out.println("Ban co can nang binh thuong");
		}
		else if(BMI < 29.9) {
			System.out.println("Ban bi thua can");
		}
		else {
			System.out.println("Ban bi beo phi");
		}
		sc.close();
		
	}
}
