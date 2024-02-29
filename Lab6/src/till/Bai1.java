package till;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        String ho = Ho(hoTen).toUpperCase();
        String tenDem = TenDem(hoTen);
        String ten = Ten(hoTen).toUpperCase();

        System.out.println("H v T: " + ho + " " + tenDem + " " + ten);
    }

    public static String Ho(String hoTen) {
        int vTKhoangTrangDau = hoTen.indexOf(" ");
        return hoTen.substring(0, vTKhoangTrangDau);
    }

    public static String TenDem(String hoTen) {
        int vTKhoangTrangDau = hoTen.indexOf(" ");
        int vTKhoangTrangCuoi = hoTen.lastIndexOf(" ");
        return hoTen.substring(vTKhoangTrangDau + 1, vTKhoangTrangCuoi);
    }

    public static String Ten(String hoTen) {
        int vTKhoangTrangCuoi = hoTen.lastIndexOf(" ");
        return hoTen.substring(vTKhoangTrangCuoi + 1);
    }
}
