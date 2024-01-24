package till;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Tính chiều dài 
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = scanner.nextDouble();
        //Tính chiều rộng
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double rong = scanner.nextDouble();
        //Tính chu Vi
        double chuVi = (dai + rong) * 2;
        //Tính diện tích
        double dienTich = dai * rong;
        //Tính cạnh nhỏ nhất
        double canhNhoNhat = Math.min(dai, rong);
        //in Chu vi , diện tích , cạnh nhỏ nhất ra màn hình
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
        scanner.close();
	}
}
