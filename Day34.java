package minggu3;

public class Day34 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 10;
        int b = 20;
        boolean aktif = true;

        // Operator perbandingan
        System.out.println("a == b  : " + (a == b));   // sama dengan
        System.out.println("a != b  : " + (a != b));   // tidak sama dengan
        System.out.println("a < b   : " + (a < b));    // lebih kecil dari
        System.out.println("a > b   : " + (a > b));    // lebih besar dari
        System.out.println("a <= b  : " + (a <= b));   // lebih kecil dari atau sama dengan
        System.out.println("a >= b  : " + (a >= b));   // lebih besar dari atau sama dengan

        System.out.println();

        // Operator logika
        System.out.println("(a < b) && (b > 5) : " + ((a < b) && (b > 5))); // AND
        System.out.println("(a > b) || (b > 5) : " + ((a > b) || (b > 5))); // OR
        System.out.println("!aktif             : " + (!aktif));             // NOT

        System.out.println();

        // Kombinasi logika
        boolean hasil = (a < b) && (b > 5) && aktif;
        System.out.println("(a < b) && (b > 5) && aktif : " + hasil);

        // Hasil akhir
        System.out.println("Apakah semua syarat terpenuhi? " + hasil);
    }
}
