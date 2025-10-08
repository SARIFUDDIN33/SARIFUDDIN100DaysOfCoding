package minggu3;

public class Day31 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 10;
        int b = 20;
        int c = 30;

        // Operator logika AND (&&)
        boolean hasil = (a < b) && (b < c); // true && true = true

        // Output hasil
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Apakah a < b DAN b < c? " + hasil);
    }
}
