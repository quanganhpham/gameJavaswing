package com.zend_ungdungatm;

public class ApplicationATM {
    // mệnh đề đồng tiền
    private final int DONG500NGHIN = 500000;
    private final int DONG200NGHIN = 200000;
    private final int DONG100NGHIN = 100000;
    private final int DONG50NGHIN = 50000;

    // số lượng đồng tiền
    private int soluongdong500nghin = 0;
    private int soluongdong200nghin = 0;
    private int soluongdong100nghin = 0;
    private int soluongdong50nghin = 0;


    private int soTien;

    public ApplicationATM(int soTien) {
        if (soTien < 50000 || (soTien % 50000 != 0)) {
            System.out.println("Số tiền rút cần là bội của 50.000 VNĐ");
            return;
        } else {
            this.soTien = soTien;
        }
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public void rutTien() {
        if (soTien >= 500000) {
            soluongdong500nghin = soTien / 500000;
            soTien = soTien % 500000;
            System.out.println("Số lượng đồng 500.000 VNĐ: " + soluongdong500nghin);
            if (soTien >= 200000) {
                soluongdong200nghin = soTien / 200000;
                soTien = soTien % 200000;
                System.out.println("Số lượng đồng 200.000 VNĐ: " + soluongdong200nghin);
                if (soTien >= 100000) {
                    soluongdong100nghin = soTien / 100000;
                    soTien = soTien % 100000;
                    System.out.println("Số lượng đồng 100.000 VNĐ: " + soluongdong100nghin);
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                } else {
                    // số tiền còn lại nhỏ hơn 50.000
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                }
            } else {
                // số tiền còn lại nhỏ hơn 200.000
                if (soTien >= 100000) {
                    soluongdong100nghin = soTien / 100000;
                    soTien = soTien % 100000;
                    System.out.println("Số lượng đồng 100.000 VNĐ: " + soluongdong100nghin);
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                } else {
                    // số tiền còn lại nhỏ hơn 50.000
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                }
            }
        } else {
            // số tiền nhỏ hơn 500.000
            if (soTien >= 200000) {
                soluongdong200nghin = soTien / 200000;
                soTien = soTien % 200000;
                System.out.println("Số lượng đồng 200.000 VNĐ: " + soluongdong200nghin);
                if (soTien >= 100000) {
                    soluongdong100nghin = soTien / 100000;
                    soTien = soTien % 100000;
                    System.out.println("Số lượng đồng 100.000 VNĐ: " + soluongdong100nghin);
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                } else {
                    // số tiền còn lại nhỏ hơn 50.000
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                }
            } else {
                // số tiền còn lại nhỏ hơn 200.000
                if (soTien >= 100000) {
                    soluongdong100nghin = soTien / 100000;
                    soTien = soTien % 100000;
                    System.out.println("Số lượng đồng 100.000 VNĐ: " + soluongdong100nghin);
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                } else {
                    // số tiền còn lại nhỏ hơn 50.000
                    if (soTien >= 50000) {
                        soluongdong50nghin = soTien / 50000;
                        //soTien = soTien % 50000;
                        System.out.println("Số lượng đồng 50.000 VNĐ: " + soluongdong50nghin);
                    }
                }
            }
        }
    }
}
