package minggu1;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
         
            Scanner input = new Scanner(System.in);
           
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan umur: ");
            int umur = input.nextInt();
            
            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi= input.nextDouble();
            input.nextLine();       
            System.out.print("Masukkan alamat: ");
            String alamat = input.nextLine();//
            
            // Output biodata
            System.out.println("\n=== Biodata Sederhana ===");
            System.out.printf("Nama   : %s\n", nama);
            System.out.printf("Umur   : %d tahun\n", umur);
            System.out.printf("Tinggi : %.1f cm\n", tinggi);
            System.out.printf("Alamat : %s\n", alamat);
        
    }
}
