package com.pqanh1995.thithulan1.bai1;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, int doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    @Override
    public String toString() {
        return "\tMã số chuyến: "+maSoChuyen+"\n\tHọ tên tài xế: "+hoTenTaiXe+"\n\tSố xe: "+soXe+"\n\tNơi đến: "+noiDen+"\n\tSố ngày đi được: "+soNgayDiDuoc+"\n\tDoanh thu: "+doanhThu;
    }
}
