package vlhp;

import java.io.*;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		String str;
		FileWriter fw;
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		try {
			fw = new FileWriter("D:\\test.txt");
		}
		catch(IOException exc) {
			System.out.print("Khong the mo file");
			return;
		}
		System.out.println("Nhap 'stop' de dung viet vao file:");
		do {
			str = bw.readLine();
			if(str.equals("stop")) {
				break;
			}
			fw.write(str);
		}while(!str.equals("stop"));
		
		fw.close();
		
	}

}
