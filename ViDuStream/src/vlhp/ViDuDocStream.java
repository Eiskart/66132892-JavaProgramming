package vlhp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("baitho.txt");
		InputStreamReader ipRead = new InputStreamReader(file);
		BufferedReader bufRead = new BufferedReader(ipRead);
		String line1 = bufRead.readLine();
		System.out.println(line1);
		String line2 = bufRead.readLine();
		System.out.println(line2);
		bufRead.close();
	}

}
