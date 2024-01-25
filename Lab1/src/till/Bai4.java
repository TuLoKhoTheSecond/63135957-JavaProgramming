//Ngô Nguyễn Anh Tú
package till;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Nhập a
		System.out.print("Nhập hệ số a: ");
	    double a = scanner.nextDouble();
	    //Nhập b
	    System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        // Nhâp c
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        //tính toán
        double delta = Math.pow(b, 2) - 4 * a * c;
        //Hàm KT
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
        	double canDelta = Math.sqrt(delta);
        	System.out.printf("Căn của delta: %.2f\n", canDelta);
        }
        scanner.close();
	}
}
