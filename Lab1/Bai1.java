
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 2; i <= n; i += 2) {
            tong += i;
        }

        System.out.println("tong cac so chan = " + tong);

        sc.close();
    }
}
