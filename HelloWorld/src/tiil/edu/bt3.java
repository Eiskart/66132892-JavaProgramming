package tiil.edu;
import java.util.Scanner;
public class bt3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Nhap a:");
		int a = s.nextInt();
		System.out.print("Nhap b:");
		int b = s.nextInt();
		s.close();

		
		if(a==0)
			if(b==0)
				System.out.println("X co vo so phan tu.");
			else
				System.out.println("Khong co gia tri x");
		else {
			double x=-(float)b/(float)a;
			System.out.printf("Gia tri cua %dx+%d=%.2f",a,b,x);
		}
	}

}
