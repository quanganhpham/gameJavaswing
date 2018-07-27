package com.zend_ungdungatm;

public class Main {
    public static void main(String[] args) {
        // input : số tiền v.d: 350.000 VNĐ
        // output: mệnh giá đồng tiền + số lượng sao cho tổng = input
        /*
        * v.d: 1 100.000 VNĐ
        *      1 200.000 VNĐ
        *      1  50.000 VNĐ
        *      */
        ApplicationATM applicationATM = new ApplicationATM(9450000);
        applicationATM.rutTien();
    }
}
