package vlhp;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		int i = 10;
		String s = "day la Java";
		double d = 12.32;
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println(i);
		pw.println(s);
		pw.println(d);
		pw.println("day la " + i + " cai ghe");
		pw.close();
	}

}
