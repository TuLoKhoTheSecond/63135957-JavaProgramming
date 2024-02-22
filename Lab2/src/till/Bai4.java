//Ngô Nguyễn Anh Tú
package till;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            menu();
            System.out.print("Chon so: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("End");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon so tu 1 - 4.");
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("Chon 1. Pt bac 1");
        System.out.println("Chon 2. Pt bac 2");
        System.out.println("Chon 3. Tinh Tien dien");
        System.out.println("Chon 4. End");
        System.out.println("\n");
    }
    
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai Pt ax + b = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Nghiệm của phương trình: x = %.2f\n", x);
        }
    }
    
    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai Pt ax^2 + bx + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Nghiệm kép của phương trình: x = %.2f\n", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Nghiệm phân biệt của phương trình: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }
    }
    
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh tien dien");
        System.out.print("Nhap so dien su dung trong thang: ");
        int soDien = scanner.nextInt();
        
        int giaDuoi50 = 1000;
        int giaVuot50 = 1200;
        int gioiHan50 = 50;
        
        int tien;
        
        if (soDien <= gioiHan50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = gioiHan50 * giaDuoi50 + (soDien - gioiHan50) * giaVuot50;
        }
        
        System.out.printf("Tien dien phai tra: %d VND\n", tien);
    }
}


