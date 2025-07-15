package com.juaracoding;

import java.util.Scanner;

public class AplikasiFilmBioskop {

    // logic untuk membuat scanner agar bisa diinputkan melalui keyboard
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean berhasilLogin = false;

         // buat logic perulangan login hingga berhasil
         while (!berhasilLogin) { // ada operator not
            berhasilLogin = login(input); // method login
        }

        // Setelah login berhasil, lanjut ke menu utama
        tampilkanMenuUtama(input);

        input.close(); // tutup scanner setelah selesai
    }
    

    // metod untuk login()
    public static boolean login (Scanner input){
        System.out.println("-----Silahkan Login----");
        System.out.println("Username");
        String userName = input.nextLine();
        System.out.println("Passoword");
        String password = input.nextLine();

        // validasi ketika user melakukan login
        if (userName.equals("admin") && password.equals("12345")) {
            System.out.println("Berhasil login!\n");
            return true;
        } else {
            System.out.println("Username atau Password anda salah, Silahkan coba lagi.\n");
            return false;
        }    

    }

    // metod untuk menuFilm()
    public static void tampilkanMenuUtama(Scanner input) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("--- Menu Utama ---");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            input.nextLine(); // menghindari masalah newline

            switch (pilihan) {
                case 1:
                    tampilkanFilm(); // Menampilkan semua film
                    break;
                case 2:
                    inputFilm(input); // Input data film ke array
                    break;
                case 3:
                    cariFilm(input); // Cari film berdasarkan judul
                    break;
                case 4:
                    isRunning = false; // keluar dari loop
                    System.out.println("Terima kasih telah meengunjungi aplikasi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

     // buat dulu metod static untuk membuat aturan maksimal 10 jumlah film yang disimpan
     public static final int maxFilm = 10;
    
    // sebelum metod inputFilm dibuat dulu deklar array filmnya 
    public static String[] judulFilm = new String[maxFilm];
    public static String[] genreFilm = new String[maxFilm];
    public static int[] durasiFilm = new int[maxFilm];
    public static double[] ratingFilm = new double[maxFilm];
    public static int jumlahFilm = 0; // penghitung jumlah film yang sudah diinput

   
    // metod inputFilm()
    public static void inputFilm(Scanner input) {
        System.out.print("Masukkan jumlah film yang ingin ditambahkan: ");
        int jumlah = input.nextInt();
        input.nextLine(); // buang newline

        // Validasi apakah melebihi kapasitas array
        if (jumlahFilm + jumlah > maxFilm) {
            System.out.println("Jumlah film melebihi kapasitas maksimal (" + maxFilm + ").\n");
            return;
        }

        // Perulangan untuk input film
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Film ke-" + (jumlahFilm + 1));
            System.out.print("Judul: ");
            judulFilm[jumlahFilm] = input.nextLine();
            System.out.print("Genre: ");
            genreFilm[jumlahFilm] = input.nextLine();
            System.out.print("Durasi (menit): ");
            durasiFilm[jumlahFilm] = input.nextInt();
            System.out.print("Rating (1-10): ");
            ratingFilm[jumlahFilm] = input.nextDouble();
            input.nextLine(); // newline
            jumlahFilm++;
            System.out.println("Berhasil disimpan");
        }
    }

    
    // metod tampilkanFilm()
    public static void tampilkanFilm() {
        System.out.println("=== Daftar Film ===");
        if (jumlahFilm == 0) {
            System.out.println("Belum ada film yang ditambahkan.\n");
            return;
        }

        // Perulangan menampilkan seluruh isi array film
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.println("Film ke-" + (i + 1));
            System.out.println("Judul : " + judulFilm[i]);
            System.out.println("Genre : " + genreFilm[i]);
            System.out.println("Durasi: " + durasiFilm[i] + " menit");
            System.out.println("Rating: " + ratingFilm[i] + "/10");
            System.out.println();
        }
    }

    // metod untuk cariFilm()
    public static void cariFilm(Scanner input) {
        System.out.print("Masukkan judul film yang dicari: ");
        String keyword = input.nextLine().toLowerCase();
        boolean ditemukan = false;

        // Perulangan untuk mencari film sesuai dengan kunci judul filmnya, maka akan ditampilkan
        for (int i = 0; i < jumlahFilm; i++) {
            if (judulFilm[i].toLowerCase().contains(keyword)) { // pilih contains krna kl equals, mesti percis judul
                System.out.println("Film ditemukan:");
                System.out.println("Judul : " + judulFilm[i]);
                System.out.println("Genre : " + genreFilm[i]);
                System.out.println("Durasi: " + durasiFilm[i] + " menit");
                System.out.println("Rating: " + ratingFilm[i] + "/10");
                System.out.println();
                ditemukan = true;
            }else{ // jika tidak akan menampilkan pesan dibawah ini
                System.out.println("Film dengan judul tersebut tidak ditemukan.\n");

            }
        }
    }

}
