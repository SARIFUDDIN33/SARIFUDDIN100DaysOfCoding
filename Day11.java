package com.mycompany.Day11.java;

import java.util.Scanner;

public class Day11Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        System.out.println("\n=== Hasil Input ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");

        sc.close();
    }
}
