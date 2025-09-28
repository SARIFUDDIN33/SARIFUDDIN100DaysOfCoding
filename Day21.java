package minggu2;
public class Day21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a + ", b = " + b);

        // Tukar nilai tanpa variabel tambahan
        a = a + b;  // a sekarang 15
        b = a - b;  // b jadi 5 (nilai awal a)
        a = a - b;  // a jadi 10 (nilai awal b)

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
