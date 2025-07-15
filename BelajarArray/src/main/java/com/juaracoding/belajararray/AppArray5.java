package com.juaracoding.belajararray;

public class AppArray5 {
    public static void main(String[] args) {
         // looping yg dibuat lebih simple lagi tapi logic nya belum ketemu

        // buat kontrakan DAN ISIKAN
        int kontrakan[] = {4, 2, 2, 7, 0, 0, 1, 3};
        // inisiasi hargaperorang kontrakan
        int hargaPerOrang = 300000;
        int pendapatanTotal = 0;
        int index = 0;

        for (int tampung : kontrakan) {

            if (tampung == 0) {
                continue;
            } else {
                index++;
            }

            if (tampung % 4 == 0) {
                kontrakan[index] = kontrakan[index] + 2;
            }

            pendapatanTotal += tampung * hargaPerOrang;

        }

        System.out.println("Pendapatan per bulan " + pendapatanTotal);

    }
}
