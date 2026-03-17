package vlhp1;

import java.util.ArrayList;
import java.util.List;
public class ArrayListCoBan {
		public static void main() {		        
		  
		        List<String> danhSachTen = new ArrayList<>();
		        
		        
		        System.out.println("--- THÊM PHẦN TỬ ---");
		        danhSachTen.add("Nguyễn Văn A");
		        danhSachTen.add("Trần Thị B");
		    
		        
		       
		        danhSachTen.add(1, "Phạm Thị D"); 
		        
		        System.out.println("Danh sách sau khi thêm: " + danhSachTen);
		        
		       
		        System.out.println("Số phần tử: " + danhSachTen.size());
		        
		        System.out.println("Phần tử thứ 0: " + danhSachTen.get(0));
		        System.out.println("Phần tử thứ 2: " + danhSachTen.get(2));
		        
		        System.out.println("Trước khi cập nhật: " + danhSachTen.get(1));
		        danhSachTen.set(1, "Trần Thị B (Đã đổi tên)");
		        System.out.println("Sau khi cập nhật: " + danhSachTen.get(1));
		        
		        System.out.println("Có 'Lê Văn C' không? " + danhSachTen.contains("Lê Văn C"));
		        System.out.println("Vị trí của 'Lê Văn C': " + danhSachTen.indexOf("Lê Văn C"));
		        System.out.println("Vị trí của 'Không tồn tại': " + danhSachTen.indexOf("Không tồn tại"));
		        
		        System.out.println("Trước khi xóa: " + danhSachTen);
		        
		        String removedByIndex = danhSachTen.remove(0);
		        System.out.println("Đã xóa (theo index 0): " + removedByIndex);
		        
		        boolean removedByObject = danhSachTen.remove("Lê Văn C");
		        System.out.println("Xóa 'Lê Văn C' thành công? " + removedByObject);
		        
		        System.out.println("Sau khi xóa: " + danhSachTen);
		        
		        System.out.println("Danh sách có rỗng không? " + danhSachTen.isEmpty());
		        
		        System.out.println("Cách 1: For thông thường");
		        for (int i = 0; i < danhSachTen.size(); i++) {
		            System.out.println("Vị trí " + i + ": " + danhSachTen.get(i));
		        }
		        
		        for (String ten : danhSachTen) {
		            System.out.println("Tên: " + ten);
		        }
		        
		        System.out.println("\nCách 3: ForEach với Lambda");
		        danhSachTen.forEach(ten -> System.out.println("Tên: " + ten));
		        
		        String[] mangTen = danhSachTen.toArray(new String[0]);
		        System.out.println("Mảng chuyển đổi:");
		        for (String ten : mangTen) {
		            System.out.println(ten);
		        }
		        
		        danhSachTen.clear();
		        System.out.println("Sau khi clear, kích thước: " + danhSachTen.size());
		        System.out.println("Danh sách có rỗng không? " + danhSachTen.isEmpty());
		}
}
