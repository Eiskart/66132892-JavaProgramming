package vlhp;

public class TestQL {

	public static void main(String[] args) {

		QuanLySanPham ql = new QuanLySanPham();

        SanPham sp1 = new SanPham("SP01", "Laptop", 15000, 5);
        SanPham sp2 = new SanPham("SP02", "Điện thoại", 8000, 20);
        SanPham sp3 = new SanPham("SP03", "Tai nghe", 500, 8);

        ql.themSP(sp1);
        ql.themSP(sp2);
        ql.themSP(sp3);

        System.out.println("\nTìm sản phẩm chứa 'tai':");
        for (SanPham sp : ql.TimTheoTen("tai")) {
            System.out.println(sp.getTenSP() + " - " + sp.getGia());
        }

        System.out.println("\nDanh sách sau khi sắp xếp tăng dần:");
        ql.sapXepTheoGia(QuanLySanPham.SapXep.Tang);
        for (SanPham sp : ql.TimTheoTen("")) {
            System.out.println(sp.getTenSP() + " - " + sp.getGia());
        }

        System.out.println("\nTổng giá trị kho: " + ql.TongGiaTri());

        System.out.println("\nSản phẩm gần hết hàng:");
        for (SanPham sp : ql.SanPhamHetHang()) {
            System.out.println(sp.getTenSP() + " - SL: " + sp.getSoLuong());
        }

        ql.xoaTheoMa("SP02");
    }
	

}
