package till;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachHoTen = new ArrayList<>();

        while (true) {
            int luaChon = menu(scanner);
            switch (luaChon) {
                case 1:
                    nhap(scanner, danhSachHoTen);
                    break;
                case 2:
                    xuat(danhSachHoTen);
                    break;
                case 3:
                    ngaunhien(danhSachHoTen);
                    break;
                case 4:
                    sapxep(danhSachHoTen);
                    break;
                case 5:
                    xoa(scanner, danhSachHoTen);
                    break;
                case 6:
                    System.out.println("End!!!!!");
                    return;
                default:
                    System.out.println("Error, hãy chonj lại");
            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("1. Nhập ds họ và tên");
        System.out.println("2. Xuất ds nhập");
        System.out.println("3. Xuất ds random");
        System.out.println("4. Sx Giảm dần và xuất ds");
        System.out.println("5. Tìm và xóa họ và tên");
        System.out.println("6. End");
        System.out.print("Chọn: ");
        return scanner.nextInt();
    }

    public static void nhap(Scanner scanner, ArrayList<String> danhSachHoTen) {
        scanner.nextLine(); // Consume newline character
        System.out.println("Nhập ds họ và tên (bấm D để kết thúc): ");
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("D")) {
                break;
            }
            danhSachHoTen.add(hoTen);
        }
    }

    public static void xuat(ArrayList<String> danhSachHoTen) {
        System.out.println("Ds họ và tên: ");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void ngaunhien(ArrayList<String> danhSachHoTen) {
        System.out.println("Ds random: ");
        Collections.shuffle(danhSachHoTen);
        xuat(danhSachHoTen);
    }

    public static void sapxep(ArrayList<String> danhSachHoTen) {
        System.out.println("Ds sau sx giảm dần: ");
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        xuat(danhSachHoTen);
    }

    public static void xoa(Scanner scanner, ArrayList<String> danhSachHoTen) {
        scanner.nextLine(); // Consume newline character
        System.out.print("Nhập họ tên cần xóa:  ");
        String hoTenCanXoa = scanner.nextLine();
        boolean found = false;
        for (String hoTen : danhSachHoTen) {
            if (hoTen.equalsIgnoreCase(hoTenCanXoa)) {
                danhSachHoTen.remove(hoTen);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("xóa thành công");
        } else {
            System.out.println("Ko tìm thấy họ tên");
        }
    }
	
}
