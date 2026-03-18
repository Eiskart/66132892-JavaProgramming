package vlhp;

import java.util.List;

public class MainQuanLy {

	public static void main(String[] args) {
System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");
        
        QuanLySV qlsv = new QuanLySV();
        
        qlsv.themSV(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        qlsv.themSV(new SinhVien("SV002", "Trần Thị B", 7.2));
        qlsv.themSV(new SinhVien("SV003", "Lê Văn C", 6.8));
        qlsv.themSV(new SinhVien("SV004", "Phạm Thị D", 9.1));
        qlsv.themSV(new SinhVien("SV005", "Hoàng Văn E", 5.5));
        
        qlsv.hienThiDanhSach();
        
        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        SinhVien sv = qlsv.timTheoMa("SV003");
        System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));
        
        System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        SinhVien svCaoNhat = qlsv.diemCaoNhat();
        System.out.println(svCaoNhat != null ? svCaoNhat : "Không có sinh viên");
        
        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        System.out.printf("Điểm TB lớp:" + qlsv.diemTB());
        
        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
        List<SinhVien> svGioi = qlsv.locSVTheoDiem(8.0);
        if (!svGioi.isEmpty()) {
            svGioi.forEach(System.out::println);
        } else {
            System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
        }
        
        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
        qlsv.sapXepTheoDiem();
        qlsv.hienThiDanhSach();
        
        System.out.println("\n=== XÓA SINH VIÊN ===");
        qlsv.xoaSinhVien("SV002");
        qlsv.hienThiDanhSach();
        
        qlsv.hienThiHaiSinhVienDauTien();
	}

}
