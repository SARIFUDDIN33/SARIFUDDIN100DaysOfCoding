package minggu2;
public class Day20 {
    public static void main(String[] args) {
        // Deklarasi tipe data primitif
        int angkaInt = 123;
        double angkaDouble = 45.67;
        boolean status = true;
        char huruf = 'A';

        // Konversi primitif ke String
        String strInt = String.valueOf(angkaInt);
        String strDouble = String.valueOf(angkaDouble);
        String strBoolean = String.valueOf(status);
        String strChar = String.valueOf(huruf);

        // Output hasil konversi
        System.out.println("Integer ke String : " + strInt);
        System.out.println("Double ke String  : " + strDouble);
        System.out.println("Boolean ke String : " + strBoolean);
        System.out.println("Char ke String    : " + strChar);
    }
}
