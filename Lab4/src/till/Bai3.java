package till;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap TT Sp 1:");
        SanPham sp1 = nhapSanPham(scanner);

        System.out.println("\nNhap TT Sp 2:");
        SanPham sp2 = nhapSanPham(scanner);

        System.out.println("\nTT Sp 1:");
        sp1.xuat();

        System.out.println("\nTT Sp 2:");
        sp2.xuat();
        
        scanner.close();
    }
    public static SanPham nhapSanPham(Scanner scanner) {
        System.out.print("Nhap ten Sp: ");
        String tenSp = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhap giam gia: ");
        double giamGia = scanner.nextDouble();
        scanner.nextLine();
        return new SanPham(tenSp, donGia, giamGia);
    }
}

