package vlhp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class NhanVat {
	protected double mau;
	protected double mana;
	protected List<String> trangBi = new ArrayList<>();
	
	
	
	public NhanVat() {
		super();
	}

	public NhanVat(double mau, double mana, String[] trangBi) {
		super();
		this.mau = mau;
		this.mana = mana;
		this.trangBi = new ArrayList<>(Arrays.asList(trangBi));
	}
	
	public double getMau() {
		return mau;
	}
	public void setMau(double mau) {
		this.mau = mau;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public List<String> getTrangBi() {
		return trangBi;
	}
	public void setTrangBi(String[] trangBiCB) {
		this.trangBi = new ArrayList<>(Arrays.asList(trangBiCB));
	}
	
	
	
}
