public class DataTypes {
    public static void main(String[] args) {
        // Java data types are all signed (+/- values).
        // Numeric
        short myShort = 32767; // 2B
        int myInt = 2147483647; // 4B
        long myLong = 9223372036854775807l; // 8B + must use l

        // Floating points
        float myFloat= 0.0001f; //f is required
        float maxFloat = (float)1/1123; // 4B
        double maxDouble = (double)1/1123; // 8B
        System.out.println("Float " + maxFloat);
        System.out.println("Double " + maxDouble);

        // Chars - 2 Bytes (single character or a digit)
        char a = 'a'; // 2B
        char aAlso = 97; // ASCII code
        char numChar = '1';
        System.out.println("char = 'a': " + a);
        System.out.println("char = 97: " + aAlso);
        System.out.println("char = '1': " + numChar);

        // Boolean - 1 bit
        boolean ok = true;
        boolean ko = false;

    }
}
