package till;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> dsSanPham = new ArrayList<>();
        while (true) {
            int luaChon = menu(scanner);
            switch (luaChon) {
                case 1:
                    nhap(scanner, dsSanPham);
                    break;
                case 2:
                    sapXepVaXuat(dsSanPham);
                    break;
                case 3:
                    xoa(scanner, dsSanPham);
                    break;
                case 4:
                    xuatGiaTrungBinh(dsSanPham);
                    break;
                case 5:
                    System.out.println("End");
                    return;
                default:
                    System.out.println("lỗi nhập lại pls");
            }
        }
	}
	public static int menu(Scanner scanner) {
        System.out.println("1. Nhập ds sp ");
        System.out.println("2. Sx theo giá và xuất");
        System.out.println("3. Tìm và xóa sản phẩm");
        System.out.println("4. Xuất giá TB ");
        System.out.println("5. End");
        System.out.print("Chọn: ");
        return scanner.nextInt();
    }
	public static void nhap(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); // Consume newline character
        System.out.println("Nhập ds (bấm D để dừng):");
        while (true) {
            System.out.print("Tên sp: ");
            String ten = scanner.nextLine();
            if (ten.equalsIgnoreCase("D")) {
                break;
            }
            System.out.print("Giá sp: ");
            double gia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(ten, gia));
            scanner.nextLine(); // Consume newline character
        }
    }
	public static void xuat(ArrayList<SanPham> danhSachSanPham) {
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println("Tên: " + sanPham.ten + ", Giá: " + sanPham.gia);
        }
    }
	 public static void sapXepVaXuat(ArrayList<SanPham> danhSachSanPham) {
	        System.out.println("Ds sp sắp xếp giảm dần: ");
	        Comparator<SanPham> comp = new Comparator<SanPham>() {
	            @Override
	            public int compare(SanPham o1, SanPham o2) {
	                return o2.gia.compareTo(o1.gia);
	            }
	        };
	        Collections.sort(danhSachSanPham, comp);
	        xuat(danhSachSanPham);
	    }
	 public static void xoa(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
	        scanner.nextLine(); // Consume newline character
	        System.out.print("Nhập sp cần xóa: ");
	        String tenCanXoa = scanner.nextLine();
	        boolean found = false;
	        for (SanPham sanPham : danhSachSanPham) {
	            if (sanPham.ten.equalsIgnoreCase(tenCanXoa)) {
	                danhSachSanPham.remove(sanPham);
	                found = true;
	                break;
	            }
	        }
	        if (found) {
	            System.out.println("Đã xóa");
	        } else {
	            System.out.println("Ko tìm thấy sp");
	        }
	    }
	 public static void xuatGiaTrungBinh(ArrayList<SanPham> danhSachSanPham) {
	        if (danhSachSanPham.isEmpty()) {
	            System.out.println("Ds sp rỗng");
	            return;
	        }
	        double tongGia = 0;
	        for (SanPham sanPham : danhSachSanPham) {
	            tongGia += sanPham.gia;
	        }
	        double giaTrungBinh = tongGia / danhSachSanPham.size();
	        System.out.println("Giá TB của các sp " + giaTrungBinh);
	    }

}
class SanPham {
    String ten;
    Double gia;

    public SanPham(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }
}
