package till;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien[] danhSachSinhVien = new SinhVien[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập tt cho sv thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            while (!isValidEmail(email)) {
                System.out.print("Email ko hợp lệ, email phải hợp lệ: ");
                email = scanner.nextLine();
            }
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            while (!isValidPhoneNumber(soDienThoai)) {
                System.out.print("SDT ko hợp lệ, hãy điền số 0 và đủ 9 số: ");
                soDienThoai = scanner.nextLine();
            }
            System.out.print("CMND: ");
            String cmnd = scanner.nextLine();
            while (!isValidCMND(cmnd)) {
                System.out.print("CMND ko hợp lệ, cmnd phải có 9 số : ");
                cmnd = scanner.nextLine();
            }

            danhSachSinhVien[i] = new SinhVien(hoTen, email, soDienThoai, cmnd);
        }
        System.out.println("\nTT các sv: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sv thứ " + (i + 1) + ":");
            System.out.println("Họ và tên: " + danhSachSinhVien[i].hoTen);
            System.out.println("Email: " + danhSachSinhVien[i].email);
            System.out.println("SDT: " + danhSachSinhVien[i].soDienThoai);
            System.out.println("CMND: " + danhSachSinhVien[i].cmnd);
            System.out.println();
        }
    }
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
    	String regex = "^(\\+84|0)\\d{8,9}$";
        return phoneNumber.matches(regex);
    }
    public static boolean isValidCMND(String cmnd) {
        String regex = "^\\d{9}$";
        return cmnd.matches(regex);
    }
}
class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }
}
