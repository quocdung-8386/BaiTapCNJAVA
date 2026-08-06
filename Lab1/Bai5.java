
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Day Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
