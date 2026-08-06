import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCBGV {

    private ArrayList<CBGV> dsCBGV;

    public QuanLyCBGV() {
        dsCBGV = new ArrayList<>();
    }

    public void themCBGV(Scanner sc) {
        String tiepTuc = "";
        do {
            System.out.println("\n--- NHAP THONG TIN GIAO VIEN MOI ---");
            CBGV cbgv = new CBGV();
            cbgv.nhap(sc);
            dsCBGV.add(cbgv);
            System.out.println(">> Them giao vien thanh cong!");

            System.out.print("\nBan co muon them giao vien nua khong? (Y/N): ");
            tiepTuc = sc.nextLine().trim();
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }

    public void xoaCBGV(Scanner sc) {
        if (dsCBGV.isEmpty()) {
            System.out.println(">> Danh sach CBGV dang rong!");
            return;
        }

        System.out.print("Nhap ma giao vien can xoa: ");
        String maGV = sc.nextLine().trim();

        boolean timThay = false;
        for (int i = 0; i < dsCBGV.size(); i++) {
            if (dsCBGV.get(i).getMaGV().equalsIgnoreCase(maGV)) {
                dsCBGV.remove(i);
                timThay = true;
                System.out.println(">> Da xoa giao vien co ma: " + maGV);
                break;
            }
        }

        if (!timThay) {
            System.out.println(">> Khong tim thay giao vien co ma: " + maGV);
        }
    }

    public void hienThiDanhSach() {
        if (dsCBGV.isEmpty()) {
            System.out.println(">> Danh sach CBGV dang rong!");
            return;
        }

        System.out.println("\n========== DANH SACH CAN BO GIAO VIEN ==========");
        for (int i = 0; i < dsCBGV.size(); i++) {
            System.out.println("\n[CBGV " + (i + 1) + "]");
            dsCBGV.get(i).xuat();
        }
        System.out.println("================================================");
    }

    public void timKiemTheoMa(Scanner sc) {
        if (dsCBGV.isEmpty()) {
            System.out.println(">> Danh sach CBGV dang rong!");
            return;
        }

        System.out.print("Nhap ma giao vien can tim: ");
        String maGV = sc.nextLine().trim();

        boolean timThay = false;
        for (CBGV cbgv : dsCBGV) {
            if (cbgv.getMaGV().equalsIgnoreCase(maGV)) {
                System.out.println("\n>> THONG TIN GIAO VIEN TIM THAY:");
                cbgv.xuat();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println(">> Khong tim thay giao vien co ma: " + maGV);
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;

        do {
            System.out.println("\n+----------------- MENU QUAN LY CBGV -----------------+");
            System.out.println("| 1. Them moi CBGV                                    |");
            System.out.println("| 2. Xoa CBGV theo ma giao vien                       |");
            System.out.println("| 3. Hien thi danh sach CBGV                          |");
            System.out.println("| 4. Tim kiem CBGV theo ma                            |");
            System.out.println("| 0. Thoat                                            |");
            System.out.println("+-----------------------------------------------------+");
            System.out.print("Chon chuc nang (0-4): ");

            try {
                chon = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            switch (chon) {
                case 1:
                    themCBGV(sc);
                    break;
                case 2:
                    xoaCBGV(sc);
                    break;
                case 3:
                    hienThiDanhSach();
                    break;
                case 4:
                    timKiemTheoMa(sc);
                    break;
                case 0:
                    System.out.println(">> Da thoat chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println(">> Luachon khong hop le! Vui long chon tu 0 den 4.");
            }
        } while (chon != 0);
    }
}
