package till;

import java.util.Scanner;

public class Bai1 {
	    public static void main(String[] args) {
	        SanPham sp = new SanPham("Áo sơ mi", 200000, 0.1);
	        sp.xuat();
	    }
	}

class SanPham {
	    private String tenSp;
	    private double donGia;
	    private double giamGia;
	    public SanPham(String tenSp, double donGia, double giamGia) {
	        this.tenSp = tenSp;
	        this.donGia = donGia;
	        this.giamGia = giamGia;
	    }
	    public double getThueNhapKhau() {
	        return 0.1 * donGia;
	    }
	    public void xuat() {
	        System.out.println("TT Sp:");
	        System.out.println("Ten Sp: " + tenSp);
	        System.out.println("Don Gia: " + donGia);
	        System.out.println("Giam gia: " + giamGia);
	        System.out.println("Thue nhap khau: " + getThueNhapKhau());
	    }
	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap ten Sp: ");
	        tenSp = scanner.nextLine();
	        System.out.print("Nhap don gia: ");
	        donGia = scanner.nextDouble();
	        System.out.print("Nhap giam gia: ");
	        giamGia = scanner.nextDouble();
	        scanner.close();
	    }
	    public String getTenSp() {
	        return tenSp;
	    }

	    public void setTenSp(String tenSp) {
	        this.tenSp = tenSp;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }

	    public double getGiamGia() {
	        return giamGia;
	    }

	    public void setGiamGia(double giamGia) {
	        this.giamGia = giamGia;
	    }
	}

