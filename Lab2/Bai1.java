

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem chuyen can: ");
        double a = sc.nextDouble();
        System.out.print("Nhap diem giua ki: ");
        double b = sc.nextDouble();
        System.out.print("Nhap diem cuoi ki: ");
        double c = sc.nextDouble();
        double diemTK = (a * 0.1 + b * 0.3 + c * 0.6);
        sc.close();
        System.out.printf("Diem tong ket la : %.2f\n", diemTK);
    }
}
