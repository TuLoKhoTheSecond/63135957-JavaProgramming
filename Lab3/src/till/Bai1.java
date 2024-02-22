package till;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " la so NTo");
        } else {
            System.out.println(number + " Ko phai so NTo");
        }
        
        scanner.close();
    }
}
