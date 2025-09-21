import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input String dari user
        System.out.print("Masukkan angka bulat (int): ");
        String strInt = input.nextLine();
        int angka = Integer.parseInt(strInt); // String -> int

        System.out.print("Masukkan angka desimal (double): ");
        String strDouble = input.nextLine();
        double pecahan = Double.parseDouble(strDouble); // String -> double

        System.out.print("Masukkan nilai true/false (boolean): ");
        String strBoolean = input.nextLine();
        boolean kondisi = Boolean.parseBoolean(strBoolean); // String -> boolean

        // Output hasil konversi
        System.out.println("\n=== Hasil Konversi ===");
        System.out.println("String ke int     : " + angka);
        System.out.println("String ke double  : " + pecahan);
        System.out.println("String ke boolean : " + kondisi);
    }
}
