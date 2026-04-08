package vlhp;

public class CungThu extends NhanVat implements CoTheTanCong, CoTheTrangBi {
	protected double mauCT = 700;
	protected double manaCT = 2;
	protected String[] trangBiCT = {"Ao Giap", "Cung"};
	
	public CungThu() {
		super();
		super.setMau(mauCT);
		super.setMana(manaCT);
		super.setTrangBi(trangBiCT);
	}

	@Override
	public void trangBiDo() {
		super.trangBi.add("Giay Hermes");
	}

	@Override
	public void thaoDo() {
		super.trangBi.remove(2);
	}

	@Override
	public double tanCong() {
		return 30;
	}

	@Override
	public double tanCong(String kiNang) {
		double damage = 0;
		if(kiNang.equals("1")) {
			super.setMau(super.getMau() + 50);
			System.out.printf("ban hoi: 50 mau\n");

		}
		else if(kiNang.equals("2")) {
			damage = 500;
		}
		else if(kiNang.equals("3")) {
			if( super.getMana() > 0) {
				damage = 2000;
				super.setMana(super.getMana()-1);
				System.out.printf("ban dung 1 mana\n");

			}
			else {
				super.setMana(super.getMana()+1);
				System.out.printf("ban hoi: 1 mana\n");}

		}
		return damage;
	}

}

