package till;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Nhập ds số thực (bấm N để kết thúc): ");
        while (true) {
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); 
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Ds số thực đã nhập:");
        for (Double number : list) {
            System.out.println(number);
        }

        double sum = 0;
        for (Double number : list) {
            sum += number;
        }
        System.out.println("Sum ds số thực: " + sum);
	}

}
