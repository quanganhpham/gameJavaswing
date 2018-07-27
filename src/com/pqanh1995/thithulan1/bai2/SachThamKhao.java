package com.pqanh1995.thithulan1.bai2;

public class SachThamKhao extends Sach {
    private int thue;

    public SachThamKhao(String maSach, String ngayNhap, int donGia, int soLuong, String nhaXuatBan, int thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "";
    }
}
