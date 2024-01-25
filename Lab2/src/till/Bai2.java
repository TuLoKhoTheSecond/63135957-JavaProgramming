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
        
     }
        scanner.close();
	}
}
