package com.pbo;

/**
 *
 * # Author
 * Nama : Agung Sepruloh
 * Kelas : PBO11K
 * NIM : 10118902
 * Deskripsi Program : Program ini berisi cara formatting nilai
 *
 */

public class PBO11K10118902Latihan11Formatting {

    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -1;
        System.out.printf("i: " + i);
        System.out.printf("%%d: %d%n", i);
        System.out.printf("%%10d: %10d%n", i);
        System.out.printf("%%+10d: %+10d%n", i);
        System.out.printf("%%+10d: %+10d%n", iMinus);
        System.out.printf("%%,10d: %,10d%n", i);
        System.out.printf("%%-10d: %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f: " + f);
        System.out.printf("%%f: %f%n", f);
        System.out.printf("%%.2f: %.2f%n", f);
        System.out.printf("%%12.2f: %12.2f%n", f);
        System.out.printf("%%,12.2f: %,12.2f%n", f);
    }
}
