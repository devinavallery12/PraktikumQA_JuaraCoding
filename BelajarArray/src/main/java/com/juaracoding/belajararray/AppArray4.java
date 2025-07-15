package com.juaracoding.belajararray;

public class AppArray4 {
    public static void main(String[] args) {
        // looping yg ada penjelasan break & continue

        // buat kontrakan DAN ISIKAN
        int kontrakan[] = {4, 2, 2, 7, 0, 0, 1, 3};
        // inisiasi hargaperorang kontrakan
        int hargaPerOrang = 300000;

        //isi kontrakan
    //    kontrakan[0] = 4; 
    //    kontrakan[1] = 2;
    //    kontrakan[2] = 2;
    //    kontrakan[3] = 7;
    //    kontrakan[4] = 2;
    //    kontrakan[5] = 6;
    //   kontrakan[6] = 1;
    //    kontrakan[7] = 3;

        int pendapatanTotal = 0;
        for(int index = 0; index < kontrakan.length; index++){
            if (kontrakan[index] == 0) {
                continue; // 5.700.000ngeskip nilai yg kosong tp masih bisa proses nilai yg ada dibawah nilai kosong
            //      break; // 4.500.000 & 5100.000 berhenti memproses
            // ini pemisalan penggunaan break & continue
            }

            if (kontrakan[index] % 4 == 0) {
                kontrakan[index] = kontrakan[index] + 2;
                // ini pemisalan di kontrakan index ke berapa, dibagi 4 sisa bagi = 0 maka ditambahkan 2
                // maka kontrakan[index] update saat ini = kontrakan[index] yg hasil bagi 0 ditambah 2
            }
            pendapatanTotal += kontrakan[index] * hargaPerOrang;
          //  System.out.println(kontrakan[index] * hargaPerOrang);
        }
        System.out.println("pendapatanTotal per bulan = " +pendapatanTotal);

    }
}
