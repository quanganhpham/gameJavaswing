package com.pqanh1995.thithulan1.bai1;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKmDiDuoc;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, int doanhThu, int soTuyen, int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public String toString() {
        return "\tMã số chuyến: "+maSoChuyen+"\n\tHọ tên tài xế: "+hoTenTaiXe+"\n\tSố xe: "+soXe+"\n\tSố tuyến: "+soTuyen+"\n\tSố km đi được: "+soKmDiDuoc+"\n\tDoanh thu: "+doanhThu;
    }
}
