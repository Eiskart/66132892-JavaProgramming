package vlhp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) throws IOException {
		
			String s;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Nhap chuoi ki tu.");
			System.out.println("Nhap 'stop' ket thuc chuong trinh");
			do {
				s = br.readLine();
				System.out.println(s);
			}while(!s.equals("stop"));
		}
}


