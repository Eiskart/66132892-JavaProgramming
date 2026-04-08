package vlhp;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main() {
		Random rand = new Random();
		double opHealth = 5000;
		System.out.println("chon nhan vat:");
		System.out.println("1: Chien binh");
		System.out.println("2: Phap su");
		System.out.println("3: Cung thu");
		Scanner player = new Scanner(System.in);
		int playerChoice = player.nextInt();
		player.nextLine();
		if(playerChoice == 1) {
			ChienBinh u = new ChienBinh();
			while(opHealth > 0 && u.getMau() > 0) {
				System.out.println("=====================================");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⢀⣠⣤⣤⣾⠟⠛⠛⠛⠛⠛⠛⠛⠻⣦⣤⣤⣄⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⣠⣾⡿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠟⠿⣿⣦⣄⠀⠀⠀\r\n"
						+ "⣠⣼⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀\r\n"
						+ "⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣶⡄⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⣀⣀⠀⠀⠀⣿⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⣿⣿⠀⠀⠀⣯⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠇⠀⠀⠀⠿⣿⠤⣤⣧⣧⣿⡇⡀\r\n"
						+ "⠿⢿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⡀⠀⠀⠀⠁⣠⣼⣿⠟⠃\r\n"
						+ "⠀⠀⠿⢷⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣁⣀⣀⣀⣤⣿⠿⠁⠀⠀\r\n"
						+ "⠀⠀⠀⠘⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠁⠁⠀⠀⠀\t\n"
						+ "Mau ke dich:"+ opHealth);
				System.out.println("=====================================");
				System.out.printf("Mau:%.2f \n",u.getMau());
				System.out.println("1:Tan cong      2:Ki nang      3:Trang bi");
				String choice = player.nextLine();
				System.out.println("-------------------------------------");

				if(choice.equals("1")) {
					opHealth -= u.tanCong();
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",u.tanCong());

					}
				else if(choice.equals("2")) {
					System.out.println("1: Ki nang 1     2:Ki nang 2");
					String kiNang = player.nextLine();
					opHealth -= u.tanCong(kiNang);
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",u.tanCong(kiNang));

				}
				else if(choice.equals("3")) {
					System.out.println(u.getTrangBi());

				}
				double damage = rand.nextDouble(300)+5;
				System.out.printf("ban bi tan cong: tru %.2f mau\n",damage);
				u.setMau(u.getMau()-damage);
			}
			if(opHealth <= 0) {
				System.out.println("!!!CHIEN THANG!!!");
				player.close();
				return;
			}
			else if(u.getMau() <= 0) {
				System.out.println("THUA CUOC...");
				player.close();
				return;
			}		
		}
		else if(playerChoice == 2) {
			PhapSu u = new PhapSu();
			while(opHealth > 0 && u.getMau() > 0) {
				System.out.println("=====================================");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⢀⣠⣤⣤⣾⠟⠛⠛⠛⠛⠛⠛⠛⠻⣦⣤⣤⣄⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⣠⣾⡿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠟⠿⣿⣦⣄⠀⠀⠀\r\n"
						+ "⣠⣼⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀\r\n"
						+ "⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣶⡄⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⣀⣀⠀⠀⠀⣿⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⣿⣿⠀⠀⠀⣯⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠇⠀⠀⠀⠿⣿⠤⣤⣧⣧⣿⡇⡀\r\n"
						+ "⠿⢿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⡀⠀⠀⠀⠁⣠⣼⣿⠟⠃\r\n"
						+ "⠀⠀⠿⢷⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣁⣀⣀⣀⣤⣿⠿⠁⠀⠀\r\n"
						+ "⠀⠀⠀⠘⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠁⠁⠀⠀⠀\t\n"
						+ "Mau ke dich:"+ opHealth);
				System.out.println("=====================================");
				System.out.printf("Mau:%.2f \n",u.getMau());
				System.out.printf("Mana:%.2f \n",u.getMana());

				System.out.println("1:Tan cong      2:Ki nang      3:Trang bi");
				String choice = player.nextLine();
				System.out.println("-------------------------------------");

				if(choice.equals("1")) {			
					opHealth -= u.tanCong();
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",u.tanCong());

					}
				else if(choice.equals("2")) {
					System.out.println("1:Hoi mau     2:Ki nang 2     3:Ki nang 3     4:Ki nang 4");
					String kiNang = player.nextLine();
					double num = u.tanCong(kiNang);
					opHealth -= num;
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",num);

				}
				else if(choice.equals("3")) {
					System.out.println(u.getTrangBi());

				}
				double damage = rand.nextDouble(300)+5;
				System.out.printf("ban bi tan cong: tru %.2f mau\n",damage);
				u.setMau(u.getMau()-damage);
			}
			if(opHealth <= 0) {
				System.out.println("!!!CHIEN THANG!!!");
				player.close();
				return;
			}
			else if(u.getMau() <= 0) {
				System.out.println("THUA CUOC...");
				player.close();
				return;
			}		
		}
		else if(playerChoice == 3) {
			CungThu u = new CungThu();
			while(opHealth > 0 && u.getMau() > 0) {
				System.out.println("=====================================");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⢀⣠⣤⣤⣾⠟⠛⠛⠛⠛⠛⠛⠛⠻⣦⣤⣤⣄⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⣠⣾⡿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠟⠿⣿⣦⣄⠀⠀⠀\r\n"
						+ "⣠⣼⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀\r\n"
						+ "⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣶⡄⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⣀⣀⠀⠀⠀⣿⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⣿⣿⠀⠀⠀⣯⣿⡇⠀\r\n"
						+ "⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠇⠀⠀⠀⠿⣿⠤⣤⣧⣧⣿⡇⡀\r\n"
						+ "⠿⢿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⡀⠀⠀⠀⠁⣠⣼⣿⠟⠃\r\n"
						+ "⠀⠀⠿⢷⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣁⣀⣀⣀⣤⣿⠿⠁⠀⠀\r\n"
						+ "⠀⠀⠀⠘⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠁⠁⠀⠀⠀\t\n"
						+ "Mau ke dich:"+ opHealth);
				System.out.println("=====================================");
				System.out.printf("Mau:%.2f \n",u.getMau());
				System.out.printf("Mana:%.2f \n",u.getMana());

				System.out.println("1:Tan cong      2:Ki nang      3:Trang bi");
				String choice = player.nextLine();
				System.out.println("-------------------------------------");

				if(choice.equals("1")) {			
					opHealth -= u.tanCong();
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",u.tanCong());

					}
				else if(choice.equals("2")) {
					System.out.println("1:Hoi mau     2:Ki nang 2     3:Ki nang 3");
					String kiNang = player.nextLine();
					double num = u.tanCong(kiNang);
					opHealth -= num;
					System.out.printf("ban tan cong ke dich: tru %.2f mau\n",num);

				}
				else if(choice.equals("3")) {
					System.out.println(u.getTrangBi());

				}
				double damage = rand.nextDouble(300)+5;
				System.out.printf("ban bi tan cong: tru %.2f mau\n",damage);
				u.setMau(u.getMau()-damage);
			}
			if(opHealth <= 0) {
				System.out.println("!!!CHIEN THANG!!!");
				player.close();
				return;
			}
			else if(u.getMau() <= 0) {
				System.out.println("THUA CUOC...");
				player.close();
				return;
			}		
		}
		else System.out.println("Khong chon nhan vat");	
		player.close();
	}
}
