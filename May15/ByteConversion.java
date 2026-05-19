package May15;

public class ByteConversion {

    public static void out1() {
        byte a = 10;
        byte b = 20;

        //byte c = a + b; // Result ?? Why ??
    }

    public static void out2() {

        byte a = 50;
        a++; // why this works
        //a = a + 1; // why this Doesn’t
        System.out.println(a);
    }

    public static void overflow() {
        byte b = (byte) -129;
        System.out.println("Overflow" + b); // Predict ?
    }

    public static void willItprint() {
        final byte a = 127;
        final byte b = 20;

        //byte c = a + b;

        //System.out.println(c);
    }

    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b); // predict ??

        byte c = -128;
        c--;
        System.out.println(c); // predict ??
        overflow();
    }
}
