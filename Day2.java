
package com.mycompany.day2.java;
public class Day2Java {
    public static void main(String[] args) {
        // bagian print
       System.out.print("Halo ");
        System.out.print("Dunia");
        System.out.println("!");
        // bagian println
        System.out.println("Halo");
        System.out.println("Dunia");
        System.out.println("!");
        // bagian printf
        String nama = "Sarifuddin";
        int umur = 19;
        double tinggi = 165.8;

        System.out.printf("%-10s : %s\n", "Nama", nama);
        System.out.printf("%-10s : %d tahun\n", "Umur", umur);
        System.out.printf("%-10s : %.1f cm\n", "Tinggi", tinggi);
    }
}
