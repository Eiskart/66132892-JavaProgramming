package vlhpack;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NhatKy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap dong nhat ky moi:");
		String dong = scanner.nextLine();
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("diary.txt",true))){
			writer.write(dong);
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Da luu vao nhat ky");
		scanner.close();
				
			}

}
