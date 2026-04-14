package vlhp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChar {
	public static void main(String args[]) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap chuoi ki tu, ket thuc bang dau .");
		do {
			c = (char) br.read();
			System.out.print(c);
		}while(c != '.');
	}
}
