package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku b1 = new NonFiksi("Bunga Maaf", "The Lantis", "Pop");
        Buku b2 = new Fiksi("Masih Ada Kamu", "Wijaya 80", "HipHop");

        b1.displayInfo();
        b2.displayInfo();

        System.out.println();

        Anggota a1 = new Anggota("Muhammad Savero", "C239");
        Anggota a2 = new Anggota("Muhammad Fasha", "A238");

        a1.displayInfo();
        a2.displayInfo();

        System.out.println();

        a1.pinjamBuku("Bunga Maaf", 9);
        a2.pinjamBuku("Masih Ada Kamu", 11);

        System.out.println();

        a1.kembalikanBuku("Bunga Maaf");
        a2.kembalikanBuku("Masih Ada kamu");
    }
}
