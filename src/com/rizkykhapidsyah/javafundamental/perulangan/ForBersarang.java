package com.rizkykhapidsyah.javafundamental.perulangan;

public class ForBersarang {
    public static void main(String[] args) {
        int A = 9, i, j;

        for (i = 0; i <= A; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
