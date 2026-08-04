import java.util.Scanner;

public class Bai3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so nguyen duong n:");
    int n = sc.nextInt();
    sc.close();
    boolean isPrime = true;
    if(n <= 1)
        isPrime = false;
    else{
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
    }
    if(isPrime)
        System.out.println(n + " la so nguyen to");
    else
        System.out.println(n + " khong phai la so nguyen to");
}}