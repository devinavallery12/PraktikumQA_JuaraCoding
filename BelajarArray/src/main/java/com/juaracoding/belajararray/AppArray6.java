package com.juaracoding.belajararray;

public class AppArray6 {
    public static void main(String[] args) {
        int[][] warZone = {
            // c0 c1 c2
            { 1, 2, 3 }, // r0
            { 4, 5, 6 }, // r1
            { 7, 8, 9 }, // r2
    };
        // cetak array tanpa pakai for
        System.out.println(warZone[1][0]);
        System.out.println(warZone[2][2]);

    // ini untuk cetak array multidimensi dengan 2 perulangan (for) apalagi ditambahkan didalam nya logic baru
    // disini logic nya
    for (int row = 0; row < warZone.length; row++) {
    // disini perulangan untuk cetak barisnya. 
        for (int col = 0; col < warZone[row].length; col++) {
    // disini untuk cetak nilai array pada setiap baris
    // sampai sini logic untuk menghasil kan angka 0 (hitung)
        if (warZone[row][col] % 3 == 0) {
            warZone[row][col] = 0;
        }
        //System.out.println(warZone[row][col]);
        }
    }

    // cetak dengan menggunakan for sederhana
    // disini untuk baca cetak ke console nya (print)
    for (int[] row : warZone) {
    // disini kenapa int[] a.k.a integer index krna dia copot nya perbaris array dimasukin ke variabel row 
    // alasannya juga krna cetak array (sdh multi-dimensi) bukan single nilai makanya int[] 
        for (int col : row) {
    // setiap row yg dikeluarin nilai nya single dimasuk ke dalam col, satu2 dikeluarin        
            System.out.println(col);
        }
    }
    }
}
