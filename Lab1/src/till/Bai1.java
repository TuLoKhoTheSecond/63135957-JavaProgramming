package till;

import java.util.Scanner;

public class Bai1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       System.out.print("Họ và tên: \n");
       String hoVaTen = scanner.nextLine();

       System.out.print("Điểm TB: \n");
       double diemTB = scanner.nextDouble();


       System.out.printf("%s %.2f điểm%n", hoVaTen, diemTB);
       
       scanner.close();
	}
}
