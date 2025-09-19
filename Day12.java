
package com.mycompany.day12.java;

import java.util.Scanner;

public class Day2Java {
    public static void main(String[] args) {
        // Input data dari user
        try (Scanner sc = new Scanner(System.in)) {
            // Input data dari user
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            
            System.out.print("Masukkan umur: ");
            int umur = sc.nextInt();
            
            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi = sc.nextDouble();
            
            sc.nextLine(); // buang newline biar bisa input string berikutnya
            
            System.out.print("Masukkan alamat: ");
            String alamat = sc.nextLine();
            
            // Output biodata
            System.out.println("\n=== Biodata Sederhana ===");
            System.out.printf("Nama   : %s\n", nama);
            System.out.printf("Umur   : %d tahun\n", umur);
            System.out.printf("Tinggi : %.1f cm\n", tinggi);
            System.out.printf("Alamat : %s\n", alamat);
        }
    }


}
  
