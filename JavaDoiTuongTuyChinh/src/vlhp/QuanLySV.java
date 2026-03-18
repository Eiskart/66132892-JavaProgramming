package vlhp;
import java.util.ArrayList;
import java.util.List;
public class QuanLySV {
	private List<SinhVien> dsSV;
	
	public QuanLySV() {
		dsSV = new ArrayList<>();
	}
	
	public void themSV(SinhVien sv) {
		dsSV.add(sv);
		System.out.println("Da Them" + sv.getHoTen());
	}
	
	public SinhVien timTheoMa(String maSV) {
		for(SinhVien sv: dsSV) {
			if(sv.getMaSV() == maSV) {
				return sv;
			}
		}
		return null;
	}
	
	public SinhVien diemCaoNhat() {
		if(dsSV.isEmpty()) {
			return null;
		}
		SinhVien max = dsSV.get(0);
		for(SinhVien sv:dsSV) {
			if(sv.getDiemTB() > max.getDiemTB()) {
				max = sv;
			}
		}
		return max;
	}
	public double diemTB() {
		if(dsSV.isEmpty()) {
			return 0;
		}
		
		double tong = 0;
		for(SinhVien sv:dsSV) {
			tong += sv.getDiemTB();
		}
		return tong/dsSV.size();
	}
	public List<SinhVien> locSVTheoDiem(double d) {
		List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : dsSV) {
            if (sv.getDiemTB() >= d) {
                ketQua.add(sv);
            }
        }
        return ketQua;
	}
	public void sapXepTheoDiem() {
        for (int i = 0; i < dsSV.size() - 1; i++) {
            for (int j = 0; j < dsSV.size() - i - 1; j++) {
                if (dsSV.get(j).getDiemTB() < dsSV.get(j + 1).getDiemTB()) {
                    SinhVien temp = dsSV.get(j);
                    dsSV.set(j, dsSV.get(j + 1));
                    dsSV.set(j + 1, temp);
                }
            }
        }
    }
	public void hienThiDanhSach() {
        if (dsSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
            return;
        }
        
        System.out.println("DANH SÁCH SINH VIÊN:");
        System.out.println(String.format("%-5s %-10s %-20s %-10s","STT", "Mã SV", "Họ tên", "Điểm TB"));
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < dsSV.size(); i++) {
            SinhVien sv = dsSV.get(i);
            System.out.println(String.format("%-5d %-10s %-20s %-10.2f ",i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
        }
    }
	
	public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < dsSV.size(); i++) {
            if (dsSV.get(i).getMaSV().equals(maSV)) {
                SinhVien svBiXoa = dsSV.remove(i);
                System.out.println("Đã xóa: " + svBiXoa.getHoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
        return false;
    }
	public void hienThiHaiSinhVienDauTien() {
        if (dsSV.size() >= 2) {
            List<SinhVien> subList = dsSV.subList(0, 2);
            System.out.println("\nHai sinh viên đầu tiên:");
            subList.forEach(x -> System.out.println(x));
        }
        else {
        	System.out.println("Danh sach khong du sinh vien");
        	return;
        }
    }
	
	
}
