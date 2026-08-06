import java.util.Scanner;

public class Nguoi {
    private static int nextId = 1;

    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maGV;

    public Nguoi() {
        this.maGV = String.format("GV%02d", nextId++);
    }

    public Nguoi(String hoTen, int tuoi, String queQuan) {
        this.maGV = String.format("GV%02d", nextId++);
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public Nguoi(String hoTen, int tuoi, String queQuan, String maGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void nhap(Scanner sc) {
        System.out.println("Ma giao vien (tu dong): " + maGV);

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        while (true) {
            try {
                tuoi = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Tuoi phai la so nguyen. Nhap lai: ");
            }
        }

        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma GV: " + maGV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + queQuan);
    }
}