package tiil.edu;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu nhat:");
		double n1 = sc.nextDouble();
		System.out.print("Nhap so thu 2:");
		double n2 = sc.nextDouble();
		
		double sum = n1+n2;
		
		sc.close();
		System.out.printf("tong cua %.2f + %.2f = %.2f",n1,n2,sum);

	}

}
