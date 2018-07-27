package com.pqanh1995.thithulan1.bai1;

import java.util.ArrayList;

public class ChuyenXeManager {
    ArrayList<ChuyenXeNoiThanh> listChuyenXeNoiThanh;
    ArrayList<ChuyenXeNgoaiThanh> listChuyenXeNgoaiThanh;

    public ChuyenXeManager() {
        listChuyenXeNoiThanh = new ArrayList<>();
        listChuyenXeNgoaiThanh = new ArrayList<>();
    }

    public boolean themXeNoiThanh(ChuyenXeNoiThanh chuyenXeNoiThanh) {
        for (int i = 0; i < listChuyenXeNoiThanh.size(); i++) {
            if (chuyenXeNoiThanh.getMaSoChuyen() == listChuyenXeNoiThanh.get(i).getMaSoChuyen()) {
                return false;
            }
        }
        listChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        return true;
    }

    public boolean themXeNgoaiThanh(ChuyenXeNgoaiThanh chuyenXeNgoaiThanh) {
        for (int i = 0; i < listChuyenXeNgoaiThanh.size(); i++) {
            if (chuyenXeNgoaiThanh.getMaSoChuyen() == listChuyenXeNgoaiThanh.get(i).getMaSoChuyen()) {
                return false;
            }
        }
        listChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        return true;
    }

    public void inThongTinXeNoiThanh() {
        if (listChuyenXeNoiThanh.size() == 0) {
            System.out.println("Chưa có xe nội thành nào!");
            return;
        }
        System.out.println("Xe nội thành: ");
        for (int i = 0; i < listChuyenXeNoiThanh.size(); i++) {
            System.out.println(listChuyenXeNoiThanh.get(i).toString());
        }
    }

    public void inThongTinXeNgoaiThanh() {
        if (listChuyenXeNgoaiThanh.size() == 0) {
            System.out.println("Chưa có xe ngoại thành nào!");
            return;
        }
        System.out.println("Xe ngoại thành: ");
        for (int i = 0; i < listChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(listChuyenXeNgoaiThanh.get(i).toString());
        }
    }
}
