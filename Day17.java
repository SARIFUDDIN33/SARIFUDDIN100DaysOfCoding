package minggu2;
import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();

        if (angka2 != 0) {
            int modulus = angka1 % angka2;
            System.out.println("Sisa hasil bagi = " + modulus);
        } else {
            System.out.println("Tidak bisa menghitung modulus dengan nol!");
        }
    }
}
