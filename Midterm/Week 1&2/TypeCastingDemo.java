public class TypeCastingDemo {
    public static void main(String[] args) {

        System.out.println("=== IMPLICIT TYPE CASTING (Widening Conversion) ===");
        // smaller → larger type (automatic)
        byte b = 20;          // 1 byte
        short s = b;          // byte → short
        int i = s;            // short → int
        long l = i;           // int → long
        float f = l;          // long → float
        double d = f;         // float → double

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);

        System.out.println("\n=== EXPLICIT TYPE CASTING (Narrowing Conversion) ===");
        // larger → smaller type (manual)
        double d2 = 123.9876;
        float f2 = (float) d2;     // double → float
        long l2 = (long) f2;       // float → long
        int i2 = (int) l2;         // long → int
        short s2 = (short) i2;     // int → short
        byte b2 = (byte) s2;       // short → byte

        System.out.println("double value: " + d2);
        System.out.println("float value: " + f2);
        System.out.println("long value: " + l2);
        System.out.println("int value: " + i2);
        System.out.println("short value: " + s2);
        System.out.println("byte value: " + b2);

        System.out.println("\n=== CHARACTER CASTING EXAMPLES ===");
        char ch = 'A';             // character 'A'
        int ascii = ch;            // char → int (implicit)
        char nextCh = (char) (ascii + 1);  // int → char (explicit)
        System.out.println("char value: " + ch);
        System.out.println("ASCII value: " + ascii);
        System.out.println("Next character: " + nextCh);

        System.out.println("\n=== MIXED TYPE CASTING EXAMPLES ===");
        int num1 = 10;
        double num2 = 5.5;
        double result1 = num1 + num2; // int → double automatically
        System.out.println("Result of int + double: " + result1);

        double largeDouble = 99.99;
        int smallInt = (int) largeDouble;  // double → int (manual)
        System.out.println("After explicit cast (double → int): " + smallInt);

        System.out.println("\n=== BOOLEAN NOTE ===");
        System.out.println("Boolean type cannot be type casted to/from numeric types in Java.");
    }
}