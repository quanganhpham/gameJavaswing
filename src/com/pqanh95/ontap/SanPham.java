package com.pqanh95.ontap;

public class SanPham {
    private String tenSanPham;
    private int soLuongBan;
    private int giaBan;

    public SanPham() {
    }

    public SanPham(String tenSanPham, int soLuongBan, int giaBan) {
        this.tenSanPham = tenSanPham;
        this.soLuongBan = soLuongBan;
        this.giaBan = giaBan;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}
