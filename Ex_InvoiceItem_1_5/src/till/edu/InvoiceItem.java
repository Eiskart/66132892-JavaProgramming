package till.edu;

public class InvoiceItem {
	String id;
	String desc;
	int qty;
	double unitPrice;
	
	public InvoiceItem(String id,String desc, int qty,double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
		
	}
	public void setQty(int qty) {
		this.qty = qty;
		return;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
		return;
	}
	public double getTotal() {
		return unitPrice*qty;
		
	}
	public String toString() {
		return String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%.2f]", id,desc,qty,unitPrice);
	}
}
