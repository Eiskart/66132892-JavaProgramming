package vlhp;

public class ConCho extends DongVat {
	 	private String giongCho;
	    private boolean coTheTruongNha;
	    
	    public ConCho(String ten, int tuoi, double canNang, 
	                  String giongCho, boolean coTheTruongNha) {
	        super(ten, tuoi, canNang);  
	        this.giongCho = giongCho;
	        this.coTheTruongNha = coTheTruongNha;
	    }
	    public void sua() {
	        System.out.println(ten + " đang sủa: Gâu gâu!");
	    }
	    
	    public void duoiMeo() {
	        System.out.println(ten + " đang đuổi mèo...");
	    }
	    
	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();  
	        System.out.println("Giống chó: " + giongCho);
	        System.out.println("Có thể trông nhà: " + (coTheTruongNha ? "Có" : "Không"));
	    }
}
