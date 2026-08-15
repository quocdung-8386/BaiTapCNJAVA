/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quoc Dung
 */
public class SinhVien {
    String maSV;
    String tenSV;
    Double diem;
    public SinhVien(){
    }
    
        public SinhVien(String maSV, String tenSV, Double diem){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem= diem;
    }
    public String getMaSV(){
        return  maSV;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }
    public String getTenSV(){
        return  tenSV;
    }
    public void setTenSV(String tenSV){
        this.tenSV = tenSV;
    }
    public Double getdiem(){
        return diem;
    }
    public void setdiem(Double diem){
        this.diem= diem;
    }
}
