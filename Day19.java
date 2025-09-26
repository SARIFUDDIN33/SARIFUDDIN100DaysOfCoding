package minggu2;

public class Day19 {
    public static void main(String[] args) {
        // Deklarasi tipe data besar
        double angkaDouble = 99.99;
        float angkaFloat;
        long angkaLong;
        int angkaInt;
        short angkaShort;
        byte angkaByte;

        // Konversi manual (narrowing conversion) dengan casting
        angkaFloat = (float) angkaDouble;  // double -> float
        angkaLong = (long) angkaFloat;     // float -> long
        angkaInt = (int) angkaLong;        // long -> int
        angkaShort = (short) angkaInt;     // int -> short
        angkaByte = (byte) angkaShort;     // short -> byte

        // Output hasil konversi
        System.out.println("Nilai double : " + angkaDouble);
        System.out.println("Nilai float  : " + angkaFloat);
        System.out.println("Nilai long   : " + angkaLong);
        System.out.println("Nilai int    : " + angkaInt);
        System.out.println("Nilai short  : " + angkaShort);
        System.out.println("Nilai byte   : " + angkaByte);
    }
}
