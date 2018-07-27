package com.pqanh95.ontap;

import java.util.ArrayList;

public class SanPhamManager {
    private ArrayList<SanPham> listSanPham;

    public SanPhamManager() {
        listSanPham = new ArrayList<>();
    }

    public boolean themSanPham(SanPham sanPham) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if(sanPham.getTenSanPham().equals(listSanPham.get(i).getTenSanPham())){
                return false;
            }
        }
        listSanPham.add(sanPham);
        return true;
}


    public void inThongTin() {
        for (int i = 0; i < listSanPham.size(); i++) {
            System.out.println("Sản phẩm "+(i+1));
            System.out.println("\tTên sản phẩm: "+listSanPham.get(i).getTenSanPham());
            System.out.println("\tSố lượng sản phẩm: "+listSanPham.get(i).getSoLuongBan());
            System.out.println("\tGiá sản phẩm: "+listSanPham.get(i).getGiaBan());
            System.out.println();
        }
    }

    public int soTien() {

        return 0;
    }
}
