package till;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhập a
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
		//Nhập b
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
		//Nhập c
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
		//Hàm KT
        if (a == 0) {
            // Hàm giải pt bậc nhất
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b; //Hàm Giải PT bậc 2
                System.out.printf("Nghiệm của phương trình: x = %.2f\n", x);
            }
        } else {
        	double delta = Math.pow(b, 2) - 4 * a * c;
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
        scanner.close();
	}
}
