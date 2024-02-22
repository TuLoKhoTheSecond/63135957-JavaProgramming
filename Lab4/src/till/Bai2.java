package till;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SanPham sp1 = new SanPham();
        System.out.println("Nhap TT Sp 1:");
        sp1.nhap(scanner);

        SanPham sp2 = new SanPham();
        System.out.println("\nNhap TT Sp 2:");
        sp2.nhap(scanner);

        System.out.println("\nTT Sp 1:");
        sp1.xuat();

        System.out.println("\nTT Sp 2:");
        sp2.xuat();
        
        scanner.close();
    }

    static class SanPham {
        private String tenSp;
        private double donGia;
        private double giamGia;

        public void nhap(Scanner scanner) {
            System.out.print("Nhap ten Sp: ");
            tenSp = scanner.nextLine();
            System.out.print("Nhap don gia: ");
            donGia = scanner.nextDouble();
            System.out.print("Nhap giam gia: ");
            giamGia = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự thừa sau khi nhập giá trị số
        }

        public void xuat() {
            System.out.println("Ten Sp: " + tenSp);
            System.out.println("Don gia: " + donGia);
            System.out.println("Giam : " + giamGia);
        }
    }
}
