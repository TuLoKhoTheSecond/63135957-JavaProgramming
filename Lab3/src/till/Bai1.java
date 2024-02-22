package till;

import java.util.Scanner;

public class Bai1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap 1 so nguyen duong: ");
	        int number = scanner.nextInt();
	        
	        boolean ok = true;
	        
	        if (number <= 1) {
	            ok = false;
	        } else {
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    ok = false;
	                    break;
	                }
	            }
	        }
	        
	        if (ok) {
	            System.out.println(number + " la so Nto");
	        } else {
	            System.out.println(number + " Ko phai so Nto");
	        }
	        
	        scanner.close();
	    }
}
