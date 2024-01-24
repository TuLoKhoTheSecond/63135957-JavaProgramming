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
        scanner.close();
	}
}
