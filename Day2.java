
package com.mycompany.day2.java;
public class Day2Java {
    public static void main(String[] args) {
        // bagian print()
        System.out.print("Hari ke-2 ");   // nulis teks ki tapi nd pindah baris
        System.out.print("belajar ");     // lanjut nempel di belakang teks sebelumnya
        System.out.print("Java\n\n");     // setelah "Java" langsung turun 2 baris kosong

        // bagian println()
        System.out.println("Perbedaan output:");  // println itu mirip print, bedanya to setiap kali nulis otomatis pindah ke baris baru
        System.out.println("- print -> hasilnya nyambung di baris yang sama");
        System.out.println("- println -> tiap teks baru pasti turun ke baris berikutnya");
        System.out.println("- printf -> bisa ngatur format teks atau angka");

        // bagian printf()
        String nama = "sarifuddin";   // nyimpen teks (string)
        String panggilan = "ade/dede"; // sama ji ini bagian nama
        int umur = 19;                // nyimpen angka bulat
        double tinggi = 164.9;        // nyimpen angka desimal

        // printf dipakai kalau mau nulis teks sekaligus format variabel
        System.out.printf("%-10s : %s\n", "Nama",nama);      // %s artinya string (teks)
        System.out.printf("%-10s : %s\n","Panggilan", panggilan); 
        // alasan ku pake "%-10s supaya rapi di bagian nama sama panggilan bisa ji %d cumn panggilan to kepajangan sekali maknya ku pake kan 10 biar ada ruang
        System.out.printf("Umur   : %d tahun\n", umur);  // %d artinya angka bulat
        System.out.printf("Tinggi : %.1f cm\n", tinggi); // %.1f artinya angka desimal dengan 1 angka di belakang koma
    }

}
  
