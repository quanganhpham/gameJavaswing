package com.pqanh1995.thithulan1.bai1;

public class StringUtil {
    private String value;

    public StringUtil() {
    }

    public StringUtil(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void printUpperCaseCharacters() {
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch);
                if (i != value.length() - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public void findSmallestNumber() {
        int max = -1;
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isDigit(ch)) {
                if (max == -1) {
                    max = ch - 48;
                }
                if (max > (ch-48)){
                    max = ch - 48;
                }
            }
        }
        System.out.println("Gia tri so nho nhat: "+max);
    }
}
