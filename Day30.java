package minggu3;

public class Day30 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        // Operator perbandingan <= dan >=
        boolean hasilKurangSama = (x <= y);
        boolean hasilLebihSama = (x >= y);

        // Output hasil perbandingan
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Apakah x <= y? " + hasilKurangSama);
        System.out.println("Apakah x >= y? " + hasilLebihSama);
    }
}
