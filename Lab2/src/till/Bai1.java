// Ngô Nguyễn Anh Tú
package till;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 // Nhập a
		 System.out.print("Nhập hệ số a: ");
	     double a = scanner.nextDouble();
		 // Nhập b
	     System.out.print("Nhập hệ số b: ");
	     double b = scanner.nextDouble();
	     //Hàm giải pt bậc nhất
	     if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.printf("Nghiệm của phương trình: x = %.2f\n", x);
	        }
	     scanner.close();
	}

}
