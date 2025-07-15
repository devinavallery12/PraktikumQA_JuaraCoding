package com.juaracoding.belajararray;

public class AppArray3 {
    
    public static void main(String[] args) {
        // array looping
        int kontrakan[] = {4, 2, 2, 7, 2, 6, 1, 3};
        int hargaPerOrang = 300000; // perorang

        kontrakan[0] = 4; 
        kontrakan[1] = 2;
        kontrakan[2] = 2;
        kontrakan[3] = 7;
        kontrakan[4] = 2;
        kontrakan[5] = 6;
        kontrakan[6] = 1;
        kontrakan[7] = 3;

        // [] >> dinamakan index
        // index[] >> menunjukan posisi ke berapa di index, index[0], index[1] dst
        // kontrakan[index] >> panggil nilai dari index keberapa yg dipanggil misal yg dipanggil index[0] maka kontrakan[index] = 4

        for(int index = 0; index < kontrakan.length; index++){
         
            // int index >> penamaan buat si index [] ini. bisa penamaan i,j dst
            // index dimulai dari 0
            // index ga boleh kurang dari kontrakan.length nya
            // kontrakan lenghtnya ada 8, kl true maka akan cetak
           // System.out.println(kontrakan[index] * hargaPerOrang);
           System.out.println("kontrakan ke " +index+ " ,bulanan/orang = " +kontrakan[index] * hargaPerOrang + "/" +kontrakan[index]);

        }
    }
}
