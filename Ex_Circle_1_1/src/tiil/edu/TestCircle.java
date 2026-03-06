package tiil.edu;

public class TestCircle {

	public static void main(String[] args) {
		Circle vong1 = new Circle();
		Circle vong2 = new Circle(2.0);
		Circle vong3 = new Circle(3.0, "blue");
		
		double banKinh1 = vong1.getRadius();
		String mau1 = vong1.getColor();
		System.out.println("ban kinh cua vong 1 la "+banKinh1+", mau la:"+mau1);
		
		System.out.println("ban kinh cua vong 2 la "+vong2.getRadius()+",mau la "+vong2.getColor());
		vong2.setRadius(5.5);
		vong2.setColor("green");
		System.out.println("ban kinh cua vong 2 sau khi doi la "+vong2.getRadius()+",mau la "+vong2.getColor());
		
		System.out.println(vong3.toString());
		
		
		
	}

}
