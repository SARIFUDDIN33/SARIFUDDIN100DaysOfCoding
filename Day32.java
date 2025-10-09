package minggu3;

public class Day32 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int x = 5;
        int y = 10;
        int z = 15;

        // Operator logika OR (||)
        boolean hasil = (x > y) || (y < z); // false || true = true

        // Output hasil
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);
        System.out.println("Apakah x > y ATAU y < z? " + hasil);
    }
}
