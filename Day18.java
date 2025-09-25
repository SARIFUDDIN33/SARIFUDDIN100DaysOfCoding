package minggu2;

public class Day18 {
    public static void main(String[] args) {
        // Deklarasi tipe data kecil
        byte angkaByte = 10;
        short angkaShort;
        int angkaInt;
        long angkaLong;
        float angkaFloat;
        double angkaDouble;

        // Konversi otomatis (widening conversion)
        angkaShort = angkaByte;      // byte -> short
        angkaInt = angkaShort;       // short -> int
        angkaLong = angkaInt;        // int -> long
        angkaFloat = angkaLong;      // long -> float
        angkaDouble = angkaFloat;    // float -> double

        // Output hasil konversi
        System.out.println("Nilai byte    : " + angkaByte);
        System.out.println("Nilai short   : " + angkaShort);
        System.out.println("Nilai int     : " + angkaInt);
        System.out.println("Nilai long    : " + angkaLong);
        System.out.println("Nilai float   : " + angkaFloat);
        System.out.println("Nilai double  : " + angkaDouble);
    }
}
