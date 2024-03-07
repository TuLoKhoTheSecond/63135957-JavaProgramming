package till;

import java.util.Scanner;

class ChuNhat {
    protected double dai;
    protected double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return 2 * (dai + rong);
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chiều dai: " + dai);
        System.out.println("Chiều rong: " + rong);
        System.out.println("dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Nhập chieu dai HCN: ");
        double daiCN = scanner.nextDouble();
        System.out.println("Nhập chieu rong HCN: ");
        double rongCN = scanner.nextDouble();     
        System.out.println("Nhập canh cua HV: ");
        double canhVuong = scanner.nextDouble();     
        ChuNhat cn = new ChuNhat(daiCN, rongCN);
        Vuong vu = new Vuong(canhVuong);    
        System.out.println("TT HCN:");
        cn.xuat();    
        System.out.println("TT HV:");
        vu.xuat();
    }
}
