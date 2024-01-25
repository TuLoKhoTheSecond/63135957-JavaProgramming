//Ngô Nguyễn Anh Tú
package till;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Nhập Số điện
		System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        
        int giaDuoi50 = 1000;
        int giaVuot50 = 1200;
        int gioiHan50 = 50;

        int tien;
        //Hàm tính tiền
        if (soDien <= gioiHan50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = gioiHan50 * giaDuoi50 + (soDien - gioiHan50) * giaVuot50;
        }
        System.out.printf("Tiền điện phải thanh toán: %d VND\n", tien);
        scanner.close();
	}

}
