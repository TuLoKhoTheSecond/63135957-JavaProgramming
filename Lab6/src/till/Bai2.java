package till;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập TT sp thứ  " + (i + 1) + ":");
            System.out.print("Tên sp: ");
            String ten = scanner.nextLine();
            System.out.print("Hãng sx: ");
            String hang = scanner.nextLine();

            danhSachSanPham.add(new SanPham(ten, hang));
        }

        System.out.println("\nTT các Sp của hãng Nokia");
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.hang.equalsIgnoreCase("Nokia")) {
                sanPham.xuatThongTin();
            }
        }
	}
}
class SanPham {
    String ten;
    String hang;

    public SanPham(String ten, String hang) {
        this.ten = ten;
        this.hang = hang;
    }

    public void xuatThongTin() {
        System.out.println("Tên sp: " + ten);
        System.out.println("Hãng sx: " + hang);
        System.out.println();
    }
}

