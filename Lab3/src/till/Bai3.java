package till;

import java.util.Arrays;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong PT cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhap cac PT cua mang:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("PT nho nhat trong mang: " + min);
        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("TB + cac pt chia het cho 3: " + average);
        
        scanner.close();
	}

}
