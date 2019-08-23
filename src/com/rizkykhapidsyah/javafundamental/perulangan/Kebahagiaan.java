package com.rizkykhapidsyah.javafundamental.perulangan;

import java.util.Scanner;

public class Kebahagiaan {
    public static void main(String[] args) {
        boolean Bahagia;
        byte Cinta = 0;
        byte Setia = 0;

        Scanner BenarkahSetia = new Scanner(System.in);
        Scanner BenarkahBahagia = new Scanner(System.in);

        System.out.print("Apakah Kamu Setia? (1 = Ya, 0 = Tidak) : ");
        Setia = BenarkahSetia.nextByte();
        System.out.print("Apakah kamu Bahagia? (true = Ya, false = Tidak) ");
        Bahagia = BenarkahBahagia.nextBoolean();

        if (Setia == 1) {
            for (Cinta = 1; Cinta != 2; Cinta++) {
                Kamu.Dinikahin();
                Kamu.Dibahagiain();
                Kamu.Dimanjain();

                if (Bahagia = true) {
                    while (Cinta <= 1) {
                        Kita.Berjuang();
                        Cinta++;
                        break;
                    }
                } else {
                    Kita.MemperbaikiDiri();
                }
            }
        } else {
            switch (Cinta) {
                case 0:
                    System.out.println("Masih terlalu dini..");
                    break;
                case 2:
                    System.out.println("Kurang Ajar,wkwkw");
                    break;
            }
        }
    }
}
