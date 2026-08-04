import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Vui lòng nhập số nguyên lớn hơn 0!");
            } else {
                double tong = 1;
                for (int i = 1; i <= n; i++) {
                    tong += 1.0/ i; 
                }
                
                System.out.printf("Tổng S = 1 + 1/2 + ... + 1/%d là: %.6f\n", n, tong);
            }
        } else {
            System.out.println("Đầu vào không hợp lệ!");
        }
        
        scanner.close();
    }
}