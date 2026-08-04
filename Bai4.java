
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a = ");
        double a = sc.nextDouble();

        System.out.print("Nhap b = ");
        double b = sc.nextDouble();

        System.out.print("Nhap c = ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if ((a == b && a * a + b * b == c * c)
                    || (a == c && a * a + c * c == b * b)
                    || (b == c && b * b + c * c == a * a)) {
                System.out.println("Tam giac vuong can");
            } else if (a * a + b * b == c * c
                    || a * a + c * c == b * b
                    || b * b + c * c == a * a) {
                System.out.println("Tam giac vuong");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giac can");
            } else {
                System.out.println("Tam giac thuong");
            }

        } else {
            System.out.println("Khong phai tam giac");
        }

        sc.close();
    }
}
