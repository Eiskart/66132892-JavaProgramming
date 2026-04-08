package vlhp;

public class PhapSu	extends NhanVat implements CoTheTanCong, CoTheTrangBi {
	protected double mauPS =300;
	protected double manaPS = 10;
	protected String[] trangBiPS = {"Ao Choang", "Truong"};
	
	public PhapSu() {
		super();
		super.setMau(mauPS);
		super.setMana(manaPS);
		super.setTrangBi(trangBiPS);
	}

	@Override
	public void trangBiDo() {
		super.trangBi.add("Nhan");
	}

	@Override
	public void thaoDo() {
		super.trangBi.remove(2);
	}

	@Override
	public double tanCong() {
		return 1;
	}

	@Override
	public double tanCong(String kiNang) {
		double damage = 0;
		if(kiNang.equals("1")) {
			if( super.getMana() > 0) {
				super.setMau(super.getMau() + 200);
				System.out.printf("ban hoi: 200 mau\n");
				super.setMana(super.getMana()-1);
				System.out.printf("ban dung 1 mana\n");

			}
			else {
				super.setMana(super.getMana()+1);
				System.out.printf("ban hoi: 1 mana\n");}
		}
		else if(kiNang.equals("2")) {
			if( super.getMana() > 0) {
				damage = 500;
				super.setMau(super.getMau() + 500);
				System.out.printf("ban hoi: 500 mau\n");
				super.setMana(super.getMana()- 4);
				System.out.printf("ban dung 4 mana\n");

			}
			else {
				super.setMana(super.getMana()+1);
				System.out.printf("ban hoi: 1 mana\n");}
		}
		else if(kiNang.equals("3")) {
			if( super.getMana() > 0) {
				damage = 4999;
				super.setMana(super.getMana()- 10);
				System.out.printf("ban dung 10 mana\n");

			}
			else {
				super.setMana(super.getMana()+1);
				System.out.printf("ban hoi: 1 mana\n");}

		}
		else if(kiNang.equals("4")) {
				super.setMana(super.getMana()+5);
				System.out.printf("ban hoi: 5 mana\n");

		}
		return damage;
	}
}
