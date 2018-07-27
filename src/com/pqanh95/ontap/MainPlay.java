package com.pqanh95.ontap;

import java.util.ArrayList;

public class MainPlay {
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham("BimBim",15,25000);
        SanPham sanPham2 = new SanPham("Poca",15,17000);
        SanPham sanPham3 = new SanPham("Coca",15,15000);
        SanPham sanPham4 = new SanPham("Pepsi",15,20000);
        SanPhamManager sanPhamManager = new SanPhamManager();
        sanPhamManager.themSanPham(sanPham1);
        sanPhamManager.themSanPham(sanPham2);
        sanPhamManager.themSanPham(sanPham3);
        sanPhamManager.themSanPham(sanPham4);
        sanPhamManager.inThongTin();
    }
}
