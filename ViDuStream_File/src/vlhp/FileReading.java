package vlhp;
import java.io.*;
public class FileReading {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null) {
			System.out.print(s);
		}
		fr.close();
	}

}
