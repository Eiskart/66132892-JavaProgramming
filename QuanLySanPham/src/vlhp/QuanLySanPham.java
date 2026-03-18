package vlhp;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
	public enum SapXep{ Tang, Giam};
	private List<SanPham> qlSP;

	public QuanLySanPham() {
		qlSP = new ArrayList<>();
	}
	
	public void themSP(SanPham sp) {
		qlSP.add(sp);
		System.out.println("Da Them San Pham:" + sp.getTenSP());
	}
	
	public boolean xoaTheoMa(String ma) {
		 for (int i = 0; i < qlSP.size(); i++) {
	            if (qlSP.get(i).getMaSP().equals(ma)) {
	                SanPham spBiXoa = qlSP.remove(i);
	                System.out.println("Đã xóa: " + spBiXoa.getTenSP());
	                return true;
	            }
	        }
	        System.out.println("Không tìm thấy sản phẩm có mã: " + ma);
	        return false;
	}
	public List<SanPham> TimTheoTen(String ten) {
		List<SanPham> tim = new ArrayList<>();
		for(SanPham sp : qlSP) {
			if(sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
				tim.add(sp);
			}
		}
		return tim;
	}
	
	public void sapXepTheoGia(SapXep xep) {
		if(xep == SapXep.Tang) {
			for (int i = 0; i < qlSP.size() - 1; i++) {
	            for (int j = 0; j < qlSP.size() - i - 1; j++) {
	                if (qlSP.get(j).getGia() > qlSP.get(j + 1).getGia()) {
	                    SanPham temp = qlSP.get(j);
	                    qlSP.set(j, qlSP.get(j + 1));
	                    qlSP.set(j + 1, temp);
	                }
	            }
	        }
	    }
		else {
			for (int i = 0; i < qlSP.size() - 1; i++) {
	            for (int j = 0; j < qlSP.size() - i - 1; j++) {
	                if (qlSP.get(j).getGia() < qlSP.get(j + 1).getGia()) {
	                    SanPham temp = qlSP.get(j);
	                    qlSP.set(j, qlSP.get(j + 1));
	                    qlSP.set(j + 1, temp);
	                }
	            }
	        }	
		}
	}
	
	public long TongGiaTri() {
		if(qlSP.isEmpty()) {
			return 0;
		}
		long Tong = 0;
		for(SanPham sp : qlSP) {
			Tong += (sp.getGia() * sp.getSoLuong());
		}
		return Tong;
	}
	
	public List<SanPham> SanPhamHetHang() {
		List<SanPham> het = new ArrayList<>();
		for(SanPham sp : qlSP) {
			if(sp.getSoLuong() < 10) {
				het.add(sp);
			}
		}
		return het;
	}
}
