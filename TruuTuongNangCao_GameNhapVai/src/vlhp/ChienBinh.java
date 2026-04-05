package vlhp;

public class ChienBinh extends NhanVat implements CoTheTanCong, CoTheTrangBi {
	protected double mauCB = 1000;
	protected double manaCB = 0;
	protected String[] trangBiCB = {"Armor", "Sword"};
	
	public ChienBinh() {
		super();
		super.setMau(mauCB);
		super.setMana(manaCB);
		super.setTrangBi(trangBiCB);
	}

	@Override
	public void trangBiDo() {
		super.trangBi.add("Shield");
	}

	@Override
	public void thaoDo() {
		super.trangBi.remove(2);
	}

	@Override
	public double tanCong() {
		return 5;
	}

	@Override
	public double tanCong(String kiNang) {
		double damage = 0;
		if(kiNang == "1") {
			damage = 100;
		}
		else if(kiNang == "2") {
			damage = 1000;
		};
		return damage;
	}
	

}
