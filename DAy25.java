package minggu2;

public class Day25 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka = 10;

        // Operator increment (++)
        int tambah = angka++;
        
        // Operator decrement (--)
        int kurang = angka--;

        // Output hasil
        System.out.println("Nilai awal = 10");
        System.out.println("Setelah increment (angka++) = " + tambah);
        System.out.println("Setelah decrement (angka--) = " + kurang);
        System.out.println("Nilai akhir angka = " + angka);
    }
}
