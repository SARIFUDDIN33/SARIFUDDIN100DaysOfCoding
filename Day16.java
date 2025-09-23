package minggu2;
import java.util.Scanner;

public class Day16 {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();
        
        int perkalian = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + perkalian);
        
        if (angka2 != 0) {
            double pembagian = (double) angka1 / angka2;
            System.out.println("Hasil Pembagian = " + pembagian);
        } else {
            System.out.println("Tidak bisa dibagi dengan nol!");
            
        }
    }
}
      
