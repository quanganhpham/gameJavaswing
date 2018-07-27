package com.pqanh1995.thithulan1.bai2;

import java.util.ArrayList;

public class ListSach {
    ArrayList<SachGiaoKhoa> listSachGiaoKhoa;
    ArrayList<SachThamKhao> listSachThamKhao;

    public ListSach() {
        listSachGiaoKhoa = new ArrayList<>();
        listSachThamKhao = new ArrayList<>();
    }

    public boolean themSachGiaoKhoa(SachGiaoKhoa sachGiaoKhoa) {
        for (int i = 0; i < listSachGiaoKhoa.size(); i++) {
            if (sachGiaoKhoa.getMaSach() == listSachGiaoKhoa.get(i).getMaSach()) {
                return false;
            }
        }
        listSachGiaoKhoa.add(sachGiaoKhoa);
        return true;
    }

    public boolean themSachThamKhao(SachThamKhao sachThamKhao) {
        for (int i = 0; i < listSachThamKhao.size(); i++) {
            if (sachThamKhao.getMaSach() == listSachThamKhao.get(i).getMaSach()) {
                return false;
            }
        }
        listSachThamKhao.add(sachThamKhao);
        return true;
    }

    public void tinhTongThanhTien() {
        int tongTienSachGiaoKhoa = 0;
        // tính tổng thành tiền cả 2 loại sách
        for (int i = 0; i < listSachGiaoKhoa.size(); i++) {
            if (listSachGiaoKhoa.get(i).getTinhTrang().equals("Mới")) {
                tongTienSachGiaoKhoa += listSachGiaoKhoa.get(i).getDonGia() * listSachGiaoKhoa.get(i).getSoLuong();
            } else {
                tongTienSachGiaoKhoa += listSachGiaoKhoa.get(i).getDonGia() * listSachGiaoKhoa.get(i).getSoLuong() / 2;
            }
        }
        System.out.println("Tổng số tiền sách giáo khoa: " + tongTienSachGiaoKhoa);
        int tongTienSachThamKhao = 0;
        // tính tổng thành tiền cả 2 loại sách
        for (int i = 0; i < listSachThamKhao.size(); i++) {
            tongTienSachThamKhao += listSachThamKhao.get(i).getDonGia() * listSachThamKhao.get(i).getSoLuong() + listSachThamKhao.get(i).getThue();
        }
        System.out.println("Tổng số tiền sách giáo khoa: " + tongTienSachThamKhao);
    }

    public double tinhTrungBinhCongDonGia() {
        // Tính trung bình cộng đơn giá của các sách tham khảo
        int tongTien = 0;
        for (int i = 0; i < listSachThamKhao.size(); i++) {
            tongTien += listSachGiaoKhoa.get(i).getDonGia();
        }
        return tongTien / listSachThamKhao.size();
    }
}
