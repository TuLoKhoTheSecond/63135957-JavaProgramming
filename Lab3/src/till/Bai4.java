package till;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap SL sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[n];
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tt sinh vien  " + (i + 1) + ":");
            System.out.print("Ho va Ten: ");
            names[i] = scanner.nextLine();
            System.out.print("Diem: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("\nTT sinh vien va hoc luc:");
        for (int i = 0; i < n; i++) {
            System.out.println("SV " + (i + 1) + ":");
            System.out.println("Ho va ten: " + names[i]);
            System.out.println("Diem: " + scores[i]);
            System.out.println("Hoc luc: " + getGrade(scores[i]));
            System.out.println();
        }
        sortStudents(names, scores);
        System.out.println("\nDs sinh vien sau khi sap xep diem tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho va ten: " + names[i] + ", Diem: " + scores[i]);
        }
        
        scanner.close();
    }
    public static String getGrade(double score) {
        if (score < 5) {
            return "Yeu";
        } else if (score < 6.5) {
            return "TB";
        } else if (score < 7.5) {
            return "Kha";
        } else if (score < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    public static void sortStudents(String[] names, double[] scores) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                    
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
    }
}
