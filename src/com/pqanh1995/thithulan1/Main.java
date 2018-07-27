package com.pqanh1995.thithulan1;

import com.pqanh1995.thithulan1.bai1.ChuyenXeManager;
import com.pqanh1995.thithulan1.bai1.ChuyenXeNoiThanh;
import com.pqanh1995.thithulan1.bai2.ListSach;
import com.pqanh1995.thithulan1.bai2.SachGiaoKhoa;
import com.pqanh1995.thithulan1.bai2.SachThamKhao;

public class Main {
    public static void main(String[] args) {
//        ChuyenXeNoiThanh chuyenXeNoiThanh1 = new ChuyenXeNoiThanh(1,"Phạm Quang Anh","36-B1 47127",1200000,10,50000);
//        ChuyenXeManager chuyenXeManager = new ChuyenXeManager();
//        chuyenXeManager.themXeNoiThanh(chuyenXeNoiThanh1);
//        chuyenXeManager.inThongTinXeNoiThanh();
//        chuyenXeManager.inThongTinXeNgoaiThanh();

        SachThamKhao sachThamKhao1 = new SachThamKhao("STK001", "23/04/2018", 20000, 10, "Kim Đồng", 20000);
        SachThamKhao sachThamKhao2 = new SachThamKhao("STK002", "23/04/2018", 25000, 5, "Hồng Sơn", 20000);
        SachGiaoKhoa sachGiaoKhoa1 = new SachGiaoKhoa("SGK001", "23/04/2018", 45000, 10, "Hồng Bàng", "Mới");
        SachGiaoKhoa sachGiaoKhoa2 = new SachGiaoKhoa("SGK002", "23/04/2018", 50000, 6, "Đại Kim", "Cũ");
        ListSach listSach = new ListSach();
        listSach.themSachGiaoKhoa(sachGiaoKhoa1);
        listSach.themSachGiaoKhoa(sachGiaoKhoa2);
        listSach.themSachThamKhao(sachThamKhao1);
        listSach.themSachThamKhao(sachThamKhao2);
        listSach.tinhTongThanhTien();
        listSach.tinhTrungBinhCongDonGia();
    }
}
