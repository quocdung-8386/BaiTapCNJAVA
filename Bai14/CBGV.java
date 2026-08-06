import java.util.Scanner;

public class CBGV extends Nguoi {

    private double luongCung;
    private double luongThuong;
    private double tienPhat;

    public CBGV() {
    }

    public CBGV(String hoTen, int tuoi, String queQuan, double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public CBGV(String hoTen, int tuoi, String queQuan, String maGV, double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, maGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap luong cung: ");
        while (true) {
            try {
                luongCung = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Luong cung phai la so. Nhap lai: ");
            }
        }

        System.out.print("Nhap luong thuong: ");
        while (true) {
            try {
                luongThuong = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Luong thuong phai la so. Nhap lai: ");
            }
        }

        System.out.print("Nhap tien phat: ");
        while (true) {
            try {
                tienPhat = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Tien phat phai la so. Nhap lai: ");
            }
        }
    }

    public double tinhLuong() {
        return luongCung + luongThuong - tienPhat;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong cung: " + luongCung);
        System.out.println("Luong thuong: " + luongThuong);
        System.out.println("Tien phat: " + tienPhat);
        System.out.printf("Luong thuc linh: %.2f\n", tinhLuong());
    }
}