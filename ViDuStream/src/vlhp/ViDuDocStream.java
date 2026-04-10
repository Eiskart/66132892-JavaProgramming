package vlhp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader ipRead = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(ipRead);
		System.out.print("Nhap chuoi:");
		String doc = bufRead.readLine();
		System.out.println(doc);
	}

}
