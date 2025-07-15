package com.juaracoding.belajararray;

/**
 * Hello world!
 *
 */
public class AppArray1
{
    public static void main( String[] args )
    {
        // buat kontrakan Array yang coba pertama, cara ini yg struktur nya lebih panjang, nilai dimensi dimasukkan banyak ke array
        int kontrakan[] = new int[8]; // [8] itu menandakan ukuran array terhitung dari 0 yaitu 1

        //isi kontrakan
        kontrakan[0] = 4;
        kontrakan[1] = 2;
        kontrakan[2] = 2;
        kontrakan[3] = 7;
        kontrakan[4] = 2;
        kontrakan[5] = 6;
        kontrakan[6] = 1;
        kontrakan[7] = 3;

        System.out.println(kontrakan[0]);
        System.out.println(kontrakan[1]);
        System.out.println(kontrakan[2]);
        System.out.println(kontrakan[3]);
        System.out.println(kontrakan[4]);
        System.out.println(kontrakan[5]);
        System.out.println(kontrakan[6]);
        System.out.println(kontrakan[7]);

        //System.out.println(kontrakan[8]); // arrayindexoutofboundsException error krna panggil yg lebih dari ada array

    }
}
