package com.zend_mang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Mang {
    private int[][] mang;
    private File file;

    public Mang() {
    }

    public void nhap(String pathName) {
        file = new File(pathName);
        try {
            FileInputStream fis = new FileInputStream(file);
            int lengMang = fis.read();
            mang = new int[lengMang - 48][lengMang - 48];
            System.out.println(lengMang - 48);
            int c1;
            int soHang = 0;
            int cot = 0;
            int hang = 0;
            while ((c1 = fis.read()) != -1) {
                if (c1 != 97) { // Ngăn cách dữ liệu
                    soHang = soHang * 10 + (c1 - 48);
                } else {
                    c1 = soHang;
                    soHang = 0;
                    if (c1 != 0) {
                        if (cot < 3) {
                            mang[hang][cot] = c1;
                            cot ++;
                        } else { // trường hợp cot =3
                            cot = 0;
                            hang ++;
                            mang[hang][cot] = c1;
                            cot++;
                        }
                    }
                }
            }
            fis.close(); // đóng luồng
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inMang() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mang[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void tongCheo() {
        int tong = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==i){
                    tong += mang[i][j];
                }

            }

        }
        System.out.println("Tổng chéo: "+tong);
    }
}
