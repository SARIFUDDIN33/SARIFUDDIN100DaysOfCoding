package minggu02;
import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();
        
        int jumlah = angka1 + angka2;
        int selisih = angka1 - angka2;
        
        System.out.println("Hasil Penjumlahan = " + jumlah);
        System.out.println("Hasil Pengurangan = " + selisih);
        
        
    }
}
