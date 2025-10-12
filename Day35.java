package minggu3;

public class Day35 {
    public static void main(String[] args) {
        int nilai = 85;

        System.out.println("Nilai kamu: " + nilai);

        // Percabangan IF, ELSE IF, ELSE
        if (nilai >= 90) {
            System.out.println("Kamu mendapat nilai A");
        } else if (nilai >= 80) {
            System.out.println("Kamu mendapat nilai B");
        } else if (nilai >= 70) {
            System.out.println("Kamu mendapat nilai C");
        } else if (nilai >= 60) {
            System.out.println("Kamu mendapat nilai D");
        } else {
            System.out.println("Kamu mendapat nilai E");
        }

        // Contoh tambahan dengan operator logika
        boolean lulus = (nilai >= 70);
        if (lulus) {
            System.out.println("Selamat, kamu lulus!");
        } else {
            System.out.println("Maaf, kamu belum lulus.");
        }
    }
}
